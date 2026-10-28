package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class m3 extends zzal {

    /* renamed from: a, reason: collision with root package name */
    final d f40498a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40499b;

    /* renamed from: h, reason: collision with root package name */
    final int f40500h;

    /* synthetic */ m3(d dVar, j4 j4Var, int i4, r3 r3Var) {
        this.f40498a = dVar;
        this.f40499b = j4Var;
        this.f40500h = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            j4 j4Var = this.f40499b;
            zzjs zzjsVar = zzjs.zzao;
            y yVar = n4.f40520h;
            int i4 = i4.f40395a;
            j4Var.l(i4.b(zzjsVar, 14, yVar, null, zzjz.zza), this.f40500h);
            this.f40498a.a(yVar);
            return;
        }
        String s4 = ProtectedSandApp.s("ԇ");
        int zzb = zzc.zzb(bundle, s4);
        y a5 = n4.a(zzb, zzc.zzj(bundle, s4));
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("Ԉ")));
            j4 j4Var2 = this.f40499b;
            zzjs zzjsVar2 = zzjs.zzw;
            int i5 = i4.f40395a;
            j4Var2.l(i4.b(zzjsVar2, 14, a5, null, zzjz.zza), this.f40500h);
        }
        this.f40498a.a(a5);
    }
}
