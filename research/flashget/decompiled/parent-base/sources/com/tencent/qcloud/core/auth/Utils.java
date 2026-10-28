package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import com.tencent.rtmp.TXLiveConstants;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class Utils {
    private static final char[] DIGITS_LOWER;
    private static final char[] DIGITS_UPPER;
    private static Calendar calendar;

    static {
        Calendar calendar2 = Calendar.getInstance();
        calendar = calendar2;
        calendar2.set(TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC, 0, 1);
        DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DIGITS_UPPER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static byte[] decodeHex(String str) {
        return decodeHex(str.toCharArray());
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    static long handleTimeAccuracy(long j4) {
        return j4 > calendar.getTime().getTime() ? j4 / 1000 : j4;
    }

    public static byte[] hmacSha1(String str, String str2) {
        String s4 = ProtectedSandApp.s("夝\u0001");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(QCloudStringUtils.getBytesUTF8(str2), s4);
            Mac mac = Mac.getInstance(s4);
            mac.init(secretKeySpec);
            return mac.doFinal(QCloudStringUtils.getBytesUTF8(str));
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    static long[] parseKeyTimes(String str) {
        String[] split = str.split(ProtectedSandApp.s("夞\u0001"));
        return new long[]{Long.parseLong(split[0]), Long.parseLong(split[1])};
    }

    public static byte[] sha1(String str) {
        try {
            return MessageDigest.getInstance(ProtectedSandApp.s("够\u0001")).digest(QCloudStringUtils.getBytesUTF8(str));
        } catch (NoSuchAlgorithmException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    static int toDigit(char c5, int i4) {
        int digit = Character.digit(c5, 16);
        if (digit != -1) {
            return digit;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("夠\u0001") + c5 + ProtectedSandApp.s("夡\u0001") + i4);
    }

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夜\u0001"));
        }
        byte[] bArr = new byte[length >> 1];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            int digit = (toDigit(cArr[i4], i4) << 4) | toDigit(cArr[i6], i6);
            i4 += 2;
            bArr[i5] = (byte) (digit & 255);
            i5++;
        }
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr, boolean z4) {
        return encodeHex(bArr, z4 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static String encodeHexString(byte[] bArr, boolean z4) {
        return new String(encodeHex(bArr, z4));
    }

    static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i4 = 0;
        for (byte b5 : bArr) {
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b5 & 240) >>> 4];
            i4 += 2;
            cArr2[i5] = cArr[b5 & c.f54871q];
        }
        return cArr2;
    }
}
