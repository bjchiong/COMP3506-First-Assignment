package au.edu.uq.itee.comp3506.assn1.adts;


public class RectangularGrid<T> implements Grid<T> {

    T[][] data;
    private T returnValue;
    private int rowSize;
    private int columnSize;

    /**
     *
     * @param a Size of row
     * @param b Size of column
     */
    public RectangularGrid(int a, int b) {
        rowSize = b;
        columnSize = a;
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Pick a number greater than 0");
        } else {
            data = (T[][]) new Object[a][b];
        }
    }

    /**
     * @param item Item to be placed in the grid.
     * @param x X Coordinate of the position of the item.
     * @param y Y Coordinate of the position of the item.
     *          Loop through the grid with a nested loop
     *          Run-time efficiency: O(1) constant
     */
    public void place(T item, int x, int y) {
                data[y][x] = item;
    }


    /**
     * @param x X Coordinate of the position of the item.
     * @param y Y Coordinate of the position of the item.
     * @return T Generic Element.
     *           Loop through grid with a nested loop and index the array
     *           Run-time efficiency: O(n^2) or (length ^ 2) in this case.
     */
    public T get(int x, int y) {
        if ((x == 0 && y == 0) || (y <= rowSize && x <= columnSize)) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= y; j++) {
                    returnValue = data[y][x];
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Coordinates cannot be accessed");
        }
        return returnValue;
    }

    /**
     * Justification
     * Array of an array implementation to replicate a grid data structure
     * To assign an element in the 2d array would simply index [x][y], which means it runs in
     * constant time. However, to retrieve an element, the 2D array needs to be looped through.
     * The area of the rectangular or the total size of the 2D array needs to be instantiated
     * at runtime. This can be highly inefficient when storing a few elements, and can
     * be problematic when the data input is more than the declared size.
     *
     * In the game's context, the dimensions are capped off to 12 and 4, so looping through the entire array
     * elements would not post any run-time or memory inefficiency.
     */
}
