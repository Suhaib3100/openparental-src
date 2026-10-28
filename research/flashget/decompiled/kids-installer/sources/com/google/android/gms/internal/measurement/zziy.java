package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes4.dex */
final class zziy extends zzis {
    private final zzja zza;

    zziy(zzja zzjaVar, int i5) {
        super(zzjaVar.size(), i5);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    protected final Object zza(int i5) {
        return this.zza.get(i5);
    }
}
