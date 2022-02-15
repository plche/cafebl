import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * CafeUtil
 */
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println("\n¡Hola, " + userName + "! Hay "  + customers.size() + " personas frente a ti");
        customers.add(userName);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + " " + customers.get(i));            
        }
        System.out.println("\n");
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        DecimalFormat frmtPrice = new DecimalFormat("$###,###");
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double newPrice = price * i;
            System.out.println(i + " - " + frmtPrice.format(newPrice));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        DecimalFormat frmtPrice = new DecimalFormat("$###,###");
        if (menuItems.size() == prices.size()) {
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i + " " + menuItems.get(i) + " -- " + frmtPrice.format(prices.get(i)));
            }
            return true;
        } else return false;
    }

    public void addCustomers() {
        boolean noSalir = true;
        ArrayList<String> customers = new ArrayList<String>();
        System.out.println("Hola, bienvenido. Presione 'q' para salir.");
        do {
            System.out.println("Por favor, ingrese nombre del cliente:");
            String newCustomer = System.console().readLine();
            if ((newCustomer.length() == 1) && ((newCustomer.charAt(0) == 113) || (newCustomer.charAt(0) == 81))) {
                noSalir = false;
            } else {
                System.out.println("\n¡Hola, " + newCustomer + "! Hay "  + customers.size() + " personas frente a ti");
                customers.add(newCustomer);
                for (int i = 0; i < customers.size(); i++) {
                    System.out.println((i + 1) + " " + customers.get(i));            
                }
                System.out.println("\n");
            }
        } while (noSalir);
    }
}