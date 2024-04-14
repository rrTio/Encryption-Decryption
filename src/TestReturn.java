import java.util.*;

class TestReturn {

    // Driver code 
    public static void main(String[] args)
    {
        String test = "Hello,World,Testing,String,To,Array";
        String[] arrayTest = test.split(",");
        System.out.println(arrayTest[2]);
        System.out.println(java.util.Arrays.toString(arrayTest));
    }
} 