
public class Week3 {

	public static void main(String[] args) {

// 1.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.println(ages[ages.length - 1] - ages[0]);

		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 76 };
		System.out.println(ages2[ages2.length - 1] - ages2[0]);

		int avg = average(ages);
		System.out.println(avg);

// 2.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		int total = 0;

		for (int counter = 0; counter < names.length; counter++) {
			total += names[counter].length();
		}

		System.out.println("The average number of letters per name is " + total / names.length);

		String result = "";
		for (String name : names) {
			result += name;
		}
		System.out.println(result);

// 5.
		String[] names1 = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		int[] nameLengths1 = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			String name = names[i];

			int lengths1 = names.length;

			System.out.println(name + " " + lengths1);

		}

		int[] nameLengths = { 3, 5, 3, 5, 4, 3 };

// 6.

		int sum = 0;

		for (int i = 0; i < nameLengths.length; i++) {
			sum = sum + nameLengths[i];

			System.out.println(sum);
		}

// 7.
		System.out.println(salutation("Hello", 3));

// 8.
		String firstName = "William";
		String lastName = "Raban";
		String fullName = writeFullName(firstName, lastName);

		System.out.println(fullName);

//9.
		int[] nums = {50, 2, 40, 3};
		int max = 100;
		boolean isGreaterThan = greaterThan(nums, max);
		System.out.println(isGreaterThan);
		
//10.
		double [] grades = {87.0, 67.3, 56.7, 99.0, 89.9};
		double avg2 = average2(grades);
		System.out.println(avg2);
		
//11.
		double[] arrayUno = {8.6, 9.4, 61.72, 2.01};
		double[] arrayDos = {6.87, 7.3, 3.04, 87.00};
		
		boolean arrayDosGreater = avgDosArrays(arrayUno, arrayDos);
		System.out.println(arrayDosGreater);
		
//12.
		boolean isHotOutside = true;
		double moneyInPocket = 65.72;
		
		boolean willBuyDrink = thirsty(isHotOutside, moneyInPocket);
		System.out.println(willBuyDrink);
		
//13.
		boolean isColdOutside = false;
		double iHaveCash = 6.78;
		
		boolean iCanBuyIceCream = yum(isColdOutside, iHaveCash);
		System.out.println(iCanBuyIceCream);
		
	}

	private static int average(int[] ages) {
		int total = 0;
		int i = 0;

		for (i = 0; i < ages.length; i++) {
			total += ages[i];

		}
		return total / ages.length;

	}

//3.(and)4.
	// If you have an array named ages, to access the last and first elements you
	// can use:
	// firstAge = ages[0];
	// lastAge = ages[ages.length - 1];

//7. 

	public static String salutation(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;

	}

//8. 

	public static String writeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;

	}
//9. 
	
	private static boolean greaterThan(int [] nums, int max) {
		int total = 0;
		
		for (int num : nums) {
			total += num;
		}
		
		return total > max;
	}

//10.
	
	private static double average2(double[] grades) {
		double total = 0.0;
		
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		return total/grades.length;
	}

//11.
	
	private static boolean avgDosArrays(double[] arrayUno, double[] arrayDos) {
		
		{
			return arrayUno.length > arrayDos.length;
		}
	}
	
//12.
	
	private static boolean thirsty(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
//13.Can I buy an ice cream?
	
	private static boolean yum(boolean isColdOutside, double iHaveCash) {
		return isColdOutside && iHaveCash < 5.00;
		}
}
	

