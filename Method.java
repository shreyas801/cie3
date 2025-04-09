public class Method {
    void display(){
        System.out.println("Value of a = 0");
        System.out.println("Value of b = 0");
    }

    void display(int a){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = 0");
    }

    void display(int a,int b){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }

    public static void main(String[] args)
    {
        Method m = new Method();
        m.display();
        m.display(5);
        m.display(5, 10);
        System.out.println("This is master branch");
    }

    
}
