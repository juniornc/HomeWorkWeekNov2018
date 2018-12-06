public class bmw { int a=10;
    int b=10;
    int c=a+b;
    int d=a-b;

    public void add(){

        System.out.println(c);

    }
    public void subtract(){
        System.out.println(" My results are for this bmw " + d);

    }
    public static void main(String[] args){

        bmw sedan= new bmw();
        bmw suv=new bmw();


        sedan.add();
        suv.subtract();

    }

}


