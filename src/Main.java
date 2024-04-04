import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Variáveis
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String decisao;
        double num1, num2, r;


        // Entrada de dados
        // Recebendo a decisão do usuário
        /* Para ficar mais fácil, vamos usar a caixa de opções
        que a importação JOptionPane nos oferece  */
        decisao = (String) JOptionPane.showInputDialog(
                null, //  significa que a caixa de diálogo será centralizada na tela.
                "Escolha uma opção",  //  mensagem exibida acima da caixa de escolha.
                "Caixa de escolha", // título da caixa de diálogo.
                JOptionPane.QUESTION_MESSAGE, //  É o tipo de ícone exibido na caixa de diálogo. Neste caso, é um ícone de interrogação.
                null, //  É o ícone customizado (neste caso, não estamos usando nenhum ícone customizado).
                opcoes, //  É o array de opções a serem exibidas na caixa de escolha.
                opcoes[0] //É o valor padrão selecionado quando a caixa de diálogo é exibida pela primeira vez.
        );


        // Processamento / Saída
        calculadora calculadora = new calculadora();
        switch (decisao) {
            case "Soma":
                calculadora.Somar();
                break;
            case "Subtração":
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
                calculadora.Subtrair(num1, num2);
                break;
            case "Multiplicação":
                r = calculadora.Multiplicar();
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + r);
                break;
            case "Divisão":
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
                r = calculadora.Divisao(num1, num2);
                JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + r);

        }
    }
}