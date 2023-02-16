package OCP.exercice;

public class ResourceManger {
    public void free(Resource resource, int resourceId){
        resource.free(resourceId);
    }
    public int allocate(Resource resource){
        return resource.allocate();
    }
}
