package javarush.coretwenty;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Читаем и пишем в файл: Human
*/

public class LoadArrayObjectsInFIle {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFileName = new File("D:/11.txt");
            OutputStream outputStream = new FileOutputStream(yourFileName);
            InputStream inputStream = new FileInputStream(yourFileName);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99),
                    new Asset("car", 2999.99), new Asset("dog", 100.00));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();

            System.out.println(somePerson.name + " ");
            for (Asset s : somePerson.assets) {
                System.out.println(s.getName() + " " + s.getPrice());
            }
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Human human = (Human) o;

            if (!Objects.equals(name, human.name)) {
                return false;
            }
            return Objects.equals(assets, human.assets);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        /**
         * Метод сохраняет объект в файл
         * @param outputStream путь к файлу, куда сохраняется объект
         */
        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (name != null && !name.isEmpty()) {
                printWriter.println(name);
                printWriter.flush();
                printWriter.println(assets.size());
                printWriter.flush();
                for (Asset s : assets) {
                    printWriter.println(s.getName());
                    printWriter.println(s.getPrice());
                    printWriter.flush();
                }
            }
            printWriter.flush();
            printWriter.close();
        }

        /**
         * Метод выгружает сохраненный объект из файла
         * @param inputStream путь к файлу с сохраненными данными
         */
        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String sName = bufferedReader.readLine();
            List<Asset> loadAssets = new ArrayList<>();
            int count = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < count; i++) {
                String nameAsset = bufferedReader.readLine();
                double priceAsset = Double.parseDouble(bufferedReader.readLine());
                loadAssets.add(new Asset(nameAsset, priceAsset));
            }
            name = sName;
            assets = loadAssets;
            bufferedReader.close();
        }
    }
}

class Asset {
    public Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Asset asset = (Asset) o;

        if (Double.compare(asset.price, price) != 0) {
            return false;
        }
        return Objects.equals(name, asset.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

