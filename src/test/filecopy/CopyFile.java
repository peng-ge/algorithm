package test.filecopy;

import java.io.*;
import java.util.HashMap;

/**
 * @author 53137
 */
public class CopyFile {
    public static void main(String[] args) {
        File src = new File("C:\\test");
        File target = new File("D:\\");
        copyFiles(src, target);
        HashMap<String, Object> map = new HashMap<>();
        map.put("1", 1);
    }

    private static void copyFiles(File src, File target) {
        if (src.isFile()) {
            InputStream input = null;
            OutputStream output = null;
            try {
                input = new FileInputStream(src);
                output = new FileOutputStream(target + src.getAbsolutePath().split(":")[1]);
                byte[] bytes = new byte[1024 * 1024];

                int read = input.read(bytes);
                while (read != -1) {
                    output.write(bytes, 0, read);
                    read = input.read(bytes);
                }
                output.flush();
                System.out.println("结束");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                //新建目录
                String oldPath = file.getAbsolutePath();
                String newPath = target.getAbsolutePath() + oldPath.split(":")[1];
                System.out.println(newPath);
                File newFile = new File(newPath);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            copyFiles(file, target);
        }
    }
}
