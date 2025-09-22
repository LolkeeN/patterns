package com.vasyl.practice.factory;

import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;
import com.vasyl.practice.pojo.cloth.ClothChair;
import com.vasyl.practice.pojo.cloth.ClothSofa;
import com.vasyl.practice.pojo.cloth.ClothTable;

public class ClothFactory extends AbstractFactory {

    @Override
    public Chair createChair() {
        return new ClothChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClothSofa();
    }

    @Override
    public Table createTable() {
        return new ClothTable();
    }
}
