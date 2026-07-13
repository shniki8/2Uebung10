package p3;

import java.util.ArrayDeque;
import java.util.Queue;

public class WaitingList {
    private Queue<String> waitingList = new ArrayDeque<>();

    public int getSize(){
        return waitingList.size();
    }
    public void addToWaitingList(String person){
        waitingList.offer(person);
    }
    public void showWaitingList(){
        for(String s : waitingList){
            System.out.println(s);
        }
    }
    public void giveBookToNextPerson(){
        if (waitingList.isEmpty()){
            System.out.println("Niemand steht auf der Warteliste");
        }else System.out.println(waitingList.poll());
    }
    //battery.isEmpty() ist gerade fast true
}
