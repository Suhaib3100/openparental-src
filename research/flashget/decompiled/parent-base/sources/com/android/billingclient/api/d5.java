package com.android.billingclient.api;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzed;
import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class d5 extends zzab {

    /* renamed from: a, reason: collision with root package name */
    final p f40350a;

    /* renamed from: b, reason: collision with root package name */
    final j4 f40351b;

    /* renamed from: h, reason: collision with root package name */
    final int f40352h;

    d5(p pVar, j4 j4Var, int i4) {
        pVar.getClass();
        this.f40350a = pVar;
        this.f40351b = j4Var;
        this.f40352h = i4;
    }

    private final void E(y yVar) {
        p pVar = this.f40350a;
        if (pVar != null) {
            pVar.a(yVar, null);
        } else {
            p4.a(zzjs.zzaR, yVar, this.f40351b, q4.zza.zzb(), this.f40352h);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void onDelegateToBackendResponse(Bundle bundle) {
        if (bundle == null) {
            j4 j4Var = this.f40351b;
            zzjs zzjsVar = zzjs.zzaT;
            y yVar = n4.f40520h;
            p4.a(zzjsVar, yVar, j4Var, q4.zza.zzb(), this.f40352h);
            E(yVar);
            return;
        }
        int zzb = q4.zza.zzb();
        j4 j4Var2 = this.f40351b;
        int i4 = this.f40352h;
        String s4 = ProtectedSandApp.s("έ");
        y a5 = s4.a(bundle, s4, zzb, j4Var2, i4);
        if (a5.c() != 0) {
            E(a5);
            return;
        }
        try {
            byte[] byteArray = bundle.getByteArray(ProtectedSandApp.s("ή"));
            if (byteArray == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ί"));
            }
            this.f40350a.a(a5, o.a(zzed.zzb(byteArray).zzc()));
        } catch (Exception e4) {
            zzc.zzo(s4, ProtectedSandApp.s("ΰ"), e4);
            j4 j4Var3 = this.f40351b;
            zzjs zzjsVar2 = zzjs.zzaS;
            y yVar2 = n4.f40520h;
            p4.b(zzjsVar2, yVar2, j4Var3, q4.zza.zzb(), this.f40352h, i4.a(e4));
            E(yVar2);
        }
    }
}
