package boletin9_2;

import javax.swing.JOptionPane;

public class Clase9_2 {
    
    public void calcular(){
        int i;
        int s=0;
        double p=1;
        for (i=10;i<=90;i++){
        s=i+s;
        p=i*p;
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + s +"\n El productor de los numeros es : "+p);
    }
    
            
        }


