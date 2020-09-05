# Hash class for java
## **Constructor:**
  - ### Hash(String hashType, String salt)
    - **hashType** - the type of the has, for example "SHA-512", you can lookup on google the types there are in java
    - **salt** - The salt that will be used on the hash  
    - **Usage** - ```Hash h = new Hash("SHA-512", "32de1475d2b13def2a2aa8a45467258d");```
  - ### Hash(String hashType)
    - **hashType** - the type of the has, for example "SHA-512", you can lookup on google the types there are in java
    - **Usage** - ```Hash h = new Hash("SHA-512");```
## **Functions:**
  - ### getStringHash(String passToHash)
    - **passToHash** - The phrase to hash
    - _**RETURNS**_ - Returns the salted hash in a String format
    - **Usage** - ```String phrase = h.getStringHash("Hello, World!");```
  - ### setSalt(byte[] salt)
    - **salt** - the salt to use on the hash in a byte array format
  - ### setSalt(String salt)
    - **salt** - the salt to use on the hash in a String format
    - **Usage** - ```h.setSalt("32de1475d2b13def2a2aa8a45467258d");```
  - ### getSalt()
    - _**RETURNS**_ - The salt that is set right now in String format
    - **Usage** - ```String salt = h.getSalt();```
--------------------------------------------------------------------------------
