package com.ychenchen.hadoop.rpc;

/**
 * 协议接口
 * 必须包含versionID字段
 */
public interface ClientProtocol {
    long versionID = 123L;

    void makeDir(String path);
}
