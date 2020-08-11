package com.Pages;

import com.Constants.SearchPageConstants;
import com.Runners.BaseClass;
import org.junit.Assert;

public class SearchResultsPage extends BaseClass {

    public void shouldSeeRelatedResults() {
    }

    public void shouldnotSeeRelatedResult(){
        Assert.assertEquals("NEWSLETTER SIGN UP",get.getElementText(SearchPageConstants.ASSERTNEWSLETTERSIGN));

    }
}
