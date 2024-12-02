import java.util.*;

public class pt_195_Hash_map_in_java {
    Scanner sc;
//    HashMap is like a Dictionary in python.
//    HashMap are unordered map.
//    map.put()
//    |     |
//  exist   does'nt exists
//    |              |
//update value     new pair is inserted
    pt_195_Hash_map_in_java(Scanner sc)
    {
        this.sc=sc;
    }
//    11 35 - 12 55
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        country(key) ,population(value)
        HashMap<String,Integer> map=new HashMap<>();

//        Insertion
        map.put("India",120);
        map.put("Us",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);


//        Search operation or look up operation
        if(map.containsKey("china"))
        {
            System.out.println("key is present");
        }
        else {
            System.out.println("not");
        }

        System.out.println(map.containsKey("China")); //True
        System.out.println(map.containsKey("Indonasia")); //false

//        Getting value:
        System.out.println(map.get("China")); //print value
        System.out.println(map.get("Indonasia")); //print value


//        Iteration in HashMap:
        System.out.println(map.entrySet());//Convert hash map into set.
        System.out.println(map);//hash map is like a dictionary.
        System.out.println();
//        for (int val:arr) {
//        for(Map.Entry<String,Integer> e : map.entrySet())
//        {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//            System.out.println();
//        }
//
////        Get all the keys:
//        System.out.println();
//        Set<String> keys=map.keySet();
//        for (String key:keys)
//        {
//            System.out.println(key+" "+map.get(key));
//        }
//
//        System.out.println();
//        Collection<Integer> values=map.values();
//        for (int value:values)
//        {
//            System.out.println(value);
//        }


//        Removing values:
        map.remove("China");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println("ok"+map.remove("India"));
        System.out.println("ok"+map.remove("India"));

//        Hashmap is a array of linked list in java.
//        Hashing- changing the form of the data.(Type casting)

    }
}