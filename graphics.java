/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
/**
 *
 * @author Sumakmur Goenawan
 */
public class graphics extends Panel {
    graphics(){
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g) {
        
        g.drawLine(100,100, 60, 100);
        g.drawLine(100, 100, 60, 150);
        g.drawLine(100, 150, 60, 150);
        
         g.drawLine(150,180, 100, 180);
         g.drawLine(150,180, 100, 230);
         g.drawLine(150,230, 100, 230);
         
         g.drawLine(200,260, 150, 260);
         g.drawLine(200,260, 150, 310);
         g.drawLine(200,310, 150, 310);
       
        
        
        
        g.drawLine(180,340,180,360 );
        g.drawLine(180, 370, 180, 390);
        g.drawLine(240,370,250,370);
        
        g.drawRoundRect(200, 355, 20, 20,20,20);
        g.drawRoundRect(150, 320, 90, 100,100,100);
        g.drawRect(100,250,150,250);
        g.drawRect(250, 250, 490, 250);
        
       
        
       
    }
    public static void main(String[] args) {
        Frame f =  new Frame("Testing Graphics Panel");
        graphics gp = new graphics();
        f.add(gp);
        f.setSize(900,900);
        f.setVisible(true);
                
    }
    
}
