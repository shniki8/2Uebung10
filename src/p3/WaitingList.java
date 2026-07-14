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
    public boolean isEmpty(){
        return waitingList.isEmpty();
    }

    public boolean contains(String s){
        for (String s2 : waitingList){
            if (s.equalsIgnoreCase(s2)){
                return true;
            }
        }

        return false;
    }
    public String peek(){
        return waitingList.peek();
    }
    public String poll(){
        if (!isEmpty()){
            return waitingList.poll();
        }
        else return "";
    }
}
