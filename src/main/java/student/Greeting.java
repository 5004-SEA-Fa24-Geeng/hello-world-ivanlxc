package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    /** the ID of the locality */
    private int localityID;

    /** the name of the locality */
    private String localityName;

    /** the greeting string in ascii format */
    private String asciiGreeting;

    /** the greeting string in unicode format */
    private String unicodeGreeting;

    /** the format string with the greeting inserted into the format */
    private String formatStr;


    /**
     * Default greeting that creates "Hello, {name}!".
     * @param localityID id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID,
                    String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters assuming the language is already using ascii letters only. It also assumes the format of the greeting to be "{greeting}, {name}!"
     * For the default format string you will want to use "%s, %%s!" which places the greeting before the persons potential name.
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ascii characters
     */
    public Greeting(int localityID,
                    String localityName,
                    String greeting) {
        this(localityID, localityName, greeting, greeting,"%s, %%s!" );
    }


    /**
     * Greeting that creates a greeting with ascii and unicode characters. It makes no assumptions and everything needs to be provided.
     * Often the other constructors will call this very detailed constructor. Using the following code (as an example this is the code for one of the constructors).
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(int localityID,
                    String localityName,
                    String asciiGreeting,
                    String unicodeGreeting,
                    String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     *Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return this.localityID;
    }






}
