import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String s;
        String s1= "0";
        String s2 = "0";
        String s3;
        Scanner in;
        Writer out;
        switch (args.length) {
            case 2:
                in = new Scanner(new File(args[0]));
                out = new PrintWriter(args[1]);
                break;
            case 1:
                in = new Scanner(new File(args[0]));
                out = new PrintWriter("output.txt");
                break;
            default:
                in = new Scanner(new File("input.txt"));
                out = new PrintWriter("output.txt");
        }
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < a; i++) {
            s1 += "'";
        }
        s = s1;
        for (int i = 0; i < b; i++) {
            s += "'";
            s2 += "'";
        }
        BufferedReader reader = new BufferedReader(new FileReader("first.txt"));
        out.write("|-" + s1 + "+" + s2 + "=" + s + "\n");
        s2 = "0";
        s3 = s1;
        while ((s = reader.readLine()) != null) {
            out.write(s.replaceAll("x", s1) + "\n");
        }
        for (int i = 0; i < b; i++) {
            reader = new BufferedReader(new FileReader("second.txt"));
            while ((s = reader.readLine()) != null) {
                out.write(s.replaceAll("x", s1).replaceAll("y", s2).replaceAll("z", s3) + "\n");
            }
            s2 += "'";
            s3 += "'";
        }
        out.close();
    }
}
