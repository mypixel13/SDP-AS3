
public class WoodMaterial implements BuildingMaterial {
    @Override public String getName() { return "Wood"; }
    @Override public int pricePerSqm() { return 600; }

    @Override public void layFoundation(int areaSqm) {
        System.out.println("  [Wood] Setting screw piles under " + areaSqm + " sqm");
    }
    @Override public void raiseWalls(int floors) {
        System.out.println("  [Wood] Assembling timber-frame walls, floors: " + floors);
    }
    @Override public void installRoof(int areaSqm) {
        System.out.println("  [Wood] Covering " + areaSqm + " sqm with wooden shingles");
    }
}
