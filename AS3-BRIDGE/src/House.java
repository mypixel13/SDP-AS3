
public abstract class House {
    private final String name;
    protected final int areaSqm;
    protected BuildingMaterial material;

    protected House(String name, int areaSqm, BuildingMaterial material) {
        this.name = name;
        this.areaSqm = areaSqm;
        this.material = material;
    }

    public void setMaterial(BuildingMaterial material) {
        this.material = material;
    }

    protected abstract int getFloors();

    public abstract void build();

    public int estimateCost() {
        return areaSqm * getFloors() * material.pricePerSqm();
    }

    protected void printHeader() {
        System.out.println(name + " (" + areaSqm + " sqm, " + getFloors()
                + " floor(s)) built from " + material.getName() + ":");
    }
}
