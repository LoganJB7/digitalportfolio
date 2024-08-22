/*Create an immutable Committee class with fields for committee name and chairperson, 
a constructor for initialization, and getter methods for both fields.*/

public final class Committee
{
    private final String committeeName;
    private final Person chairPerson;
    
    public Committee(String committeeName,Person chairPerson)
    {
        this.committeeName = committeeName;
        this.chairPerson = new Person(chairPerson);
    }