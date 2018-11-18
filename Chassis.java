// STEP 1

public interface Chassis {

  // Any implementing classes will be forced to include these methods and fields
  public final String chassis = "Chassis";

  public Chassis getChassisType();

  public void setChassisType(String vehicleChassis);

}
