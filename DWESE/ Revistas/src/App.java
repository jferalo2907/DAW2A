import java.util.Scanner;

import negocio.Catalogo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Catalogo catalogo = new Catalogo();

        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 0:
                    inicializaCatalogo(catalogo);
                    break;
                case 1:
                    muestraRevistas(catalogo);
                    break;
                case 2:
                    muestraEstudiantes(catalogo);
                    break;
                case 3:
                    muestraRevistasConAccesoDisponible(catalogo);
                    break;
                case 4:
                    daAccesoRevistaAEstudiante(scanner, catalogo);
                    break;
                case 5:
                    quitaAccesoRevistaAEstudiante(scanner, catalogo);
                    break;
                case 6:
                    muestraInformacionCompletaEstudiante(scanner, catalogo);
                    break;
                case 7:
                    muestraInformacionCompletaRevista(scanner, catalogo);
                    break;
                case 8:
                    muestraInformacionCompleta(scanner, catalogo);
                    break;
                case 9:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);
    }

    private static void mostrarMenu() { 
        System.out.println("CATÁLOGO DE REVISTAS CIENTÍFICAS");
        System.out.println("0. Inicializar el catálogo");
        System.out.println("1. Mostrar todas las revistas");
        System.out.println("2. Mostrar todos los estudiantes");
        System.out.println("3. Mostrar sólo las revistas con acceso disponible");
        System.out.println("4. Dar acceso a una revista a un estudiante");
        System.out.println("5. Quitar acceso a una revista a un estudiante");
        System.out.println("6. Mostrar información completa de una estudiante");
        System.out.println("7. Mostrar información completa de una revista");
        System.out.println("8. Mostrar información completa del sistema");
        System.out.println("9. Salir");
        System.out.print("Introduzca una opción... ");
    }
    
    private static void inicializaCatalogo(Catalogo catalogo) {

        catalogo.eliminaEstudiantesYRevistas();

        catalogo.registraEstudiante("11111111A", "Lucia Torres", 2);
        catalogo.registraEstudiante("22222222B", "Carlos Mendez", 3);
        catalogo.registraEstudiante("33333333C", "Ana Ruiz", 2);
        catalogo.registraEstudiante("44444444D", "Mario Gomez", 3);
        catalogo.registraEstudiante("55555555E", "Clara Lopez", 2);
        catalogo.registraEstudiante("66666666F", "Pablo Rodriguez", 3);
        catalogo.registraEstudiante("77777777G", " Laura Fernandez", 2);
        catalogo.registraEstudiante("88888888H", "David Sánchez", 3);
        catalogo.registraEstudiante("99999999I", "Sofia Martin", 2);
        catalogo.registraEstudiante("00000000J", "Jorge Navarro", 3);

        catalogo.registraRevista("REV001", "Nature", "Springer", 3);
        catalogo.registraRevista("REV002", "Science", "AAAS", 2);
        catalogo.registraRevista("REV003", "IEEE Transactions", "IEEE", 4);
        catalogo.registraRevista("REV004", "ACM Computing Surveys", "ACM", 2);
        catalogo.registraRevista("REV005", "The Lancet", "Elsevier", 1);

    }

    private static void muestraRevistas(Catalogo catalogo) {
        System.out.println(catalogo.mostrarRevistas());
    }

    private static void muestraEstudiantes(Catalogo catalogo) {
        System.out.println(catalogo.mostrarEstudiantes());
    }

    private static void muestraRevistasConAccesoDisponible(Catalogo catalogo) {
        System.out.println(catalogo.muestraRevistasConAccesoDisponible());
    }

    private static void daAccesoRevistaAEstudiante(Scanner scanner, Catalogo catalogo) {
       catalogo.daAccesoRevistaAEstudiante(scanner, catalogo);
    }

    private static void quitaAccesoRevistaAEstudiante(Scanner scanner, Catalogo catalogo) {
        catalogo.quitaAccesoRevistaAEstudiante(scanner, catalogo);
    }

    private static void muestraInformacionCompletaRevista(Scanner scanner, Catalogo catalogo) {
        // Implementar
    }

    private static void muestraInformacionCompletaEstudiante(Scanner scanner, Catalogo catalogo) {
        catalogo.muestraInformacionCompletaEstudiante(scanner, catalogo);
    }

    private static void muestraInformacionCompleta(Scanner scanner, Catalogo catalogo) {
        catalogo.muestraInformacionCompleta(scanner, catalogo);
    }

   
}