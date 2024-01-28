import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

	public RecipeSearch() {

	}

	static void list(String fileName) {
		try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				System.out.println(line);
			}

			fileReader.close();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	static void findName(String name) {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File to read: ");
		String fileName = scanner.nextLine();

		System.out.println(
				"\nCommands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name");

		while (true) {

			System.out.print("\nEnter command: ");
			String command = scanner.nextLine();

			if (command.equals("stop")) {
				break;
			} else if (command.equals("list")) {
				RecipeSearch.list(fileName);
			} else if (command.equals("find name")) {
				System.out.print("Recipe's name: ");
				String recipeName = scanner.nextLine();
				RecipeSearch.findName(recipeName);
			}
		}
		scanner.close();
	}
}
