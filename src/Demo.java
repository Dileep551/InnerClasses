class OuterClass {

    int num;
    String name;

    public void printName(){
        System.out.println("Hello I am in Outer Class");
    }

    static class InnerClass{

        public void printInnerClass(){

            System.out.println("Hello I am in Inner Class");
        }

    }
}

class Demo{

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.printName();

//        OuterClass.InnerClass obj = oc.new InnerClass(); //If Inner class is not static

        OuterClass.InnerClass obj = new OuterClass.InnerClass(); //If inner class is static
        obj.printInnerClass();

    }

}
