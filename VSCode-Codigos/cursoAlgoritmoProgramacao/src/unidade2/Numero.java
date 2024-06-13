package unidade2;

import javax.swing.JOptionPane;

public class Numero {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informar o numero"));
        int anterior = numero - 1;
        int posterior = numero + 1;
        JOptionPane.showMessageDialog(null, "O valor o numero anterior="+anterior+" e o posterior="+posterior);
        
    }
}
