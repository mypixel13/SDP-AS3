
public class Main {
    public static void main(String[] args) {
        House cottage = new Cottage(60, new WoodMaterial());
        cottage.build();
        System.out.println("  Cost: $" + cottage.estimateCost() + "\n");

        System.out.println("--- Switching the cottage to brick at runtime ---");
        cottage.setMaterial(new BrickMaterial());
        cottage.build();
        System.out.println("  Cost: $" + cottage.estimateCost() + "\n");

        House villa = new Villa(120, new ConcreteMaterial());
        villa.build();
        System.out.println("  Cost: $" + villa.estimateCost() + "\n");

        System.out.println("--- Same villa, different material ---");
        villa.setMaterial(new WoodMaterial());
        villa.build();
        System.out.println("  Cost: $" + villa.estimateCost());
    }
}
