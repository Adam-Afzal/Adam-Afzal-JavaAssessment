public class TreasureChest extends Feature {

   int numberofDoubloons;


    public TreasureChest(String description, String location, double coordinate, int numberofDoubloons) {
        super(description, location, coordinate);
        this.numberofDoubloons = numberofDoubloons;
    }


    public int getNumberofDoubloons() {
        return numberofDoubloons;
    }


}
