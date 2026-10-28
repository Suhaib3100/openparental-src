package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzy;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class g3 extends zzy {

    /* renamed from: a, reason: collision with root package name */
    final j0 f40382a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40383b;

    /* renamed from: h, reason: collision with root package name */
    final int f40384h;

    /* synthetic */ g3(j0 j0Var, j4 j4Var, int i4, r3 r3Var) {
        this.f40382a = j0Var;
        this.f40383b = j4Var;
        this.f40384h = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            j4 j4Var = this.f40383b;
            zzjs zzjsVar = zzjs.zzaG;
            y yVar = n4.f40520h;
            int i4 = i4.f40395a;
            j4Var.l(i4.b(zzjsVar, 24, yVar, null, zzjz.zza), this.f40384h);
            this.f40382a.a(yVar, null);
            return;
        }
        String s4 = ProtectedSandApp.s("φ");
        int zzb = zzc.zzb(bundle, s4);
        y a5 = n4.a(zzb, zzc.zzj(bundle, s4));
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("χ")));
            j4 j4Var2 = this.f40383b;
            zzjs zzjsVar2 = zzjs.zzw;
            int i5 = i4.f40395a;
            j4Var2.l(i4.b(zzjsVar2, 24, a5, null, zzjz.zza), this.f40384h);
            this.f40382a.a(a5, null);
            return;
        }
        try {
            this.f40382a.a(a5, new i0(bundle.getString(ProtectedSandApp.s("ψ"))));
        } catch (JSONException e4) {
            zzc.zzo(s4, ProtectedSandApp.s("ω"), e4);
            j4 j4Var3 = this.f40383b;
            zzjs zzjsVar3 = zzjs.zzaH;
            y yVar2 = n4.f40520h;
            int i6 = i4.f40395a;
            j4Var3.l(i4.b(zzjsVar3, 24, yVar2, null, zzjz.zza), this.f40384h);
            this.f40382a.a(yVar2, null);
        }
    }
}
