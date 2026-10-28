package com.google.android.gms.internal.common;

import java.util.Iterator;
import x1.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    @a
    public final zzad zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    @a
    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    zzad(int i5) {
        super(4);
    }
}
