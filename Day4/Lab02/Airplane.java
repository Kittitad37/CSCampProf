package Lab02;

//กรุณาใส่รหัสประจำตัว 2 หลัก สุดท้าย : 02

public class Airplane {
  private final String FIGHTNUMBER;
  private final String AIRLINENAME;
  private int gateNumber;
  private String desination;
  private int delayTime;

  public Airplane (String fight,String destination, String airline, int gateNumber){
    FIGHTNUMBER = fight;
    AIRLINENAME = airline;
    this.gateNumber = gateNumber;
    this.desination = destination;
  }



    public void changeGate(int newGate){
        gateNumber = newGate;
        System.out.printf("Attention Please,Flight $s Has been gate change to gate $d\n", this.FIGHTNUMBER, this.gateNumber);
      }
    
    public void changeDestination(String newDestination) {
        this.desination = newDestination;
        System.out.printf("Attention Please,Flight $s Has been diverted to %s\n", this.FIGHTNUMBER, this.desination);
      }

    public void setDelay(int delayTime){
      this.delayTime = delayTime;
    }

    public void checkStatus() {
        if (delayTime == 0) {
          System.out.printf("Flight %s is on time.\n", this.FIGHTNUMBER);
        } else {
          System.out.printf("Flight %s is delayed by %d minutes.\n", this.FIGHTNUMBER, this.delayTime);
        }
      }
}
 