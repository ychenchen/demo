package com.ychenchen.hadoop.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * RPC客户端
 *
 * @author alexis.yang
 * @since 2021/4/16 12:03 PM
 */
public class DFSClient {
    public static void main(String[] args) throws IOException {
        ClientProtocol nameNode = RPC.getProxy(ClientProtocol.class,
                ClientProtocol.versionID,
                new InetSocketAddress("localhost", 8888),
                new Configuration()
        );
        nameNode.makeDir("/usr/local/hadoop");
    }
}
