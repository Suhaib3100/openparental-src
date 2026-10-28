package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: Digest.java */
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21493a = ProtectedSandApp.s("㘏");

    public static String a(String str) {
        return b(str, ProtectedSandApp.s("㘆"));
    }

    public static String b(String str, String str2) {
        byte[] bytes;
        String trim = str.trim();
        try {
            bytes = trim.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            bytes = trim.getBytes();
        }
        try {
            return h.G(MessageDigest.getInstance(ProtectedSandApp.s("㘇")).digest(bytes));
        } catch (NoSuchAlgorithmException e6) {
            e6.fillInStackTrace();
            return null;
        }
    }

    public static String c(String str, String str2, String str3) {
        byte[] bytes;
        String trim = str.trim();
        try {
            bytes = trim.getBytes(str3);
        } catch (UnsupportedEncodingException unused) {
            bytes = trim.getBytes();
        }
        try {
            return h.G(MessageDigest.getInstance(str2).digest(bytes));
        } catch (NoSuchAlgorithmException e6) {
            e6.fillInStackTrace();
            return null;
        }
    }

    public static String d(String str, String str2, String str3) {
        byte[] bytes;
        byte[] bytes2;
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        try {
            bytes = str2.getBytes(str3);
            bytes2 = str.getBytes(str3);
        } catch (UnsupportedEncodingException unused) {
            bytes = str2.getBytes();
            bytes2 = str.getBytes();
        }
        Arrays.fill(bArr, bytes.length, 64, (byte) 54);
        Arrays.fill(bArr2, bytes.length, 64, (byte) 92);
        for (int i5 = 0; i5 < bytes.length; i5++) {
            bArr[i5] = (byte) (bytes[i5] ^ 54);
            bArr2[i5] = (byte) (bytes[i5] ^ 92);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘈"));
            messageDigest.update(bArr);
            messageDigest.update(bytes2);
            byte[] digest = messageDigest.digest();
            messageDigest.reset();
            messageDigest.update(bArr2);
            messageDigest.update(digest, 0, 20);
            return h.G(messageDigest.digest());
        } catch (NoSuchAlgorithmException e6) {
            e6.fillInStackTrace();
            return null;
        }
    }

    public static String e(String str) {
        try {
            return h.G(MessageDigest.getInstance(ProtectedSandApp.s("㘉")).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e6) {
            e6.fillInStackTrace();
            return null;
        }
    }

    public static String f(String str, String str2) {
        return g(str, str2, ProtectedSandApp.s("㘊"));
    }

    public static String g(String str, String str2, String str3) {
        byte[] bytes;
        byte[] bytes2;
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        try {
            bytes = str2.getBytes(str3);
            bytes2 = str.getBytes(str3);
        } catch (UnsupportedEncodingException unused) {
            bytes = str2.getBytes();
            bytes2 = str.getBytes();
        }
        Arrays.fill(bArr, bytes.length, 64, (byte) 54);
        Arrays.fill(bArr2, bytes.length, 64, (byte) 92);
        for (int i5 = 0; i5 < bytes.length; i5++) {
            bArr[i5] = (byte) (bytes[i5] ^ 54);
            bArr2[i5] = (byte) (bytes[i5] ^ 92);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘋"));
            messageDigest.update(bArr);
            messageDigest.update(bytes2);
            byte[] digest = messageDigest.digest();
            messageDigest.reset();
            messageDigest.update(bArr2);
            messageDigest.update(digest, 0, 16);
            return h.G(messageDigest.digest());
        } catch (NoSuchAlgorithmException e6) {
            e6.fillInStackTrace();
            return null;
        }
    }

    public static String h(String str, String str2) {
        try {
            return h.G(MessageDigest.getInstance(ProtectedSandApp.s("㘌")).digest(str.getBytes(str2)));
        } catch (UnsupportedEncodingException e6) {
            e6.fillInStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e7) {
            e7.fillInStackTrace();
            return null;
        }
    }

    public static String i(String str) {
        String s5 = ProtectedSandApp.s("㘍");
        try {
            return new String(c.h(MessageDigest.getInstance(ProtectedSandApp.s("㘎")).digest(str.getBytes(s5))), s5);
        } catch (Exception unused) {
            return null;
        }
    }
}
