public class ford {

    int a = 200;
    int b = 70;
    int c = a+b;
    int d = a-b;

    public void add(){
        System.out.println(c);

    }
    public void subtract(){
        System.out.println(" the resulst for this car = " + d);
    }
    public static void main(String[] args){

        ford sedan=  new ford();
        ford suv= new ford();

        sedan.add();
        suv. subtract();

    }
}
