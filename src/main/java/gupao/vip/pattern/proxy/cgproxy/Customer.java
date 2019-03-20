package gupao.vip.pattern.proxy.cgproxy;

import gupao.vip.pattern.proxy.Package;

public class Customer extends Package{
    public void findLove(){
        System.out.println("顾客要求：最新款Hello Keith");
        setPackageName("Hello Keith");
    }
}
