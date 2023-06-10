/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compressor;
import comp_decomp.decompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class AppFrame extends JFrame implements ActionListener{
    JButton compressbutton;
    JButton decompressbutton;
    AppFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    compressbutton=new JButton("Select file to compress");
    compressbutton.setBounds(20,100,200,30);
    compressbutton.addActionListener(this);
    decompressbutton=new JButton("Select file to ecompress");
    decompressbutton.setBounds(250,100,200,30);
    decompressbutton.addActionListener(this);
    this.add(compressbutton);
    this.add(decompressbutton);
    this.setSize(1000,500);
    this.getContentPane().setBackground(Color.green);
    this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==compressbutton){
    JFileChooser filechhoser=new JFileChooser();
    int response=filechhoser.showSaveDialog(null);
    if(response==JFileChooser.APPROVE_OPTION){
    File file=new File(filechhoser.getSelectedFile().getAbsolutePath());
    System.out.println(file);
    try{
    compressor.method(file);
    }
    catch(Exception ee){
    JOptionPane.showMessageDialog(null, ee.toString());
    }
    
    }
    }
    if(e.getSource()==decompressbutton){
    JFileChooser filechhoser=new JFileChooser();
    int response=filechhoser.showSaveDialog(null);
    if(response==JFileChooser.APPROVE_OPTION){
    File file=new File(filechhoser.getSelectedFile().getAbsolutePath());
    System.out.println(file);
    try{
    decompressor.method(file);
    }
    catch(Exception ee){
    JOptionPane.showMessageDialog(null, ee.toString());
    }
    
    }
    }
    
    }
}
