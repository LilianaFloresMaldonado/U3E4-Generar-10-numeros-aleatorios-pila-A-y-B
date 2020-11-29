package trabajo4;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        pila pila = new pila();
        pila A = new pila();
        pila B = new pila();
        Scanner leer= new Scanner(System.in);
        boolean salir = false;
        int dato;
        do {
            salir = false;
            System.out.println("      ********MENÚ*********");
            System.out.println("    1.-Generar numeros random");
            System.out.println("    2.-Eliminar");    
            System.out.println("    3.-vaciar pila");
            System.out.println("    4.-Mostrar pila");
            System.out.println("    5.-Salir");
            System.out.println("Elige alguna de las opciones");            
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    pila.Random(A, B);
                    System.out.println("Numeros random generados");
                    break;
                case 2:
                    if (!A.estaVacia()) {
                        System.out.println("Numero elimidado: " + A.eliminar());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                    
                case 3:
                    A.Empty();
                    break;
               
                case 4:
                    if (!A.estaVacia()) {
                        System.out.println("Pila A: ");
                        A.Mostrar();
                        System.out.println("\nPila B: ");
                        B.Mostrar();
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                
                case 5:
                    salir = true;
                    System.out.println("El programa ha finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("");
        } while (!salir);
    }
  }
    


