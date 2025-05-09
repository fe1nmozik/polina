public class Dancer extends Data {
    String style;
    String activity;
    String progress;
    String performances;
    String practiceName;


    public Dancer(String name, int age, String health, String weight, String style, String activity, String progress, String performances,String practiceName) {
        super(name, age, health, weight);
        this.style = style;
        this.activity = activity;
        this.progress = progress;
        this.performances = performances;
        this.practiceName = practiceName;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getPerformances() {
        return performances;
    }

    public void setPerformances(String performances) {
        this.performances = performances;
    }

    public void joinPractice(String practiceName) {
        this.activity = practiceName;
        System.out.println(name + " joined practice: " + practiceName);
    }


    public void print_info() {
        super.print_info();
        System.out.println("Dance Style: " + style);
        System.out.println("Current Activity: " + activity);
        System.out.println("Progress: " + progress);
        System.out.println("Performances: " + performances);
    }
}
