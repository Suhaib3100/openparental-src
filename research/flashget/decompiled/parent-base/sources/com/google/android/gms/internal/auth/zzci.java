package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.a3;
import zc.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzci {
    private final a3 zza;

    zzci(a3 a3Var) {
        this.zza = a3Var;
    }

    @h
    public final String zza(@h Uri uri, @h String str, @h String str2, String str3) {
        a3 a3Var;
        if (uri != null) {
            a3Var = (a3) this.zza.get(uri.toString());
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return null;
        }
        return (String) a3Var.get("".concat(str3));
    }
}
