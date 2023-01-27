public class Person {
    String name;
    int age;
    
    Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;
    }
    void addFriend(Person Friend){
        System.out.println(this.name + " is friends with " + Friend.name);
        
    }
    void addClassMate(Person classMate){
        System.out.println(classMate.name + " is Classmates with " + this.name);
        
    }
    

   
}

