package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* compiled from: DES.java */
/* loaded from: classes5.dex */
public class i {
    public static String a(String str, String str2) throws Exception {
        String s5 = ProtectedSandApp.s("㘁");
        return new String(b(str.getBytes(s5), l.e(str2)), s5);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㘂"));
        cipher.init(2, e(bArr));
        return cipher.doFinal(bArr2);
    }

    public static String c(String str, String str2) throws Exception {
        String s5 = ProtectedSandApp.s("㘃");
        return l.f(d(str.getBytes(s5), str2.getBytes(s5)));
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㘄"));
        cipher.init(1, e(bArr));
        return cipher.doFinal(bArr2);
    }

    private static Key e(byte[] bArr) throws Exception {
        return SecretKeyFactory.getInstance(ProtectedSandApp.s("㘅")).generateSecret(new DESKeySpec(bArr));
    }
}
