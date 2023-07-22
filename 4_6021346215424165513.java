import java.util.Scanner;

		public class Project{

			public static String[] WORDS = {"HELLO", "APPLE", "LILLI", "RIDICULOUS", "FLUFFY", "CHEEZEY" };
			public static String Word = WORDS[(int) (Math.random() * WORDS.length)];
			public static String Asterisk = new String(new char[Word.length()]).replace("\0", "*");
			public static int count = 0;

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				while (count < 7 && Asterisk.contains("*")) {
					System.out.println(" PLEASE TURN ON YOUR CAPS LOCK ");
					System.out.println(" GUESS ANY LETTER BETWEEN A TO Z ");
					System.out.println(Asterisk);
					String guess = input.next();
					hang(guess);
				}
				input.close();
			}

			public static void hang(String guess) {
				String NewAsterisk = "";
				for (int i = 0; i < Word.length(); i++) {
					if (Word.charAt(i) == guess.charAt(0)) {
						NewAsterisk += guess.charAt(0);
					} else if (Asterisk.charAt(i) != '*') {
						NewAsterisk += Word.charAt(i);
					} else {
						NewAsterisk += "*";
					}
				}

				if (Asterisk.equals(NewAsterisk)) {
					count++;
					hangmanImage();
				} else {
					Asterisk = NewAsterisk;
				}
				if (Asterisk.equals(Word)) {
					System.out.println(" YOU WIN ! ALL GUESSES WERE CORRECT. THE WORD WAS " + Word);
				}
			}

			public static void hangmanImage() {
				if (count == 1) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |");
					System.out.println("    |");
					System.out.println("    |");
					System.out.println("    |");
					System.out.println("____|_____");
				}
				if (count == 2) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |");
					System.out.println("    |");
					System.out.println("    |");
					System.out.println("____|_____");
				}
				if (count == 3) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |       |");
					System.out.println("    |       |");
					System.out.println("    |");
					System.out.println("____|_____");
				}
				if (count == 4) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |      \\|");
					System.out.println("    |       |");
					System.out.println("    |");
					System.out.println("____|_____");
				}
				if (count == 5) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |      \\|/");
					System.out.println("    |       |");
					System.out.println("    |");
					System.out.println("____|_____");
				}
				if (count == 6) {
					System.out.println(" SORRY WRONG GUESS ! TRY AGAIN ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |      \\|/");
					System.out.println("    |       |");
					System.out.println("    |     _/");
					System.out.println("____|_____");
				}
				if (count == 7) {
					System.out.println(" GAME OVER ! YOUR TURNS ARE END ");
					System.out.println("      ------- ");
					System.out.println("    |/      | ");
					System.out.println("    |      (_)");
					System.out.println("    |      \\|/");
					System.out.println("    |       |");
					System.out.println("          _/ \\_");
					System.out.println(" GAME OVER ! THE WORD WAS " + Word);
				}
			}
		}
