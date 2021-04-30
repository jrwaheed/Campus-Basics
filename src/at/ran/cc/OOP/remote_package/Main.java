package OO.remote_package;

public class Main {
    public static void main(String[] args){

    Remote r1 = new Remote(50, 2, 10, Remote.TVSTATUS.ON, true);
    Remote r2 = new Remote(100, 5, 25, Remote.TVSTATUS.OFF, false);

    Batteries battery1 = new Batteries(Batteries.TYPE.AA, 44 , Batteries.CHARGINGSTATUS.FINISHED);
    Batteries battery2 = new Batteries(Batteries.TYPE.AAA, 77, Batteries.CHARGINGSTATUS.CHARGING);

    Buttons button1 = new Buttons(Buttons.FORM.CIRCLE, "Green","ON");
    Buttons button2 = new Buttons(Buttons.FORM.SQUARE, "Red", "OFF");
    Buttons button3 = new Buttons(Buttons.FORM.TRIANGLE, "White", "Volume");

    r1.addBattery(battery1);
    r1.addBattery(battery2);

    r1.addButton(button1);
    r1.addButton(button2);
    r1.addButton(button3);

    r2.addBattery(battery1);
    r2.addBattery(battery2);

    r2.addButton(button1);
    r2.addButton(button2);
    r2.addButton(button3);

    r1.setIsOn(Remote.TVSTATUS.ON);

    System.out.println(r2.getBattery().get(0).getPrice());
    System.out.println(r2.getIsOn());
    System.out.println(r2.getBattery().get(0).getChargingStatus());
    System.out.println(r1.getIsOn());
    }
}
