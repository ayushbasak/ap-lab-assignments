import java.util.*;
import java.io.*;
class Student{
        String name;
        String branch;
        String grade; // between A-F
        ArrayList<String> courses = new ArrayList<String>();
        ArrayList<String> electives = new ArrayList<String>();

        //Constructor
        Student(String name, String branch,String grade,ArrayList<String> courses, ArrayList<String> electives){
            this.name = name;
            this.branch = branch;
            this.grade = grade;
            this.courses = courses;
            if(electives.size() == 0){
                this.electives.add("NOTHING");
                this.electives.add("NOTHING");
            }
            else
                this.electives = electives;
        }

        public void display(){
            System.out.println(name+"\t" + branch+ "\t" + grade + "\t" + courses.get(0) + "\t" + courses.get(1) + "\t" + courses.get(2) + "\t" + electives.get(0) + "\t" + electives.get(1) + "\n");
        }
}

class Program{
    static ArrayList<Student> students = new ArrayList<Student>();
    public static void main(String[] args)throws IOException{
        // Program obj = new Program();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> core = new ArrayList<String>();
        core.add("M2");
        core.add("Analog");
        core.add("Physics");
        core.add("DSA");

        ArrayList<String> electivesAvailable = new ArrayList<String>();
        electivesAvailable.add("HSS");
        electivesAvailable.add("BCom");
        electivesAvailable.add("LLB");

        //Students can choose 3 Core courses and 2  Electives if any

        //Menu
        System.out.println("List Of Options:\n");
        System.out.println("Available Branches: CCE ECE ME");
        System.out.println("Available Core Courses: M2 Analog Physics DSA");
        System.out.println("Available Electives: HSS BCom LLB\n");
        System.out.println("List Of Options:\n");
        System.out.println("1: Register A Student");
        System.out.println("2: Branch Wise Data");
        System.out.println("3: Course Wise Data");
        System.out.println("4: Course and Grades");
        System.out.println("5: Elective Courses and Grades");
        System.out.println("6: EXIT the program");
        // System.out.println("2: ");


        System.out.println("Enter a Choice");
        int choice = Integer.parseInt(br.readLine());

        switch(choice){
            case 1:{
                System.out.println("Enter Your Name, Branch and Grade");
                String name = br.readLine();
                String branch = br.readLine();
                String grade = br.readLine();

                System.out.println("Enter Core Courses");
                String core01 = br.readLine();
                String core02 = br.readLine();
                String core03 = br.readLine();

                ArrayList<String> li01 = new ArrayList<String>();
                li01.add(core01);
                li01.add(core02);
                li01.add(core03);

                System.out.println("Enter 2 Electives");
                String elec01 = br.readLine();
                String elec02 = br.readLine();

                ArrayList<String> li = new ArrayList<String>();
                li.add(elec01);
                li.add(elec02);
                students.add(new Student(name,branch,grade,li01,li));
                break;
            }
            case 2:{
                String branch01;
                System.out.println("Enter the name of branch");
                branch01 = br.readLine();
                for(int i = 0;i< students.size();i++){
                    if(students.get(i).branch.equals(branch01))
                        students.get(i).display();
                }
                break;

            }
            case 3:{
                System.out.println("Enter Course to Get Course Wise List");
                String coursename = br.readLine();

                for(int i = 0;i< students.size();i++){
                    if(students.get(i).courses.contains(coursename));
                        students.get(i).display();
                }
                break;

            }


            case 4:{
                for(int i = 0;i< students.size();i++){
                    System.out.println("Student: ");
                    System.out.println(students.get(i).name);
                    System.out.println(students.get(i).grade);
                    System.out.println(students.get(i).courses.get(0));
                    System.out.println(students.get(i).courses.get(1));
                    System.out.println(students.get(i).courses.get(2));
                    System.out.println();
                }
                break;
            }
            case 5:{
                for(int i = 0;i< students.size();i++){
                    System.out.println("Student: ");
                    System.out.println(students.get(i).name);
                    System.out.println(students.get(i).grade);
                    System.out.println(students.get(i).electives.get(0));
                    System.out.println(students.get(i).electives.get(1));
                    System.out.println();
                }
                break;
            }

            case 6:
                return;

            default:
                System.out.println("This is Invalid");
                
        }

        main(new String[] {"a"});
    }
}