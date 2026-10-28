package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import f9.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class HashAccumulator {
    private int zaa = 1;

    @o0
    @KeepForSdk
    @a
    public HashAccumulator addObject(@q0 Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @o0
    @a
    public final HashAccumulator zaa(boolean z4) {
        this.zaa = (this.zaa * 31) + (z4 ? 1 : 0);
        return this;
    }
}
