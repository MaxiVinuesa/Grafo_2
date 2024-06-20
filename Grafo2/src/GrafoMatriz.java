public class GrafoMatriz {

    int nVertices;
    static int MaxVertices = 20;
    Vertice [] vertices;
    int [][] matAd;


    public GrafoMatriz(){
        this(MaxVertices);

    }

    public GrafoMatriz(int mx){
        matAd = new int [mx][mx];
        vertices = new Vertice[mx];
        for (int i = 0; i<mx; i++){
            for(int j=0; i<mx; i++){
                matAd[i][j] = 0;
                nVertices = 0;
            }
        }
    }


    public void NuevoVertice(String nombre){
        boolean esta = nVertices(nombre) >= 0;
        if (!esta){
            Vertice v = new Vertice(nombre);
            v.asigVertice(nVertices);
            vertices[nVertices++] = v;
        }
    }

    // nVertices();

    public int nVertices(String vs){
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < nVertices) && !encontrado;){
            encontrado = vertices[i].equals(v);
            if (!encontrado) i++;
        }
        return (i < nVertices) ? i : -1;
    }

    public void nuevoArco(String a, String b)throws Exception{
        int va, vb;
        va = nVertices(a);
        vb = nVertices(b);
        if (va < 0 || vb < 0) throw new Exception ("Vertice no existente");
        matAd[va][vb] = 1;
    }

    public boolean adyacente(String a, String b) throws Exception{
        int va,vb;
        va = nVertices(a);
        vb = nVertices(b);

        if (va < 0 || vb < 0)throw new Exception ("Vertice no existente"); 
        return matAd[va][vb]  == 1;
    }

    public void mostrarMatriz(){
        try{
            System.out.println("  |  ");

            for ( int i = 0; i < vertices.length; i++){
                System.out.println(vertices[i].nomVertices() + " ");
            }

            System.out.println();
            for (int i = 0; i< matAd.length; i++){
                System.out.println(vertices[i].nomVertices() + " | ");

                for (int j = 0; j < matAd.length; j++){
                    System.out.println(matAd[i][j] + "  ");
                }
                System.out.println();
            }

        } catch (Exception e){
            System.out.println("La matriz se encuentra vacia.");
        }
    }

    public int getNVertices() {
        return nVertices;
    }

    public void setNVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] verts) {
        this.vertices = vertices;
    }

    public int[][] getMatAd() {
        return matAd;
    }

    public void setMatAd(int[][] matAd) {
        this.matAd = matAd;
    }

    
}