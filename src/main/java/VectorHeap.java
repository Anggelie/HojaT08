public class VectorHeap<E> {
    private nodo Node;
    private String string;
    private String btree;

    public  void addNodo(){
        if(Node == null){
            Node = new nodo();
        }
        else{
            Node = Node;
        }
    }

    public String Buscar(String cadena){
        string = cadena;
        return string;
    }

    public void B_Help(nodo Nodo){
        if(Nodo == null) {
            return  ;
        }
    }
}
