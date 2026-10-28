package com.tencent.cos.xml.s3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.COSLogger;
import java.util.HashMap;

/* loaded from: classes7.dex */
public enum Base64 {
    ;

    private static final Base64Codec codec = new Base64Codec();
    private static final boolean isJaxbAvailable;

    static {
        boolean z4 = false;
        try {
            Class.forName(ProtectedSandApp.s("付\u0001"));
            z4 = true;
        } catch (Exception unused) {
        }
        isJaxbAvailable = z4;
        if (z4) {
            new HashMap().put(ProtectedSandApp.s("仙\u0001"), ProtectedSandApp.s("仚\u0001"));
        } else {
            COSLogger.wProcess(ProtectedSandApp.s("仛\u0001"), ProtectedSandApp.s("仜\u0001"));
        }
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        return codec.decode(bArr, CodecUtils.sanitize(str, bArr));
    }

    public static byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.encode(bArr);
    }

    public static String encodeAsString(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.toStringDirect(codec.encode(bArr));
    }

    public static byte[] decode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.decode(bArr, bArr.length);
    }
}
