package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AES.java */
/* loaded from: classes5.dex */
public class a {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        String s5 = ProtectedSandApp.s("㗋");
        f.a(bArr, ProtectedSandApp.s("㗌"));
        f.a(bArr2, ProtectedSandApp.s("㗍"));
        if (bArr2.length != 16) {
            throw new RuntimeException(ProtectedSandApp.s("㗐"));
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(bArr2, s5).getEncoded(), s5);
            Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㗎"));
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception e6) {
            e6.printStackTrace();
            throw new RuntimeException(ProtectedSandApp.s("㗏"), e6);
        }
    }

    public static String b(String str, String str2) {
        String s5 = ProtectedSandApp.s("㗑");
        try {
            return new String(a(c.b(str.getBytes()), str2.getBytes(s5)), s5);
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("㗒"), e6);
        }
    }

    public static String c(String str, String str2) {
        try {
            return new String(a(c.b(str.getBytes()), c.d(str2.getBytes())), ProtectedSandApp.s("㗓"));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("㗔"), e6);
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        String s5 = ProtectedSandApp.s("㗕");
        f.a(bArr, ProtectedSandApp.s("㗖"));
        f.a(bArr2, ProtectedSandApp.s("㗗"));
        if (bArr2.length != 16) {
            throw new RuntimeException(ProtectedSandApp.s("㗚"));
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(bArr2, s5).getEncoded(), s5);
            Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㗘"));
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception e6) {
            e6.printStackTrace();
            throw new RuntimeException(ProtectedSandApp.s("㗙"), e6);
        }
    }

    public static String e(String str, String str2) {
        String s5 = ProtectedSandApp.s("㗛");
        try {
            return new String(c.h(d(str.getBytes(s5), str2.getBytes(s5))));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("㗜"), e6);
        }
    }

    public static String f(String str, String str2) {
        try {
            return new String(c.j(d(str.getBytes(ProtectedSandApp.s("㗝")), c.b(str2.getBytes())), false));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("㗞"), e6);
        }
    }

    public static byte[] g() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ProtectedSandApp.s("㗟"));
            keyGenerator.init(new SecureRandom());
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(ProtectedSandApp.s("㗠"), e6);
        }
    }

    public static String h() {
        return new String(c.h(g()));
    }
}
