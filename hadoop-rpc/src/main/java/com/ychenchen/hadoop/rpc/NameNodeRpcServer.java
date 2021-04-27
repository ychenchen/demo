package com.ychenchen.hadoop.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

/**
 * RPC 服务端
 *
 * @author alexis.yang
 * @since 2021/4/16 11:59 AM
 */
public class NameNodeRpcServer implements ClientProtocol {
    @Override
    public void makeDir(String path) {
        System.out.println("进入服务端方法：" + path);
    }

    public static void main(String[] args) throws IOException {
        RPC.Server server = new RPC.Builder(new Configuration())
                .setBindAddress("localhost")
                .setPort(8888)
                .setProtocol(ClientProtocol.class)
                .setInstance(new NameNodeRpcServer())
                .build();
        server.start();
    }
}
