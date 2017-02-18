/**
 *calculates hours to charge based on entered hours and percent.
 */

public class JO {
    private int joNum;
    private float joPer;
    private int hoursToCharge;

//constructor-doesn't return antyhing
//creates a new JO object
    JO(int joNum, float joPer){
        this.joNum = joNum;
        this.joPer = joPer;
    }
//stores the values
    void setHoursToCharge(int hours){
        this.hoursToCharge = hours;
    }
//returns values
    int getHoursToCharge(){
        return hoursToCharge;
    }
}
