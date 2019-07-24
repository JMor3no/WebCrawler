package com.baalze.bal;

import org.junit.*;
import static org.junit.Assert.*;

public class BalUT {

    public BalUT() {
    }

    @Test
    public void loadDocumentFromWeb() throws Exception{
        Domain domain = new Domain("https://www.jsoup.org");
        assertTrue("getDomainHash: Hash is wrong length" , domain.getDomainHash().length() == 64);
        Anchor anchor = new Anchor(domain,"1234-124", "https://www.jsoup.org");
        WebPage webPage = new WebPage(anchor);
        webPage.loadDocumentFromWeb();
        assertTrue("Test Results", webPage.getDocument() != null);

    }

    @BeforeClass
    public static void serUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}