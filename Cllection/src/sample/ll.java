package sample;

public class ll {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 1.7;

        String formattedString = "Name: %s, Age: %d, Height: %.3f".formatted(name, age, height);
        System.out.println(formattedString);

    }

}
