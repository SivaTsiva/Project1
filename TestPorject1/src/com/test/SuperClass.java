package com.test;

class SuperClass
{
    void firstMethodOfSuperClass()
    {
        System.out.println("From Super Class");
    }

    double secondMethodOfSuperClass()
    {
        return 0.0;
    }

    Object thirdMethodOfSuperClass()
    {
        return new Object();
    }
}

class SubClass extends SuperClass
{
    int firstMethodOfSuperClass()
    {
        return 0;
    }

    void secondMethodOfSuperClass1()
    {
        //Complie time error, return type must be double not void
    }

    String thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return new String();
    }
}

