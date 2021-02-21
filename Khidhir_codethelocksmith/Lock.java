class Lock
{
    int combo, tries; 
    boolean status;

    /**
     * Constructor for objects of type Lock
     */
    public Lock (int key)
    {
        combo = key;
        tries = 0;
    }

    /**
     * Closes the locks
     */
    public void close ()
    {
        status = false;
    }

    /**
     * Returns the status of the lock
     */
    public boolean isOpen ()
    {
        return (status);
    }

    /**
     * Attempts to unlock the lock using the user's inputed combo
     */
    public void open (int key)
    {
        if (key == combo)
        {
            status = true; 
            System.out.println ("The combination entered is correct\nThe lock is now open");
        }
        else
        {
            System.out.println ("The combination entered is incorrect");
            tries = tries + 1;
        }
    }

    /**
     * Returns the number of tries (to unlock a lock) as to be used in jamming the program
     */
    public int get_tries ()
    {
        return (tries);
    }
} // Lock class