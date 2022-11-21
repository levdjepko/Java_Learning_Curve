class Scratch {
        public static String recurse( String string) {
            if (string.length() <= 1) {
                return string;
            }
            String first = string.substring(0,1);
            String second = string.substring(1);

            return recurse(second) + first;
        }
        public static void main(String[] args) {
            System.out.println(recurse("abbf"));
        }

}
