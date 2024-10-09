
public class ListaLigada {
    private Node inicio;
    private Node fim;
    private int tamanho;
    
    //Criando um construtor para permitir instanciar
    //uma lista ligada vazia.
    public ListaLigada(){
        inicio=null;
        fim=null;
        tamanho=0;        
    }    
    public void adicionar(Object info){
        //Adiciona um novo Nó na ultima posição da lista ligada.
        Node novoNo;
        if(tamanho==0){
        //Criando o primeiro Nó que aponta para null        
            novoNo=new Node(info,null) ;
            //Atribui o ponteiro inicio e fim para o primeiro Nó        
            inicio = fim = novoNo;
            tamanho++;//Incrementa tamanho
        }
        else{
            novoNo = new Node(info,null);
            //Atribui o ponteiro do ultimo Nó para o NovoNó
            //fim é somente um ponteiro....
            fim.setProximoNo(novoNo);
            //Atribui o ponteiro fim para o NovoNo
            fim=novoNo;
            //Incrementa tamanho
            tamanho++;
        }
    }
    
    // Adiciona na posição definida pelo índice
    public void adicionar(Object info, int indice) {
        Node novoNo;

        if (indice == 0) {
            // Adiciona no início
            novoNo = new Node(info, inicio);
            inicio = novoNo;
            if (tamanho == 0) {
                fim = novoNo;
            }
            tamanho++;
        } else if (indice < tamanho) {
        	//Retorna o Nó definido pelo indice
            Node aux = percorreLista(indice);
            novoNo = new Node(info, aux);
            Node anterior = percorreLista(indice - 1);
            anterior.setProximoNo(novoNo);
            tamanho++;
        }
    }
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (posicao == 0) {
            // Remove o primeiro nó
            inicio = inicio.getProximoNo();
            if (tamanho == 1) {
                fim = null;  // Se a lista ficar vazia, ajusta o fim
            }
        } else {
            Node anterior = percorreLista(posicao - 1);
            Node atual = anterior.getProximoNo();
            anterior.setProximoNo(atual.getProximoNo());

            if (posicao == tamanho - 1) {
                fim = anterior;  // Se o nó removido era o último, ajusta o fim
            }
        }
        tamanho--;
    }
    
    public Object getLista(int indice){
        //Retornará o info do nó apontado pelo índice
        return percorreLista(indice).getInfo();        
    }
    private Node percorreLista(int indice){
        //Percorre a lista ligada e retorna o node referente ao índice
        Node aux=inicio;//Atribui o primeiro Nó a aux
        if(indice<= tamanho){//verifica se o índice é válido
            for (int i = 0; i < indice; i++) {
                //Percorre a lista até a posição indicada pelo índice
                aux = aux.getProximoNo();
            }
            return aux;
        }
        else
            return null;
    }
    
    public int getTamanho(){
        //Retorna o tamanho da lista
        return tamanho;
    }
    
    
}
