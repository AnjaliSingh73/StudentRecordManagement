import java.util.Scanner;

public class StudentRecordLauncher {
    public static void main(String[] args) {
        StudentRecord studentRecord=new StudentRecord();
        System.out.println("Are you an admin? Enter yes or no.");
        Scanner scanner=new Scanner(System.in);
        String userResponse=scanner.next();
        if (userResponse.equalsIgnoreCase("yes")){
            System.out.println("Please enter admin password.");
            String adminPassword=scanner.next();
            Admin aiYasminSchoolAdmin =new Admin();
            if (aiYasminSchoolAdmin.checkPassword(adminPassword)) {
                String continueEditing;
                do {
                    System.out.println("Following operations can be performed:\n1: Add student\n2: Update student\n3: Remove student\n4: View records.");
                    System.out.println("Please enter your choice(1/2/3/4)");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Please enter the name.");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            System.out.println(name);
                            studentRecord.addNewStudent(name);
                        }
                        case 2 -> {
                            System.out.println("Please enter roll number");
                            int rollNumber = scanner.nextInt();
                            System.out.println("Please enter name");
                            scanner.nextLine();
                            String newName = scanner.nextLine();
                            System.out.println();
                            System.out.println(studentRecord.updateNewStudent(rollNumber, newName));
                        }
                        case 3 -> {
                            System.out.println("Please enter roll number");
                            int removeRollNumber = scanner.nextInt();
                            System.out.println(studentRecord.removeNewStudent(removeRollNumber));
                        }
                        case 4 -> studentRecord.viewDatabase();
                        default -> System.out.println("Wrong choice Entered.");
                    }
                    System.out.println("Do you want to continue editing?(yes/no)");
                    continueEditing = scanner.next();
                }while (continueEditing.equalsIgnoreCase("yes")) ;

            }
            else
                System.out.println("Wrong Password! Access Denied!");
        }
        else {
            studentRecord.viewDatabase();
        }

    }

}
