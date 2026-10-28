package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzgj {
    public static byte[] zza(byte[]... bArr) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= bArr.length) {
                break;
            }
            i5 += bArr[i4].length;
            i4++;
        }
        byte[] bArr2 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        return bArr2;
    }
}
