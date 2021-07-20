package ReturnTypeExercise;

public class ReturnTypeDemo {
    public String MethodOne(){
        String name ="selenium";
        return name;
    }

    public int MethodTwo(){
        int age = 10;
        return age;
    }

    public float MethodThree(){
        float height = 5.6f;
        return height;
    }

    public double MethodFour(){
        double mobileNumber = 9898989898d;
        return mobileNumber;
    }

    public boolean IsMyImageIsUploaded(){
        //logic of image upload
        //really image is uploaded
        return false;
    }

    public double CourierService(String senderName, double mobileNumber){
        double trackingNumber = 54578787458975d;
        return trackingNumber;
    }

    //Create a method which accept one parameter of type string and return String as a data
    public String SomeMethodName(String ref){
        String variable = null;
        return variable;
    }
}
