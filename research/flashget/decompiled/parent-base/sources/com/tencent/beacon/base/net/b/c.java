package com.tencent.beacon.base.net.b;

import android.content.Context;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: EncryUtil.java */
/* loaded from: classes6.dex */
public final class c {
    public static byte[] a(int i4, String str, byte[] bArr) throws Exception {
        if (i4 == 3) {
            return a(str, bArr);
        }
        return null;
    }

    public static byte[] b(int i4, String str, byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (i4 == 3) {
            return b(str, bArr);
        }
        return null;
    }

    private static byte[] a(String str, byte[] bArr) throws Exception {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length(); length < 16; length++) {
            sb.append(ProtectedSandApp.s("ㄦ\u0001"));
        }
        String substring = sb.toString().substring(0, 16);
        String s4 = ProtectedSandApp.s("ㄥ\u0001");
        SecretKeySpec secretKeySpec = new SecretKeySpec(substring.getBytes(Charset.forName(s4)), ProtectedSandApp.s("ㄧ\u0001"));
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("ㄨ\u0001"));
        cipher.init(2, secretKeySpec, new IvParameterSpec(substring.getBytes(Charset.forName(s4))));
        return cipher.doFinal(bArr);
    }

    private static byte[] b(String str, byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length(); length < 16; length++) {
            sb.append(ProtectedSandApp.s("ㄦ\u0001"));
        }
        String substring = sb.toString().substring(0, 16);
        String s4 = ProtectedSandApp.s("ㄥ\u0001");
        SecretKeySpec secretKeySpec = new SecretKeySpec(substring.getBytes(Charset.forName(s4)), ProtectedSandApp.s("ㄧ\u0001"));
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("ㄨ\u0001"));
        cipher.init(1, secretKeySpec, new IvParameterSpec(substring.getBytes(Charset.forName(s4))));
        return cipher.doFinal(bArr);
    }

    public static byte[] a(Context context, String str) {
        KeyFactory keyFactory;
        if (str == null) {
            return null;
        }
        String s4 = com.tencent.beacon.d.b.b().j() == 0 ? ProtectedSandApp.s("ㄝ\u0001") : ProtectedSandApp.s("ㄞ\u0001");
        com.tencent.beacon.base.util.c.a(String.format(ProtectedSandApp.s("ㄡ\u0001"), com.tencent.beacon.d.b.b().j() == 0 ? ProtectedSandApp.s("ㄟ\u0001") : ProtectedSandApp.s("ㄠ\u0001")), new Object[0]);
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(s4, 0));
            int i4 = context.getApplicationInfo().targetSdkVersion;
            String s5 = ProtectedSandApp.s("ㄢ\u0001");
            if (i4 >= 28) {
                keyFactory = KeyFactory.getInstance(s5);
            } else {
                keyFactory = KeyFactory.getInstance(s5, ProtectedSandApp.s("ㄣ\u0001"));
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(x509EncodedKeySpec);
            Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("ㄤ\u0001"));
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(str.getBytes(Charset.forName(ProtectedSandApp.s("ㄥ\u0001"))));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
