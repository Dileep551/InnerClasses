public class Anonymous {

    public void print() {

        System.out.println(" I am in class Anonymous outer class");

    }
}

class Demo1 {

    public static void main(String[] args) {

        Anonymous aOut = new Anonymous() {

            @Override
            public void print() {
                System.out.println(" I am in Inner Class , without creating object");
            }
        };

        aOut.print();


    }
}

