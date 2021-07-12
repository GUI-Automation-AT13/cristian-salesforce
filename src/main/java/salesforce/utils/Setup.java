package salesforce.utils;

import static configfile.Configuration.dotenv;

/**
 * This class sets the fields from the dotenv file to authenticate.
 */
public enum Setup {
    USER(dotenv.get("USER")),
    PASSWORD(dotenv.get("PASSWORD"));

    private String name;

    Setup(String name) {
        this.name =  name;
    }

    /**
     * Gets the name of the field.
     *
     * @return a String with the name of the fiel
     */
    public String toName() {
        return name;
    }

}
