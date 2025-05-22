import java.util.Scanner;

public class HipHop extends Dance{
    private int beatLevel;
    public HipHop(String styleName, String trainerName, int beatLevel) {
        super(styleName, trainerName);
        this.beatLevel = beatLevel;
    }

    public void startTraining() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You selected " + getStyleName() + "! Your coach: " + getTrainerName());
        System.out.println("Beat intensity level: " + beatLevel + "/10");
        System.out.println("Do you want to:");
        System.out.println("1 — Start training now");
        System.out.println("2 — Schedule your next session");
        System.out.println("3 - Get information about your trainer");
        System.out.println("4 - Choose other style");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        while (true) {
        if (choice == 1) {
            System.out.println("Starting training session...");
            try {
                Thread.sleep(1000);
                System.out.println("Warm-up...");
                Thread.sleep(1000);
                System.out.println("Practicing rhythm and freestyle...");
                Thread.sleep(1000);
                System.out.println("Training complete!");
                System.out.println("====================================");
                int burnedCalories = 100 + (int)(Math.random() * 150);
                System.out.println("You burned approximately " + burnedCalories + " calories!");
                System.out.println("====================================");
                Dance.addInfo("Completed Hip-hop training | Coach: " + getTrainerName() + " | Calories burned: " + burnedCalories);
                System.out.print("Choose again (1–4): ");
                choice = sc.nextInt();
            } catch (InterruptedException e) {
                System.out.println("Training interrupted.");
            }
        }
        else if (choice == 2) {
            sc.nextLine();
            System.out.print("Enter the date for your next session (for example, 15-06-2025): ");
            String date = sc.nextLine();

            System.out.println("You are scheduled for your next Hip-hop session on " + date + "!");
            System.out.println("====================================");
            Dance.addInfo("Scheduled Hip-hop session on " + date + " | Coach: " + getTrainerName());
            System.out.print("Choose again (1–4): ");
            choice = sc.nextInt();
        }
        else if (choice == 3) {
            getTrainerInfo();
            System.out.println("====================================");
            System.out.print("Choose again (1–4): ");
            choice = sc.nextInt();
        }
        else if (choice == 4) break;
        else {
            System.out.println("Invalid choice.");
            choice = sc.nextInt();
        }

    }
    }
    public void getTrainerInfo() {
        String line = "There is information about your HipHop trainer:\n" +
                "Trainer's name: " + getTrainerName() + ";\n" +
                "Trainer's age: 30.";
        System.out.println(line);
        Dance.addInfo(line);
    }
    public int getBeatLevel() {
        return beatLevel;
    }

    public void setBeatLevel(int beatLevel) {
        this.beatLevel = beatLevel;
    }

}
