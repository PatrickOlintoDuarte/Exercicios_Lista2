import javax.swing.JOptionPane;
public class ex05 {
    public static void main(String[] args) {
        Integer dia;
            dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            switch (dia) {
                case 1:
                JOptionPane.showMessageDialog(null, "Janeiro: 31 Dias");
                case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro: 28 Dias");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Março: 31 Dias");
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Abril: 30 Dias");
                break;
                case 5:
                JOptionPane.showMessageDialog(null, "Maio: 31 Dias");
                break;
                case 6:
                JOptionPane.showMessageDialog(null, "Junho: 30 Dias");
                break;
                case 7:
                JOptionPane.showMessageDialog(null, "Julho: 30 Dias");
                break;
                case 8:
                JOptionPane.showMessageDialog(null, "Agosto: 31 Dias");
                break;
                case 9:
                JOptionPane.showMessageDialog(null, "Setembro: 30 Dias");
                break;
                case 10:
                JOptionPane.showMessageDialog(null, "Outubro: 31 Dias");
                break;
                case 11:
                JOptionPane.showMessageDialog(null, "Novembro: 30 dias");
                break;
                case 12:
                JOptionPane.showMessageDialog(null, "Dezembro: 31 dias");
                break;
            }
     }
}
