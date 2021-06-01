public class Person {

    private String name;

    public Person(String userName) {
        this.name = userName;
    }

    public String getName(){
//TODO: return the person's name
        return name;

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }

    public void setName(String userName){
//TODO: change the name property to the passed value
        name = userName;

    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

}

