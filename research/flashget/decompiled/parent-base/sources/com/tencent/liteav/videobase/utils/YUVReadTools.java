package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class YUVReadTools {
    public static native void nativeReadYUVPlanesForByteArray(int i4, int i5, byte[] bArr);

    public static native void nativeReadYUVPlanesForByteBuffer(int i4, int i5, ByteBuffer byteBuffer);
}
