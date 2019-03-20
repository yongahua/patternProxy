package gupao.vip.pattern.proxy;

public class PackageDao {
    public int insert(Package packages){
        System.out.println("PackageDao创建packages成功!");
        return 1;
    }
}
