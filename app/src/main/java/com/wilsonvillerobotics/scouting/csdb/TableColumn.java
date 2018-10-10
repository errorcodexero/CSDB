package com.wilsonvillerobotics.scouting.csdb;

public class TableColumn<E> {
    protected String key;
    protected E value;

    public TableColumn (String k) {
        key = k;
    }
    public void setValue(E v){
        value = v;
    }
    public E getValue() { return value; }
    public String toString () { return String.valueOf(this.value); }
    public E getKey() { return (E) key; }


}

