package com.google.android.gms.internal.auth;

import zc.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d5, boolean z4) {
        super(zzczVar, str, d5, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @h
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
