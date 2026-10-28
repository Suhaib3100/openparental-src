package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzcs implements Comparator {
    protected zzcs() {
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzcs zza() {
        return new zzcx(this);
    }
}
