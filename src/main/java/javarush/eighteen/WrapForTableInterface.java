package javarush.eighteen;

import java.util.List;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush Таблица
 * Java Core
 * 8 уровень, 8 лекция
 * Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
 * Метод setModel должен вывести в консоль количество элементов в списке
 * перед обновлением модели (вызовом метода setModel у объекта типа TableInterface).
 * Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().
 */
public class WrapForTableInterface {
    public static class TableInterfaceWrapper implements TableInterface {
        TableInterface interfaceWrapper;

        public TableInterfaceWrapper(TableInterface interfaceWrapper) {
            this.interfaceWrapper = interfaceWrapper;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            interfaceWrapper.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return interfaceWrapper.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            interfaceWrapper.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
