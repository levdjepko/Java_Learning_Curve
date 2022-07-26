        String target = "OlDBar";
        String oldR = "old";
        String newR = "New";
        target = target.replaceAll("(?i)" + oldR, newR); // IGNORE CASE
        System.out.println(target);
// NewBar
