import java.lang.classfile.instruction.SwitchCase;
import java.util.*;


public class CRUD {
 

 static String [] name=new String[10];
 static String [] city=new String[10];
static String [] address=new String[10];
static String [] stclass=new String[10];

static int idx=0;
    static void Add(){
    Scanner ch=new Scanner(System.in);
    System.out.println("Enter name");
    name[idx]=ch.nextLine();
   System.out.println("Enter city");
   city[idx]=ch.nextLine();
  System.out.println("Enter address");
    address[idx]=ch.nextLine();
  System.out.println("Enter studentClass");
   stclass[idx]=ch.nextLine();
   idx++;


};

static void showStudent(){
    System.out.println("============!!!Student table!!!===========" );
    System.out.println(
    "name" + "   " +
    "city" + "   " +
    "address" + "   " +
    "stclass"
);

    for(int i=0;i<idx;i++){
        System.out.println(
    name[i] + "   " +
    city[i] + "   " +
    address[i] + "   " +
    stclass[i]
);
    }
}

static void updateStudent(int ch,int id){
    Scanner up=new Scanner(System.in);
String [] attr=new String[4];
attr[0]="name";
attr[1]="city";
attr[2]="address";
attr[3]="stclass";

System.out.println("Enter updated "+attr[ch-1]+":");
String update=up.nextLine();
switch (ch) {
    case 1:
        name[id-1]=update;
        break;
    case 2:
        city[id-1]=update;
        break;
    case 3:
        address[id-1]=update;
        break;
    case 4:
        stclass[id-1]=update;
        break;

    default:
        System.out.println("Invalid choice");
        break;
}

}
static void deleteStudent(int id){
    System.out.println("You really want to delete (y/n)");
   
      Scanner del=new Scanner(System.in);
       char sure=del.next().charAt(0);

       if(sure=='y'){
        for(int i=id-1;i<idx;i++){
        name[i]=name[i+1];
        city[i]=city[i+1];
        address[i]=address[i+1];
        stclass[i]=stclass[i+1];
    }
    idx--;

       }else{
        System.out.println("Noting removed...");
       }

}





    

    public static void main(String[] args) {
        int choice=0;
        Scanner ch=new Scanner(System.in);
        
        while(choice!=5){
            System.out.println("1.Add student \n,2.show student \n,3.update student\n,4.delete student\n,5.exit");
            choice=ch.nextInt();
         switch (choice) {
            case 1:
                Add();
                break;
            case 2:
                showStudent();
                break;
            case 3:
                System.out.println("Enter the id of student want to update");
                 int id=ch.nextInt();
                System.out.println("1.student name \n,2.student city \n,3.student address \n,4.student class");
                int x=ch.nextInt();
                updateStudent(x,id);
                break;
                case 4:
                System.out.println("Enter the id of student want to delete");
                 int idx=ch.nextInt();
               deleteStudent(idx);
                break;
            case 5:
             break;
            
         
            default:
                break;
         }
        }
    }
}