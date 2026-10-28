package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdd;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class b4 implements zzdd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.core.util.e f40307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f40308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g4 f40309c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f40310d;

    b4(g4 g4Var, int i4, androidx.core.util.e eVar, Runnable runnable) {
        this.f40310d = i4;
        this.f40307a = eVar;
        this.f40308b = runnable;
        Objects.requireNonNull(g4Var);
        this.f40309c = g4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final void zza(Throwable th) {
        boolean z4 = th instanceof TimeoutException;
        String s4 = ProtectedSandApp.s("Ͷ");
        if (z4) {
            this.f40309c.E2(zzjs.zzaX, 28, n4.F);
            zzc.zzo(s4, ProtectedSandApp.s("ͷ"), th);
        } else {
            this.f40309c.E2(zzjs.zzaQ, 28, n4.F);
            zzc.zzo(s4, ProtectedSandApp.s("\u0378"), th);
        }
        this.f40308b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        y C2;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        g4 g4Var = this.f40309c;
        if (!g4.r2(g4Var, intValue)) {
            this.f40308b.run();
        } else {
            C2 = g4Var.C2(this.f40310d, num.intValue());
            this.f40307a.accept(C2);
        }
    }
}
