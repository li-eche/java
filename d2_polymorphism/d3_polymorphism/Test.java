package com.lyk.d2_polymorphism.d3_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：理解多态的好处
        //1，可以实现解耦合，右边对象可以随时切换，后边业务改变
        People p1 = new Teacher();
        p1.run();//识别技巧：编译看左边，运行看右边
        p1.test();//多态下存在问题，无法直接调用子类的独有功能。


        //强制类型转换
        Student s1 =(Student)p1;
        s1.test();

        //强制类型转换可能存在的问题：编译阶段有继续或者实现关系就可以强制类型转换，但是运行时可以出现类型转换异常
        Teacher t1 = (Teacher) p1;//运行时出现了：ClassCasetException

        if(p1 instanceof Student){
            Student s2 =(Student)p1;
            s2.test();
        }else {
            Teacher t2 = (Teacher)p1;
            t2.teach();
        }


        Student s= new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);
    }
    //好处2：可以使用父类类型的变量作为形参，可以接受一切子类对象
    public static void go(People p){

    }
}
