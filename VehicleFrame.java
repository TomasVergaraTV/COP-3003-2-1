// STEP 4

public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  // Default Constructor
  public VehicleFrame() {
    this.vehicleFrameType = "Generic";
  }

  // Parameter Constructor
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  // Returns object instantiated from this class
  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public String toString() {
    return "Chassis : " + Chassis.chassis + "\nVehicle Frame : " + this.vehicleFrameType;
  }

}
