// STEP 2

import java.util.Date;

public interface Engine {

  // Any implementing classes will be forced to include these fields and methods
  public void setEngineCylinders(int engineCylinders);

  public void setEngineManufacturedDate(Date date);

  public void setEngineManufacturer(String manufacturer);

  public void setEngineMake(String engineMake);

  public void setEngineModel(String engineModel);

  public void setDriveTrain(String driveTrain);

  public void setEngineType(String fuel);

}