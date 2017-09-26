package construct;

class Student{  
    int id;  
    String name;  
      
    Student(int i,String prudhvi){  
    id = i;  
    name = prudhvi;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan"); 
    Student s3 = new Student(333, "Rama");
    s1.display();  
    s2.display();  
    s3.display();
   }  
}  