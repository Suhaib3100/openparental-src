package com.panda.mecrypt;

import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* compiled from: RSA.java */
/* loaded from: classes5.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static int f21496a = 1024;

    public static boolean a(String str, String str2, String str3) {
        try {
            int i5 = Build.VERSION.SDK_INT;
            String s5 = ProtectedSandApp.s("㘟");
            PublicKey generatePublic = (i5 >= 28 ? KeyFactory.getInstance(s5) : KeyFactory.getInstance(s5, ProtectedSandApp.s("㘠"))).generatePublic(new X509EncodedKeySpec(c.c(str3)));
            Signature signature = Signature.getInstance(ProtectedSandApp.s("㘡"));
            signature.initVerify(generatePublic);
            signature.update(str.getBytes(ProtectedSandApp.s("㘢")));
            return signature.verify(c.c(str2));
        } catch (Exception e6) {
            e6.fillInStackTrace();
            return false;
        }
    }

    public static String b(String str, String str2) throws Exception {
        PrivateKey g5 = g(str2);
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㘣"));
        cipher.init(2, g5);
        return new String(e(str, cipher));
    }

    public static String c(String str, String str2) throws Exception {
        PublicKey h5 = h(str2);
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("㘤"));
        cipher.init(1, h5);
        return new String(c.i(f(str, cipher)), ProtectedSandApp.s("㘥"));
    }

    public static Map<String, String> d() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ProtectedSandApp.s("㘦"));
        keyPairGenerator.initialize(f21496a, secureRandom);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] i5 = c.i(generateKeyPair.getPublic().getEncoded());
        String s5 = ProtectedSandApp.s("㘧");
        String str = new String(i5, s5);
        String str2 = new String(c.j(generateKeyPair.getPrivate().getEncoded(), false), s5);
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㘨"), str);
        hashMap.put(ProtectedSandApp.s("㘩"), str2);
        hashMap.put(ProtectedSandApp.s("㘪"), new String(c.j(((RSAPublicKey) generateKeyPair.getPublic()).getModulus().toByteArray(), false)));
        return hashMap;
    }

    private static byte[] e(String str, Cipher cipher) throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        byte[] doFinal;
        byte[] b6 = c.b(str.getBytes(StandardCharsets.UTF_8));
        int length = b6.length;
        byte[] bArr = new byte[0];
        int i5 = 0;
        while (true) {
            int i6 = length - i5;
            if (i6 <= 0) {
                return bArr;
            }
            if (i6 > 128) {
                doFinal = cipher.doFinal(b6, i5, 128);
                i5 += 128;
            } else {
                doFinal = cipher.doFinal(b6, i5, i6);
                i5 = length;
            }
            bArr = Arrays.copyOf(bArr, bArr.length + doFinal.length);
            System.arraycopy(doFinal, 0, bArr, bArr.length - doFinal.length, doFinal.length);
        }
    }

    private static byte[] f(String str, Cipher cipher) throws IllegalBlockSizeException, BadPaddingException {
        byte[] doFinal;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[0];
        int i5 = 0;
        while (true) {
            int i6 = length - i5;
            if (i6 <= 0) {
                return bArr;
            }
            if (i6 > 117) {
                doFinal = cipher.doFinal(bytes, i5, 117);
                i5 += 117;
            } else {
                doFinal = cipher.doFinal(bytes, i5, i6);
                i5 = length;
            }
            bArr = Arrays.copyOf(bArr, bArr.length + doFinal.length);
            System.arraycopy(doFinal, 0, bArr, bArr.length - doFinal.length, doFinal.length);
        }
    }

    public static PrivateKey g(String str) throws Exception {
        return KeyFactory.getInstance(ProtectedSandApp.s("㘫")).generatePrivate(new PKCS8EncodedKeySpec(c.d(str.getBytes())));
    }

    public static PublicKey h(String str) throws Exception {
        return KeyFactory.getInstance(ProtectedSandApp.s("㘬")).generatePublic(new X509EncodedKeySpec(c.d(str.getBytes())));
    }

    public static String i(String str, String str2) {
        String s5 = ProtectedSandApp.s("㘭");
        try {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(c.d(str2.getBytes()));
            int i5 = Build.VERSION.SDK_INT;
            String s6 = ProtectedSandApp.s("㘮");
            PrivateKey generatePrivate = (i5 >= 28 ? KeyFactory.getInstance(s6) : KeyFactory.getInstance(s6, ProtectedSandApp.s("㘯"))).generatePrivate(pKCS8EncodedKeySpec);
            Signature signature = Signature.getInstance(ProtectedSandApp.s("㘰"));
            signature.initSign(generatePrivate);
            signature.update(str.getBytes(s5));
            return new String(c.j(signature.sign(), false));
        } catch (Exception unused) {
            return null;
        }
    }
}
