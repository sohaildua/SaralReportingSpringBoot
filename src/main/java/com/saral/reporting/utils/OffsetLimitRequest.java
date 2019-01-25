package com.saral.reporting.utils;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class OffsetLimitRequest implements Pageable {
    private int limit;
    private int offset;
    public OffsetLimitRequest(int offset, int limit){
        this.limit = limit;
        this.offset = offset;
    }
        @Override
    public int getPageNumber() {
        return 0;
    }
    @Override
    public int getPageSize() {
        return limit;
    }
    @Override
    public int getOffset() {
        return offset;
    }
	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
    
}