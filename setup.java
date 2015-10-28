import java.util.*;
import java.text.*;
import java.io.*;

public class setup {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        int hwnum;
        String hwsummary;
        int period;
        String name;
        System.out.println("Enter name: ");
        name = userin.next();
        System.out.println("Enter APCS period: ");
        period = userin.nextInt();
        System.out.print("Enter HW number: ");
        hwnum = userin.nextInt();
        System.out.println("Enter HW summary: ");
        hwsummary = userin.next();
        System.out.println("Enter file name: ");
        String filename = userin.next();
        filename = filename + ".java";
        new File("/hw" + hwnum).mkdirs();
        new File("/hw" + hwnum +"/" + filename);
        System.out.println("/*");
        System.out.println(name);
        System.out.println("APCS1 " + "pd" + period);
        System.out.println("HW" + hwnum + " -- " + hwsummary);
        System.out.println(getdate());
        System.out.println("*/");
    }
    public static String getdate() {
       DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	   Date date = new Date();
	   String todaydate;
	   todaydate = dateformat.format(date);
	   return todaydate;
    }
}
    <tabs>
        <tab>
            <cursor style="0" r="79" g="91" b="102"/>
            <background type="0" r="43" g="48" b="59">
                <image file="" relative="0" extend="0" position="0">
                    <tint opacity="0" r="0" g="0" b="0"/>
                </image>
            </background>
        </tab>
    </tabs>