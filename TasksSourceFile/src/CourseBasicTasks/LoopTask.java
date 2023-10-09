package CourseBasicTasks;

import java.util.Random;

public class LoopTask {
    public static void main(String args[]){

        Random random = new Random();

        int mySpace = 0;
        int totalSpace = 20;
        int maxRoll = 5;

        for(int i=1; i<=maxRoll; i++){

            int die = random.nextInt(6) + 1; // + one to make sure the number range b/w 1-6
            mySpace = mySpace + die;


            if(mySpace == totalSpace){
                System.out.print("Your space is " + totalSpace + ". Congrats!!! You've won \n");
            }
            else if(mySpace > totalSpace ){
                System.out.print("Your space exceeds " + totalSpace + ". Sorry :(, You've lost\n");

            } else if (i == maxRoll && mySpace < totalSpace) {
                System.out.print("Your space is less than " + totalSpace + " and you've reached max rolls limit of " + maxRoll + ". Sorry :(, You've lost \n");

            }
            else{
                int diff = totalSpace - mySpace;
                System.out.print("You have rolled a " + die + ". You are on space " + mySpace
                        + " and have " + diff + " more to go\n");
            }

            System.out.println();

        }

    }
}
