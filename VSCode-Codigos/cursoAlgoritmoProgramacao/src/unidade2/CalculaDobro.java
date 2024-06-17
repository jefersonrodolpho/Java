package unidade2;

import javax.swing.JOptionPane;

public class CalculaDobro {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        var numero = JOptionPane.showInputDialog("Digite o numero");
        var dobro = Double.parseDouble(numero) * 2;
        JOptionPane.showMessageDialog(null, "O resultado é "+dobro);

        }

    }
