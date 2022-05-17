/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package somaporenquato;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
/**
 *
 * @author Bruno
 */
 public class SomaPORenquato extends JFrame {
 
     JLabel rotulo1, rotulo2, exibir;
     JTextField texto1, texto2;
     JButton somar ,subtrair ,dividir ,multiplicar ,limpar ,ocultar ,exbir;
    
         public SomaPORenquato(){
         super("Calculadorazinha");
         Container tela = getContentPane();
         setLayout(null);
         
        
         rotulo1 = new JLabel("1° Número: ");
         rotulo2 = new JLabel("2° Número: ");
         texto1 = new JTextField(5);
         texto2 = new JTextField(5);
         exibir = new JLabel("");
         somar = new JButton("Somar");
         subtrair = new JButton("Subtrair");
         dividir = new JButton("Dividir");
         multiplicar = new JButton("Multiplicar");
         limpar = new JButton("Limpar");
         ocultar = new JButton("Ocultar");
         exbir = new JButton("Exibir");
         
         rotulo1.setBounds(50,20,100,20);
         rotulo2.setBounds(50,60,100,20);
         texto1.setBounds(120,20,200,20);
         texto2.setBounds(120,60,200,20);
         somar.setBounds(50,100,80,20);
         subtrair.setBounds(240,100,80,20);
         dividir.setBounds(190,130,80,20);
         multiplicar.setBounds(80,130,100,20);
         exibir.setBounds(50,275,200,20);
         ocultar.setBounds(50,165,80,20);
         exbir.setBounds(50,190,80,20);
         limpar.setBounds(50,235,80,20);
         
         somar.addActionListener(
         new ActionListener(){
         public void actionPerformed(ActionEvent e){
             int numero1,numero2,soma;
             soma=0;
           
             numero1 = Integer.parseInt(texto1.getText());
             numero2 = Integer.parseInt(texto2.getText());
             soma = numero1 + numero2;
             exibir.setVisible(true);
             exibir.setText("A soma é: "+soma);
            
         }  
         }
         );
      
         subtrair.addActionListener(
         new ActionListener(){
         public void actionPerformed(ActionEvent e){
             int numero1,numero2,subtração;
             subtração=0;
            
             numero1 = Integer.parseInt(texto1.getText());
             numero2 = Integer.parseInt(texto2.getText());
             subtração = numero1 - numero2;
             exibir.setVisible(true);
             exibir.setText("A subtração é: "+subtração);

         } 
         }
         );
        
         dividir.addActionListener(
         new ActionListener(){
         public void actionPerformed(ActionEvent e){
             int numero1,numero2,divisão;
             divisão=0;
            
             numero1 = Integer.parseInt(texto1.getText());
             numero2 = Integer.parseInt(texto2.getText());
             divisão = numero1 / numero2;
             exibir.setVisible(true);
             exibir.setText("A divisão é: "+divisão);
 
         } 
         }
         );
        
         multiplicar.addActionListener(
         new ActionListener(){
         public void actionPerformed(ActionEvent e){
             int numero1,numero2,multiplicação;
             multiplicação=0;
            
             numero1 = Integer.parseInt(texto1.getText());
             numero2 = Integer.parseInt(texto2.getText());
             multiplicação = numero1 * numero2;
             exibir.setVisible(true);
             exibir.setText("A multiplicação é: "+multiplicação);
 
         } 
         }
         );
        
         limpar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 texto1.setText(null);
                 texto2.setText(null);
                 texto1.requestFocus();
                 
             }
         }
         );
         
         ocultar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 rotulo1.setVisible(false);
                 rotulo2.setVisible(false);
             }
         }
         );
         
         exbir.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 rotulo1.setVisible(true);
                 rotulo2.setVisible(true);
             }
         }
         );
        
         exibir.setVisible(false);
         tela.setBackground(new Color(176,224,230));
         tela.add(rotulo1);
         tela.add(rotulo2);
         tela.add(texto1);
         tela.add(texto2);
         tela.add(exibir);
         tela.add(somar);
         tela.add(subtrair);
         tela.add(dividir);
         tela.add(multiplicar);
         tela.add(limpar);
         tela.add(ocultar);
         tela.add(exbir);
         
         setSize(400, 350);
         setVisible(true);
        
        
         ImageIcon icone = new ImageIcon("norman.png");
         setIconImage(icone.getImage());
    
     }
        
   
     public static void main(String[] args) {
         SomaPORenquato app = new SomaPORenquato();
         //Limpar app = new Limpar();
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
 }
