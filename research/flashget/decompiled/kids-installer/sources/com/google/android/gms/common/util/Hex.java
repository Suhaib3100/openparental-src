package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @o0
    @KeepForSdk
    public static String bytesToStringLowercase(@o0 byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i5 = 0;
        for (byte b6 : bArr) {
            int i6 = b6 & UByte.f27220r;
            int i7 = i5 + 1;
            char[] cArr2 = zzb;
            cArr[i5] = cArr2[i6 >>> 4];
            i5 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    @o0
    @KeepForSdk
    public static String bytesToStringUppercase(@o0 byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @o0
    @KeepForSdk
    public static byte[] stringToBytes(@o0 String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0c51"));
        }
        byte[] bArr = new byte[length / 2];
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 2;
            bArr[i5 / 2] = (byte) Integer.parseInt(str.substring(i5, i6), 16);
            i5 = i6;
        }
        return bArr;
    }

    @o0
    @KeepForSdk
    public static String bytesToStringUppercase(@o0 byte[] bArr, boolean z5) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i5 = 0; i5 < length && (!z5 || i5 != length - 1 || (bArr[i5] & UByte.f27220r) != 0); i5++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[i5] & 240) >>> 4]);
            sb.append(cArr[bArr[i5] & 15]);
        }
        return sb.toString();
    }
}
