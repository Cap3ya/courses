import java.util.ArrayList;

public class RecipeSearch {
	private ArrayList<Recipe> recipes;

	public RecipeSearch() {
		this.recipes = new ArrayList<>();
	}

	public void add(Recipe recipe) {
		this.recipes.add(recipe);
	}

	public void list() {
		for (Recipe recipe : recipes) {
			System.out.println(recipe.toString());
		}
	}

	public void findByName(String name) {
		for (Recipe recipe : recipes) {
			if (recipe.name().equals(name)) {
				System.out.println(recipe.toString());
			}
		}
	}

	public void findByCookingTime(int maxCookingTime) {
		for (Recipe recipe : recipes) {
			if (recipe.cookingTime() <= maxCookingTime) {
				System.out.println(recipe.toString());
			}
		}
	}

	public void findByIngredient(String searchIngredient) {
		for (Recipe recipe : recipes) {
			if (recipe.ingredients().contains(searchIngredient)) {
				System.out.println(recipe.toString());
			}
		}
	}
}
