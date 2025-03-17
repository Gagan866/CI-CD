public class hello {
    void hi() {
        System.out.println("hi");

    }
    void morning(){
        System.out.println("morning");
    }
    void evening(){
        System.out.println("Evening");
    }
    public static void main(String[] args) {
        hello h = new hello();
        h.hi();
        h.morning();
        h.evening();
    }
}