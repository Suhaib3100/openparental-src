package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class SignerFactory {
    private static final String COS_XML_SIGNER = ProtectedSandApp.s("夗\u0001");
    private static final Map<String, Class<? extends QCloudSigner>> SIGNERS;
    private static final Map<String, QCloudSigner> SIGNER_INSTANCES;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(5);
        SIGNERS = concurrentHashMap;
        SIGNER_INSTANCES = new ConcurrentHashMap(5);
        concurrentHashMap.put(ProtectedSandApp.s("夗\u0001"), COSXmlSigner.class);
    }

    private SignerFactory() {
    }

    private static QCloudSigner createSigner(String str) {
        String s4 = ProtectedSandApp.s("夘\u0001");
        Class<? extends QCloudSigner> cls = SIGNERS.get(str);
        if (cls == null) {
            return null;
        }
        try {
            QCloudSigner newInstance = cls.newInstance();
            SIGNER_INSTANCES.put(str, newInstance);
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(s4.concat(cls.getName()), e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(s4.concat(cls.getName()), e5);
        }
    }

    public static QCloudSigner getSigner(String str) {
        return lookupAndCreateSigner(str);
    }

    private static QCloudSigner lookupAndCreateSigner(String str) {
        Map<String, QCloudSigner> map = SIGNER_INSTANCES;
        return map.containsKey(str) ? map.get(str) : createSigner(str);
    }

    public static void registerSigner(String str, Class<? extends QCloudSigner> cls) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("多\u0001"));
        }
        if (cls == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夛\u0001"));
        }
        SIGNERS.put(str, cls);
    }

    public static <T extends QCloudSigner> void registerSigner(String str, T t4) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("多\u0001"));
        }
        if (t4 != null) {
            SIGNER_INSTANCES.put(str, t4);
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("夙\u0001"));
    }
}
