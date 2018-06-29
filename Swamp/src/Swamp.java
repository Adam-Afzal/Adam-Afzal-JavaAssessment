import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Swamp implements Movement {


String[] scenery = {"Endless fields of grass surround you but don't worry there's hope.", "Don't eat the mushrooms.","Oh look at you, desperately trying to find objects.", "Sometimes, you see most when it's darkest."};
    private double swampSize;

    private boolean won = false;



    private String[] commands = {"look","north","east","south","west"};
    ArrayList<Feature> features = new ArrayList<>();

    Compass com = new Compass(0,0,0,0);

    public Swamp(double swampSize) {
        this.swampSize = swampSize;
    }


    public void addFeature(Feature f){

        features.add(f);
    }




public void begin(){

        String command = "";
    Scanner in = new Scanner(System.in);
    System.out.println("You were travelling on a plane when all of sudden, you were forced to jump out along with your luggage.\n");
    System.out.println("You only need to find one of your valuables to escape the swamp you landed in. You awaken to find yourself in a barren moor, try 'look'");
    command = in.nextLine();
    if(command.equals("look")){
        System.out.println("You're smart, you used your eyes to become aware of your surroundings. Now it's time to make some moves. Try 'north', 'east','south' or 'west'.");

    } else {


    }

    while(won == false) {

      command = in.nextLine();
      checkCommand(command);

    }





}


private void checkCommand(String input){

        if(input.equals("look")){

double rand = Math.random();
double r = rand * scenery.length;
int rint = (int)r;
            System.out.println(scenery[rint]);



        } else if(input.equals("north")){
            this.goNorth();
        }else if(input.equals("south")){
            this.goSouth();
        }else if(input.equals("east")){
            this.goEast();
        }else if(input.equals("west")){
            this.goWest();
        }


}


    @Override
    public void goNorth() {

        if(objectFound("North")){


        for (Feature f : features) {

            if ((com.getDistanceWalkedNorth() >= f.getCoordinate()) && (f.getLocation().equals("North"))) {
                checkFeature(f);
            } else if(f.getLocation().equals("North")) {

                com.goNorth();

                if ((com.getDistanceWalkedNorth() >= f.getCoordinate()) && (f.getLocation().equals("North"))) {
                    checkFeature(f);
                } else {

                    if (com.getDistanceWalkedSouth() == 0) {

                    } else {

                        com.setDistanceWalkedSouth(com.getDistanceWalkedSouth() - Compass.getStepSize());

                        for (Feature fe : features) {
                            if (fe.getLocation().equals("South")) {
                                fe.setCoordinate(fe.getCoordinate() + Compass.getStepSize());

                            }
                        }


                    }
                    System.out.println("Your magic compass says that you are " + (f.getCoordinate() - com.getDistanceWalkedNorth()) + "away from the nearest object north of you!");

                }

            }


        }


    } else{

            System.out.println("The magic compass isn't reading anything, try going in a different direction.");
        }






    }

    @Override
    public void goSouth() {

        if(objectFound("South")){

        for (Feature f : features) {

            if ((com.getDistanceWalkedSouth() >= f.getCoordinate()) && (f.getLocation().equals("South"))) {
                checkFeature(f);
            } else if (f.getLocation().equals("South")){

                com.goSouth();


                if ((com.getDistanceWalkedSouth() >= f.getCoordinate()) && (f.getLocation().equals("South"))) {
                    checkFeature(f);
                } else {
                    if (com.getDistanceWalkedNorth() == 0) {

                    } else {

                        com.setDistanceWalkedNorth(com.getDistanceWalkedNorth() - Compass.getStepSize());

                        for (Feature fe : features) {
                            if (fe.getLocation().equals("North")) {
                                fe.setCoordinate(fe.getCoordinate() + Compass.getStepSize());

                            }
                        }
                    }
                    System.out.println("Your magic compass says that you are " + (f.getCoordinate() - com.getDistanceWalkedSouth()) + "away from the nearest object south of you!");

                }

            }


        }


    } else{

            System.out.println("The magic compass isn't reading anything, try going in a different direction.");
        }

    }

    @Override
    public void goWest() {

        if(objectFound("West")){

        for (Feature f : features) {


            if ((com.getDistanceWalkedWest() >= f.getCoordinate()) && (f.getLocation().equals("West"))) {
                checkFeature(f);
            } else if (f.getLocation().equals("West")){

                com.goWest();

                if ((com.getDistanceWalkedWest() >= f.getCoordinate()) && (f.getLocation().equals("West"))) {
                    checkFeature(f);
                } else {
                    if (com.getDistanceWalkedEast() == 0) {

                    } else {
                        com.setDistanceWalkedEast(com.getDistanceWalkedEast() - Compass.getStepSize());

                        for (Feature fe : features) {
                            if (fe.getLocation().equals("East")) {
                                fe.setCoordinate(fe.getCoordinate() + Compass.getStepSize());

                            }
                        }
                    }
                    System.out.println("Your magic compass says that you are " + (f.getCoordinate() - com.getDistanceWalkedWest()) + "away from the nearest object west of you!");

                }
            }


        }


    } else{

            System.out.println("The magic compass isn't reading anything, try going in a different direction.");
        }

    }

    @Override
    public void goEast() {
if(objectFound("East")){
        for (Feature f : features) {

            if ((com.getDistanceWalkedEast() >= f.getCoordinate()) && (f.getLocation().equals("East"))) {
                checkFeature(f);
            } else if(f.getLocation().equals("East")) {

                com.goEast();

                if ((com.getDistanceWalkedEast() >= f.getCoordinate()) && (f.getLocation().equals("East"))) {
                    checkFeature(f);
                } else {
                    if (com.getDistanceWalkedWest() == 0) {

                    } else {
                        com.setDistanceWalkedWest(com.getDistanceWalkedWest() - Compass.getStepSize());

                        for (Feature fe : features) {
                            if (fe.getLocation().equals("West")) {
                                fe.setCoordinate(fe.getCoordinate() + Compass.getStepSize());

                            }
                        }

                    }
                    System.out.println("Your magic compass says that you are " + (f.getCoordinate() - com.getDistanceWalkedEast()) + "away from the nearest object east of you!");


                }
            }


        }


    } else{

    System.out.println("The magic compass isn't reading anything, try going in a different direction.");
    }

    }

    public void checkFeature(Feature f){
        if(f instanceof TreasureChest){
            System.out.println("You have found a treasure chest with " + ((TreasureChest) f).getNumberofDoubloons() + " doubloons in it! You now have all you need to escape this horrific swamp.");
            this.won = true;
        }
    }

    private boolean objectFound(String Location){
boolean found = false;


        for(Feature f: features){

            if(f.getLocation().equals(Location)){
                found = true;

            }
        }
if(found == true){
            return true;
} else {
    return false;

}

    }

}
