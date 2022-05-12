package red888hamcrest

import org.junit.Test

import static org.hamcrest.CoreMatchers.containsString
import static org.hamcrest.MatcherAssert.assertThat


class LibraryTest {

    @Test
    void testContainsStringIsAvailable() {
        Library lib = new Library()
        assertThat(lib.someBandName, containsString("Crimson"))
    }
}
