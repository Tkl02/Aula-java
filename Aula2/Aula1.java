package Aula2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Aula1{
   public static void main(String[] args) {

      try (Scanner scan = new Scanner(System.in)) {
            double a, b;                                //← funçao para ler e definir numeros
            System.out.println("digite um numero: ");   //←
            a = scan.nextDouble();                      //←

///////////////////////////////////////////// RAIZ /////////////////////////////////////////
            b = Math.sqrt(a);

            System.out.println("a raiz de " + a + " e: " + b);

///////////////////////////////////// RAIZ, EXP, LOG, c/ REALINT ////////////////////////////////
            b = (Math.exp(1/2 * Math.log(a)));

            DecimalFormat formatador = new DecimalFormat(".");

            System.out.println("o valor (int de exp, log) de "+ a + " e: "+ formatador.format(b));

//////////////////////////////////// RAIZ, EXP, LOG, S/ REALINT ///////////////////////////////
   
            b = (Math.exp(1/2 * Math.log(a)));

            System.out.println("o valor de (exp, log) "+ a + " e: "+ b);
/////////////////////////////// formatar(sen(45*pi/180)+0.0001,3) ///////////////////////////////
       b = (float) (Math.sin(45*Math.PI/180)+0.00013);

      System.out.println("o valor((sen(45*pi/180)+0.0001,3) e: " + formatador.format(b));
//////////////////////////////// potencia com exp e log e formatar ///////////////////////////////
      b = (Math.exp(3*Math.log(8))+0.0013);

      System.out.println("o valor(potencia com exp e log) e: " + formatador.format(b));
/////////////////////////////// potencia com exp e log sem formatar: //////////////////////////////
b = (Math.exp(3*Math.log(8))+0.0013);

System.out.println("o valor(potencia com exp e log) e: " + b);
////////////////////////////// potencia com exp e log sem formatar ///////////////////////////////
b = Math.exp(3*Math.log(8));

System.out.println("o valor(potencia com exp e log) e: "+b);
///////////////////////////// raiz cubica  ///////////////////////////////////////////////////////
b = Math.exp(1/3*Math.log(8));

System.out.println("o valor(raiz cubica) e: "+b);
///////////////////////////// absoluto //////////////////////////////////////////////////////////
b = Math.abs(-8);

System.out.println("o valor(absoluto) e: "+b);
//////////////////////////// conversor de decimal //////////////////////////////////////////////
System.out.println("o valor em float e: " + a);
int c = (int) Math.round(a);
System.out.println("o valor em int e: " + c);
////////////////////////////////////////////////////////////////////////////////////////////////
System.exit(0);
      }
   }
}