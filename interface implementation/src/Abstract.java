abstract class ElectricVehicle{
    abstract void batterytype();
}

class ElectricCar extends ElectricVehicle{

    @Override
    void batterytype() {
        System.out.println("This vehicle uses lithium ion batteries");
    }
}

class ElectricBike extends ElectricVehicle{
    @Override
    void batterytype() {
        System.out.println("This vehicle uses lithium batteries");
    }
}

class MainClass{
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        System.out.println("What type of batteries do electric cars use?");
        car1.batterytype();
        System.out.println("********************************************");
        ElectricBike bike1 = new ElectricBike();
        System.out.println("What type of batteries do electric bikes use?");
        bike1.batterytype();
        System.out.println("********************************************");

    }
}