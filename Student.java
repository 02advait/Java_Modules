import java.util.Scanner;
class Student
{
    int RollNo;
    String Name;
    int Age;
    float Fees;
    Student()
    {

    }
    Student(int RollNo, String Name, int Age, float Fees)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.Age=Age;
        this.Fees=Fees;
    }
    void PrintRecord()
    {
        System.out.println("Roll No: "+this.RollNo+" Name: "+this.Name+" Age: "+this.Age+" Fees: "+this.Fees);
    }
    void AddRecord()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Roll No of the Student");
        this.RollNo=scan.nextInt();
        System.out.println("Enter Name of the Student");
        this.Name=scan.next();
        System.out.println("Enter Age of the Student");
        this.Age=scan.nextInt();
        System.out.println("Enter Fees of the Student");
        this.Fees=scan.nextFloat();
    }
    void UpdateRecord()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Name");
        this.Name=scan.next();
        System.out.println("Enter Age");
        this.Age=scan.nextInt();
    }
}
class StudentTest
{
    public static void main(String[] args) {
        Student sarr[]=new Student[5];
        Scanner scan=new Scanner(System.in);

        int choice;
        do
        {
            System.out.println("========================Student Management System==================");
            System.out.println("Press 1 to Add Student");
            System.out.println("Press 2 to Display All Student");
            System.out.println("Press 3 to Update a Student");
            System.out.println("Press 4 to Delete a Student");
            System.out.println("Press 5 to Exit");
            System.out.println("====================================================================");
            System.out.println("Please Enter your choice");
            choice=scan.nextInt();
   
            switch (choice) {
                case 1:
                    {
                        boolean flag=false;
                        for(int i=0;i<5;i++)
                        {
                            if(sarr[i]==null)
                            {
                                flag=true;
                                sarr[i]=new Student();
                                sarr[i].AddRecord();
                                System.out.println("Record Addess Successfully");
                                break;
                            }
                        }
                        if(flag==false)
                        {
                            System.out.println("Memory not available");
                        }
                        break;
                    }
                case 2:
                {
                    for(int i=0;i<5;i++)
                    {
                        if(sarr[i]!=null)
                        {
                            sarr[i].PrintRecord();
                        }
                       
                    }
                    break;
                }
            case 3:
            {
                Scanner sc=new Scanner(System.in);
                int rn;
                System.out.println("Enter RollNo of the Student to be updated");
                rn=sc.nextInt();
                boolean flag=false;
                for(int i=0;i<5;i++)
                {
                    if(sarr[i]!=null)
                    {
                        if(sarr[i].RollNo==rn)
                        {
                            flag=true;
                            sarr[i].UpdateRecord();
                            System.out.println("Record Updated Successfully");
                            break;
                        }
                    }
                }
                if(flag==false)
                {
                    System.out.println("Record Not Found");
                }
                break;
            }
            case 4:
            {
                Scanner sc=new Scanner(System.in);
                int rn;
                System.out.println("Enter RollNo of the Student to be deleted");
                rn=sc.nextInt();
                boolean flag=false;
                for(int i=0;i<5;i++)
                {
                    if(sarr[i]!=null)
                    {
                        if(sarr[i].RollNo==rn)
                        {
                            flag=true;
                            sarr[i]=null;
                            System.out.println("Record Deleted Successfully");
                            break;
                        }
                    }
                }
                if(flag==false)
                {
                    System.out.println("Record Not Found");
                }
                break;
            }
            case 5:
            System.out.println("Exiting the Program");
            break;
            default:
                System.out.println("Invalid Input");
                    break;
            }
        }while(choice!=5);
        
    }

    public static void main3(String[] args) {
        Student sarr[]=new Student[5];

        sarr[0]=new Student(100, "Malkeet", 34, 24773.89f);
        sarr[1]=new Student(103, "Sahil", 24, 4773.89f);

        int rn=103;

        boolean flag=false;
        for(int i=0;i<5;i++)
        {

            if(sarr[i]!=null)
            {
                if(sarr[i].RollNo==rn)
                {
                    flag=true;
                    sarr[i].PrintRecord();
                    break;
                }
               
            }
        }
        if(flag==false)
        {
            System.out.println("Record Not Found");
        }



    }

    public static void main2(String[] args) {
       
        Student sarr[]=new Student[5];

        for(int i=0;i<5;i++)
        {
            sarr[i]=new Student();
        }

        for(int i=0;i<5;i++)
        {
            sarr[i].AddRecord();
        }

        System.out.println("The Entered Record are as follows");

        for(int i=0;i<5;i++)
        {
            sarr[i].PrintRecord();
        }
       

    }
    public static void main1(String[] args) {
        Student s1=new Student();
        Student s2=new Student();


        s1.AddRecord();
        s2.AddRecord();

        System.out.println("Printing the Records");
        s1.PrintRecord();
        s2.PrintRecord();
    }
}