package Experiment.Personal_Lab.Array;

public class Person {

    private String name;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    /* public static void sibling(int number) {

         System.out.println("Please enter your array length");
         Scanner input = new Scanner(System.in);
         int length = input.nextInt();

         String[] array1 = new String[number];

         for (int i = 0; i < number; i++) {
             System.out.println("Please enter their name");
             array1[i] = input.next();
         }
         System.out.print("[ ");
         for (int j = 0; j < array1.length; j++) {
             System.out.print(array1[j] + " ");
         }
         System.out.print(" ]");

     }
 */
   /* public static void gotMarried(Person[] family, String name) {

        for(int i = 0; i < family.length; i++){
            if(family[i].getName().equalsIgnoreCase(name)){
                family[i] = null;
            }
        }

    }
*/
    public static void main(String[] args) {

        Person person1 = new Person("Robeil");
        Person person2 = new Person("Keleab");
        Person person3 = new Person("Haben");
        Person person4 = new Person("Hannah");
        Person person5 = new Person("Silvana");
        Person person6 = new Person("Solinana");

        Person[] family = {person1, person2, person3, person4, person5, person6};
/*
        System.out.println("Please enter your array length");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
*/
        // Person newFamily = new Person();

        //sibling(length);

        // sibling(5);

        //  gotMarried(family, "Robeil");
    /*   for (int i = 0; i < family.length; i++) {
            System.out.println(family[i].getName());
        }
*/
        // System.out.println();
        for (Person f : family) {
            System.out.println(f);
        }
    }
}
