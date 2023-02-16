package OCP.exercice;

public interface Resource {
    public int allocate() ;
    public void free(int ResourceId) ;
}
