package solucionAlemol.video01_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GeneradorBoleto
 */
public class GeneradorBoletoLista {

  private static final int NUMS = 5;
  private static final int VALOR_MIN = 1;
  private static final int VALOR_MAX = 50;

  public static List<Integer> generaBoleto() {
    List<Integer> numeros = new ArrayList<Integer>();
    for (int i = 0; i < NUMS;) {
      int newNum = generaNumero();
      if (!numeros.contains(newNum)) {
        numeros.add(newNum);
        i++;
      }
    }
    Collections.sort(numeros);
    return numeros;
  }

  private static int generaNumero() {
    return (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) * VALOR_MIN);
  }

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      // Genero un boleto y lo imprimo por pantalla
      System.out.println((generaBoleto()));
    }
  }

}