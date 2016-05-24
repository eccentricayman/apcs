import java.util.*;
import java.text.*;
import java.io.*;

public class heading {

    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        int hwnum = 0;
        String hwsummary = "";
        int period = 0;
        String name = "";
        String filename = "";
        if (new File("heading.txt").isFile()) {
            try (BufferedReader headingreader = new BufferedReader(new FileReader("heading.txt"))) {
                name = headingreader.readLine();
                period = Integer.parseInt(headingreader.readLine());
                System.out.print("Enter HW number: ");
                hwnum = userin.nextInt();
                boolean success = (new File("hw" + hwnum)).mkdirs();
                if (!success) {
                    System.out.println("Couldn't create the directory, your hw number already exists.");
                }
                String filler = userin.nextLine();
                System.out.print("Enter HW summary: ");
                hwsummary = userin.nextLine();
                System.out.print("Enter file name: ");
                filename = userin.nextLine();
                filename += ".java";
                new File("/hw" + hwnum +"/" + filename);
                try {
                    FileWriter outputStream = new FileWriter("hw" + hwnum +"/" + filename);
                    try (BufferedWriter out = new BufferedWriter(outputStream)) {
                        out.write("/*");
                        out.newLine();
                        out.write(name);
                        out.newLine();
                        out.write("APCS2 pd" + period);
                        out.newLine();
                        out.write("HW" + "#" + hwnum + " -- " + hwsummary);
                        out.newLine();
                        out.write(getdate());
                        out.newLine();
                        out.write("*/");
                    }
                }
                catch (IOException ex) {
                    System.out.println("Well, something dun goofed somewhere. Have fun with that");
                }
            }
            catch (Exception e) {
                System.out.println("Error parsing heading.txt, try deleting it.");
            }
        }
        else {
            System.out.println("Heading.txt not found, running first time setup.");
            System.out.println("Enter name: ");
            name = userin.nextLine();
            System.out.println("Enter APCS period: ");
            period = userin.nextInt();
            System.out.print("Enter HW number: ");
            hwnum = userin.nextInt();
            boolean success = (new File("hw" + hwnum)).mkdirs();
            if (!success) {
                System.out.println("Couldn't create the directory, your hw number already exists.");
            }
            String filler = userin.nextLine();
            System.out.println("Enter HW summary: ");
            hwsummary = userin.nextLine();
            System.out.println("Enter file name: ");
            filename = userin.nextLine();
            filename += ".java";
            new File("/hw" + hwnum +"/" + filename);
            try {
                FileWriter savedoutStream = new FileWriter("heading.txt");
                FileWriter outputStream = new FileWriter("hw" + hwnum +"/" + filename);
                try (BufferedWriter out = new BufferedWriter(outputStream)) {
                    out.write("/*");
                    out.newLine();
                    out.write(name);
                    out.newLine();
                    out.write("APCS1 pd" + period);
                    out.newLine();
                    out.write("HW" + "#" + hwnum + " -- " + hwsummary);
                    out.newLine();
                    out.write(getdate());
                    out.newLine();
                    out.write("*/");
                }
                try (BufferedWriter savedout = new BufferedWriter(savedoutStream)) {
                    savedout.write(name);
                    savedout.newLine();
                    savedout.write(Integer.toString(period));
                    System.out.println("First run complete, name and period saved in heading.txt");
                }
            }
            catch (IOException ex) {
                System.out.println("Well, something dun goofed somewhere. Have fun with that");
            }
        }
    }  //end main
    
    public static String getdate() {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String todaydate;
        todaydate = dateformat.format(date);
        return todaydate;
    } //end getdate

} //end class
