package com.android.billingclient.api;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzkw;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class z4 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40796a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.datatransport.l f40797b;

    z4(Context context) {
        try {
            com.google.android.datatransport.runtime.x.f(context);
            this.f40797b = com.google.android.datatransport.runtime.x.c().g(com.google.android.datatransport.cct.a.f51765j).b(ProtectedSandApp.s("؊"), zzkw.class, com.google.android.datatransport.e.b(ProtectedSandApp.s("؋")), new y4());
        } catch (Throwable unused) {
            this.f40796a = true;
        }
    }

    public final void a(zzkw zzkwVar) {
        boolean z4 = this.f40796a;
        String s4 = ProtectedSandApp.s("،");
        if (z4) {
            zzc.zzn(s4, ProtectedSandApp.s("؍"));
            return;
        }
        try {
            this.f40797b.b(com.google.android.datatransport.f.j(zzkwVar));
        } catch (Throwable unused) {
            zzc.zzn(s4, ProtectedSandApp.s("؎"));
        }
    }
}
