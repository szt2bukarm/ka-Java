public class Codinghours {
    
    public static void main(String[] args) {
        
        // An average attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int weekdays = 5 * 17;
        double allCodingHours = weekdays * 6;
        System.out.println(allCodingHours);

        double allWorkHours = 52 * 17;
        double codingRatio = allCodingHours / allWorkHours;
        System.out.println(Math.round(codingRatio * 100));

    }

}

