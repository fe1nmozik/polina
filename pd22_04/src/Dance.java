import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Dance {
    private String styleName;
    private String trainerName;
    private static ArrayList<String> info = new ArrayList<>();

    public Dance(String styleName, String trainerName) {
        this.styleName = styleName;
        this.trainerName = trainerName;
    }

    public void startTraining() {
        System.out.println("Chosen style and trainer's name.");
    }

    public void getTrainerInfo() {
        System.out.println("Info about your trainer.");
    }
    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("info.txt");
            for (String line: info) {
                fw.write(line + "\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addInfo(String line) {
        info.add(line);
    }
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
