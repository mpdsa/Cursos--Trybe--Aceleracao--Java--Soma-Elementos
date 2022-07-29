package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * The type Soma valores.
 */
public class SomaValores {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int[] myArray = new int [3];
    int soma = 0;

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    for (int index = 0; index < 3; index++) {
      System.out.println("Digite um número:");
      myArray[index] = scan.nextInt();
    }

    for (int count : myArray) {
      soma = soma + count;
    }

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("A soma é: " + soma);

  }

}
