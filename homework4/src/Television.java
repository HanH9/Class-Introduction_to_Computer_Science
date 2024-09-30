/**
 * The purpose of this class is to model a television
 * H9 2021/4/29
 */
class Television
{
    /**
     * The manufacturer attribute will hold the brand name
     */
    final private String MANUFACTURER;
    /**
     * The screenSize attribute will hold the size of the television screen.
     */
    final private int SCREEN_SIZE;
    /**
     * The powerOn attribute will hold the value true if the power is on, and false if the power is off.
     */
    private boolean powerOn;
    /**
     * The channel attribute will hold the value of the station that the television is showing.
     */
    private int channel;
    /**
     * The volume attribute will hold a number value representing the loudness (0 being no sound).
     */
    private int volume;
    /**
     * Create a constructor definition that has two parameters, a manufacturer’s brand and a screen size.
     * @param MANUFACTURER Television's manufacturer.
     * @param SCREEN_SIZE Television's screen size.
     */
    public Television(String MANUFACTURER,int SCREEN_SIZE)
    {
        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    /**
     * Get the television's manufacturer.
     * @return MANUFACTURER The television's manufacturer.
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    /**
     * Get television's volume.
     * @return volume Television's volume.
     */
    public int getVolume()
    {
        return volume;
    }
    /**
     *Get television's channel.
     * @return channel Television's channel.
     */
    public int getChannel()
    {
        return channel;
    }
    /**
     * Get television's screen size.
     * @return SCREEN_SIZE Television's screen size.
     */
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    /**
     * Set television's channel.
     * @param station Television's channel.
     */
    public void setChannel(int station)
    {
        channel = station;
    }
    /**
     * Changes the power state from true to false or from false to true
     */
    public void power()
    {
        powerOn = !powerOn;
    }
    /**
     * Increase volume.
     */
    public void increaseVolume()
    {
        volume += 1;
    }
    /**
     * Decrease volume.
     */
    public void decreaseVolume()
    {
        volume -= 1;
    }
}
