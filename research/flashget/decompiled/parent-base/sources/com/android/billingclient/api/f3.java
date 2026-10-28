package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzw;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class f3 extends zzw {

    /* renamed from: a, reason: collision with root package name */
    final g f40371a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40372b;

    /* renamed from: h, reason: collision with root package name */
    final int f40373h;

    /* synthetic */ f3(g gVar, j4 j4Var, int i4, r3 r3Var) {
        this.f40371a = gVar;
        this.f40372b = j4Var;
        this.f40373h = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            j4 j4Var = this.f40372b;
            zzjs zzjsVar = zzjs.zzas;
            y yVar = n4.f40520h;
            int i4 = i4.f40395a;
            j4Var.l(i4.b(zzjsVar, 15, yVar, null, zzjz.zza), this.f40373h);
            this.f40371a.a(yVar, null);
            return;
        }
        String s4 = ProtectedSandApp.s("κ");
        int zzb = zzc.zzb(bundle, s4);
        y a5 = n4.a(zzb, zzc.zzj(bundle, s4));
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("λ")));
            j4 j4Var2 = this.f40372b;
            zzjs zzjsVar2 = zzjs.zzw;
            int i5 = i4.f40395a;
            j4Var2.l(i4.b(zzjsVar2, 15, a5, null, zzjz.zza), this.f40373h);
            this.f40371a.a(a5, null);
            return;
        }
        try {
            this.f40371a.a(a5, new f(bundle.getString(ProtectedSandApp.s("μ"))));
        } catch (JSONException e4) {
            zzc.zzo(s4, ProtectedSandApp.s("ν"), e4);
            j4 j4Var3 = this.f40372b;
            zzjs zzjsVar3 = zzjs.zzat;
            y yVar2 = n4.f40520h;
            int i6 = i4.f40395a;
            j4Var3.l(i4.b(zzjsVar3, 15, yVar2, null, zzjz.zza), this.f40373h);
            this.f40371a.a(yVar2, null);
        }
    }
}
