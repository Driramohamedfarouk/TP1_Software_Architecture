package OCP.exercice;

public class SpaceSlot extends AbstractResource implements  Resource{

    @Override
    public int allocate() {
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int ResourceId) {
        markSlotFree(resourceId);
    }

    @Override
    public void markSlotFree(int resourceId) {

    }

    @Override
    public void markSlotBusy(int resourceId) {

    }

    @Override
    public int findFreeSlot() {
        return 0;
    }
}
