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

            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                System.out.print("Enter a task : ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task has been added");
                break;
            }
        }

        sc.close();
    }
}