package ReturnTypeExercise;

public class ReturnTypeDemoExecutor {
    public static void main(String[] args) {
        ReturnTypeDemo obj1 = new ReturnTypeDemo();
        String soomeValue = obj1.MethodOne();
        System.out.println(soomeValue);

        int someIntValue = obj1.MethodTwo();
        float someFloatValue = obj1.MethodThree();
        double someDoubleValue = obj1.MethodFour();
        boolean someBoolValue = obj1.IsMyImageIsUploaded();
        double trackingNumber = obj1.CourierService("alpha",9878787878d);
        System.out.println(trackingNumber);
    }
}
