package CollectionExercise.HashMapExercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String,String> ref = new HashMap();

        ref.put("pankaj","street house number 123 villagename pincode 1111");
        ref.put("Anupama","street house number 546 villagename pincode 77744");
        ref.put("Bhagyashri","street house number 225 villagename pincode 34546");

        String address = ref.get("Bhagyashri");

        HashMap<Integer,String> students = new HashMap<>();
        students.put(11,"pankaj");
        students.put(11,"sushil");
        students.put(11,"tade");
        students.put(11,"abc");
        students.put(11,"selnium ");
        students.put(11,"java");
        students.put(34,"Anupama");
        students.put(55,"Bhagyashri");

        String studentName = students.get(11);

        boolean isAvailable = students.containsKey(54545);
        boolean isAvailable1 = students.containsValue("java");
        Set<Integer> keys = students.keySet();
        Collection<String> values = students.values();

        //String oldValue = students.replace(34,"ANUPAMA");
        //boolean status = students.replace(55,"Bhagyashri","BHAGYASHRI");

        //String value = students.remove(4445454);
        boolean status = students.remove(5454587,"java");

//        System.out.println(status);
//        System.out.println(students);

        HashMap<String,String> classData = new HashMap<>();
        classData.put("23","pankaj");
        classData.put("33","sushil");

        System.out.println("Before clearing the hashamp : " + classData.size());
        classData.clear();
        System.out.println("After clearing the hashamp : " +classData.size());

        for (Map.Entry<String, String> var:classData.entrySet()) {
            System.out.println("Roll Number is : " + var.getKey() + " & Student name is : " + var.getValue());
        }
    }
}
