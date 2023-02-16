package OCP.exercice;

public abstract class AbstractResource {
    int resourceId ;
    abstract public void markSlotFree(int resourceId) ;
    abstract public void markSlotBusy(int resourceId) ;
    abstract public int findFreeSlot() ;

}
