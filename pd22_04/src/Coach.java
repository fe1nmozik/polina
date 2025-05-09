public class Coach extends Data{
    String timetable;
    String experience;
    String quantityofgroups;

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQuantityofgroups() {
        return quantityofgroups;
    }

    public void setQuantityofgroups(String quantityofgroups) {
        this.quantityofgroups = quantityofgroups;
    }

    public Coach(String name, int age, String health, String weight, String timetable, String experience, String quantityofgroups) {
        super(name, age, health, weight);
        this.timetable = timetable;
        this.experience = experience;
        this.quantityofgroups = quantityofgroups;

    }
        public void print_info(){
            System.out.println("Timetable: " + timetable);
            System.out.println("Experience: " + experience);
            System.out.println("Groups Managed: " + quantityofgroups);
        }
    }

