public class BasicCalculator {

//    function takes two numbers and a mathematical operator
//    perform the calculation with the given numbers

    public static void main(String[] args){

        BasicCalculator basicCalculator = new BasicCalculator();

        basicCalculator.calculator(2, "+", 2);
        basicCalculator.calculator(2, "*", 2);
        basicCalculator.calculator(4, "/", 0);

    }

    public void calculator(int a, String b, int c){
        double answer = 0;

        if(b.equals("+")){
            answer = a + c;
            System.out.println("The answer for " + a + b + c + " is " + answer);
        }
        else if(b.equals("*")){
            answer = a*c;
            System.out.println("The answer for " + a + b + c + " is " + answer);
        }
        else{
            if(c==0){
                System.out.println("Can't divide by 0!");
            }
            else{
                answer = a/c;
                System.out.println("The answer for " + a + b + c + " is " + answer);
            }
                 }
//        System.out.println("The answer for " + a + b + c + " is " + answer);
    }
}
