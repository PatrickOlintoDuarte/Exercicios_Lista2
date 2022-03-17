import javax.swing.JOptionPane;
public class ex03 {
    public static void main(String[] args) {
        Integer a, b, c;
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));

            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));

            if (a > b && a > c){
                JOptionPane.showMessageDialog(null, "O primeiro Numero é o maior" + a);
            }
            else {
                if (b > a && b > c) {
                JOptionPane.showMessageDialog(null, "O segundo Numero é o maior" + b);
            }
            else { 
                JOptionPane.showMessageDialog(null, "O terceiro Numero é o maior" + c);
            }
        }
    }
}

