package negocio;

class Estudiante {
    private String dni;
    private String nombre;
    private int maxVisualizacionesSimultaneas;
    
    private Revista[] revistasActivas; // Topar al valor mínimo necesario
    private Revista[] revistasHistorico; // Topar al valor mínimo necesario

    public Estudiante(String dni, String nombre, int maxVisualizacionesSimultaneas) {
        this.dni = dni;
        this.nombre = nombre;
        this.maxVisualizacionesSimultaneas = maxVisualizacionesSimultaneas;
        this.revistasActivas = new Revista[maxVisualizacionesSimultaneas];
        this.revistasHistorico = new Revista[5];
    }

    public String mostrarRevistasHistoricas() {

        String cadena = "Revistas Historico\n";

        if (revistasHistorico != null) {
            for (int i = 0; i < revistasHistorico.length; i++) {

                if (revistasHistorico[i] != null) {
                    cadena += revistasHistorico[i].toString();
                }

            }
        }
        return cadena;
    }

    public String mostrarRevistasActivas() {
        String cadena = "Revistas Activas\n";
        if (revistasActivas != null) {
            for (int i = 0; i < revistasActivas.length; i++) {

                if (revistasActivas[i] != null) {
                    cadena += revistasActivas[i].toString();
                }

            }
        }
        return cadena;
    }

    public void añadirRevista(Revista revista) {
        int huecoRevistaActiva = buscaHuecoRevista(revistasActivas);
        revistasActivas[huecoRevistaActiva] = revista;
        int huecoRevistaHistorica = buscaHuecoRevista(revistasHistorico);

        boolean estaEnHistorico = false;

        for (int i = 0; i < revistasHistorico.length; i++) {
            if (revistasHistorico[i] == revista) {
                estaEnHistorico = true;
            }
        }
        if (!estaEnHistorico) {
            revistasHistorico[huecoRevistaHistorica] = revista;
        }
    }

    public void quitarRevista(Revista revista) {
        for (int i = 0; i < revistasActivas.length; i++) {
            if (revistasActivas[i] == revista) {
                revistasActivas[i] = null;
                revista.quitarVisualizacion();
            }
        }
    }

    public Revista[] getRevistasActivas() {
        return revistasActivas;
    }

    public Revista[] getRevistasHistorico() {
        return revistasHistorico;
    }

    public boolean comprobarAccesoRevista(Revista revista) {

        for (int i = 0; i < revistasActivas.length; i++) {
            if (revista == revistasActivas[i]) {
                return true;
            }
        }
        return false;
    }

    public String getDni() {
        return dni;
    }

    public String toString() {

        return "---------\n" + this.dni + "\n" + this.nombre + "\n" + this.maxVisualizacionesSimultaneas + "\n";

    }

    boolean puedeVisualizarOtraRevista() {
        int revistaActivaNum = 0;
        for (int i = 0; i < revistasActivas.length; i++) {
            if (revistasActivas[i] != null) {
                revistaActivaNum++;
            }
        }

        if (revistaActivaNum < maxVisualizacionesSimultaneas) {
            return true;
        }

        return false;
    }

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

}