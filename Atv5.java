
package Atividades;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Double prodvalor,parcelas;
        System.out.println("Digite o valor da compra para saber ");
        Scanner teclado=new Scanner(System.in);
        prodvalor=teclado.nextDouble();
        parcelas=prodvalor/5;
        System.out.println("O valor de cada parcela é:"+parcelas);
        
        
    }
    
}
