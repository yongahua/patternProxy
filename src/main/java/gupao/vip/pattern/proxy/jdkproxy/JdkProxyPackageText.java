package gupao.vip.pattern.proxy.jdkproxy;

import gupao.vip.pattern.proxy.Package;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JdkProxyPackageText {
    public static void main(String[] args) {
        try{
            Object obj = new JdkManager().getInstance(new JdkPackage());

            //byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Package.class});
            //FileOutputStream os = new FileOutputStream("F://$Proxy0.class");
            //os.write(bytes);
            //os.close();
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
