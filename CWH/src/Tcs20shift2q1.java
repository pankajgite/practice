import java.util.*;

class Task{
    int priority;
    int time ;

    public Task(int priority, int time) {
        this.priority=priority;
        this.time=time;
    }
    
}

public class Tcs20shift2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Task> list= new ArrayList();
        for (int i=0;i<n;i++){
            int p =sc.nextInt();
            int t = sc.nextInt();
            list.add(new Task(p, t));
        }

        Collections.sort(list,new Comparator<Task>(){
            public int compare(Task a , Task b ){
                if(a.priority != b.priority){
                    return a.priority - b.priority;
                }else{
                    return a.time -b.time;
                }
            }
        });


        System.out.println("==================");
        for(Task task:list){
            System.out.println(task.priority+" "+task.time);
        }
    }
}
