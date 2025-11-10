interface SmartDevice{void turnOn();void turnOff();}
class Light implements SmartDevice{public void turnOn(){System.out.println("Light on");}public void turnOff(){System.out.println("Light off");}}
class AC implements SmartDevice{public void turnOn(){System.out.println("AC on");}public void turnOff(){System.out.println("AC off");}}
public class Main{public static void main(String[]a){SmartDevice d=new Light();d.turnOn();d.turnOff();}}