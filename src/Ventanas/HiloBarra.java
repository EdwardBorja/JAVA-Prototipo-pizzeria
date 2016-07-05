package Ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;
 //se crea el hilo
public class HiloBarra extends Thread{
    
    JProgressBar barra;
    
    private static int retraso =230;
    
    public HiloBarra(JProgressBar barrar){
        this.barra = barrar;
        
    }
    
    @Override
    public void run(){
        
         //obtiene minimo y maximo
        int minimo = barra.getMinimum();
        int maximo = barra.getMaximum();
        
         //empieza a correr el porcentaje de la barra  lo va aumentando de 1 en 1 
        Runnable ejecutor = new Runnable(){
            @Override
            public void run(){
            
                int valorActual = barra.getValue();
                barra.setValue(valorActual + 1);
                
                
              
            }
        };
        
        for(int i=minimo; i<maximo; i++){
            try {
                 //aqui se llama el tiempo de retraso del avance
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(retraso);
            } catch (InterruptedException ex) {} 
              catch (InvocationTargetException ex) {}   
        }
    }
}