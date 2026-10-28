package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzid extends zzii {
    zzid() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzii
    public final void zza() {
        if (!zzj()) {
            for (int i4 = 0; i4 < zzc(); i4++) {
                Map.Entry zzg = zzg(i4);
                if (((zzie) zzg).zza().zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzgg) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
