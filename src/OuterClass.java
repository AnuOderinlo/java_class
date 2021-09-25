public class OuterClass {
    int x = 5;

    public class InnerClass{
        public int innerMethod(){
            return x;
        }
    }

    public static void main(String[] args) {

        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();


        System.out.println(myInnerClass.innerMethod());
    }


}
