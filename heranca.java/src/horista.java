public class horista extends Empregado {
   
    private double horas;

    // construtor para inicializar nome, endereço e horas, salário será calculado
    public horista(String nome, String endereco, double horas) {
        super(nome, endereco, 0); // Inicializa o salário como 0
        this.horas = horas;
        calcularSalario(); // Calcula o salário com base nas horas
    }

    // getters e setters
    public void setHoras(double horas) {
        this.horas = horas;
        calcularSalario(); // Recalcula o salário ao mudar as horas
    }

    public double getHoras() {
        return horas;
    }

    //calculo do salário baseado nas horas trabalhadas
    public void calcularSalario() {
        setSalario(horas * 50); // Usando o setter para garantir o encapsulamento
    }
}

