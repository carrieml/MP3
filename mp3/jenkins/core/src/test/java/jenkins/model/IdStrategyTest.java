package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

import jenkins.model.IdStrategy.CaseInsensitive;
import jenkins.model.IdStrategy.CaseSensitive;

public class IdStrategyTest {

	@Test
	public void basicFormatTest() throws Exception {
        String result = CaseSensitive.idFromFilename("filename");
        Boolean check = result.matches("filename");
        assertEquals(check, true);
    }
	
	@Test
    public void caseSensitiveTest() throws Exception {
        String result = CaseSensitive.idFromFilename("~filename");
        Boolean check = result.matches("Filename");
        assertEquals(check, true);
    }
}
