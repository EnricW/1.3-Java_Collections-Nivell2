package Level2.Execise2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void display() {
        System.out.println("Name: " + name + ", Rating: " + rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return rating == that.rating && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison == 0) {
            return Integer.compare(other.rating, this.rating);
        }
        return nameComparison;
    }
}
