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
        name = userin.nextLine();
        System.out.println("Enter APCS period: ");
        period = userin.nextInt();
        System.out.print("Enter HW number: ");
        hwnum = userin.nextInt();
        System.out.println("Enter HW summary: ");
        hwsummary = userin.nextLine();
        System.out.println("Enter file name: ");
        String filename = userin.nextLine();
        filename = filename + ".java";
        new File("/hw" + hwnum + "/").mkdirs();
        new File("/hw" + hwnum +"/" + filename);
        try {
    FileWriter outputStream = new FileWriter(filename);
    try (BufferedWriter out = new BufferedWriter(outputStream)) {
        out.write("/*");
        out.newLine();
        out.write(name);
        out.newLine();
        out.write("APCS1 pd" + period);
        out.newLine();
        out.write("HW" + hwnum + " -- " + hwsummary);
        out.newLine();
        out.write(getdate());
        out.newLine();
        out.write("*/");
    }
} catch (IOException ex) {
    System.out.println("Well, something fucked up. Go complain to Ayman or something");
}
    }
    public static String getdate() {
       DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	   Date date = new Date();
	   String todaydate;
	   todaydate = dateformat.format(date);
	   return todaydate;
    }
}
