import javax.swing.JOptionPane;

public class quest5 {
    public static void main(String[] args) {
        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String[] operacoes = {"+", "-", "x", "/"};
            String op = (String) JOptionPane.showInputDialog(null, "Escolha a operação:",
                    "Operação", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

            double resultado = 0;
            switch (op) {
                case "+": resultado = n1 + n2; break;
                case "-": resultado = n1 - n2; break;
                case "x": resultado = n1 * n2; break;
                case "/":
                    if (n2 == 0) throw new ArithmeticException();
                    resultado = n1 / n2; break;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: divisão por zero.");
        }
    }
}
