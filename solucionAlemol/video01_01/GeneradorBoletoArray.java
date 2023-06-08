package solucionAlemol.video01_01;

import java.util.Arrays;

/**
 * GeneradorBoleto
 */
public class GeneradorBoletoArray {

  private static final int NUMS = 5;
  private static final int VALOR_MIN = 1;
  private static final int VALOR_MAX = 50;

  public static int[] generaBoleto() {
    int[] numeros = new int[NUMS];
    for (int i = 0; i < NUMS; i++) {
      numeros[i] = generaNumero();
    }

    return numeros;
  }

  private static int generaNumero() {
    return (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) * VALOR_MIN);
  }

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      // Genero un boleto y lo imprimo por pantalla
      System.out.println(Arrays.toString(generaBoleto()));
    }
  }

}