public class folhapgto {

    public static void main(String[] args) {
        mensalista men1, men2;
        horista hora1, hora2;

        // Empregados mensalistas 
        men1 = new mensalista("Jose", "Rua abc", "Junior");
        men1.imprimir();

        men2 = new mensalista("Ana", "Rua sem fim", "Senior");
        men2.imprimir();
        
        // Empregados horistas
        hora1 = new horista("Carlos", "Rua xyz", 20);
        hora1.imprimir();
         
        hora2 = new horista("Cristina", "Rua do centro", 100);
        hora2.imprimir();
    }    
}

