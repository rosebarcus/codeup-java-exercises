public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

    }
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

//TODO: The class should have a constructor that accepts a 'String' value and sets the person's name to the passed
// string.

    public Person(String name){
        this.name = name;
    }

//TODO: Create a `main` method on the class that creates a new `Person` object and tests the above methods.

    public static void main(String[] args){
        /*//Testing constructor:
        Person newPerson = new Person("Rose");
        //Should see Rose as name.
        System.out.println(newPerson.getName());
        newPerson.setName("Dru");
        //Should see Dru as name
        System.out.println(newPerson.getName());
        //Should see "Hello there, Dru."
        newPerson.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        //Below we can see that person 1 and person two are in fact different objects
        System.out.println(person1);
        System.out.println(person2);*/

        //instantiating a new person
      /*  Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
        //This shows that person 1 and person 2 in this instance ARE the same person
        System.out.println(person1);
        System.out.println(person2);*/

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //shows that person 1 & 2 are still the same object.
        System.out.println(person1);
        System.out.println(person2);


    }

}



