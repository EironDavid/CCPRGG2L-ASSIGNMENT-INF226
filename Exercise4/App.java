public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hahaha");

        //Person Object
        Person Me = new Person("TobleRon", 19);
        Person Friend = new Person("Jorpetitoy", 20);

        Me.addFriend(Friend);
        // Pet Object
        Pet Dog = new Pet(4,"Crunchy", Me);
        Dog.showOwner();

        Person classMate = new Person("Jograt", 27);
        Me.addClassMate(classMate);

        Person classMate2 = new Person("TENSION", 21);
        Me.addClassMate(classMate2);

        Person classMate3 = new Person("Faye lee", 19);
        Me.addClassMate(classMate3);

        Car Mustang = new Car("Mustang", "Blue", 220, "Eiron");
        Mustang.showOwner();

    }
}
