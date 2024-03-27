import javax.swing.JOptionPane;
public class calculadora {
    // Atributos
    private double valor1;
    private double valor2;
    private double resultado;


    // Inicializando vaziu
    public calculadora() {
        this(0, 0);
    }


    // Inicializando cheio
    public calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }


    // Getter e Setter
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    // Métodos
    //Soma
    public void Somar() {
        // Entrada
        setValor1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: ")));
        setValor2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: ")));

        // Processamento
        setResultado(getValor1() + getValor2());

        // Saída
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + getResultado());
    }

    // Subtrair
    public void Subtrair(double v1, double v2) {
        // Processamrnto
        setResultado(v1 - v2);

        // saida
        JOptionPane.showMessageDialog(null, "resultado da Subtração: " + getResultado());
    }

    // Multiplicar
    public double Multiplicar() {
        // Entrada
        setValor1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1: ")));
        setValor2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2: ")));

        // Processamento
        setResultado(getValor1() * getValor2());

        // Saída
        return getResultado();
    }

    // Dividir
    public double Divisao(double v1, double v2) {
        // Processamrnto
        setResultado(v1 / v2);

        // Saída
        return getResultado();
    }
}
