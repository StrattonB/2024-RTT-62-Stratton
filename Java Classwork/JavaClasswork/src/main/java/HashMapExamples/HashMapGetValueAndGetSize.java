package HashMapExamples;
import java.util.HashMap;
import java.util.Map;

public class HashMapGetValueAndGetSize<I, S> {
    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args) {
        //creating a new dictionary
        //new map has parameters (key is int and val is a string)
        HashMap<Integer, String> hash_map= new HashMap<Integer,String>();
        //using map put method to store in key "1" the value of ""Red"" ex: {1: "Red"}
        //called key val pairs
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        //using a for each instead of for loop to lookup each key and return its value
        //Entry() returns the contents of map, entrySet() returns set of keys

        for(Map.Entry x:hash_map.entrySet()){
            //
            System.out.println(x.getKey()+" "+x.getValue());
        }
        System.out.println("Size of the hash map: "+hash_map.size());
    }
}
