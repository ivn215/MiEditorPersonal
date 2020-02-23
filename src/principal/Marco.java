/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;

/**
 *
 * @author ivan
 */
public class Marco extends JFrame {
    
    public static void main(String args[]) {
       
       Marco marcoVentana=new Marco();
       
       marcoVentana.setVisible(true);
       marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public Marco() {
        
        ControladorEventos ce=new ControladorEventos();
        ce.marco=this;
        
        setVisible(true);
        setTitle("My Personal Editor");
        setSize(1080,700);
        this.setLocationRelativeTo(null);
        
        Lamina lamina=new Lamina();
        add(lamina);
        
        //establecemos la barra de menús en el propio marco
        this.setJMenuBar(lamina.barraMenu);
        
}
    
    }
    
        
    
  
