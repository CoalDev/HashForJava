import java.nio.charset.StandardCharsets;
import java.security.*;

/**
 * Class for hashing and salting
 * 
 * @author Lior Ichilov
 * @version 0.2
 * 
 * Using the java security library we make a salted hash
 */
public class Hash{
    MessageDigest md;
    SecureRandom rand;
    byte[] salt;
    byte[] hashedPass;
    
    // Constructor
    /**
     * Creates a Hash object with a hashtype and a salt
     * @param hashType - Example, ("SHA-256"), ("SHA-512")
     * @param salt - Salting the hash with
     * @throws NoSuchAlgorithmException - so we don't have to make a try and finally block
     */
    public Hash(String hashType, String salt) throws NoSuchAlgorithmException{
        //this.salt = new byte[16];
        this.salt = salt.getBytes();
        this.rand = new SecureRandom();
        //this.rand.nextBytes(this.salt);
        this.md = MessageDigest.getInstance(hashType); // "SHA-512"
        //this.md.update(this.salt);
    }

    /**
     * function creates a hash
     * @param passToHash - Phrase to hash
     * @return a salted hash of the desired phrase
     */
    public String getStringHash(String passToHash){
        //this.salt = salt.getBytes();

        //Updating the salt to use
        this.md.update(this.salt);
        //Creating the hashed Phrase
        this.hashedPass = md.digest(passToHash.getBytes(StandardCharsets.UTF_8));

        //Returning a string representation of the hash
        StringBuilder sb = new StringBuilder();
        for (byte b : this.hashedPass)
            sb.append(String.format("%02x", b));
        
        return sb.toString();
    }    
    
    /**
     * Sets the salt with a byte array
     * @param salt - byte array to set salt
     */
    public void setSalt(byte[] salt){
        this.salt = salt;
    }

    /**
     * Sets the salt with a string
     * @param salt - String to set salt
     */
    public void setSalt(String salt){
        this.salt = salt.getBytes();
    }

    /**
     * Gets the salt in a string way
     * @return string representation of the salt
     */
    public String getSalt(){

        //Returning the string representation of the hash
        StringBuilder sb = new StringBuilder();
        for (byte b : this.salt)
            sb.append(String.format("%02x", b));

        return sb.toString();
    }
}
