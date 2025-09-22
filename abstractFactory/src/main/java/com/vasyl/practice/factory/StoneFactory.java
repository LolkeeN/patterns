package com.vasyl.practice.factory;

import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;
import com.vasyl.practice.pojo.stone.StoneChair;
import com.vasyl.practice.pojo.stone.StoneSofa;
import com.vasyl.practice.pojo.stone.StoneTable;

public class StoneFactory extends AbstractFactory {

    @Override
    public Table createTable() {
        return new StoneTable();
    }

    @Override
    public Sofa createSofa() {
        return new StoneSofa();
    }

    @Override
    public Chair createChair() {
        return new StoneChair();
    }
}
