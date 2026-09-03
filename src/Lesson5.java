public class Lesson5 {
  /*
   * The main method is the program's starting point.
   * When we run the Lesson5 class, Java starts here.
   */
  public static void main(String[] args) {
    /*
     * Person          -> variable type, defined by the Person class.
     * student         -> variable that stores the object reference.
     * new             -> creates a new object in memory.
     * Person(...)     -> calls the constructor and supplies the initial values.
     *
     * Therefore, student is an OBJECT (or instance) created from
     * the blueprint called Person.
     */
    Person student = new Person("Marllon", 20);

    // The dot provides access to a behavior (method) of the student object.
    student.introduce();

    // This method changes the age stored in the object from 20 to 21.
    student.celebrateBirthday();

    // The second introduction now uses the new age: 21.
    student.introduce();
  }
}

/*
 * CLASS AND OBJECT
 *
 * The Person class works as a blueprint. It defines the data a person has
 * and the actions that person can perform.
 *
 * Class: the blueprint called Person.
 * Object: a specific person created with "new Person(...)".
 */
class Person {
  /*
   * FIELDS
   *
   * Fields represent the object's state. Each Person object created
   * has its own name and age.
   *
   * private protects fields from direct changes made outside this class.
   * This allows the class itself to control its data.
   */
  private String name;
  private int age;

  /*
   * CONSTRUCTOR
   *
   * The constructor has the same name as the class and is called automatically
   * when we use "new Person(...)". It prepares the object's initial state.
   */
  public Person(String name, int age) {
    /*
     * "this" means "this object."
     *
     * this.name -> name field belonging to the object.
     * name      -> value received by the constructor parameter.
     *
     * If we receive "Marllon", the value is stored in this.name.
     */
    this.name = name;
    this.age = age;
  }

  /*
   * METHODS
   *
   * Methods represent an object's behaviors.
   * public allows the method to be called from outside the Person class.
   * void indicates that the method performs an action but does not return a value.
   */
  public void introduce() {
    System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
  }

  public void celebrateBirthday() {
    // age++ is a shorthand for: age = age + 1;
    age++;
    System.out.println(name + " celebrated a birthday!");
  }
}
