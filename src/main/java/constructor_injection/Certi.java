package constructor_injection;

public class Certi {
    String name;

    public Certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }
}
