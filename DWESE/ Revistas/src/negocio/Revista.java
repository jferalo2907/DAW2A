package negocio;

class Revista {
    private String codigo;
    private String titulo;
    private String editorial;
    private int maxVisualizacionesSimultaneas;
    private int visualizacionesActivas;
    private int visualizacionesTotales;

    public Revista(String codigo, String titulo, String editorial, int maxVisualizacionesSimultaneas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.maxVisualizacionesSimultaneas = maxVisualizacionesSimultaneas;
        this.visualizacionesActivas = 0;
        this.visualizacionesTotales = 0;
    }

    public void añadirVisualizacion() {
        this.visualizacionesActivas +=1;
        this.visualizacionesTotales +=1;
    }
    public void quitarVisualizacion() {
        this.visualizacionesActivas -=1;
    }

    public int getMaxVisualizacionesSimultaneas() {
        return maxVisualizacionesSimultaneas;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getVisualizacionesActivas() {
        return visualizacionesActivas;
    }
    public int getVisualizacionesTotales() {
        return visualizacionesTotales;
    }

    public String toString() {
    return "----------\n" + this.codigo+"\n"+this.titulo+"\n"+this.editorial+"\n"+this.maxVisualizacionesSimultaneas+"\n";


    }

    // Implementar el constructor (o constructores necesarios)

    // Implementar los métodos que se consideren necesarios
}