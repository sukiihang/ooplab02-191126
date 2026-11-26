void main() {
    AirPurifier m1 = new AirPurifier("Model01", "SN01");
    AirPurifier m2 = new AirPurifier("SN02");

    m1.printStatus();
    m2.printStatus();

    IO.println("\nTurn ON & Adjust Speed (m1)");
    m1.powerButton();
    m1.increaseFanSpeed();
    m1.printStatus();

    IO.println("\nDecrease Speed & Turn OFF (m1) ");
    m1.decreaseFanSpeed();
    m1.printStatus();
    m1.powerButton();
    m1.printStatus();

    IO.println("\nFilter Warning");
    m1.filter = true;
    m1.warning();
    m1.printStatus();
}