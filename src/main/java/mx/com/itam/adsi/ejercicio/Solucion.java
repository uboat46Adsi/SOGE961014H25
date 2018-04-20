package mx.com.itam.adsi.ejercicio;

public class Solucion {
    class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
        }
        
        Node gus() {
            if(next == null) return this;
            Node otro = next;
            next      = null;
            Node tavo = otro.gus();
            otro.next = this;
            return tavo;
        }
      
        /**
         * Imprime en la consola la secuencia de Nodos que 
         * componen a esta lista. Por ejemplo, para la lista
         * que devuelve el mÃ©todo "build", la invocaciÃ³n de
         * este mÃ©todo escribe en la consola: 
         * 
         * A-->B-->C-->D-->E-->F-->
         * 
         * Lo anterior serÃ­a lo que se visualiza en la consola 
         * justo despuÃ©s de ejecutar las siguintes dos lineas:
         * 
         *         Node a = build();
         *         a.prn();
         *         
         */
        void prn() {
            // Este mÃ©todo requiere sÃ³lo de 3 a 7 lineas de cÃ³digo para funcionar correctamente
        }
        
    }// ends Node class
    
    /**
     * COMENTARIO INCORRECTO:
     * 
     * MÃ©todo que crea 6 Nodos cada uno con una letra diferente y
     * luego a cada uno en su propiedad next le asigna en siguiente.
     * 
     * @return Node Regresa el primero que se creÃ³.
     */
    private Node build() {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el mÃ©todo "gus" con distintos casos de prueba
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    public static void main(String...argv) {
        Solucion sol = new Solucion().ok();
    }

}

