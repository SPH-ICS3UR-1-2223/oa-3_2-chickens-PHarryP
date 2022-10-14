public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	int eggCount = 0;
    	
    	//Monday
    	eggCount = eggCount+100;
    	
    	//Tuesday
    	eggCount = eggCount+121;
    	
    	//Wednessday
    	eggCount = eggCount+117;		
    			
    	int dailyAverage = eggCount/3;
    	int monthlyAverage = dailyAverage*30;
    	double monthlyProfit = monthlyAverage*(0.18*eggCount);
        System.out.println("Daily Average:   " +dailyAverage );
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $"+monthlyProfit );
    }
    
}
