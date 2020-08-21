import java.text.SimpleDateFormat;
import java.util.Date;

public class Exzample {


        public static void main(String[] args) {

            Operationable operation;
            Operationable operation1 = (int x, int y)-> x + y;
            Operationable operation2 = (int x, int y)-> x - y;
            Operationable operation3 = (int x, int y)-> x * y;


            int result1 = operation1.calculate(10, 20);
            int result2 = operation2.calculate(10, 20);
            int result3 = operation3.calculate(10, 20);
            System.out.println(operation1.calculate(20, 10)); //30
            System.out.println(operation2.calculate(20, 10)); //10
            System.out.println(operation3.calculate(20, 10)); //200

            Date dateNow = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss.SSS");
            dateNow = new Date(dateNow.getTime());
            System.out.println("Today is: " + dateNow);
        }
    }
    interface Operationable{
        int calculate(int x, int y);
    }

