package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeq;
import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class s4 {
    public static y a(Bundle bundle, String str, int i4, j4 j4Var, int i5) {
        String s4 = ProtectedSandApp.s("֊");
        if (!bundle.containsKey(s4)) {
            zzc.zzn(str, ProtectedSandApp.s("֏"));
            zzjs zzjsVar = zzjs.zzaU;
            y yVar = n4.f40520h;
            p4.a(zzjsVar, yVar, j4Var, i4, i5);
            return yVar;
        }
        try {
            byte[] byteArray = bundle.getByteArray(s4);
            if (byteArray == null) {
                throw new Exception(ProtectedSandApp.s("֍"));
            }
            zzeq zzc = zzeq.zzc(byteArray);
            y.a d5 = y.d();
            d5.d(zzc.zza());
            d5.b(zzc.zze());
            y a5 = d5.a();
            if (a5.c() != 0) {
                p4.a(zzjs.zzw, a5, j4Var, i4, i5);
                return a5;
            }
            if (bundle.containsKey(ProtectedSandApp.s("\u058b"))) {
                return a5;
            }
            zzc.zzn(str, ProtectedSandApp.s("\u058c"));
            zzjs zzjsVar2 = zzjs.zzaW;
            y yVar2 = n4.f40520h;
            p4.a(zzjsVar2, yVar2, j4Var, i4, i5);
            return yVar2;
        } catch (Exception e4) {
            zzc.zzo(str, ProtectedSandApp.s("֎"), e4);
            zzjs zzjsVar3 = zzjs.zzaV;
            y yVar3 = n4.f40520h;
            p4.b(zzjsVar3, yVar3, j4Var, i4, i5, i4.a(e4));
            return yVar3;
        }
    }
}
