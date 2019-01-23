package com.dxsys.integration.model;

import java.util.Collection;

public class List {

    Collection<Account> list;

    public Collection<Account> getList() {
        return list;
    }

    public Collection setList(Collection<Account> list) {
        this.list = list;
        return this.list;
    }
}
