package gupao.vip.pattern.proxy;

public class PackageServiceImpl implements PackageService{
    private PackageDao packageDao;

    public PackageServiceImpl(){
        //如果使用Spring应该是自动注入的
        //我们为了使用方便，在构造方法中将orderDao直接初始化了
        packageDao = new PackageDao();
    }

    public int createPackage(Package packages) {
        System.out.println("PackageServiceImpl调用packageDao创建订单");
        return packageDao.insert(packages);
    }
}
