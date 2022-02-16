import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      Necesitarás agregar 1 línea a este archivo para crear una instancia
      de la clase CafeUtil.
      Sugerencia: deberás corresponder con el nombre de la variable que se usa a continuación.
    */
    CafeUtil appTest = new CafeUtil();
    	
        /* ============ Casos de prueba de la App ============= */
    
        System.out.println("\n----- Prueba Meta Café -----");
        System.out.printf("Compras necesarias para la semana 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("\n----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total orden: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("\n----- Prueba Mostrar Menú-----");        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Prueba acgregar cliente-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
        }

        System.out.println("\n----- Prueba Mostrar Tabla de Precios-----");
        appTest.printPriceChart("Café Colombiano Molido", 12000, 3);

        System.out.println("\n----- Prueba Mostrar Menú Doble-----");
        ArrayList<Double> mprice = new ArrayList<Double>();
        mprice.add(1200.00);
        mprice.add(3200.00);
        mprice.add(3600.00);
        mprice.add(3200.00);
        appTest.displayMenu(menu, mprice);

        System.out.println("\n----- Prueba Acgregar Clientes-----");
        appTest.addCustomers();
    }
}