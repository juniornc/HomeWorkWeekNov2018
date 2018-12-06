public class mitsubishi {
    int a = 10;
    int b = 25;
    int c = a + b;
    int d = a - b;

    public void add() {
        System.out.println(c);
    }

    public void subtract() {
        System.out.println("My results for this car is " + d);
    }

    public static void main(String[] args) {



        mitsubishi sedan = new mitsubishi();
        mitsubishi suv = new mitsubishi();

        sedan.add();
        suv.subtract();
    }
}
