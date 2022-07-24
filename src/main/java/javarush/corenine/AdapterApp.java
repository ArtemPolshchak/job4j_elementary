package javarush.corenine;

/**
 * @author artem.polschak@gmail.com on 06.05.2022.
 * @project javaRush
 */
public class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        VectorGraphicsInterface g2 = new VectorAdapterFromRaster();
        g2.drawLine();
        g2.drawSquare();
    }
}

interface  VectorGraphicsInterface {
    void drawLine();
    void drawSquare();
}
class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Draw line");
    }
    void drawRasterSquare() {
        System.out.println("Draw square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {


    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
