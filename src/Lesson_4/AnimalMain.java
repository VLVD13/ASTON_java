package Lesson_4;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animalGiraffe = new Animal();
        Animal animalElephant = new Animal();
        Animal animaLion = new Animal();

        Cat catBarsik = new Cat("Барсик", 50);
        Dog dogTuzik = new Dog("Тузик");
        Cat catBoris = new Cat("Борис", 50);
        Dog dogMuhtar = new Dog("Мухтар");
        catBarsik.run(100);
        dogTuzik.run(250);

        catBoris.swim(1);
        dogMuhtar.swim(5);

        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: "+ Cat.getCountCat());
        System.out.println("Всего собак: "+ Dog.getCountDod());

        Cat[] cats = {new Cat("Василий", 50), new Cat("Матроскин", 50), new Cat("Биток", 25), new Cat("Вайфай", 5), new Cat("Жрун", 1)};
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(20);
        System.out.println("В тарелке осталось: " + plate.food + " единиц еды");
    }
}
