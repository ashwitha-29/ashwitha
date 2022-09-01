import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class activity {
  Map<String,String> classList = new HashMap<String,String>();
  public activity() {
  classList.put("Bob", "A");
  classList.put("Maray", "C");
  classList.put("Sarah", "B");
  classList.put("Philip", "A");
  classList.put("Greg", "F");
   }
   
  public void printClassList() {
  Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
  while(entries.hasNext()) {
  Entry<String, String> entry = entries.next();
  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
  }
  }
 
  public void printClassList2() {
  for (Map.Entry<String, String> entry : classList.entrySet()) {
  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
  }
     
//iterating over keys only
      for (String key : classList.keySet()) {
  System.out.println("Key = " + key);
      }
     
      //iterating over values only
      for (String value : classList.values()) {
  System.out.println("Value = " + value);
  }
   }  

  public static void main(String[] args) {
activity myClassList = new activity();
myClassList.printClassList();
myClassList.printClassList2();
}
}
