package com.utilities;

import com.pages.NclPage;



public class Pages {
    private NclPage nclPage;


    public  NclPage nclPage() {
        if (nclPage == null) {
            nclPage = new NclPage();
        }
        return nclPage;
    }


}
