private static String timeConversion(String input) {
        // converting the AM PM time to standard (military) format
        int hour = Integer.parseInt(input.substring(0, 2));
        String hourString = input.substring(0, 2);
        String minutes = input.substring(3, 5);
        String seconds = input.substring(6, 8);
        String timeOfDay = input.substring(8, 10);

        StringBuilder sb = new StringBuilder();
        if (hour == 12 && timeOfDay.equals("PM")) {
            sb.append(hour); // appends 12 like for PM time
        } else if (hour == 12 && timeOfDay.equals("AM")) {
            sb.append("00"); // the day begins with a zero time
        } else if (timeOfDay.equals("PM")) {
            int hourInPM = hour + 12;
            sb.append(Integer.toString(hourInPM));
        } else {
            sb.append(hourString);
        }

        sb.append(":");
        sb.append(minutes);
        sb.append(":");
        sb.append(seconds);

        String result = sb.toString();
        return result;
    }
