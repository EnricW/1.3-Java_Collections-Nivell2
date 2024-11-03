package Level1.Exercise1;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
