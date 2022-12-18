package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place result = null;
        int n = places.length;
        m:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    if (places[i][j] == null) {
                        result = new Place(i, j);
                        break m;
                    }
                }
            }
        }
        return result;
    }

    public static class Place {
        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return  true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }

    }
}
