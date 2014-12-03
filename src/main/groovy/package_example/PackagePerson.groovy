package package_example
/**
 * A Class description
 */
class PackagePerson {
    /** the name of the person */
    String name

    /**
     * Creates a greeting method for a certain person.
     *
     * @param otherPerson the person to greet
     * @return ag reeting message
     */
    String greet(String otherPerson) {
       "Hello ${otherPerson}"
    }
}
