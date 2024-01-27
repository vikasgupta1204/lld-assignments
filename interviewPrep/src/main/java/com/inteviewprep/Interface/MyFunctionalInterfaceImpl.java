package com.inteviewprep.Interface;

public class MyFunctionalInterfaceImpl implements MyFunctionalInterface{

    @Override
    public Object method1(Object obj) {
        if(obj instanceof Integer){
            return "Obj is integer";
        }
        else if(obj instanceof String){
            return  "Obj is string";
        }
        else if(obj instanceof Boolean){
            return  "obj is boolean";
        }
        else if(obj instanceof Double){
            return  "obj is double";
        }
        return obj;
    }
}
