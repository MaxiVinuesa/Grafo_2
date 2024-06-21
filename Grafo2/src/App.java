import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scc = new Scanner(System.in);

        int opc=0;
        RGrafo adm = new RGrafo();
        GrafoAdcia gad = new GrafoAdcia(opc);


        do{
            System.out.println("Bienvenido Al Menu Interactivo.");
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1) Agregar Vertice");
            System.out.println("2) Agregar Arco");
            System.out.println("3) Recorrer (Profundidad)");
            System.out.println("4) Imprimir");
            System.out.println("5) Salir.");


            switch (opc){

                case 1:
                    System.out.println("Por favor ingrese el nombre / valor del vertice a insertar");
                    String vertice = scc.nextLine();
                    gad.nuevoVertice(vertice);
                    break;

                
                case 2:
                System.out.println("Ingrese el vertice base");
                String base = scc.nextLine();
                System.out.println("Ingrese el vertice final");
                String finali = scc.nextLine();
                gad.nuevoArco(base, finali);
                    break;


                case 3:
                System.out.println("Con que vertice desea realizar el recorrido?");
                String reco = scc.nextLine();
                adm.recorreProfundidad(gad ,reco);
                    break;



                case 5:
                System.out.println("Gracias por utilizar el menu interactivo.");
                    break;

                
                default:
                        System.out.println("OPERACION NO VALIDA. INGRESE UN VALOR VALIDO");
                    break;


            }
        }while (opc != 5);

    }
}
