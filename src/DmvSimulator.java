public class DmvSimulator {
    private static int userNum;
    private static int numCall;

    public static void main (String args[]){
        System.out.println("Hello and welcome to the DMV!");
        //generates a number between 1 and 200
        userNum = (int) ((Math.random() *200) + 1);
        
        //gives user the information they need
        System.out.println("Your number for the queue is: " + userNum);
        System.out.println("Please wait until your number is called.");
        numCall = userNum + 1;
        System.out.println("Calling number: " + numCall);

        //loops around to the number for the user
        do{
            if(userNum == 200){
                numCall = 0;
            }else if(numCall != userNum && numCall == 200){
                //System.out.println("Calling number: " + numCall);
                numCall = 0;
            }else{
                numCall ++;
            }
            System.out.println("Calling number: " + numCall);

        } while(numCall != userNum);
        System.out.println("Leave, you have the wrong paperwork.");

    }
}
