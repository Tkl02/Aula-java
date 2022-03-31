package Aula;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Aula{
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);      //←
      double a, b;                                //← funçao para ler e definir numeros
      System.out.println("digite um numero: ");   //←
      a = scan.nextDouble();                      //←

///////////////////////////////////////////// RAIZ /////////////////////////////////////////
      b = Math.sqrt(a);

      System.out.println("a raiz de " + a + " e: " + b);

///////////////////////////////////// RAIZ, EXP, LOG, c/ REALINT ////////////////////////////////
      b = (Math.exp(1/2 * Math.log(a)));

      DecimalFormat formatador = new DecimalFormat(".");

      System.out.println("o valor int de exp, log de "+ a + " e: "+ formatador.format(b));

//////////////////////////////////// RAIZ, EXP, LOG, S/ REALINT ///////////////////////////////
   
      b = (Math.exp(1/2 * Math.log(a)));

      System.out.println("o valor de exp, log "+ a + " e: "+ b);

//////////////////////////////////


   }
}