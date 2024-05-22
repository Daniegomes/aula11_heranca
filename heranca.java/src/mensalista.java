public class mensalista extends Empregado {

    private String cargo;

    // construtor para inicializar nome, endereço e cargo, salário será calculado
    public mensalista(String nome, String endereco, String cargo) {
        super(nome, endereco, 0); // Inicializa o salário como 0
        this.cargo = cargo;
        calcularSalario(); // Calcula o salário com base no cargo
    }

    // getters e setters
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
        calcularSalario(); // Recalcula o salário ao mudar o cargo
    }

    // calculO Do salário baseado no cargo
    public void calcularSalario() {
        switch (cargo) {
            case "Junior":
                setSalario(2500);
                break;
            case "Pleno":
                setSalario(3500);
                break;
            case "Senior":
                setSalario(5500);
                break;
            default:
                setSalario(0);
                break;
        }
    }
}

