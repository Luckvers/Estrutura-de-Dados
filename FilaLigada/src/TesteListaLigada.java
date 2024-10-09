
public class TesteListaLigada {
    
    public static void main(String[] args){
        
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.adicionar("Rodrigo");
        minhaLista.adicionar("Pedro");
        minhaLista.adicionar("Carlos");
        minhaLista.adicionar("Creusa");
        
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }
        minhaLista.adicionar("Rafael", 2);
        System.out.println(" ========================");
        
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }
        System.out.println("\nRemovendo o elemento na posição 2:");
        minhaLista.remover(2); // Remove "Rafael"
        
        // Imprime lista após remoção
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }
        System.out.println("\nRemovendo o elemento na posição 0:");
        minhaLista.remover(0); // Remove 'Rodrigo'
        
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }
        
        System.out.println("\nTentando remover em uma posição inválida:");
        minhaLista.remover(10); // Teste para uma posição inválida
    }
    
}
