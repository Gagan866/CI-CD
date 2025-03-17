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
    void night(){
        System.out.println("Night");
    }
    public static void main(String[] args) {
        hello h = new hello();
        h.hi();
        h.morning();
        h.evening();
        h.night();
    }
}