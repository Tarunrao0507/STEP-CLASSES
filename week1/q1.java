
public class q1 {

    public void checkDuplicateSeats(int[] seatNumbers) {

        boolean found = false;

        for (int i = 0; i < seatNumbers.length; i++) {

            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: "
                            + seatNumbers[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        int[] seatNumbers = {101, 102, 103, 102, 105};

        q1 obj = new q1();

        obj.checkDuplicateSeats(seatNumbers);
    }
}

