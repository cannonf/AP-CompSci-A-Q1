import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class colorFilter {
    public static void main(String args[]) throws IOException {
        BufferedImage img = null;
        File f = null;

        // read image
        try {
            f = new File("/Users/23cfl/OneDrive/Documents/Greenhill/2021-2022/Comp Sci/Q1 programs/wombat.jpg");
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();

        // convert to filter
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Here (x,y)denotes the coordinate of image
                // for modifying the pixel value.
                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // calculate how much each color should change
                r = r + 20;
                g = g + 50;
                b = b + 30;

                // set new RGB value
                p = (a << 24) | (r << 16) | (g << 8) | b;

                // priting image
                img.setRGB(x, y, p);
            }
        }

        // write image
        try {
            f = new File("/Users/23cfl/OneDrive/Documents/Greenhill/2021-2022/Comp Sci/Q1 programs/bwwambat.jpg");
            ImageIO.write(img, "jpg", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
