package com.vasyl.practice.factory;

import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;
import com.vasyl.practice.pojo.wooden.WoodenChair;
import com.vasyl.practice.pojo.wooden.WoodenSofa;
import com.vasyl.practice.pojo.wooden.WoodenTable;

public class WoodenFactory extends AbstractFactory {

    @Override
    public Table createTable() {
        return new WoodenTable();
    }

    @Override
    public Sofa createSofa() {
        return new WoodenSofa();
    }

    @Override
    public Chair createChair() {
        return new WoodenChair();
    }
}
