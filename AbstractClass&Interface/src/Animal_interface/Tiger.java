package Animal_interface;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrrrrr";
    }

    @Override
    public String howToEat() {
        return "Bite";
    }
}
