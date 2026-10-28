package com.google.android.gms.internal.measurement;

import zc.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzhq extends zzhj<Boolean> {
    zzhq(zzhr zzhrVar, String str, Boolean bool, boolean z4) {
        super(zzhrVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    @h
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgi.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzgi.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        zzb();
        String.valueOf(obj);
        return null;
    }
}
