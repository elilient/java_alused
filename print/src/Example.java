public class Example {
    public static void main(String[] args) {
        Menu food = new Menu();

        food.addMeal("Hamburger");
        food.addMeal("Fish'n'Chips");
        food.addMeal("Sauerkraut");

        food.printMeals();

        food.clearMenu();
        food.printMeals();
    }

}