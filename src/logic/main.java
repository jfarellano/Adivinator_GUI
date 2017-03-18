package logic;

import view.Log_in_Frame;

public class main {
    
    
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in_Frame();
            }
        });
    }
}
