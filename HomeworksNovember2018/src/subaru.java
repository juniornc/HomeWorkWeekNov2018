public class subaru {

    int a=5;
    int b=10;
    int c=a+b;
    int d=a-b;


    public void add(){

        System.out.println(c);

    }
    public void subtract(){
        System.out.println(" my results "+ d);}
    public static void main(String[]args){

        subaru sedan = new subaru();
        subaru suv = new subaru();

        sedan.add();
        suv.subtract();
    }

}
