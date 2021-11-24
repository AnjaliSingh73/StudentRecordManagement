import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Set;

public class StudentRecord {
    private HashMap<Integer, String> students =new HashMap<>();
    private static int lastRollNumber=0;
    protected void addNewStudent(String name){
        lastRollNumber+=1;
        this.students
            .put(lastRollNumber,name);
        System.out.println("Student added successfully");
    }
    protected String updateNewStudent(int rollNumber,String name){
        if(this.students.containsKey(rollNumber)){
            this.students.replace(rollNumber,name);
            return "Database updated successfully";
        }
        return "No such roll number found";
    }
    protected String removeNewStudent(int rollNumber){
        if(this.students.containsKey(rollNumber)){
            this.students.remove(rollNumber);
            return "Student removed successfully";
        }
        return "No such roll number found";
    }
    public String toString(){
        String databaseData="";
//        Set keys= this.students.keySet();
//        Iterator keyIterator=keys.iterator();
//        while(keyIterator.hasNext()){
//            Object key=keyIterator.next();
//            databaseData+=(key+" "+ this.students.get(key)+"\n");
//        }
        for(HashMap.Entry<Integer,String> hashMap:this.students.entrySet()){
            databaseData+=(hashMap.getKey()+" "+hashMap.getValue());
        }
        return databaseData;
    }
    public void viewDatabase(){
        System.out.println(this.students);
    }
}
