public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sidet", "Lejat"};
        Shelter shelter = new Shelter("Peace", "Lenina1");
        Dog dog = new Dog("Rex", "Ovcharka", commands,
                ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Gav Gav");
    }
}