# Hash class for java
## **Constructor:**
  - ### Hash(String hashType, String salt)
    - **hashType** - the type of the has, for example "SHA-512", you can lookup on google the types there are on java
    - **salt** - The salt that will be used on the hash
## **Functions:**
  - ### getStringHash(String passToHash)
    - **passToHash** - The phrase to hash
    - _**RETURNS**_ - Returns the salted hash
  - ### setSalt(byte[] salt)
    - **salt** - the salt to use on the hash in a byte array format
  - ### setSalt(String salt)
    - **salt** - the salt to use on the hash in a String format
  - ### getSalt()
    - _**RETURNS**_ - The salt that is set right now
--------------------------------------------------------------------------------
