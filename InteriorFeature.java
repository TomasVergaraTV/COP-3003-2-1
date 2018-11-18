// STEP 7

public class InteriorFeature implements Feature {

  private String interiorFeature;

  // Default Constructor
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  // Parameter Constructor
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return this.interiorFeature;
  }

  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

}
