package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos2 {
private int num;
private int num2;
private int intentos;

public void pedirDatos(){  
int numero =(int) (Math.random() * (51 - 0));
this.num=numero;
int intento = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos"));
this.intentos=intento;
}

public void adiviñar(){
do {
int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adiviña o numero entre 1 e 50"));
this.num2=numero2;
} while(num2>50 || num2<1); 
}

public void comparar(){
int cont;
for (cont=0;num!=num2 && cont<intentos;cont++){
adiviñar();
if (Math.abs(num-num2)<5 && (num-num2)!=0 )
JOptionPane.showMessageDialog(null, "Moi preto");
else if (Math.abs(num-num2)<10 && (num-num2)!=0)
JOptionPane.showMessageDialog(null, "Preto");
else if (Math.abs(num-num2)<20 && (num-num2)!=0)
JOptionPane.showMessageDialog(null, "Lonxe");
else if (Math.abs(num-num2)>20 && (num-num2)!=0)
JOptionPane.showMessageDialog(null, "Moi lonxe");   
}

if (num2==num)
JOptionPane.showMessageDialog(null, "Felicidades, acertaches!");
else
JOptionPane.showMessageDialog(null, "Perdiches D:");
}


}

