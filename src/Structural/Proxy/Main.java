package Structural.Proxy;

import java.net.URL;

/**
 * Created by chetan on 28/9/15.
 */
//Let's continue with the idea of using a proxy for loading images.
// First, we should create a common interface for the real and proxy implementations to use:
interface Image {
    public void displayImage();
}

//The RealImage implementation of this interface works as you'd expect:
class RealImage implements Image {
    public RealImage(URL url) {
    //load up the image
        loadImage(url);
    }

    public void displayImage() {
     //display the image
    }

    // a method that only the real image has
    private void loadImage(URL url) {
     //do resource intensive operation to load image
    }
}

//Now the Structural.Proxy implementation can be written, which provides access to the RealImage class.
// Note that it's only when we call the displayImage() method that it actually uses the RealImage.
// Until then, we don't need the data.
class ProxyImage implements Image {
    private URL url;

    public ProxyImage(URL url) {
        this.url = url;
    }
     //this method delegates to the real image

    public void displayImage() {
        RealImage real = new RealImage(url);
        real.displayImage();
    }
}
// And it's really as simple as that. As far as the client is concerned, they will just deal with the interface.