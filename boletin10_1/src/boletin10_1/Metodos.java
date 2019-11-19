package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
private int num;
private int num2;
private int intentos;

public void pedirDatos(){  
do {
int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero a adiviñar"));
this.num=numero;
int intento = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos"));
this.intentos=intento;
} while (num<=50 ||num>=1);
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
if (num2>num)
JOptionPane.showMessageDialog(null, "O teu número é maior");
else if (num2<num)
JOptionPane.showMessageDialog(null, "O teu número é menor");
}
if (num2==num)
JOptionPane.showMessageDialog(null, "Felicidades, acertaches!");
else
JOptionPane.showMessageDialog(null, "Perdiches D:");
}


}
