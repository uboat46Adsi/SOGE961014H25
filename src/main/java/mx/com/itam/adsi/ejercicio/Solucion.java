package mx.com.itam.adsi.ejercicio;

/** Represents a Solucion for adsi´s exam.
* @version 1.0.1
* @since 1.0
*/
public class Solucion {
    /** Represents a Node.
    * @version 1.0.1
    * @since 1.0
    */
    class Node {
        String data;
        Node next;
        
        /** Creates a Node with the specified data.
        * @param data The Node’s data.
        */
        public Node (String data) {
            this.data = data;
            this.next = null;
        }
        
        /**
         * Rotates a sequence of concatenated Nodes.
         * In example:
         * 
         * Having the next nodes
         *  A-->B-->C-->D-->E-->F-->
         * 
         * Calling
         * A.gus() would make this nodes have the next structure
         *  F-->E-->D-->C-->B-->A-->
         *        
         */
        private Node gus() {
            Node next, nextsChild;
            
            if(this.next == null) {
                return this;
            }

            next = this.next;
            this.next = null;
            nextsChild = next.gus();//returns the last Node;
            next.next = this;//rotate sequence
            return nextsChild;
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
            System.out.print(this.data);
            System.out.print("-->");
            if(this.next != null) {
                this.next.prn();
            }
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
        Solucion sol = new Solucion();
        sol.ok();
    }

}

