
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            ArrayList<String> rows = new ArrayList<>();
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.isEmpty()) {
                    // Process the recipe
                    addRecipe(rows, recipes);
                } else {
                    rows.add(row);
                }
            }

            // Handle the last recipe if the file doesn't end with a blank line
            if (!rows.isEmpty()) {
                addRecipe(rows, recipes);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            // Handle `find name` command
            if (command.startsWith("find name")) {
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(name)) {
                        System.out.println(recipe);
                    }
                }
            }

            // Handle `find cooking time` command
            if (command.startsWith("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.getTime() <= time) {
                        System.out.println(recipe);
                    }
                }
            }

            // Handle `find ingredient` command
            if (command.startsWith("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
        
    }
    
    private static void addRecipe(ArrayList<String> rows, ArrayList<Recipe> recipes) {
        String name = rows.get(0);
        int time = Integer.valueOf(rows.get(1));
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < rows.size(); i++) {
            ingredients.add(rows.get(i));
        }
        Recipe recipe = new Recipe(name, time, ingredients);
        recipes.add(recipe);
        rows.clear();
    }

}
