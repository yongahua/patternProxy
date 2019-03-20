package gupao.vip.pattern.proxy.dbproxy;

import gupao.vip.pattern.proxy.Package;
import gupao.vip.pattern.proxy.PackageService;
import gupao.vip.pattern.proxy.PackageServiceImpl;
import gupao.vip.pattern.proxy.dbproxy.proxy.PackageServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DbProxyPackageText {
    public static void main(String[] args) {
        try {
            Package packages = new Package();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            packages.setCreatetime(date.getTime());
            packages.setId("1");
            packages.setCreateuser("管理员");
            packages.setUpdatetime(date.getTime());
            packages.setUpdateuser("管理员2");
            packages.setPackageName("马里奥");

            PackageService packageService = (PackageService)new PackageServiceDynamicProxy().getInstance(new PackageServiceImpl());
            packageService.createPackage(packages);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
