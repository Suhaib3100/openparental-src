package com.google.android.gms.internal.play_billing;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzcb {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzcb(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        String s4 = ProtectedSandApp.s("훳");
        String s5 = ProtectedSandApp.s("훴");
        return new IllegalArgumentException(k0.a(androidx.constraintlayout.core.parser.b.a(s4, valueOf, s5, valueOf2, ProtectedSandApp.s("훵")), valueOf3, s5, valueOf4));
    }
}
