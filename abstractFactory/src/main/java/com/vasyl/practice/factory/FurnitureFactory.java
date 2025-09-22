package com.vasyl.practice.factory;

import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
