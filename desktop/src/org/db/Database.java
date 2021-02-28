package org.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Achmad Baihaqi
 */
public class Database {
    
    public static final String USERS_USERNAME = "username",
                        USERS_PASSWORD = "password",
                        BIODATA_NIS = "nis",
                        BIODATA_NAMA = "nama",
                        BIODATA_KELAS = "kelas",
                        BIODATA_JURUSAN = "jurusan",
                        BIODATA_EMAIL = "email";
    
    private final String DB_NAME = "pre_ukk_biodata",
                         USERNAME = "root",
                         PASSWORD = "";
    
    private Connection conn;
    private Statement stat;
    private ResultSet res;
    
    public Database(){
        startConn();
    }
    
    public void startConn(){
        try{
            // meregistrasi driver
            Class.forName("com.mysql.jdbc.Driver");
            // melakukan koneksi
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+DB_NAME, USERNAME, PASSWORD);
            // membuat object statement
            stat = conn.createStatement();
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void closeConn(){
        try{
            if(conn != null){
                conn.close(); 
            }
            if(stat != null){
                stat.close();
            }
            if(res != null){
                res.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public boolean login(String username, String password){
        String sql = "SELECT * FROM users WHERE username = '"+username+"'";
        try{
            res = stat.executeQuery(sql);
            // mengecek apakah username ada atau tidak
            if(res.next()){
                String dbPassword = res.getString(USERS_PASSWORD); // mengambil password
                // mengecek apakah password cocok atau tidak
                if(password.equals(dbPassword)){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Password tidak cocok!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Username tidak ditemukan!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean daftar(String username, String password){
        try{
            String sql = "SELECT * FROM users WHERE username = '" + username + "'";
            // mengecek apakah username sudah terdaftar atau belum
            res = stat.executeQuery(sql);
            if(res.next()){
                JOptionPane.showMessageDialog(null, "Username sudah terdaftar!");
            }else{
                // menambahkan data kedalam database
                int result = stat.executeUpdate("INSERT INTO users VALUES ('"+username+"', '"+password+"')"); // menambahkan data
                // mengecek apakah data berhasil ditambahkan atau tidak
                if(result > 0){
                    return true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean addBiodata(int nis, String nama, String kelas, String jurusan, String email){
        try{
            String sql = "SELECT * FROM biodata WHERE nis = '" + nis + "'";
            res = stat.executeQuery(sql);
            // mengecek apakah nis sudah terdaftar atau belum
            if(res.next()){
                JOptionPane.showMessageDialog(null, "Nis Sudah terdaftar!");
            }else{
                sql = "INSERT INTO biodata VALUES ("+nis+", '"+nama+"', '"+kelas+"', '"+jurusan+"', '"+email+"')";
                int result = stat.executeUpdate(sql); // menambakan buffer
                // mengecek apakah buffer berhasil ditambahkan atau tidak
                if(result > 0){
                    return true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public Object[] listBiodata(){
        try{
            StringBuilder buffer = new StringBuilder(); // untuk menyimpan data sementara
            ArrayList<String> data = new ArrayList<>(); // untuk menampung data
            String sql = "SELECT * FROM biodata ORDER BY nis ASC";
            res = stat.executeQuery(sql); // mendapatkan semua data yang ada didalam tabel biodata
            // membaca semua data yang ada didalam tabel
            while(res.next()){
                // mengambil data dan disimpan ke object buffer
                buffer.append(res.getString(BIODATA_NIS)).append("\\").append(res.getString(BIODATA_NAMA)).append("\\")
                       .append(res.getString(BIODATA_KELAS)).append("\\").append(res.getString(BIODATA_JURUSAN)).append("\\")
                       .append(res.getString(BIODATA_EMAIL));
                data.add(buffer.toString()); // menambahkan data ke ArrayList
                buffer = new StringBuilder(); // mereset data sementara
            }
            
            return data.toArray(); // mengembalikan data dalam bentuk array
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    public String getData(int nis, String field){
        try{
            String sql = "SELECT * FROM biodata WHERE nis = '"+nis+"'";
            res = stat.executeQuery(sql);
            // mengecek apakah nis ada atau tidak
            if(res.next()){
                return res.getString(field); // mengambil data dari field berdasarkan nis yang diinputkan
            }else{
                JOptionPane.showMessageDialog(null, "Nis tidak ditemukan!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean deleteBiodata(int nis){
        try{
            int result = stat.executeUpdate("DELETE FROM biodata WHERE nis = '"+nis+"'");
            // menghapus data berdasarkan nis yang dinputkan
            if(result > 0){
                return true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean editBiodata(int nis, String data, String newValue){
        try{
            String sql = "SELECT * FROM biodata WHERE nis = '"+nis+"'";
            res = stat.executeQuery(sql);
            // mengecek apakah nis ada atau tidak
            if(res.next()){
                sql = "UPDATE biodata SET "+data+" = '"+newValue+"' WHERE nis = '"+nis+"'";
                int result = stat.executeUpdate(sql); // mengedit data
                if(result > 0){ // mengecek apakah data berhasil diedit atau tidak
                    return true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nis tidak ditemukan!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
