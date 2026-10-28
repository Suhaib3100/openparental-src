package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.StandardCharsets;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
class zziz {
    protected static final int zza(String str, byte[] bArr, int i4, int i5) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i4 > i5) {
            throw new ArrayIndexOutOfBoundsException(ProtectedSandApp.s("\ud848"));
        }
        System.arraycopy(bytes, 0, bArr, i4, length);
        return i4 + length;
    }

    static int zzb(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                try {
                    int i7 = zzjc.zza;
                    int length2 = str.length();
                    while (i5 < length2) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 < 2048) {
                            i4 += (127 - charAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i5) < 65536) {
                                    throw new zzjb(i5, length2);
                                }
                                i5++;
                            }
                        }
                        i5++;
                    }
                    i6 += i4;
                } catch (zzjb unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\ud849") + (i6 + 4294967296L));
    }
}
