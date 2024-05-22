public class Empregado {

    private String nome;
    private String endereco;
    private double salario;

    // construtor para inicializar nome, endereço e salário
    public Empregado(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // calculo do IRPF  
    public double calcularIRPF() {
        double aux = 0;
        if (salario <= 2112.00) {
            aux = 0; // Isento até 2112.00
        } else if (salario <= 2826.65) {
            aux = (salario - 2112.00) * 0.075; // 7.5% para faixa de 2112.01 a 2826.65
        } else if (salario <= 3751.05) {
            aux = (2826.65 - 2112.00) * 0.075 + (salario - 2826.65) * 0.15; // 15% para faixa de 2826.66 a 3751.05
        } else if (salario <= 4664.68) {
            aux = (2826.65 - 2112.00) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salario - 3751.05) * 0.225; // 22.5% para faixa de 3751.06 a 4664.68
        } else {
            aux = (2826.65 - 2112.00) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275; // 27.5% acima de 4664.68
        }
        return aux;
    }

    // calculO DO INSS 
    public double calcularINSS() {
        double aux = 0;
        if (salario <= 1412.00) {
            aux = salario * 0.075; // 7.5% até 1412.00
        } else if (salario <= 2826.65) {
            aux = 1412.00 * 0.075 + (salario - 1412.00) * 0.09; // 9% para faixa de 1412.01 a 2826.65
        } else if (salario <= 4664.68) {
            aux = 1412.00 * 0.075 + (2826.65 - 1412.00) * 0.09 + (salario - 2826.65) * 0.12; // 12% para faixa de 2826.66 a 4664.68
        } else {
            aux = 1412.00 * 0.075 + (2826.65 - 1412.00) * 0.09 + (4664.68 - 2826.65) * 0.12 + (salario - 4664.68) * 0.14; // 14% acima de 4664.68
        }
        return aux;
    }

    //imprimindo informações do empregado
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salário: " + getSalario());
        System.out.println("IRPF: " + calcularIRPF());
        System.out.println("INSS: " + calcularINSS());
    }
}
