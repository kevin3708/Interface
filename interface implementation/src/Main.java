
interface Amphibious{

    void dock();
    void launch();

}


interface AirVehicle{

    void fly();
}



class AmphibiousPlane implements Amphibious, AirVehicle{

    @Override
    public void dock() {
        System.out.println("The vehicle is docked");
    }

    @Override
    public void launch() {
        System.out.println("The vehicle is now getting launched");
    }

    @Override
    public void fly() {
        System.out.println("The vehicle is now in flight");

    }
}

class Main{
    public static void main(String[] args) {
        AmphibiousPlane plane1 = new AmphibiousPlane();
        System.out.println("How does this vehicle move?");
        plane1.dock();
        System.out.println("********************");
        plane1.launch();
        System.out.println("******************");
        plane1.fly();
        System.out.println("*******************");


    }
}