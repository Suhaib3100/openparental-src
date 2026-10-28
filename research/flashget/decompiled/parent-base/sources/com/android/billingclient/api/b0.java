package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdx;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.concurrent.ExecutorService;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@e6
/* loaded from: classes3.dex */
final class b0 extends zzab {

    /* renamed from: l, reason: collision with root package name */
    private static final String f40288l = ProtectedSandApp.s("ͬ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f40289m = ProtectedSandApp.s("ͪ");

    /* renamed from: a, reason: collision with root package name */
    final w f40290a;

    /* renamed from: b, reason: collision with root package name */
    final int f40291b;

    /* renamed from: h, reason: collision with root package name */
    final int f40292h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f40293i;

    /* renamed from: j, reason: collision with root package name */
    final ExecutorService f40294j;

    /* renamed from: k, reason: collision with root package name */
    final j4 f40295k;

    b0(w wVar, int i4, j4 j4Var, int i5, Handler handler, ExecutorService executorService) {
        wVar.getClass();
        this.f40290a = wVar;
        this.f40291b = i4;
        this.f40295k = j4Var;
        this.f40292h = i5;
        this.f40293i = handler;
        this.f40294j = executorService;
    }

    private v E(Bundle bundle) throws Exception {
        byte[] byteArray = bundle.getByteArray(ProtectedSandApp.s("ͪ"));
        if (byteArray != null) {
            return new v(zzdx.zzb(byteArray).zzc().zzc(), this.f40291b);
        }
        throw new Exception(ProtectedSandApp.s("ͫ"));
    }

    private void F(y yVar, Bundle bundle) {
        try {
            this.f40290a.a(yVar, E(bundle));
        } catch (Exception e4) {
            zzc.zzn(ProtectedSandApp.s("ͬ"), ProtectedSandApp.s("ͭ"));
            j4 j4Var = this.f40295k;
            zzjs zzjsVar = zzjs.zzaS;
            y yVar2 = n4.f40520h;
            p4.b(zzjsVar, yVar2, j4Var, q4.zzc.zzb(), this.f40292h, i4.a(e4));
            this.f40290a.a(yVar2, null);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    @e6
    public void onDelegateToBackendResponse(Bundle bundle) {
        if (bundle == null) {
            j4 j4Var = this.f40295k;
            zzjs zzjsVar = zzjs.zzaT;
            y yVar = n4.f40520h;
            p4.a(zzjsVar, yVar, j4Var, q4.zzc.zzb(), this.f40292h);
            this.f40290a.a(yVar, null);
            return;
        }
        q4 q4Var = q4.zzc;
        y a5 = s4.a(bundle, ProtectedSandApp.s("ͬ"), q4Var.zzb(), this.f40295k, this.f40292h);
        w wVar = this.f40290a;
        if (wVar == null) {
            p4.a(zzjs.zzaR, a5, this.f40295k, q4Var.zzb(), this.f40292h);
        } else if (a5.c() != 0) {
            wVar.a(a5, null);
        } else {
            F(a5, bundle);
        }
    }
}
