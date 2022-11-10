import java.util.*;
import java.security.*;


  class FoodFactory {
    public Food getFood(String order) {

if (order.equals("pizza")) {
    Food pie = new Pizza();
    return pie;
} else {
    Food dessert = new Cake();
    return dessert;
}

}//End of getFood method

  }//End of factory class
