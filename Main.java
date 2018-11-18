import java.util.Date;

public class Main {

  public static void main(String[] args) {
/*
    // STEP 3 -------------------------------------------------------------------------------------
    // Default Constructor
    VehicleChassis vehicleChassis_1 = new VehicleChassis();
    System.out.println(vehicleChassis_1.toString());
    // Parameter Constructor
    VehicleChassis vehicleChassis_2 = new VehicleChassis("Some Chassis Name");
    System.out.println(vehicleChassis_2.toString());

    // STEP 4 -------------------------------------------------------------------------------------
    // Default
    VehicleFrame vehicleFrame_1 = new VehicleFrame();
    System.out.println(vehicleFrame_1.toString());
    // Parameter
    VehicleFrame vehicleFrame_2 = new VehicleFrame("Some Frame Name");
    System.out.println(vehicleFrame_2.toString());

    // STEP 5 -------------------------------------------------------------------------------------
    // Default
    ManufacturedEngine manufacturedEngine_1 = new ManufacturedEngine();
    System.out.println(manufacturedEngine_1.toString());
    //Parameter
    ManufacturedEngine manufacturedEngine_2 = new ManufacturedEngine("Honda",
        new Date(), "H-Series", "H23A1", "2WD",
        4, "88 AKI");
    System.out.println(manufacturedEngine_2.toString());

    // STEP 7 -------------------------------------------------------------------------------------
    // Default
    InteriorFeature interiorFeature_1 = new InteriorFeature();
    System.out.println(interiorFeature_1.toString());
    // Parameter
    InteriorFeature interiorFeature_2 = new InteriorFeature("Air Conditioning");
    System.out.println(interiorFeature_2.toString());

    // STEP 8 -------------------------------------------------------------------------------------
    // Default
    ExteriorFeature exteriorFeature_1 = new ExteriorFeature();
    System.out.println(exteriorFeature_1.toString());
    // Parameter
    ExteriorFeature exteriorFeature_2 = new ExteriorFeature("Spoiler");
    System.out.println(exteriorFeature_2.toString());

    // STEP 9 -------------------------------------------------------------------------------------
    // Default
    Vehicle vehicle_1 = new Vehicle();
    System.out.println(vehicle_1.toString());
    // Parameter
    Vehicle vehicle_2 = new Vehicle("Honda Manufacturing", new Date(),
        "Honda", "Civic", "Coupe",
        new VehicleChassis("Unibody"),
        new ManufacturedEngine("Honda Manufacturing", new Date(),
            "H-Series", "H23A1", "2WD", 4,
            "88 AKI"));
    System.out.println(vehicle_2.toString());

    // STEP 10 ------------------------------------------------------------------------------------
    // Default
    Car car_1 = new Car();
    System.out.println(car_1.toString());
    // Setting up array to be an argument in the parameter constructor
    Feature[] featureArray = {new InteriorFeature("Air Conditioning"),
        new ExteriorFeature("Spoiler"), new InteriorFeature("Bluetooth Audio"),
        new ExteriorFeature("Annoyingly loud muffler")};
    // Parameter
    Car car_2 = new Car("Honda Manufacturing", new Date(), "Honda",
        "Civic", "Coupe", new VehicleChassis("Unibody"),
        new ManufacturedEngine("Honda Manufacturing", new Date(),
            "H-Series", "H23A1", "2WD", 4,
            "88 AKI"), featureArray, 2);
    System.out.println(car_2.toString());
*/
    // REPL.IT ------------------------------------------------------------------------------------

    // Test VehicleChassis-----------------------------------------------
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.
/*
    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());

    // Test VehicleFrame-------------------------------------------------
    // Step 4 Test
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);

    // Test ManufacturedEngine-----------------------------------------------
    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    ManufacturedEngine me2 =
        new ManufacturedEngine("Honda", new Date()
            , "H-Series", "H23A1"
            , "2WD: Two-Wheel Drive", 4
            , "88 AKI");
    System.out.println(me2);

    // Test Features-------------------------------------------------
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);

    // Test Vehicle-------------------------------------------------
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"));
    System.out.println(v2);
*/
    // Test Car-------------------------------------------------
    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Seed the features with valid subclasses.
    Feature[] f = {new InteriorFeature("AM/FM Radio")
        , new ExteriorFeature("Wood Panels")
        , new InteriorFeature("Air Conditioning")
        , new ExteriorFeature("Moonroof")};

    // Create an overloaded Car instance.
    Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
        , f, 2);
    System.out.println(c2);

  }
}
