import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main extends JFrame {
    private JPanel JForm;
    private JLabel Intro;
    private JLabel Name;
    private JLabel Height;
    private JLabel Weight;
    private JTextField textName;
    private JTextField textHeight;
    private JTextField textWeight;
    private JButton continueButton;

    Main(){
        setContentPane(JForm);
        setTitle("Dance");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                int height;
                int weight;

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your name.");
                    return;
                }

                try {
                    height = Integer.parseInt(textHeight.getText());
                    if (height <= 0) {
                        JOptionPane.showMessageDialog(null, "Height must be a positive number.");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Height must be a valid number.");
                    return;
                }

                try {
                    weight = Integer.parseInt(textWeight.getText());
                    if (weight <= 0) {
                        JOptionPane.showMessageDialog(null, "Weight must be a positive number.");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Weight must be a valid number.");
                    return;
                }

                Person person = new Person(name, height, weight);
                JOptionPane.showMessageDialog(null, "✅ Registration complete!\nWelcome, " + name + "!");
                dispose();
                Scanner sc = new Scanner(System.in);
                System.out.println("====================================");
                person.printInfo();
                System.out.println("====================================");
                HipHop hiphop = new HipHop("HipHop", "Tom", 8);
                Ballet ballet = new Ballet("Ballet", "Brad", true);
                Contemporary contemporary = new Contemporary("Contemporary", "Max", true);
                while (true) {
                    System.out.println("What are you interested in: ");
                    System.out.println("1 - HipHop");
                    System.out.println("2 - Ballet");
                    System.out.println("3 - Contemporary");
                    System.out.println("4 - Exit");
                    int choice = sc.nextInt();
                    if (choice == 1) hiphop.startTraining();
                    else if (choice == 2) ballet.startTraining();
                    else if (choice == 3) contemporary.startTraining();
                    else if (choice == 4) {
                        System.out.println("Goodbye, see you next time!");
                        break;
                    }
                    else {
                        System.out.println("Invalid number: ");
                        choice = sc.nextInt();
                    }
                    Dance.writeFile();
                }
            }
        });

    }
    public static void main(String[] args) {
        new Main();
    }
}