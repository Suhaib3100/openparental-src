package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzae extends zzz {
    private final zzah zza;

    zzae(zzah zzahVar, int i4) {
        super(zzahVar.size(), i4);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
