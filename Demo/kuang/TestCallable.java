package Demo.kuang;

import java.io.File;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.io.FileUtils;

public class TestCallable implements Callable<Boolean> {// 2.callable实现多线程下载
    private String url;
    private String name;

    @Override
    public Boolean call() {
        WebDownloader webdownloader = new WebDownloader();
        webdownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*
         * TestCallable t1 = new TestCallable(
         * "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3709200372,2581328376&fm=26&gp=0.jpg",
         * "1.jpg");
         */
        TestCallable t1 = new TestCallable();
        t1.url = "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3709200372,2581328376&fm=26&gp=0.jpg";
        t1.name = "1.jpg";
        TestCallable t2 = new TestCallable();
        t2.url = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimages3.10qianwan.com%2F10qianwan%2F20180914%2Fb_0_201809141418403245.jpg&refer=http%3A%2F%2Fimages3.10qianwan.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1616548147&t=b5a12584a2387fb78fed09ad65a6263b";
        t2.name = "2.jpg";
        TestCallable t3 = new TestCallable();
        t3.url = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.24ketang.cn%2Fwp-content%2Fuploads%2F2020%2F03%2F20200327161037-5e7e257d228f3.png&refer=http%3A%2F%2Fwww.24ketang.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1616548147&t=dbdb9b80f816859b847733c305c22c61";
        t3.name = "3.jpg";
        // 创建执行服务的线程池
        ExecutorService ser = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> r1 = ser.submit(t1);

        Future<Boolean> r2 = ser.submit(t2);

        Future<Boolean> r3 = ser.submit(t3);
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        ser.shutdown();
    }
}

class WebDownloader {

    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("IO方法出现异常");
        }
    }
}