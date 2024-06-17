package unidade3;

import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura, peso_ideal_homem, peso_ideal_mulher;
        String sexo;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura"));
        sexo = JOptionPane.showInputDialog("Digite sexo");

        if (sexo.equalsIgnoreCase ("M"))
        {
            peso_ideal_homem = (altura*72.7) - 58;
            System.out.println("O peso ideal do homem é de "+peso_ideal_homem);
        }
        else{
            peso_ideal_mulher = (altura*62.1) - 44.7;
            System.out.println("O peso ideal da mulher é de "+peso_ideal_mulher);
        }
    }
}
