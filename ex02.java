import javax.swing.JOptionPane;
public class ex02 {
    public static void main(String[] args) {
        Double a, b, c, delta, x1, x2;
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));

            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));

            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));

            delta = b * b - 4*a*c;

            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / 2.0 * a;
                x2 = (-b - Math.sqrt(delta)) / 2.0 * a;
                JOptionPane.showMessageDialog(null, "As raizes são:" + x1 + x2);
            }
            else if (delta == 0){
                x1 = (-b + Math.sqrt(delta)) / 2.0 * a;
                JOptionPane.showMessageDialog(null, "A raiz é: " + x1);
            }
            else { 
                JOptionPane.showMessageDialog(null, "Não pode ser calculado!");
            }
        }
    }

    

