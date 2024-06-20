public class Vertice {
    String nombre;
    int nVertices;

    public Vertice(String x){
        nombre = x;
        nVertices = -1;
    }

    public String nomVertices(){
        return this.nombre;
    }

    public boolean equals(Vertice n){
        return nombre.equals(n.nombre);
    }

    public void asigVertice(int n){
        nVertices = n;
    }

    public String toString(){
        return nombre + " (" + nVertices + ") ";
    }


}