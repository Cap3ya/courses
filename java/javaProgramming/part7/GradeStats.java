import java.util.ArrayList;
import java.util.Scanner;

public class GradeStats {
	private ArrayList<Integer> grades;

	public GradeStats() {
		this.grades = new ArrayList<>();
	};

	public void push(int point) {
		this.grades.add(point);
	}

	public int sum(ArrayList<Integer> grades) {

		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}

		return sum;
	}

	public ArrayList<Integer> filter(ArrayList<Integer> grades, int min, int max) {
		ArrayList<Integer> filteredArray = new ArrayList<>();
		for (int grade : grades) {
			if (grade >= min && grade <= max) {
				filteredArray.add(grade);
			}
		}
		return filteredArray;
	}

	public float averageTotal() {
		return (float) this.sum(this.grades) / this.grades.size();
	}

	public float averageAbove() {
		ArrayList<Integer> aboveGrades = this.filter(this.grades, 50, 100);
		if (aboveGrades.size() == 0)
			return 0;
		return (float) this.sum(aboveGrades) / aboveGrades.size();
	}

	public float percentAbove() {
		ArrayList<Integer> aboveGrades = this.filter(this.grades, 50, 100);
		if (aboveGrades.size() == 0)
			return 0;
		return 100 * ((float) aboveGrades.size() / this.grades.size());
	}

	public void distribution() {

		int gradesA = this.filter(this.grades, 90, 100).size();
		int gradesB = this.filter(this.grades, 80, 89).size();
		int gradesC = this.filter(this.grades, 70, 79).size();
		int gradesD = this.filter(this.grades, 60, 69).size();
		int gradesE = this.filter(this.grades, 50, 59).size();
		int gradesF = this.filter(this.grades, 0, 49).size();

		System.out.print("Grade Distribution:");
		System.out.print("\n5: ");
		for (int i = 0; i < gradesA; i++) {
			System.out.print("*");
		}
		System.out.print("\n4: ");
		for (int i = 0; i < gradesB; i++) {
			System.out.print("*");
		}
		System.out.print("\n3: ");
		for (int i = 0; i < gradesC; i++) {
			System.out.print("*");
		}
		System.out.print("\n2: ");
		for (int i = 0; i < gradesD; i++) {
			System.out.print("*");
		}
		System.out.print("\n1: ");
		for (int i = 0; i < gradesE; i++) {
			System.out.print("*");
		}
		System.out.print("\n0: ");
		for (int i = 0; i < gradesF; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		GradeStats grades = new GradeStats();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Points from 0 to 100,\n-1 to quit");

		while (true) {
			System.out.print("Enter point: ");
			int point = Integer.valueOf(scanner.nextLine());

			if (point == -1) {
				break;
			}

			if (point >= 0 && point <= 100) {
				grades.push(point);
			} else {
				System.out.println("Point is out of range.");
			}
		}

		System.out.println("average (total): " + grades.averageTotal());
		System.out.println("average (above): " + grades.averageAbove());
		System.out.println("percent (above): " + grades.percentAbove());
		grades.distribution();

		scanner.close();
	}
}