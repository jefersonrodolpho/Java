 package unidade2;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class OpcoesPagamento {
    public static void main(String[] args) {
      double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do produto"));
      double produto_avista = valor_produto * 0.9;
      double produto_parcelado = valor_produto / 3;

      System.out.println("O produto pago a vista tem 10% de desconto e sairá por "+ produto_avista);
      System.out.println("O produto pago a prazo em 3 x de "+ produto_parcelado);
    }

}
