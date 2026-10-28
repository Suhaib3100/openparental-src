package com.google.android.gms.internal.auth;

import zc.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzcv extends zzdc {
    zzcv(zzcz zzczVar, String str, Long l4, boolean z4) {
        super(zzczVar, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @h
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
