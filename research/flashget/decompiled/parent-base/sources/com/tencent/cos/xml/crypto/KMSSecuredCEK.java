package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* loaded from: classes6.dex */
final class KMSSecuredCEK extends SecuredCEK {
    static final String KEY_PROTECTION_MECHANISM = ProtectedSandApp.s("㘉\u0001");

    KMSSecuredCEK(byte[] bArr, Map<String, String> map) {
        super(bArr, ProtectedSandApp.s("㘉\u0001"), map);
    }

    public static boolean isKMSKeyWrapped(String str) {
        return ProtectedSandApp.s("㘉\u0001").equals(str);
    }
}
