class OuterClass {

    int num;
    String name;

    public void printName(){
        System.out.println(name);
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

        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.printInnerClass();

    }

}
