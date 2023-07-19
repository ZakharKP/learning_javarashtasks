package com.javarush.task.task24.task2408;

/*
notice exactly how Mouse differs from Dog
This class is familiar to you.
*/

public class Mouse implements Pet, Sayable {
    @Override
    public Sayable toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Mouse squeaks.";
    }
}
