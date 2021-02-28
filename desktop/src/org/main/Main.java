package org.main;

import org.app.LoadingWindow;

/**
 *
 * @author Achmad Baihaqi
 */
public class Main {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                new LoadingWindow().setVisible(true);
            }
        });
    }
}
