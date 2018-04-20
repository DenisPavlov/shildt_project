package chapter9.p1;

import java.time.Duration;

// Instantiate the various classes in p1.
public class Demo {
    public static void main(String args[]) {
//        Protection ob1 = new Protection();
//        Derived ob2 = new Derived();
//        SamePackage ob3 = new SamePackage();

        Duration duration = Duration.parse("PT48H15M");

        String text = "22:44";
        String hour = text.substring(0, text.indexOf(":"));
        String minute = text.substring(text.indexOf(":")+1);

        String durationString = String.format("PT%dH%dM", Integer.valueOf(hour),Integer.valueOf(minute));

        System.out.println("hour = " + hour + " " + "minute = " + minute);
        System.out.println(duration);
        System.out.println(Duration.parse(durationString).toMinutes());
    }
}
