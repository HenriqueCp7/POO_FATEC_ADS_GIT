import javax.swing.JOptionPane;

public class EntradaSaida{
    public static void main(String args[]){
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro valor"));
        double soma = a + b;
        JOptionPane.showMessageDialog(null, soma);
    }
}