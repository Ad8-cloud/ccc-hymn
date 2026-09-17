package hymn;

import com.sun.jdi.PrimitiveValue;

class Hymn {
    private int  hymnNumber;
    private String hymnTitleYoruba;
    private String hymnTitleEnglish;
    private Category catergory;
    private String tune;
    private String lyricsYoruba;
    private String lyricsEnglish;
    Hymn(int hymnNumber, String hymnTitleYoruba, String hymnTitleEnglish, Category cat, String tune, String lyricsYoruba,  String lyricsEnglish) {
        this.hymnNumber = hymnNumber;
        this.hymnTitleYoruba = hymnTitleYoruba;
        this.hymnTitleEnglish = hymnTitleEnglish;
        this.catergory = cat;
        this.tune = tune;
        this.lyricsYoruba = lyricsYoruba;
        this.lyricsEnglish = lyricsEnglish;
    }
    Hymn(int hymnNumber, String hymnTitleYoruba, String hymnTitleEnglish, Category cat, String tune, String lyricsYoruba) {
        this(hymnNumber,hymnTitleYoruba,hymnTitleEnglish, cat,tune,lyricsYoruba,null); // in case there are no english hymn
    }
    Hymn(int hymnNumber, String hymnTitleYoruba, String hymnTitleEnglish, Category cat, String lyricsYoruba) {
        this(hymnNumber,hymnTitleYoruba,hymnTitleEnglish, cat,null,lyricsYoruba,null); // in case there are no tune and no english hymn
    }


    public String getLyricsEnglish() {
        return this.lyricsEnglish;
    }

    public String getLyricsYoruba() {
        return this.lyricsYoruba;
    }

    public String getTune() {
        return this.tune;
    }

    public Category getCatergory() {
        return this.catergory;
    }

    public String getHymnTitleEnglish() {
        return this.hymnTitleEnglish;
    }

    public String getHymnTitleYoruba() {
        return this.hymnTitleYoruba;
    }

    public int getHymnNumber() {
        return this.hymnNumber;
    }
}