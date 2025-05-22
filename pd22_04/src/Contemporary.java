import java.util.Scanner;

public class Contemporary extends Dance{
    private boolean improvisationUsed;
    public Contemporary(String styleName, String trainerName, boolean improvisationUsed) {
        super(styleName, trainerName);
        this.improvisationUsed = improvisationUsed;
    }
    public void startTraining() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You selected " + getStyleName() + "! Your coach: " + getTrainerName());
        if (improvisationUsed == true) {
            System.out.println("This class includes improvisation exercises.");
        }
        else {
            System.out.println("This class follows a fixed choreography.");
        }
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
                    System.out.println("Breath work and body flow...");
                    Thread.sleep(1000);
                    System.out.println("Expressive movement and floor work...");
                    Thread.sleep(1000);
                    System.out.println("Training complete!");
                    System.out.println("====================================");
                    int burnedCalories = 90 + (int)(Math.random() * 130);
                    System.out.println("You burned approximately " + burnedCalories + " calories!");
                    System.out.println("====================================");
                    Dance.addInfo("Completed Contemporary training | Coach: " + getTrainerName() + " | Calories burned: " + burnedCalories);
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

                System.out.println("You are scheduled for your next Contemporary session on " + date + "!");
                System.out.println("====================================");
                Dance.addInfo("Scheduled Contemporary session on " + date + " | Coach: " + getTrainerName());
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
        String line = "There is information about your Contemporary style trainer:\n" +
                "Trainer's name: " + getTrainerName() + ";\n" +
                "Trainer's age: 30.";
        System.out.println(line);
        Dance.addInfo(line);
    }
    public boolean isImprovisationUsed() {
        return improvisationUsed;
    }

    public void setImprovisationUsed(boolean improvisationUsed) {
        this.improvisationUsed = improvisationUsed;
    }
}
