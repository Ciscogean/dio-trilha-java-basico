public class Operadores {
    
    public static void main(String[] args) {
        String nomeUm = "Cisco";
        String nomeDois = "Cisco";
        
        System.out.println(nomeUm.equals(nomeDois));
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numero Dois?" + simNao);
        
    }
}
