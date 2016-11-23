/**
 * Created by Anonymous11100001 on 4/22/2016.
 */
public class Employee {
    String fullName;
    int age;

    Employee(String fullName){
        this.fullName = fullName;
        System.out.println("Constructor has only String args fullName = " + this.fullName);
    }

    Employee(int age){
        this.age = age;
        System.out.println("Constructor has only int args age = " + this.age);
    }

    Employee(String fullname, int age){
        this(fullname);
        this.age = age;
        System.out.println("Constructor has age and fullname");
    }

    Employee(){
        this("anonymous11100001", 32);
    }

    void printInformation(){
        System.out.println("FullName = " + this.fullName + " Age = " + this.age);
    }

    public static void main(String[] args){
        Employee newEmployee = new Employee();
        newEmployee.printInformation();
    }
}
