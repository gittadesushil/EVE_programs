package MethodExercise;

public class MethodDemoOneExecutor {
    public static void main(String[] args) {
        MethodDemoOne obj1 = new MethodDemoOne();
        MethodDemoOne obj2 = new MethodDemoOne("pankaj","automation");
        MethodDemoOne obj3 = new MethodDemoOne("hello .....");
        MethodDemoOne obj4 = new MethodDemoOne("hi....",1234,1.2f,'A');

        obj1.MethodOne();
        obj1.MethodThree('B',2.2f,"hello....");
        obj1.MethodTwo(3.3f);
        obj1.MethodFour("alpha","beta");

    }
}
