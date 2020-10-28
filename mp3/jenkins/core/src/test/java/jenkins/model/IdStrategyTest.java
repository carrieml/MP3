package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

import jenkins.model.IdStrategy.CaseInsensitive;

public class IdStrategyTest {

	@Test
	public void basicFormatTest() throws Exception {
        String result = CaseInsensitive.idFromFilename("filename");
        Boolean check = result.matches("[a-z0-9_. -]+");
        assertEquals(check, true);
    }

    @Test
    public void complexFormatTest() throws Exception {
        String result = CaseInsensitive.idFromFilename(".-$~");
        Boolean check = result.matches("[a-z0-9_. -]+");
        assertEquals(check, false);
    }
}
