package zoo;

public class Animal {
    String specie;
    int age;
    double height;
    boolean isAlive;
    float weight;

    void feed(String food) {
        System.out.println("I am eating " + food);
    }
    void speak(){
        System.out.println("Hello There i am " + specie);
    }
}
