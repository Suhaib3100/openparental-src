package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class a3 implements n {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzp f40272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f40273c;

    a3(m mVar, zzp zzpVar) {
        this.f40272b = zzpVar;
        Objects.requireNonNull(mVar);
        this.f40273c = mVar;
    }

    @Override // com.android.billingclient.api.n
    public final void b(final y yVar) {
        n nVar;
        String str = ProtectedSandApp.s("͟") + yVar.c();
        String s4 = ProtectedSandApp.s("͠");
        zzc.zzm(s4, str);
        try {
            this.f40272b.zzb(yVar);
        } catch (Throwable th) {
            zzc.zzo(s4, ProtectedSandApp.s("͡"), th);
        }
        m mVar = this.f40273c;
        nVar = mVar.K;
        if (nVar != null) {
            mVar.Y0(new Runnable() { // from class: com.android.billingclient.api.z2
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar2;
                    a3 a3Var = a3.this;
                    y yVar2 = yVar;
                    try {
                        nVar2 = a3Var.f40273c.K;
                        nVar2.b(yVar2);
                    } catch (Throwable th2) {
                        zzc.zzo(ProtectedSandApp.s("؈"), ProtectedSandApp.s("؉"), th2);
                    }
                }
            });
        }
    }

    @Override // com.android.billingclient.api.n
    public final void d() {
        n nVar;
        String s4 = ProtectedSandApp.s("͢");
        String s5 = ProtectedSandApp.s("͠");
        zzc.zzm(s5, s4);
        try {
            this.f40272b.zzb(n4.f40522j);
        } catch (Throwable th) {
            zzc.zzo(s5, ProtectedSandApp.s("͡"), th);
        }
        m mVar = this.f40273c;
        nVar = mVar.K;
        if (nVar != null) {
            mVar.Y0(new Runnable() { // from class: com.android.billingclient.api.y2
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar2;
                    try {
                        nVar2 = a3.this.f40273c.K;
                        nVar2.d();
                    } catch (Throwable th2) {
                        zzc.zzo(ProtectedSandApp.s("\u0603"), ProtectedSandApp.s("\u0604"), th2);
                    }
                }
            });
        }
    }
}
