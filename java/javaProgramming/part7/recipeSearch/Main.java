import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        RecipeSearch recipes = new RecipeSearch();

        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
			
            int count = 1;
			String name = "";
            int cookingtime = 0;
            ArrayList<String> ingredients = new ArrayList<>();

			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				if (line.isEmpty()) {
                    Recipe recipe = new Recipe(name, cookingtime, ingredients);
                    recipes.add(recipe);

                    //reset variables
                    ingredients.clear();
                    count = 0;

				} else if (count == 1) {
					name = line;
				} else if (count == 2) {
					cookingtime = Integer.valueOf(line);
				}
                else {
                    ingredients.add(line);
                }
				count++;
			}
            Recipe recipe = new Recipe(name, cookingtime, ingredients);
            recipes.add(recipe);

			fileReader.close();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

        System.out.println("\nCommands:" + //
                "\nlist - lists the recipes" + //
                "\nstop - stops the program" + //
                "\nfind name - searches recipes by name" + //
                "\nfind cooking time - searches recipes by cooking time" + //
                "\nfind ingredient - searches recipes by ingredient");

        while (true) {

            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nrecipes:");
                recipes.list();
            } else if (command.equals("find name")) {
                System.out.print("Recipe's name: ");
                String recipeName = scanner.nextLine();
                System.out.println("\nrecipes:");
                recipes.findByName(recipeName);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nrecipes:");
                recipes.findByCookingTime(maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nrecipes:");
                recipes.findByIngredient(ingredient);
            } else {
                System.out.println(command + " does not exist.");
            }
        }
        scanner.close();
    }
}
