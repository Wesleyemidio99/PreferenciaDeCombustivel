package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int alcool=0,gasolina=0,diesel=0,n;

        System.out.println("Digite sua preferencia de combustivel");
        System.out.println("1 - Alcool \n2 - Gasolina\n3 - Diesel\n4 - Resultados");
        n = valor.nextInt();

        while(n != 4){

            if(n ==1){
                alcool += 1;
            }
            else if(n == 2){
                gasolina += 1;
            }
            else {
                diesel += 1;

            }

            System.out.println("Digite sua preferencia de combustivel");
            System.out.println("1 - Alcool \n2 - Gasolina\n3 - Diesel\n4 - Resultados");
            n = valor.nextInt();

        }

        System.out.printf("Os resultados sao:\nAlcool = %d\nGasolina = %d\nDiesel = %d",alcool,gasolina,diesel);

    }
}