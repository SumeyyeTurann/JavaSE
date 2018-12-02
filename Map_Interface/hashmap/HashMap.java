package hashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMap {
    public static void mapYazdir(Map<Integer,String> map) {
       map.put(10,"C#");
       map.put(20, "Java"); // HashMapte ekleme işlemi put ile yapılır..
       map.put(30, "Web Programlama");
       map.put(40, "Php");
       map.put(50, "C");
       map.put(60, "Python");
       
       for(Map.Entry<Integer,String> entry : map.entrySet()){
           System.out.println("Key " + entry.getKey() + "------> Değer:" + entry.getValue() );      
       }
       
       // Bu şekilde de anahtarları ve karşılık gelen değerleri ekrana yazdırabiliriz... 
      /* for (Integer key : map.keySet()){
           System.out.println("Key: " + key + "Value: " + map.get(key));
       } */ 
      
      System.out.println("---------------------");
      Collection<String> value = map.values();
      for(String s: value){
          System.out.println("Değer: " + s);
      }
    
}
    public static void main(String[] args) {
        Map <Integer,String> hashmap = new java.util.HashMap<Integer,String>();
        Map<Integer, String> linkedHashmap = new LinkedHashMap<Integer,String>();
        Map <Integer,String> treemap = new TreeMap<Integer,String>();
        
        System.out.println("*************HashMap*************");
        mapYazdir(hashmap);
        System.out.println("*************LinkedHashMap*************");
        mapYazdir(linkedHashmap);
        System.out.println("*************TreeMap*************");
        mapYazdir(treemap);
        
        System.out.println("****************************************");
        
        
        
        
    }
}