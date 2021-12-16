import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class sepiaImage {
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

        // get width and height
        int width = img.getWidth();
        int height = img.getHeight();

        // convert to sepia
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                // calculate average
                int avg = (r + g + b) / 3;

                // replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                // printing image in gray scale
                img.setRGB(x, y, p);

                // taking the gray scale pixel and giving it color
                if (r < 63) {

                    r = (int) (r * 1.1);

                    b = (int) (b * 0.9);

                } else if (r < 192) {

                    r = (int) (r * 1.15);

                    b = (int) (b * 0.85);

                } else {

                    r = Math.min((int) (r * 1.08), 255);

                    b = (int) (b * 0.93);

                }
                p = (a << 24) | (r << 16) | (g << 8) | b;

                // printing final image
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