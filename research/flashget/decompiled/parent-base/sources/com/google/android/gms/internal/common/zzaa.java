package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i4) {
    }

    public final zzaa zza(Object obj) {
        int i4;
        obj.getClass();
        int length = this.zza.length;
        int i5 = this.zzb;
        int i6 = i5 + 1;
        if (i6 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쿓"));
        }
        if (i6 <= length) {
            i4 = length;
        } else {
            i4 = (length >> 1) + length + 1;
            if (i4 < i6) {
                int highestOneBit = Integer.highestOneBit(i5);
                i4 = highestOneBit + highestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
        }
        if (i4 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i4);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}
