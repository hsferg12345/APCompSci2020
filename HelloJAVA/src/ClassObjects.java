public class ClassObjects
{
    public static void main(String[] args)
    {
        Person joe = new Person("Joe","Regular");

        joe.setAddress("1000 Roosevelt, Irvine, CA");
        joe.setDateOfBirth(27, 5, 2020);
        joe.setFullName("Harry", "Potter");

        System.out.println("Author: " + Person.getClassAuthor());

        System.out.println("Person Name: " + joe.getFullName());
        System.out.println("Person DOB: " + joe.getDOB());
        System.out.println("Person Address: " + joe.getAddress());


//        System.out.println("Person Name: " + joe.firstName + joe.lastName);
//        System.out.println("Person DOB: " + joe.yearOfBirth + "/" + joe.monthOfBirth + "/" + joe.dayOfBirth);
//        System.out.println("Person Address: " + joe.address);

    }
}
