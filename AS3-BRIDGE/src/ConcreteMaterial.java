
public class ConcreteMaterial implements BuildingMaterial {
    @Override public String getName() { return "Concrete"; }
    @Override public int pricePerSqm() { return 1200; }

    @Override public void layFoundation(int areaSqm) {
        System.out.println("  [Concrete] Casting reinforced slab under " + areaSqm + " sqm");
    }
    @Override public void raiseWalls(int floors) {
        System.out.println("  [Concrete] Casting monolithic walls, floors: " + floors);
    }
    @Override public void installRoof(int areaSqm) {
        System.out.println("  [Concrete] Casting flat roof slab of " + areaSqm + " sqm");
    }
}
