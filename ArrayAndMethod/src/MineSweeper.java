public class MineSweeper {
    public static void main(String[] args) {
        String[][] map={
                {"*", ".", "*", ".", "."},
                {".", "*", ".", ".", "."}
        };

        final int map_width=map[0].length;
        final int map_height = map.length;

        String[][] mapReport = new String[map_height][map_width];
        for (int y =0 ; y <map_height;y++) {
            for (int x = 0; x < map[0].length; x++) {
                String CurrentCell = map[y][x];
                if (CurrentCell.equals("*")) {
                    mapReport[y][x] = "*";
                } else {
                    final int[][] neighbours_ordinate = {
                            {y-1,x-1},{y-1,x},{y-1,x+1},
                            {y,x-1},{y,x+1},
                            {y+1,x-1},{y+1,x},{y+1,x+1}
                    };
                    int minAround = 0;

                    for (int i = 0; i < neighbours_ordinate.length; i++) {
                        int[] neighboursOrdinate = neighbours_ordinate[i];
                        int xNO = neighboursOrdinate[1];
                        int yNO = neighboursOrdinate[0];

                        boolean isOutofMapNeighbour = xNO < 0 || xNO == map_width
                                || yNO <0
                                || yNO == map_height;
                        if (isOutofMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yNO][xNO].equals("*");
                        if (isMineOwnerNeighbour) minAround++;
                    }
                    mapReport[y][x] = String.valueOf(minAround);
                }
            }

        }

        for (int y =0 ; y < map_height;y++){
            for (int x = 0; x < map_width; x++) {
                String CurrentCellReport = mapReport[y][x];
                System.out.print(CurrentCellReport);
            }
            System.out.println("");
        }
    }
}
