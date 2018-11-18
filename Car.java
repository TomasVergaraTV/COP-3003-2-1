// STEP 10

import java.util.Date;

public class Car extends Vehicle {

  // Array of type Feature (so basically array of both interior and exterior objects)
  private Feature[] features = new Feature[10];
  private int carAxle;

  // Default Constructor
  public Car() {
    // Calls parent default constructor
    super();
    // Creating local array to set to global (instead of having to iterate through array since only
    // two total features
    Feature[] features = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.features = features;
    this.carAxle = 2;
  }

  // Parameter Constructor
  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine, Feature[] features, int carAxle) {
    // Calls parent parameter constructor
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.features = features;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    // Must initialize String before checking length
    String featureHolder = "";
    for (int counter = 0; counter < this.features.length; counter++) {
      // If object found is of type ExteriorFeature
      if (this.features[counter] instanceof ExteriorFeature) {
        // If featureHolder is empty
        if (featureHolder.length() == 0) {
          // Simply concatenate to empty string (this happens at beginning)
          featureHolder += this.features[counter];
        } else {
          // If not empty, then go down one line, THEN concatenate
          featureHolder += "\n" + this.features[counter];
        }
      }
    }
    return featureHolder;
  }

  // Basically same thing. Look at getExteriorFeatures (above) for explanation
  public String getInteriorFeatures() {
    String featureHolder = "";
    for (int i = 0; i < this.features.length; i++) {
      if (this.features[i] instanceof InteriorFeature) {
        if (featureHolder.length() == 0) {
          featureHolder += this.features[i];
        } else {
          featureHolder += "\n" + this.features[i];
        }
      }
    }
    return featureHolder;
  }

  // Basically same thing but with all features, not just one specific type
  public String toString() {
    String interiorFeaturesString = "";
    String exteriorFeaturesString = "";
    for (int i = 0; i < this.features.length; i++) {
      if (this.features[i] instanceof InteriorFeature) {
        if (interiorFeaturesString.length() == 0) {
          interiorFeaturesString += this.features[i];
        } else {
          interiorFeaturesString += "\n" + this.features[i];
        }
      } else {
        if (exteriorFeaturesString.length() == 0) {
          exteriorFeaturesString += this.features[i];
        } else {
          exteriorFeaturesString += "\n" + this.features[i];
        }
      }
    }
    // Calls parent class's toString
    return super.toString() + "\nFeatures : " + "\n" + interiorFeaturesString + "\n" +
        exteriorFeaturesString + "\nCar Axle : " + carAxle;
  }
}