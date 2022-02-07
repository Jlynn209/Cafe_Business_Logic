import java.util.Arrays;
import java.io.Console;
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {

        int sum = 0;

        for (int i = 0; i <= numWeeks; i++){
            sum = sum + i;
        }

        return sum;
    }

    public double getOrderTotal(double[] prices) {

        double sum = 0;

        for (int i = 0; i < prices.length; i++){
            sum = sum + prices[i];
        }

        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }

    }

    public void addCustomer(ArrayList<String> customers) {

        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s", userName);
        System.out.printf(" There are %s in front of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);

    }
}