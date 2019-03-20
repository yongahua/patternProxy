package gupao.vip.pattern.proxy.jdkproxy;

import gupao.vip.pattern.proxy.Package;

public class JdkPackage extends Package implements Manager {
    public int findLove() {
        System.out.println("2019-03-15");
        System.out.println("关于大海");
        setPackageName("大海");
        getBookName();
        return 0;
    }
    public String getBookName(){
        System.out.println("书包系列 ： "+getPackageName());
        return getPackageName();
    }
}
