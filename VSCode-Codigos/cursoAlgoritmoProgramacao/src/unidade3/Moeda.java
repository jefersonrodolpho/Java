package unidade3;

import javax.swing.JOptionPane;

public class Moeda {
    public static void main(String[] args) {
       
        double valor, valor_convertido;
        int tipo_moeda;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido"));
        tipo_moeda = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de moeda [1-Libra][2-Dólar][3-Euro]"));

        switch (tipo_moeda) {
            case 1: // Libra
                {
                    valor_convertido = valor/5;
                    JOptionPane.showMessageDialog(null, "O valor convertido em Libras é de "+valor_convertido);
                    break;
                }

            case 2: // Dólar
                {
                    valor_convertido = valor/4;
                    JOptionPane.showMessageDialog(null, "O valor convertido em Dólar é de "+valor_convertido );
                    break;
                }

            case 3: // Euro
                {
                    valor_convertido = valor/4.4;
                    JOptionPane.showMessageDialog(null, "O valor convertido em Euro é de "+valor_convertido);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opção digitada incorreta");

        }
    


    }
}
