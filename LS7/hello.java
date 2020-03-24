package LS7;

public class hello {
    int a;
    int b;

    public void setData(int a, int b){
        a = a;
        b = b;
    }

    public void showData(){
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " +b);
    }

    public static void main(String[] args) {
        hello a1 = new hello();
        a1.setData(2,3);
        a1.showData();
    }
}

