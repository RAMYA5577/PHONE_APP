public class LandLine implements Phone{
    private String myPhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String phoneNumber) {
        this.myPhoneNumber = phoneNumber;
        isRinging=false;
        isPowerOn=false;
    }

    public String getPhoneNumber() {
        return myPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.myPhoneNumber = phoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNumber) {
        if(isPowerOn==true){
            System.out.println("You are dailing the no: "+phoneNumber);
        }
        else{
            System.out.println("Your landLine is off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNumber) {

        if(isPowerOn && myPhoneNumber.equals(phoneNumber)){
            this.isRinging=true;
            System.out.println("Hey! "+myPhoneNumber+" You get a call ");
        }
        else{
            System.out.println("power off");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answered!!");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
