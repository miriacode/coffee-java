public class CoffeeJava{
    public static void main(String[] args) {
           // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String generalGreeting = "Welcome to CoffeeJava, ";
        String messagePending = ", your order will be ready soon";
        String messageReady = ", your order is ready";
        String messageShowTotal = "Your total is $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double priceMocha = 3.5;
        double priceFilterCoffee = 3.6;
        double priceMilkCoffee = 3.8;
        double priceCappuccino = 4.1;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String client1 = "Cindhuri";
        String client2 = "Sam";
        String client3 = "Jimmy";
        String client4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean isOrder1ready = false;
        boolean isOrder2ready = true;
        boolean isOrder3ready = false;
        boolean isOrder4ready = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        //System.out.println(generalGreeting + client1); 
        // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //

        //Statement 1
        System.out.println(generalGreeting + client1 + messagePending); 

        //Statement 2
        if(isOrder4ready){
            System.out.println(generalGreeting + client4 + messageReady);
            System.out.println(messageShowTotal + priceMocha);
        }else{
            System.out.println(generalGreeting + client4 + messagePending);
        }
        
        //Statement 3
        if(isOrder2ready){
            System.out.println(messageShowTotal + (priceMilkCoffee + priceMilkCoffee));
            System.out.println(client2 + messageReady);
        }else{
            System.out.println(client2 + messagePending);
        
        }
        
        //Statement 4
        System.out.println(messageShowTotal + (priceFilterCoffee - priceMilkCoffee));

        //Statement 5
        priceMocha = 4.20;
        priceCappuccino = 4.00;
        priceMilkCoffee = 4.50;
        priceFilterCoffee = 3.90;
        isOrder1ready = true;
        isOrder2ready = false;
        isOrder3ready = true;
        isOrder4ready = false;
        System.out.println(priceMocha);
        System.out.println(priceCappuccino);
        System.out.println(priceMilkCoffee);
        System.out.println(priceFilterCoffee);
    }
}