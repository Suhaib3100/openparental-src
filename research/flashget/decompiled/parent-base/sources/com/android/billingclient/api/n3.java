package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class n3 extends zzan {

    /* renamed from: a, reason: collision with root package name */
    final g0 f40510a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40511b;

    /* renamed from: h, reason: collision with root package name */
    final int f40512h;

    /* synthetic */ n3(g0 g0Var, j4 j4Var, int i4, r3 r3Var) {
        this.f40510a = g0Var;
        this.f40511b = j4Var;
        this.f40512h = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzao
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            j4 j4Var = this.f40511b;
            zzjs zzjsVar = zzjs.zzaD;
            y yVar = n4.f40520h;
            int i4 = i4.f40395a;
            j4Var.l(i4.b(zzjsVar, 23, yVar, null, zzjz.zza), this.f40512h);
            this.f40510a.a(yVar);
            return;
        }
        String s4 = ProtectedSandApp.s("ԉ");
        int zzb = zzc.zzb(bundle, s4);
        y a5 = n4.a(zzb, zzc.zzj(bundle, s4));
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("Ԋ")));
            j4 j4Var2 = this.f40511b;
            zzjs zzjsVar2 = zzjs.zzw;
            int i5 = i4.f40395a;
            j4Var2.l(i4.b(zzjsVar2, 23, a5, null, zzjz.zza), this.f40512h);
        }
        this.f40510a.a(a5);
    }
}
