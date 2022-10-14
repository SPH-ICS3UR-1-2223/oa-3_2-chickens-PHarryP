public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
     int totalEggs = 0;
     int eggsPerChicken = 5;
     int chickenCount = 3;		 
     //Monday
     totalEggs = eggsPerChicken * chickenCount;
    		 
     //Tuesday
     chickenCount++;
     totalEggs = eggsPerChicken * chickenCount;
     //Wednessday
     chickenCount=chickenCount/2;
     totalEggs = eggsPerChicken * chickenCount;
     System.out.println(totalEggs);
    }   
}
