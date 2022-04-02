package dynamic;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Uitls {
    public static void getProxyClass(String proxyName, Class clazz) {
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                proxyName, clazz.getClasses());
        String filePath = "D:\\" + proxyName + ".class";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(proxyClassFile);
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
