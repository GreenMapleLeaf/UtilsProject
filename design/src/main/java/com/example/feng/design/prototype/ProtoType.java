package com.example.feng.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * Created by Feng on 2017/11/17.
 */

public class ProtoType implements Cloneable, Serializable {
    private static final long serialVersionUID = 1l;
    private int anInt;
    private String string;
    private String stringObject;
    private ProtoType object;

    public ProtoType init() {
        anInt = 1;
        string = "string";
        stringObject = new String("String Object");
        object = new ProtoType();
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}
