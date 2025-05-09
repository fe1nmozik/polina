public class Data {
    String name;
    int age;
    String health;
    String weight;

    public Data(String name, int age, String health, String weight){
        this.name = name;
        this.age = age;
        this.health = health;
        this.weight = weight;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void print_info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Health: " + health);
        System.out.println("Weight: " + weight);
    }

}

