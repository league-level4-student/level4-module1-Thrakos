package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	void horoscope(int o) {

		switch (o) {
		case 0:
			JOptionPane.showMessageDialog(null, "Beware monkeys in party hats.");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Floating cupcakes will bring you good fortune.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Do not go bowling. It will end quite tragically.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Eat lots of food, for it will repel the spirits of stupidity.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Stay away from winged pumpkins, they will prove quite vicious.");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Asparagus tastes quite good today.");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Terrible things will happen if you do not compliment a rock today.");
			break;
		case 7:
			JOptionPane.showMessageDialog(null,
					"Your magical powers are beginning to manifest in the form of mixed candy.");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "A stranger will present you with a paper snowflake. Accept it.");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Magical unicorns feel a strong attraction to you today.");
			break;
		case 10:
			JOptionPane.showMessageDialog(null,
					"Do not go to Legoland anytime this week. It will be full of screaming toddlers.");
			break;
		case 11:
			JOptionPane.showMessageDialog(null,
					"Do not try on shoes without socks. If you do, you might find an alligator in your closet.");
		}

	}

	// 3. Make a main method to test your method

	public static void main(String[] args) {

		String[] options = { "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius",
				"Capricorn", "Aquarius", "Pisces" };
		
		int input = JOptionPane.showOptionDialog(null, "SELECTETH THOU SIGNETH", "Zodiac", 0, -1, null,
				options, 0);
		
		_00_Horoscope o = new _00_Horoscope();
		
		o.horoscope(input);
		
	}

}
