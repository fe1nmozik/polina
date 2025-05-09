public class Masterclass extends Data {
    int price;
    String coach;
    String class_name;



    public Masterclass(String name, int age, String health, String weight, int price, String coach, String class_name){
        super(name,age,health,weight);
        this.price = price;
        this.coach = coach;
        this.class_name = class_name;
    }

    public void print_info() {
        System.out.println("Masterclass: " + class_name);
        System.out.println("Coach: " + coach);
        System.out.println("Price: " + price + " EUR");
    }
}


