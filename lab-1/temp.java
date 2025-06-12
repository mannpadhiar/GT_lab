class Hello{
    public static void printHello(){
        System.out.println("Hello");
    }
}

class SecondHelllo extends Hello{
    public static  void printHello(){
        System.out.println("Hello Second");
    }

    public static void printHello(String s){
        System.out.println("Hello Second" + s);
    }
}

class Temp{
    public static void main(String[] args) {
        SecondHelllo hello = new SecondHelllo();
        hello.printHello("hello");
    }

}