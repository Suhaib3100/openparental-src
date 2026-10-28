package com.google.android.gms.internal.common;

import java.util.Arrays;
import x1.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i5) {
    }

    private final void zzb(int i5) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i5) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i6 = length + (length >> 1) + 1;
        if (i6 < i5) {
            int highestOneBit = Integer.highestOneBit(i5 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i6);
        this.zzc = false;
    }

    @a
    public final zzaa zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }
}
