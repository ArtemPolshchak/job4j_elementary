package javarush.corenine;

/**
 * @author artem.polschak@gmail.com on 06.05.2022.
 * @project javaRush
 * Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
 * Метод getHeaderText должен возвращать такую строку "[username] : tablename".
 * Пример, "[Amigo] : DashboardTable".
 */
public class Table {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return String.format("[%s] : %s", aTable.getCurrentUserName(), aTable.getTableName());
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}