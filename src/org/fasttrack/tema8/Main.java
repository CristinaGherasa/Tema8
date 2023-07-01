package org.fasttrack.tema8;

public class Main {
    public static void main(String[] args) {
        Advertisement facebookAd = new FacebookAdvertisement("Check out our new product!");
        facebookAd.display();

        Advertisement emailAd = new EmailAdvertisement("Special Offer", "Limited time discount!", "example@example.com");
        emailAd.display();

        Advertisement printAd = new PrintAdvertisement("Visit our store today!");
        printAd.display();


        Bank ingBank = new INGbank();
        ingBank.deposit(1000.0);
        ingBank.withdraw(500.0);

        Bank btBank = new BTbank();
        btBank.deposit(2000.0);
        btBank.withdraw(1500.0);

        Bank brdBank = new BRDbank();
        brdBank.deposit(3000.0);
        brdBank.withdraw(4000.0);


        Cat cat = new Cat();
        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        Dog dog = new Dog();
        System.out.println(dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());

        Mouse mouse = new Mouse();
        System.out.println(mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());

        Chicken chicken = new Chicken();
        System.out.println(chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());

        Duck duck = new Duck();
        System.out.println(duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());



        Student student1 = new Student("John", 85);
        Student student2 = new Student("Alice", 90);
        Student student3 = new Student("Bob", 75);

        System.out.println("Student 1: Name = " + student1.getName() + ", Grade = " + student1.getGrade());
        System.out.println("Student 2: Name = " + student2.getName() + ", Grade = " + student2.getGrade());
        System.out.println("Student 3: Name = " + student3.getName() + ", Grade = " + student3.getGrade());
        System.out.println("Average Grade: " + Student.getAverageGrade());
    }
}