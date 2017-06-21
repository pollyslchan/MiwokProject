package com.example.android.miwok;

/**
 * Word contains a default translation and a Miwok translation for the same word
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //class constructor, you need to pass in 2 String variables to create a word Object
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the Miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


}
