package negocio;
import java.util.Scanner;

public class Catalogo {

    private Estudiante[] estudiantes;
    private Revista[] revistas;

    public Catalogo() {
        this.estudiantes = new Estudiante[10];
        this.revistas = new Revista[5];
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public String mostrarRevistas() {
        String cadena = "";
        for (int i = 0; i < revistas.length; i++) {
            cadena += revistas[i].toString();
        }
        return cadena;
    }

    public String muestraRevistasConAccesoDisponible() {
       String cadena = "";
        for (int i = 0; i < revistas.length; i++) {
            
            if (revistas[i].getVisualizacionesActivas() < revistas[i].getMaxVisualizacionesSimultaneas()) {
                cadena += revistas[i].toString();
            }            
        }
        return cadena;
    }

    public String mostrarEstudiantes() {
        String cadena = "";
        for (int i = 0; i < estudiantes.length; i++) {
            cadena += estudiantes[i].toString();
        }
        return cadena;
    }

    public void eliminaEstudiantesYRevistas() {
        for (int i = 0; i < estudiantes.length; i++) {
            this.estudiantes[i] = null;
        }
        for (int i = 0; i < revistas.length; i++) {
            this.revistas[i] = null;
        }
    }

    public void registraEstudiante(String dni, String nombre, int maxVisualizacionesSimultaneas) {
        int posicionEstudiante = buscaHuecoEstudiante(estudiantes);
        Estudiante estudiante = new Estudiante(dni, nombre, maxVisualizacionesSimultaneas);
        estudiantes[posicionEstudiante] = estudiante;

    }

    public void registraRevista(String codigo, String nombre, String editorial, int maxVisualizacionesSimultaneas) {
        int posicionRevistas = buscaHuecoRevista(revistas);
        Revista revista = new Revista(codigo, nombre, editorial, maxVisualizacionesSimultaneas);
        revistas[posicionRevistas] = revista;
    }

    public Estudiante buscaEstudiantePorDni(String dni) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getDni().equalsIgnoreCase(dni)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public Revista buscaRevistaPorCodigo(String codigo) {
        for (int i = 0; i < revistas.length; i++) {
            if (revistas[i].getCodigo().equalsIgnoreCase(codigo)) {
                return revistas[i];
            }
        }
        return null;
    }

    // Implementar los métodos que se consideren necesarios

    /*
     * private static int buscaX(int[] coleccion) {
     * boolean encontrado = false;
     * int i = 0;
     * while (i < coleccion.length && !encontrado) {
     * if (coleccion[i] == 0) {
     * encontrado = true;
     * } else {
     * i++;
     * }
     * }
     * return i;
     * }
     */

    public static int buscaHuecoRevista(Revista[] revistas) {
        boolean encontrado = false;
        int i = 0;
        while (i < revistas.length && !encontrado) {
            if (revistas[i] == null) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }

    public static int buscaHuecoEstudiante(Estudiante[] estudiantes) {
        boolean encontrado = false;
        int i = 0;
        while (i < estudiantes.length && !encontrado) {
            if (estudiantes[i] == null) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }

    public void daAccesoRevistaAEstudiante(Scanner scanner, Catalogo catalogo) {
        System.out.print("Introduce el dni del alumno buscado: ");
        String dniBuscado = scanner.nextLine();

        if (catalogo.buscaEstudiantePorDni(dniBuscado) == null) {
            System.out.println("No hay ningun alumno con ese dni");
        } else {
            Estudiante estudianteBuscado = catalogo.buscaEstudiantePorDni(dniBuscado);
            System.out.print("Introduce el codigo de la revista: ");
            String codigoBuscado = scanner.nextLine();

            if (catalogo.buscaRevistaPorCodigo(codigoBuscado) == null) {
                System.out.println("No hay ninguna revista.");
            }

            else {
                Revista revistaBUscada = catalogo.buscaRevistaPorCodigo(codigoBuscado);

                if (revistaBUscada.getVisualizacionesActivas() < revistaBUscada.getMaxVisualizacionesSimultaneas()) {

                    if (estudianteBuscado.comprobarAccesoRevista(revistaBUscada)) {
                        System.out.println("El estudiante ya tiene acceso a esta revista.");
                    } else {

                        if (estudianteBuscado.puedeVisualizarOtraRevista()) {
                            revistaBUscada.añadirVisualizacion();
                            estudianteBuscado.añadirRevista(revistaBUscada);
                            System.out.println("Hecho correcto");

                        } else {
                            System.out.println("El estudiante no puede visualizar mas revistas");
                        }
                    }
                } else {
                    System.out.println("No se puede acceder mas a esta revista actualmente");
                }

            }

        }
    }

    public void quitaAccesoRevistaAEstudiante(Scanner scanner, Catalogo catalogo) {
        System.out.print("Introduce el dni del alumno buscado: ");
        String dniBuscado = scanner.nextLine();

        if (catalogo.buscaEstudiantePorDni(dniBuscado) == null) {
            System.out.println("No hay ningun alumno con ese dni");
        } else {
            Estudiante estudianteBuscado = catalogo.buscaEstudiantePorDni(dniBuscado);
            System.out.print("Introduce el codigo de la revista: ");
            String codigoBuscado = scanner.nextLine();

            if (catalogo.buscaRevistaPorCodigo(codigoBuscado) == null) {
                System.out.println("No hay ninguna revista.");
            }

            else {
                Revista revistaBUscada = catalogo.buscaRevistaPorCodigo(codigoBuscado);

                if (estudianteBuscado.comprobarAccesoRevista(revistaBUscada)) {
                    estudianteBuscado.quitarRevista(revistaBUscada);
                    System.out.println("Hecho correcto");
                    
                } else {
                    System.out.println("El alumno no tiene acceso a esta revista actualmente");
                }
            }

        }

    }

    public void muestraInformacionCompletaEstudiante(Scanner scanner, Catalogo catalogo) {
        System.out.print("Introduce el dni del alumno buscado: ");
        String dniBuscado = scanner.nextLine();

        if (catalogo.buscaEstudiantePorDni(dniBuscado) == null) {
            System.out.println("No hay ningun alumno con ese dni");
        } else {
            Estudiante alumnoBuscado = catalogo.buscaEstudiantePorDni(dniBuscado);
            System.out.println(alumnoBuscado.toString());
            System.out.println(alumnoBuscado.mostrarRevistasActivas());
            System.out.println(alumnoBuscado.mostrarRevistasHistoricas());
        }
    }

     public void muestraInformacionCompleta(Scanner scanner, Catalogo catalogo) {
        System.out.println("Eliga visualizacion por Revista(1) o por Estudiantes(2)");
        int opcion = scanner.nextInt();

        if (opcion==1) {
        System.out.println(mostrarRevistas());
        }
        else if (opcion==2) {
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println(estudiante.toString());
            System.out.println(estudiante.mostrarRevistasActivas());
            System.out.println(estudiante.mostrarRevistasHistoricas());
        }
        }
        else{System.out.println("Opcion incorrecta");}
    }


}