package com.example.criminalintent;

import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        //unique identifier
        mId = UUID.randomUUID();
    }
}

