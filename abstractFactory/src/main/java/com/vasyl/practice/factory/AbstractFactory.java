package com.vasyl.practice.factory;

import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;

public class AbstractFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return null;
    }

    @Override
    public Sofa createSofa() {
        return null;
    }

    @Override
    public Chair createChair() {
        return null;
    }
}
