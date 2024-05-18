package com.example.siemens.enums;

public enum RoomType {
    SINGLE(0),
    DOUBLE(1),
    SUITE(2),
    MATRIMONIAL(3);

    private int numVal;

    RoomType(int i) {
        this.numVal = i;
    }
}
