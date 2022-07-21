import java.util.Scanner;

     public class number_of_notes {
        public static void main(String[] args) {

            int [] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
            int totalAmount = 0;

            Scanner inputAmount = new Scanner(System.in);

            System.out.println("Enter your amount: ");
            totalAmount = inputAmount.nextInt();

            NumberOfNotes(notes, totalAmount);

            inputAmount.close();

        }

        public static void NumberOfNotes(int [] notes, int totalAmount) {
            int temp = totalAmount;

            for (int i = 0; i < notes.length; i++) {

                System.out.println("Number of "+ notes[i]+ " notes = " + temp / notes[i]);
                temp = temp % notes[i];
            }
        }

    }
