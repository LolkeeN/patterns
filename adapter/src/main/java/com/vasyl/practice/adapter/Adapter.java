package com.vasyl.practice.adapter;

public interface Adapter <I, O> {

    O adapt(I input) throws Exception;
}
