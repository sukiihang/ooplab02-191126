public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    boolean filter;
    int fanSpeed;
    String mode;

    public AirPurifier(String model,String serialNo){
        this.model = model;
        this.serialNo = serialNo;
        this.power = false;
        this.filter = false;
        this.fanSpeed = 0;
        this.mode = "normal";
    }

    public AirPurifier(String serialNo){
        this("Pro",serialNo);
    }

    public void powerButton(){
        if(this.power == false){
            this.power = true;
            this.fanSpeed = 1;
        } else if (this.power == true) {
            this.power = false;
            this.fanSpeed = 0;
        }
    }

    public void increaseFanSpeed(){
        if(this.fanSpeed < 3){
            this.fanSpeed++;
        }
    }

    public void decreaseFanSpeed(){
        if(this.fanSpeed > 0){
            this.fanSpeed--;
        }
    }

    public void warning(){
        if(this.filter == true){
            IO.println("warning!!! You should change filter");
        }
    }

    public void printStatus() {
        String powerStatus;
        if (this.power == true) {
            powerStatus = "ON";
        } else {
            powerStatus = "OFF";
        }

        String filterStatus;
        if (this.filter == true) {
            filterStatus = "Full";
        } else {
            filterStatus = "Nothing";
        }

        IO.println("Model: " + this.model +
                " | SN: " + this.serialNo +
                " | Power: " + powerStatus +
                " | Speed: " + this.fanSpeed +
                " | Filter Alert: " + filterStatus);
    }
}