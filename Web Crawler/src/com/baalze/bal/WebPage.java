package com.baalze.bal;

import baalze.pagecollector.BaalzePageCollector;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebPage {
    private Anchor anchor;
    private String webPageHash;
    private int anchorParseStatus;
    private int emailParseStatus;

    private Document document;

    /* General constructor for crawling */
    public WebPage(Anchor anchor) {
        this.anchor = anchor;
    }

    private void loadDocumentFromWeb(){
        try {
            document = Jsoup.connect(anchor.getAnchorUrl()).get();

        } catch (IOException ex) {
            Logger.getLogger(BaalzePageCollector.class.getName()).log(Level.SEVERE, null, ex);

        }
    }


}
