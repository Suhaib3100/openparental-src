package com.android.billingclient.api;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzea;
import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class b5 extends zzab {

    /* renamed from: a, reason: collision with root package name */
    private final i f40311a;

    /* renamed from: b, reason: collision with root package name */
    private final j4 f40312b;

    /* renamed from: h, reason: collision with root package name */
    private final int f40313h;

    b5(i iVar, j4 j4Var, int i4) {
        this.f40311a = iVar;
        this.f40312b = j4Var;
        this.f40313h = i4;
    }

    private final void E(y yVar) {
        this.f40311a.a(yVar, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void onDelegateToBackendResponse(Bundle bundle) {
        if (bundle == null) {
            j4 j4Var = this.f40312b;
            zzjs zzjsVar = zzjs.zzaT;
            y yVar = n4.f40520h;
            p4.a(zzjsVar, yVar, j4Var, q4.zzd.zzb(), this.f40313h);
            E(yVar);
            return;
        }
        int zzb = q4.zzd.zzb();
        j4 j4Var2 = this.f40312b;
        int i4 = this.f40313h;
        String s4 = ProtectedSandApp.s("\u0379");
        y a5 = s4.a(bundle, s4, zzb, j4Var2, i4);
        if (a5.c() != 0) {
            E(a5);
            return;
        }
        try {
            byte[] byteArray = bundle.getByteArray(ProtectedSandApp.s("ͺ"));
            if (byteArray == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ͻ"));
            }
            zzea zzb2 = zzea.zzb(byteArray);
            this.f40311a.a(a5, new h(zzb2.zzc(), zzb2.zze()));
        } catch (Exception e4) {
            zzc.zzo(s4, ProtectedSandApp.s("ͼ"), e4);
            j4 j4Var3 = this.f40312b;
            zzjs zzjsVar2 = zzjs.zzaS;
            y yVar2 = n4.f40520h;
            p4.b(zzjsVar2, yVar2, j4Var3, q4.zzd.zzb(), this.f40313h, i4.a(e4));
            E(yVar2);
        }
    }
}
