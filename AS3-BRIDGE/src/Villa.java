
public class Villa extends House {
    private static final int TERRACE_SQM = 30;

    public Villa(int areaSqm, BuildingMaterial material) {
        super("Villa", areaSqm, material);
    }

    @Override protected int getFloors() { return 3; }

    @Override public void build() {
        printHeader();
        material.layFoundation(areaSqm);
        material.raiseWalls(getFloors());
        material.installRoof(areaSqm);
        System.out.println("  Adding terrace:");
        material.installRoof(TERRACE_SQM);
    }
}
