public class harly { int a=20;
    int b=10;
    int c=a+b;
    int d=a-b;

    public void add(){

        System.out.println(c);

    }
    public void subtract(){
        System.out.println(" my harley davidson is one of the best american made motorcycles $" + d);

    }
    public static void main(String[] args){

        harly sedan = new harly();
        harly suv = new harly();

        sedan.add();
        suv.subtract();
    }
}
