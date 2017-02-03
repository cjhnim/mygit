
public class Counter {

	public static int count_1bit(int value) {

		int quotient ;
		int remainder ;
		int dividend = value;
		int count = 0;

		do {
			quotient = dividend / 2;
			remainder = dividend % 2;

			if (quotient == 1)
				count++;

			if (remainder == 1)
				count++;

			dividend = quotient;
		} while (dividend > 1);

		return count;
	}
}
