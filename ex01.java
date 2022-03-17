import javax.swing.JOptionPane;
public class ex01 {
    public static void main(String[] args) {
    Integer numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Seu Numero é Negativo!");
        }
        else {
            if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Seu Numero é Positivo");
        }
        else { 
            JOptionPane.showMessageDialog(null, "Numero Nulo");
        }
    }
    }
}
