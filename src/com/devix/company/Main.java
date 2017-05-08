package com.devix.company;

/*Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:
2, 5, 7, 10, 12, 15, 17, . . ., 1 800*/
public class Main {

    public static void main(String[] args) {
        int i;
        int bra = 't';

        for (i = 0; i <800;) {
            if (bra == 't'){
                i = i + 2;
                bra = 'f';
            }
            else {
                i = i + 3;
                bra = 't';
            }
            System.out.println(+i);
        }
    }
}