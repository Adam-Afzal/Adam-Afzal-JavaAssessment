import java.util.Random;

public class Controller
{
    public static void main(String[] args) {
       Swamp sw = new Swamp(200);
       TreasureChest tr = new TreasureChest("Treasure Chest","North",100,400);
        TreasureChest trSouth = new TreasureChest("Treasure Chest","North",150,800);
        TreasureChest trWest = new TreasureChest("Treasure Chest","West",300,500);
       sw.addFeature(tr);
       sw.addFeature(trSouth);
       sw.addFeature(trWest);
       sw.begin();

    }
}
