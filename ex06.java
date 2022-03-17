import javax.swing.JOptionPane;
public class ex06 {
    public static void main(String[] args) {
        Integer ano;
            ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));

            if (ano % 4 == 0 || ano%100==0 || ano%400==0) {
                JOptionPane.showMessageDialog(null, "Ano Bissexto!");
            }
            else { 
                JOptionPane.showMessageDialog(null, "Não é Bissexto!");
            }
        }
    
}
