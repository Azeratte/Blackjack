public class Stack {
    private No topo;

    public Stack(){
        this.topo = null;
    }

    public boolean isEmpty() {
        if(this.topo == null)
            return true;
        else
            return false;
    
    }

    public void push(Carta elem) {
        No novoNo = new No(elem);

        No aux = topo;

        novoNo.prox = aux;

        this.topo = novoNo;

    }

    public Carta pop() {
        if(this.isEmpty()){
            System.out.println("Pilha vazia");          
        }

        No aux = topo;
        topo = topo.prox;
        return aux.dado;
    }      

    

}
