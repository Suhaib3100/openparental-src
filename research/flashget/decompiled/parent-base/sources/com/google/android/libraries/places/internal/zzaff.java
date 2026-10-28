package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaff extends zzafp {
    zzaff(int i4) {
        super(i4, null);
    }

    @Override // com.google.android.libraries.places.internal.zzafp
    public final void zza() {
        if (!zzj()) {
            for (int i4 = 0; i4 < zzb(); i4++) {
                Map.Entry zzg = zzg(i4);
                if (((zzadd) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzadd) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
