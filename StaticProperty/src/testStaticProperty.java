public class testStaticProperty {
    public static int data1 = 0;
    private int data2 = 0;

    public testStaticProperty(){
        data1 = data1 + 1;
        data2 = data2 + 1;
        System.out.println("Class data " + data1);
        System.out.println("Class data " + data2);

    }
}
