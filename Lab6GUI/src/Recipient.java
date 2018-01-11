 
import java.awt.Image;
import java.io.Serializable;

class Recipient implements Serializable
{
    String name;
    String handle;  //A display name
    private Image  picture;

    /**
     * @return the picture
     */
    public Image getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(Image picture) {
        this.picture = picture;
    }
}
