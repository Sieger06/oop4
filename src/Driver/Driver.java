package Driver;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicence;
    private int drivingExperience;
    public Driver (String fullName, boolean driversLicence, int drivingExperience){
        if(fullName == null || fullName.isEmpty()){
            this.fullName = "Ivanov Ivan Ivanovich";
        }else {
            this.fullName = fullName;
        }
        this.driversLicence = driversLicence;
        if(drivingExperience <= 0){
            this.drivingExperience = 1;
        }else{
            this.drivingExperience = drivingExperience;
        }
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(boolean driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public String toString(){
        return "Driver's name: " + fullName + ", drivers license: " + driversLicence + ", with driving experience of : " + drivingExperience + " years";
    }
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();
}
