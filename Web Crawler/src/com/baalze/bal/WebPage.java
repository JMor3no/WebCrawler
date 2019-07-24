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

    public int getAnchorParseStatus() {
        return anchorParseStatus;
    }

    public String getWebPageHash() {
        return webPageHash;
    }

    public int getEmailParseStatus() {
        return emailParseStatus;
    }

    public Document getDocument() {
        return document;
    }

    /* General constructor for crawling */
    public WebPage(Anchor anchor) throws Exception {
        this.anchor = anchor;
        this.webPageHash = Hasher.toSha256(anchor.getAnchorHash() + CommonBal.getTimestamp().toString());
        this.anchorParseStatus = 0;
        this.emailParseStatus = 0;
    }

    public void loadDocumentFromWeb(){
        try {
            document = Jsoup.connect(anchor.getAnchorUrl()).get();

        } catch (IOException ex) {
            Logger.getLogger(BaalzePageCollector.class.getName()).log(Level.SEVERE, null, ex);

        }
    }


}
