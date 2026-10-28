package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;
import kotlin.UByte;

/* compiled from: EncryptionUtil.java */
/* loaded from: classes5.dex */
public class l {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b6 : bArr) {
            sb.append(String.format(ProtectedSandApp.s("㘒"), Byte.valueOf(b6)));
        }
        return sb.toString();
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘓"));
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘔"));
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘕"));
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            String str2 = new String(new byte[]{bytes[i6]});
            String s5 = ProtectedSandApp.s("㘖");
            bArr[i5] = (byte) (((byte) (Byte.decode(s5.concat(str2)).byteValue() << 4)) ^ Byte.decode(s5.concat(new String(new byte[]{bytes[i6 + 1]}))).byteValue());
        }
        return bArr;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b6 : bArr) {
            String hexString = Integer.toHexString(b6 & UByte.f27220r);
            if (hexString.length() == 1) {
                sb.append(ProtectedSandApp.s("㘗"));
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString();
    }
}
