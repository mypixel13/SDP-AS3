
public interface BuildingMaterial {
    String getName();
    int pricePerSqm();
    void layFoundation(int areaSqm);
    void raiseWalls(int floors);
    void installRoof(int areaSqm);
}
