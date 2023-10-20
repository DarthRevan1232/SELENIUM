package zoo;

public class Owner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.specie = "monkey";
        animal.feed("pyszne jedzonko");

        animal.speak();
    }
}
