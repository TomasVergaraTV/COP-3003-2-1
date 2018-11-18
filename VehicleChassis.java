// STEP 3

public class VehicleChassis implements Chassis {

  private String chassisName;

  // Default Constructor
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }

  // Parameter Constructor
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  // Returns object instantiated from this class
  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  public String toString() {
    return "Chassis Name : " + this.chassisName;
  }

}
