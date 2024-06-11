package OOP.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.SetOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.SetOn(false);

        // Display the state of the fans
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
