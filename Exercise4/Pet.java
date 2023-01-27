public class Pet {
    int age;
    String name;
    Person owner;

    Pet(int petAge, String petName, Person ownerName) {
        this.age = petAge;
        this.name = petName;
        this.owner = ownerName;
    
}
    void showOwner() {
    System.out.println("My name is " + this.name + " My owner name is " + owner.name);
}
}

