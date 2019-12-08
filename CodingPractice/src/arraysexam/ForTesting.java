package arraysexam;

interface A {

    void walk();

}



class B implements A {
    public void walk() {
        System.out.println("B is walking");
    }
}

class C implements A {
    public void walk() {
        System.out.println("C is walking");
    }
}



 class ForTesting {

    public static void main(String[] args) {
    A c = new B();
    c.walk();
    }

    
    
    
    
}
