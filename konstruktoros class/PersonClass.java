class Person {
        String firstName;
        String lastName;
        int birthYear;
        int birthMonth;
        int birthDay;
        
        public Person(String _firstName, String _lastName, int _birthYear, int _birthMonth, int _birthDay) {
            this.firstName = _firstName;
            this.lastName = _lastName;
            this.birthYear = _birthYear;
            this.birthMonth = _birthMonth;
            this.birthDay = _birthDay;
        }
        
        

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            birthDay = 10;
            birthMonth = 6;
            birthYear = 1990;
        }



        public void printPerson() {
            System.out.println("Vezetéknév: " + lastName);
            System.out.println("Utónév: " + firstName);
            System.out.println("Születési idő: " + birthYear + "." + birthMonth + "." + birthDay + ".");
        }
        
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public int getBirthMonth() {
            return birthMonth;
        }

        public int getBirthDay() {
            return birthDay;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public void setBirthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
        }

        public void setBirthDay(int birthDay) {
            this.birthDay = birthDay;
        }
        
    }


public class PersonClass {
    
        public static void main(String[] args) {
            Person Sanyi = new Person("Pelda", "Sanyi");
            Sanyi.printPerson();
            Sanyi.setBirthDay(30);
            Sanyi.setBirthMonth(2);
            Sanyi.setBirthYear(2000);
            Sanyi.printPerson();
        }
        
    
}
