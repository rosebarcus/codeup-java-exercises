package birds;

import birds.Bird;

public class Duck extends Bird {
    //Duck inherits from Bird
    //Duck inherits all public methods

    public void makeNoise(){
        super.makeNoise();
        System.out.println(this.getName() + " goes Quack Quack!");
    }
}
