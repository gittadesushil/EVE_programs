package CollectionExercise.HashMapExercise;

import java.util.Collection;
import java.util.HashMap;
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

        System.out.println(values);
    }
}
