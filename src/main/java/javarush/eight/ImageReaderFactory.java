package javarush.eight;

/**
 * @author Artem Polshchak on 30.12.2021.
 * @project JavaRush Factory method pattern
 * Java Core
 * 6 уровень, 13 лекция
 * 1. Внимательно посмотри, какие классы у тебя есть.
 * 2. В отдельных файлах в пакете common создай классы JpgReader,
 * PngReader, BmpReader, которые реализуют интерфейс ImageReader.
 * 3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом.
 * 3.1. Подумай, как он должен называться.
 * 3.2. Подумай, какие модификаторы должны быть у этого метода.
 * 4. Этот метод должен:
 * 4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader,
 * например, для ImageTypes.JPG - JpgReader;
 * 4.2. Если передан неправильный параметр (в т.ч. null),
 * то выбрасывать исключение IllegalArgumentException("Неизвестный тип картинки").
 */

public class ImageReaderFactory  {

    public static ImageReader getImageReader(ImageTypes jpg)  {
            if (jpg != null) {
                if (jpg.equals(ImageTypes.JPG)) {
                    return new JpgReader();
                } else if (jpg.equals(ImageTypes.BMP)) {
                    return new BmpReader();
                } else if (jpg.equals(ImageTypes.PNG)) {
                    return new PngReader();
                } else {
                    throw new IllegalArgumentException("Неизвестный тип картинки");
                }
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
    }

}
