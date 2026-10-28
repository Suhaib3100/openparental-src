package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzmw extends zzng {
    zzmw(int i5) {
        super(i5, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzb(); i5++) {
                Map.Entry zzg = zzg(i5);
                if (((zzkr) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzkr) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
