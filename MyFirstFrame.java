/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ul;


import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author LISAKHANYA
 */
public class MyFirstFrame extends JFrame{
    public MyFirstFrame(){
        
        setTitle("My Furst GUI");
        setSize(700,850);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
