package assignment11;

import java.util.*;
public class hashmap {
  
public static void main(String args[]) {
HashMap<Integer,String>map= new HashMap<Integer,String>();
map.put(1, "megha");
map.put(2, "kritika");
map.put(3, "priya");
map.put(4, "shubham");
map.put(5, "sumit");
map.put(6, "yogesh");
map.put(7, "mohit");
map.put(8, "harsh");
for(Map.Entry<Integer,String>e : map.entrySet()){
 System.out.println(e.getKey()+" "+e.getValue());
}
}
}
 
