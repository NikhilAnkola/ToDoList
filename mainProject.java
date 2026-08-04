import java.util.*;

public class mainProject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        boolean isTrue = true;

        while(isTrue){
            System.out.println("----Menu----");
            System.out.println("1 : Add Task");
            System.out.println("2 : View Task");
            System.out.println("3 : Remove Task");
            System.out.println("4 : Exit");


            System.out.print("Enter the operation which you want to perform : ");
            int choice = sc.nextInt();      
            sc.nextLine();

            /*
                * WHY WE NEED sc.nextLine() HERE:
                * 
                * When you type a number and press 'Enter', two things enter the input buffer:
                * 1. The number itself (e.g., '1')
                * 2. The 'Enter' key press (the newline character '\n')
                * 
                * - sc.nextInt() only grabs the number, leaving the '\n' sitting in the buffer.
                * - When the code later hits sc.nextLine() inside the switch statement, it 
                *   instantly reads that leftover '\n', assumes you hit 'Enter' with an empty 
                *   string, and skips your input entirely.
                * 
                * THE FIX: This standalone sc.nextLine() acts as a cleanup step. It consumes 
                * and discards the leftover '\n' from the buffer, ensuring the next 
                * sc.nextLine() actually waits for the user to type their task.
            */

            
            switch(choice){
                case 1: 
                    System.out.print("Enter a task : ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task has been added");
                    break;

                case 2:
                    System.out.println("Your tasks ");
                    for(int i=0; i<tasks.size(); i++){
                        System.out.println(" - " + tasks.get(i));
                    }
                    break;

                case 3: 
                    System.out.print("Enter task number which you want to remove : ");
                    int removeTask = sc.nextInt();
                    removeTask--;
                    tasks.remove(removeTask);
                    System.out.println("Task is removed");
                    break; 
                    
                case 4: 
                    System.out.println("You have exited");
                    isTrue = false;
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }

        sc.close();
    }
}