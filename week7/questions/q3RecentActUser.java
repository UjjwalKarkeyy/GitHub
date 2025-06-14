package week7.questions;
import java.util.LinkedList;
import java.util.Arrays;

class User{
    LinkedList<String>activities = new LinkedList<>(Arrays.asList("Swimming", "Running", "Dancing", "Horse Riding", "Soccer"));

    void addActivities(String activities){
        if(this.activities.size() >= 5){
            this.activities.removeFirst();
        }
        this.activities.add(activities);
    }
}

public class q3RecentActUser{
    public static void main(String[] args) {
        
        User u1 = new User();
        u1.addActivities("Walking");
        System.out.println(u1.activities);
    }
}
