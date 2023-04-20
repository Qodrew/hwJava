package hw2;

import java.io.BufferedReader;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) throws Exception {

        String dataFile = "file.txt";
        String[] infoBase;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = br.readLine()) != null) {
                    infoBase = line.replace("\"", "").split(":|,");
                    sb.append("Student ").append(infoBase[1]).append(" got a ").append(infoBase[3])
                            .append(" in ").append(infoBase[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
