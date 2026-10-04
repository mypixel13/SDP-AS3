
public class Cottage extends House {
    public Cottage(int areaSqm, BuildingMaterial material) {
        super("Cottage", areaSqm, material);
    }

    @Override protected int getFloors() { return 1; }

    @Override public void build() {
        printHeader();
        material.layFoundation(areaSqm);
        material.raiseWalls(getFloors());
        material.installRoof(areaSqm);
    }
}
