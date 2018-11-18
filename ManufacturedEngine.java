// STEP 5

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  // Default constructor
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 4;
    this.engineType = "Generic";
    this.driveTrain = "Generic";
  }

  // Parameter Constructor
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  public final void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  public final void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public final void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public String toString() {
    return "Engine Manufacturer : " + this.engineManufacturer + "\nEngine Manufactured : "
        + this.engineManufacturedDate.toString() + "\nEngine Make : " + this.engineMake +
        "\nEngine Model : " + this.engineModel + "\n" + "Engine Type : " + this.engineType +
        "\nEngine Cylinders : " + this.engineCylinders + "\nDrive Train : " + this.driveTrain;
  }

}
