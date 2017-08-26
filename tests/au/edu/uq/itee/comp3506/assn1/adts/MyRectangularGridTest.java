package au.edu.uq.itee.comp3506.assn1.adts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

import au.edu.uq.itee.comp3506.assn1.gameworld.GameObject;
import org.junit.Before;
import org.junit.Test;


/* Implement your additional JUnit tests for RectangularGrid in this test class. */
public class MyRectangularGridTest {
    private RectangularGrid<GameObject> grid;

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    /**
     * Create a small RectangularGrid to be used for testing.
     * The grid is 6 cells in length and 6 cells in width.
     */
    @Before
    public void setupRectangularGrid() {
        grid = new RectangularGrid<GameObject>(6, 6);
    }

    @Test
    public void switchCoordinates() {
        GameObject itemToInsert = new GameObject("Elixir");
        GameObject secondItemToInsert = new GameObject("Potion");
        GameObject firstItemRetrieved;
        GameObject secondItemRetrieved;
        grid.place(itemToInsert, 3, 5);
        grid.place(secondItemToInsert, 5, 3);
        firstItemRetrieved = grid.get(3, 5);
        secondItemRetrieved = grid.get(5, 3);
        assertThat("Item retrieved does not match item inserted at the same position",
                firstItemRetrieved, not(secondItemRetrieved));
    }

    @Test
    public void testRowLength() {

        int expectedRowLength = 6;
        int test = grid.data.length;
      //  int actualColumnLength = grid.data[0].length;
        assertThat("Rows are the correct size",
                expectedRowLength, is(equalTo(test)));
    }

}
