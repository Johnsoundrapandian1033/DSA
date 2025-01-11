 class  A {
    void message(){
        System.out.println("hii");
    }
}
class B {
    void message(){
        System.out.println("hello");
    }
}
class C extends B{
    public static void main (String args[]){
        C c = new C();
        c.message();
    }
}

