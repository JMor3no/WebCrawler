package com.baalze.bal;

import java.sql.Timestamp;

public class CommonBal {
    public static Timestamp getTimestamp() {
        java.util.Date date = new java.util.Date();
        return new Timestamp(date.getTime());
    }
}
