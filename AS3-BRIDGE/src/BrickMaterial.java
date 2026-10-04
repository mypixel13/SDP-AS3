
public class BrickMaterial implements BuildingMaterial {
    @Override public String getName() { return "Brick"; }
    @Override public int pricePerSqm() { return 900; }

    @Override public void layFoundation(int areaSqm) {
        System.out.println("  [Brick] Pouring strip foundation under " + areaSqm + " sqm");
    }
    @Override public void raiseWalls(int floors) {
        System.out.println("  [Brick] Laying brick walls, floors: " + floors);
    }
    @Override public void installRoof(int areaSqm) {
        System.out.println("  [Brick] Covering " + areaSqm + " sqm with clay tiles");
    }
}
