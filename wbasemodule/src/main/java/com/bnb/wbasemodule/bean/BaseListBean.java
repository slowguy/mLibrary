package com.bnb.wbasemodule.bean;

import java.util.List;

public abstract class BaseListBean<T> extends BaseBean<T> {

    abstract List<T> getListData();

    @Override
    public T getData() {
        return null;
    }
}
