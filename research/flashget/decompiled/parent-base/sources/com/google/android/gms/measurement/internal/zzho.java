package com.google.android.gms.measurement.internal;

import androidx.collection.g1;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzho extends g1<String, com.google.android.gms.internal.measurement.zzb> {
    private final /* synthetic */ zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzho(zzhl zzhlVar, int i4) {
        super(20);
        this.zza = zzhlVar;
    }

    @Override // androidx.collection.g1
    protected final /* synthetic */ com.google.android.gms.internal.measurement.zzb create(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return zzhl.zza(this.zza, str2);
    }
}
