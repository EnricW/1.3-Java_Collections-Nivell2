package Level2.Execise1;

public class Restaurant {
    public String name;
    public int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void display() {
        System.out.println("Name: " + name + ", Rating: " + rating);
    }
}
