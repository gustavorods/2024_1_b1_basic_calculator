import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Variáveis
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String decisao;
        double valor1, valor2, resultado;


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
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
                calculadora.Subtrair(valor1, valor2);
                break;
            case "Multiplicação":
                resultado = calculadora.Multiplicar();
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + resultado);
                break;
            case "Divisão":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: "));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: "));
                resultado = calculadora.Divisao(valor1, valor2);
                JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + resultado);

        }
    }
}