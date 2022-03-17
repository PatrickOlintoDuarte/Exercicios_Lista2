import javax.swing.JOptionPane;
public class ex04 {
    public static void main(String[] args) {
        Integer dia;
            dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            switch (dia) {
                case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
                case 5:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
                case 6:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
                case 7:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            }
     }
}

