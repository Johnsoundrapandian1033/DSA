 class ride {
    void  display(){
        System.out.println("safe ride");
    }
}
class bike extends ride{
    void bike(){
        System.out.println("safely ride to the bike");
    }
}
class car extends ride {
    void car() {
        System.out.println("safely ride the car");
    }
}
public class hierarchical{
    public static void main(String args[]){
        car c = new car ();
        c.car();
        bike b  =  new bike ();
        b.bike();
        c.display();
        b.display();

    }

}
