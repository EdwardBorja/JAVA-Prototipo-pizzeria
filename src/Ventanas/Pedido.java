/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;
import Ventanas.Inicio;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author edward
 */


public class Pedido extends javax.swing.JFrame {
    //aqui estan las variables que se ocupan para la funcion del reloj y fecha,sonido 

 
String ampm;
int hora, minutos, segundos; 
int dia,mes,año;
        
private Clip clip;
private String path="/Audio/";
    
     public void sonido(String value)
    {        
       try
       {
   clip=AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream( getClass().getResourceAsStream( path +  value +".wav" ) ) );
          clip.start();
       }catch(Exception ex){
    System.err.println( ex.getMessage() );
        }
    }
     
     
    public Pedido() {
        
        
        initComponents();
       //se inicia funcion de fecha y hora
        reloj();
        
        
        //aqui se muestran las imagenes que se encuentran dentro del proyecto en las etiquetas
       ImageIcon haciendo = new ImageIcon("src/Imagenes/pedido.jpg");
       Estadopedido.setIcon(new ImageIcon(haciendo.getImage().getScaledInstance(279,175,Image.SCALE_SMOOTH)));
       
        setResizable(false);
        ImageIcon img = new ImageIcon("src/Imagenes/rebanada.png/");
        foto1.setIcon(new ImageIcon(img.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        
        
       ImageIcon img2 = new ImageIcon("src/Imagenes/condimento.png/");
       foto2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
       
       ImageIcon img3 = new ImageIcon("src/Imagenes/bebida.png");
       foto3.setIcon(new ImageIcon(img3.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
       
       //estado del pedido
       info.setText("Realizando el Pedido");
       
       //aqui esta la posicion de la ventana 
       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
       GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
       Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
       int x = (int) rect.getMaxX() - getWidth();
       int y = 1;
       setLocation(x, y);
       
       desactivaEtiquetas();
    
      

        
    }
//esta funcion obtiene los valores de la fecha ,hora,cantidades, y  muestra los valores l hacer click
public void activaEtiquetas(){
    
    String Fecha,hora,texto1,texto2;
    texto1=campo1.getText();
    texto2=campo2.getText();
    hora= (labelHora.getText());
    Fecha=(labelFecha.getText());
   
    
    
    jLabel32.setVisible(true);
    jLabel33.setVisible(true);
    jLabel34.setVisible(true);
    jLabel35.setVisible(true);
    
    jLabel32.setText(hora);
    jLabel33.setText(Fecha);
    jLabel34.setText(texto1);
    jLabel35.setText(texto2);
    
    
    
    
}
//desactiva las etiquetas
public void desactivaEtiquetas(){
    jLabel32.setVisible(false);
    jLabel33.setVisible(false);
    jLabel34.setVisible(false);
    jLabel35.setVisible(false);
    
    
}
    
    //esta funcion obtiene fecha y hora del sistema
    public final void reloj() { 
  
Calendar calendario;


calendario = new java.util.GregorianCalendar(); 
segundos = calendario.get(Calendar.SECOND); 
@SuppressWarnings("empty-statement")
Timer timer = new Timer(1000, (ActionEvent e) -> {
    Date actual = new Date();
    calendario.setTime(actual);
    
    hora = calendario.get(Calendar.HOUR);
    minutos = calendario.get(Calendar.MINUTE);
    segundos = calendario.get(Calendar.SECOND);
    ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
    //
    dia = calendario.get(Calendar.DAY_OF_MONTH);
    mes = (calendario.get(Calendar.MONTH)+1);
    año = calendario.get(Calendar.YEAR);
    //
            
    String hour = String.format("%02d : %02d : %02d ",hora,minutos,segundos);
    String date = String.format("%02d / %02d / %02d ",dia,mes,año);
    
    labelHora.setText(hour+ampm);
    labelFecha.setText(date);
    labelHora.setToolTipText(hour+ampm+"   "+"\t"+date);
    
    
    
        
    });
timer.start(); 
}
     //aqui esta el codigo generado de las caracteristicas de todos los elementos 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        eligepizza = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox();
        eligeingrediente = new javax.swing.JLabel();
        Combo3 = new javax.swing.JComboBox();
        eligebebida = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator4 = new javax.swing.JSeparator();
        Estadopedido = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        gethora = new javax.swing.JLabel();
        getfecha = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido 1");

        Combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione  pizza", "● Pizza chicago ", "● Pizza Mexicana", "● Pizza Hawaii", "● Pizza Clasica" }));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MENU de La Gran Pizza");

        labelHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha)
                    .addComponent(jLabel14)))
        );

        jLabel8.setText("● Carne asada");

        jLabel9.setText("●Champiñones");

        jLabel10.setText("● Peperoni");

        jLabel11.setText("● Rajas ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Ingredientes");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("PIZZAS");

        jLabel3.setText("● Pizza chicago ");

        jLabel6.setText("● Pizza Classica");

        jLabel5.setText("● Pizza Hawaii");

        jLabel7.setText("● Pizza Mexicana");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setText("● Manzanita");

        jLabel16.setText("●Fanta");

        jLabel17.setText("● Coca");

        jLabel18.setText("● Sprite");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Bebidas");

        Combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione  ingrediente", "● peperoni", "● carne asada", "● rajas", "● champiñones" }));
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });

        Combo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una bebida", "●Coca ", "● manzanita", "● sprite", "● fanta" }));
        Combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("PIZZA");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Ingrediente");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Bebida");

        info.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info.setForeground(new java.awt.Color(51, 51, 255));

        jProgressBar1.setToolTipText("");
        jProgressBar1.setName(""); // NOI18N
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listo.png"))); // NOI18N
        jButton1.setText("Realizar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Cantidad de:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Pizzas:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Bebidas:");

        campo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo1KeyTyped(evt);
            }
        });

        campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo2ActionPerformed(evt);
            }
        });
        campo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo2KeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setText("Detalles de su pedido:");

        gethora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gethora.setForeground(new java.awt.Color(0, 0, 255));
        gethora.setText("Hora:");

        getfecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getfecha.setForeground(new java.awt.Color(0, 0, 255));
        getfecha.setText("Fecha:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Cantidad de pizzas:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("Cantidad de refrescos:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("df");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("df");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("df");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("df");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel20)
                                .addGap(134, 134, 134)
                                .addComponent(jLabel21)
                                .addGap(112, 112, 112)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(356, 356, 356)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Combo1, 0, 140, Short.MAX_VALUE)
                                                .addComponent(eligepizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(39, 39, 39)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(eligeingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(37, 37, 37)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Combo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(eligebebida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel24)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(campo1))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(19, 19, 19)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel6))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel3)
                                                            .addGap(7, 7, 7))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(85, 85, 85)
                                                    .addComponent(jLabel12)))
                                            .addGap(18, 18, 18)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11))
                                                    .addGap(31, 31, 31))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(96, 96, 96)))
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jLabel15)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel19)
                                                    .addGap(45, 45, 45))))
                                        .addComponent(jSeparator5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Estadopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gethora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getfecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15)
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel16)))
                                        .addGap(272, 272, 272))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Estadopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(94, 94, 94)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(gethora)
                                                    .addComponent(jLabel32))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(getfecha)
                                                    .addComponent(jLabel33))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel34))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel30)
                                                    .addComponent(jLabel35))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jSeparator3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eligepizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eligeingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Combo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel24)
                                                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eligebebida, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(100, 100, 100)))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cada combobox muestra los valores y segun el valor seleccionado muestra una imagen
    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        sonido("mous");
        Object selected = Combo1.getSelectedItem();
        if(selected.toString().equals("● Pizza chicago ")){      
        ImageIcon chicago = new ImageIcon("src/Imagenes/chicago.jpg");
        eligepizza.setIcon(new ImageIcon(chicago.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
        }
       
        if(selected.toString().equals("● Pizza Hawaii")){
        ImageIcon hawaiana = new ImageIcon("src/Imagenes/hawaiana.jpg");
        eligepizza.setIcon(new ImageIcon(hawaiana.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
        }
        
        if(selected.toString().equals("● Pizza Clasica")){
        ImageIcon Clasica = new ImageIcon("src/Imagenes/clasica.jpg");
        eligepizza.setIcon(new ImageIcon(Clasica.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
        }
        
        if(selected.toString().equals("● Pizza Mexicana")){
        ImageIcon Clasica = new ImageIcon("src/Imagenes/mexicana.jpg");
        eligepizza.setIcon(new ImageIcon(Clasica.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
        }
        
        if(selected.toString().equals("Seleccione  pizza")){
        ImageIcon Clasica = new ImageIcon("");
        eligepizza.setIcon(new ImageIcon(Clasica.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
        }
       

 
    
    }//GEN-LAST:event_Combo1ActionPerformed

        //cada combobox muestra los valores y segun el valor seleccionado muestra una imagen

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
    sonido("mous");
    Object selected = Combo2.getSelectedItem();
    if(selected.toString().equals("● peperoni")){      
    ImageIcon peperoni = new ImageIcon("src/Imagenes/peperoni.jpg");
    eligeingrediente.setIcon(new ImageIcon(peperoni.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● carne asada")){      
    ImageIcon carne = new ImageIcon("src/Imagenes/carne.jpg");
    eligeingrediente.setIcon(new ImageIcon(carne.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● rajas")){      
    ImageIcon rajas = new ImageIcon("src/Imagenes/rajas.jpg");
    eligeingrediente.setIcon(new ImageIcon(rajas.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● champiñones")){      
    ImageIcon champiñones = new ImageIcon("src/Imagenes/champiñon.jpg");
    eligeingrediente.setIcon(new ImageIcon(champiñones.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("Seleccione  ingrediente")){      
    ImageIcon champiñones = new ImageIcon("");
    eligeingrediente.setIcon(new ImageIcon(champiñones.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    


    }//GEN-LAST:event_Combo2ActionPerformed

        //cada combobox muestra los valores y segun el valor seleccionado muestra una imagen

    private void Combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo3ActionPerformed
    sonido("mous");
    Object selected = Combo3.getSelectedItem();
    if(selected.toString().equals("●Coca ")){      
    ImageIcon coca = new ImageIcon("src/Imagenes/coca.jpg");
    eligebebida.setIcon(new ImageIcon(coca.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● manzanita")){      
    ImageIcon manzanita = new ImageIcon("src/Imagenes/manzanita.jpg");
    eligebebida.setIcon(new ImageIcon(manzanita.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● sprite")){      
    ImageIcon sprite = new ImageIcon("src/Imagenes/sprite.jpg");
    eligebebida.setIcon(new ImageIcon(sprite.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("● fanta")){      
    ImageIcon fanta = new ImageIcon("src/Imagenes/fanta.jpg");
    eligebebida.setIcon(new ImageIcon(fanta.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    if(selected.toString().equals("Seleccione una bebida")){      
    ImageIcon fanta = new ImageIcon("");
    eligebebida.setIcon(new ImageIcon(fanta.getImage().getScaledInstance(140,100,Image.SCALE_SMOOTH)));
    }
    
    }//GEN-LAST:event_Combo3ActionPerformed

        //aqui esta el cambio en la barra de progreso ,al llegar a cada porcentaje cambia las imagenes y proceso

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        if(jProgressBar1.getValue() == 1){
            info.setText("Etapa: Armando el pedido");
            ImageIcon armando = new ImageIcon("src/Imagenes/prepara.jpg");
            Estadopedido.setIcon(new ImageIcon(armando.getImage().getScaledInstance(279,175,Image.SCALE_SMOOTH)));
        }

        if(jProgressBar1.getValue() == 25){
            info.setText("Etapa: Pizza en el horno");
            ImageIcon horno = new ImageIcon("src/Imagenes/horno.jpg");
            Estadopedido.setIcon(new ImageIcon(horno.getImage().getScaledInstance(279,175,Image.SCALE_SMOOTH)));
        }
        
        if(jProgressBar1.getValue() == 85){
            info.setText("Etapa: Empacando pedido");
            ImageIcon empacar = new ImageIcon("src/Imagenes/empaca.jpg");
            Estadopedido.setIcon(new ImageIcon(empacar.getImage().getScaledInstance(279,175,Image.SCALE_SMOOTH)));
        }
        
        if(jProgressBar1.getValue() == 100){
            info.setText("Etapa: Pedido entregado al cliente");
            ImageIcon entrega = new ImageIcon("src/Imagenes/entrega.jpg");
            Estadopedido.setIcon(new ImageIcon(entrega.getImage().getScaledInstance(279,175,Image.SCALE_SMOOTH)));
            sonido("tono");
        }
    }//GEN-LAST:event_jProgressBar1StateChanged

        //al hacer click en realizar pedido checa si hay valores faltantes y muestra mensaje en caso de que falte llenar algo

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sonido("mous");
        
        if(campo1.getText().equals("")||campo2.getText().equals("")||Combo1.getSelectedItem().toString().equals("Seleccione  pizza")
         ||Combo2.getSelectedItem().toString().equals("Seleccione  ingrediente")
         ||Combo3.getSelectedItem().toString().equals("Seleccione una bebida")){
          getToolkit().beep();
          JOptionPane.showMessageDialog(null,"\t"+"Seleccione la pizza"+"\n"
                                             +"Seleccione ingrediente"+"\n"      
                                             +"Seleccione Bebida"+"\n"
                                             +"Ingrese cantidad de pizza y bebidas"
                                           
                                                    
                                                                                );
           
      
      
      }
      
      else{
    //empieza a inciar el hilo de la barra de progreso

      activaEtiquetas();
      jButton1.setEnabled(false);
      Thread Hilo = new Ventanas.HiloBarra(jProgressBar1);
      Hilo.start();
      Combo1.setEnabled(false);
      Combo2.setEnabled(false);
      Combo3.setEnabled(false);
      campo1.setEnabled(false);
      campo2.setEnabled(false);
      
      }
        

      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo2ActionPerformed

        //aqui valida para solo aceptar numeros

    private void campo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo1KeyTyped
         String s1=String.valueOf(evt.getKeyChar());

        if(!(s1.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_campo1KeyTyped
 //aqui valida para solo aceptar numeros
    private void campo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo2KeyTyped
     String s1=String.valueOf(evt.getKeyChar());

        if(!(s1.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_campo2KeyTyped




    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo1;
    private javax.swing.JComboBox Combo2;
    private javax.swing.JComboBox Combo3;
    private javax.swing.JLabel Estadopedido;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JLabel eligebebida;
    private javax.swing.JLabel eligeingrediente;
    private javax.swing.JLabel eligepizza;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel getfecha;
    private javax.swing.JLabel gethora;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables
}
