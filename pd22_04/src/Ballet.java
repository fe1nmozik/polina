import java.util.Scanner;

public class Ballet extends Dance{
    private boolean hasPointeShoes;
    public Ballet(String styleName, String trainerName, boolean hasPointeShoes) {
        super(styleName, trainerName);
        this.hasPointeShoes = hasPointeShoes;
    }

    public void startTraining() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You selected " + getStyleName() + "! Your coach: " + getTrainerName());
        if (hasPointeShoes) {
            System.out.println("This session includes pointe shoes.");
        }
        else {
            System.out.println("This session is without pointe shoes.");
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
                    System.out.println("Posture and basic positions...");
                    Thread.sleep(1000);
                    System.out.println("Plié, relevé, and pirouettes...");
                    Thread.sleep(1000);
                    System.out.println("Training complete!");
                    System.out.println("====================================");
                    int burnedCalories = 80 + (int)(Math.random() * 120);
                    System.out.println("You burned approximately " + burnedCalories + " calories!");
                    System.out.println("====================================");
                    Dance.addInfo("Completed Ballet training | Coach: " + getTrainerName() + " | Calories burned: " + burnedCalories);
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

                System.out.println("You are scheduled for your next Ballet session on " + date + "!");
                System.out.println("====================================");
                Dance.addInfo("Scheduled Ballet session on " + date + " | Coach: " + getTrainerName());
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
        String line = "There is information about your Ballet trainer:\n" +
                "Trainer's name: " + getTrainerName() + ";\n" +
                "Trainer's age: 30.";
        System.out.println(line);
        Dance.addInfo(line);
    }
    public boolean isHasPointeShoes() {
        return hasPointeShoes;
    }

    public void setHasPointeShoes(boolean hasPointeShoes) {
        this.hasPointeShoes = hasPointeShoes;
    }

}
