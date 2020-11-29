package trabajo4;

public class pila {
    private Nodo cima;
    private int tamanio;

    public pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void empujar(int dato) {
        Nodo N = new Nodo(dato);
        N.siguiente = cima;
        cima = N;
        tamanio++;
    }

    public int eliminar() {
        int aux = cima.Dato;
        cima = cima.siguiente;
        tamanio--;
        return aux;
    }

    public int peek() {
        return cima.Dato;
    }

    public void Empty() {
        while (!estaVacia()) {
            eliminar();
        }
        System.out.println("La pila esta vacia");
    }

    public int size() {
        return tamanio;
    }

    public void Mostrar() {
        Nodo aux = cima;

        while (aux != null) {
            System.out.println("[" + aux.Dato + "]");
            aux = aux.siguiente;
        }
        System.out.println("");

    }
    
    public void Random(pila A, pila B) {
        
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 500) + 50;
            insertar(A, B, n);
        }
    }
    public void insertar(pila A, pila B, int d) {
        if (A.estaVacia()) {
            A.empujar(d);
        } else {
            int cima = A.eliminar();
            if (d >= cima) {
                A.empujar(cima);
                A.empujar(d);
            } else {
                A.empujar(cima);
                B.empujar(d);
            }
          }
        } 
}
