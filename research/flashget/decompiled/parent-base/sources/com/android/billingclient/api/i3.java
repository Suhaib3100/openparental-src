package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzaf;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class i3 extends zzaf {

    /* renamed from: a, reason: collision with root package name */
    final p f40392a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40393b;

    /* renamed from: h, reason: collision with root package name */
    final int f40394h;

    /* synthetic */ i3(p pVar, j4 j4Var, int i4, r3 r3Var) {
        this.f40392a = pVar;
        this.f40393b = j4Var;
        this.f40394h = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzag
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            j4 j4Var = this.f40393b;
            zzjs zzjsVar = zzjs.zzak;
            y yVar = n4.f40520h;
            int i4 = i4.f40395a;
            j4Var.l(i4.b(zzjsVar, 13, yVar, null, zzjz.zza), this.f40394h);
            this.f40392a.a(yVar, null);
            return;
        }
        String s4 = ProtectedSandApp.s("Ҭ");
        int zzb = zzc.zzb(bundle, s4);
        String zzj = zzc.zzj(bundle, s4);
        y.a d5 = y.d();
        d5.d(zzb);
        d5.b(zzj);
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("ҭ")));
            y a5 = d5.a();
            j4 j4Var2 = this.f40393b;
            zzjs zzjsVar2 = zzjs.zzw;
            int i5 = i4.f40395a;
            j4Var2.l(i4.b(zzjsVar2, 13, a5, null, zzjz.zza), this.f40394h);
            this.f40392a.a(a5, null);
            return;
        }
        String s5 = ProtectedSandApp.s("Ү");
        if (!bundle.containsKey(s5)) {
            zzc.zzn(s4, ProtectedSandApp.s("ү"));
            d5.d(6);
            y a6 = d5.a();
            j4 j4Var3 = this.f40393b;
            zzjs zzjsVar3 = zzjs.zzal;
            int i6 = i4.f40395a;
            j4Var3.l(i4.b(zzjsVar3, 13, a6, null, zzjz.zza), this.f40394h);
            this.f40392a.a(a6, null);
            return;
        }
        try {
            this.f40392a.a(d5.a(), new o(bundle.getString(s5)));
        } catch (JSONException e4) {
            zzc.zzo(s4, ProtectedSandApp.s("Ұ"), e4);
            j4 j4Var4 = this.f40393b;
            zzjs zzjsVar4 = zzjs.zzam;
            y yVar2 = n4.f40520h;
            int i7 = i4.f40395a;
            j4Var4.l(i4.b(zzjsVar4, 13, yVar2, null, zzjz.zza), this.f40394h);
            this.f40392a.a(yVar2, null);
        }
    }
}
