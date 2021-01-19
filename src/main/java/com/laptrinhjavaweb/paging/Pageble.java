package com.laptrinhjavaweb.paging;

import com.laptrinhjavaweb.sort.Sorter;

public interface Pageble {

    Integer getPage();
    
    Integer getStatus();

    Integer getOffset();

    Integer getLimit();

    Sorter getSorter();
}
