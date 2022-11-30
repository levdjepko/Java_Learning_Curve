// helper method that replicates C#'s tryParse method
        public static int tryParseInt (String s) {
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                return 0; // default return
            }
        }

        public static void main(String[] args) {
            // Inverse the integer, keeping the Sign
            int value = -2147483648;

            boolean isNegative = value < 0 ? true : false;
            if (isNegative) {
                value = value * -1;
            }
            StringBuilder sb = new StringBuilder();
            while (value / 10 > 0) {
                sb.append(value % 10);
                value = value / 10;
            }
            sb.append(value);
            String newNumberAsString = sb.toString();
            int newNumber = tryParseInt(newNumberAsString);

            if (isNegative) {
                newNumber = newNumber * -1;
            }
            System.out.println(newNumber);
        }
