package com.inteviewprep.Interface;

public class Client {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface=new MyFunctionalInterface() {
            @Override
            public Object method1(Object obj) {
                return "abcd";
            }
        };
        System.out.println(myFunctionalInterface.method1("accc"));
        MyFunctionalInterface myFunctionalInterface1=new MyFunctionalInterfaceImpl();
        Object obj= myFunctionalInterface1.method1(245);
        System.out.println(obj);
        //way 3 using lambda
        MyFunctionalInterface lambdaObj=(a)->{return a.toString()+a.toString();};
         Object object1= lambdaObj.method1(89);
        System.out.println(object1);
    }





}
