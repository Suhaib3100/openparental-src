package com.android.billingclient.api;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class x2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z0 f40769a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f40770b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f40771c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f40772d;

    x2(m mVar, z0 z0Var, String str, boolean z4) {
        this.f40769a = z0Var;
        this.f40770b = str;
        this.f40771c = z4;
        Objects.requireNonNull(mVar);
        this.f40772d = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        boolean J1;
        r5 e12;
        m mVar = this.f40772d;
        J1 = mVar.J1(w4.b());
        if (!J1) {
            zzjs zzjsVar = zzjs.zzb;
            y yVar = n4.f40522j;
            mVar.g1(zzjsVar, 9, yVar);
            this.f40769a.a(yVar, zzca.zzk());
            return null;
        }
        String str = this.f40770b;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn(ProtectedSandApp.s("\u05fe"), ProtectedSandApp.s("\u05ff"));
            zzjs zzjsVar2 = zzjs.zzX;
            y yVar2 = n4.f40517e;
            mVar.g1(zzjsVar2, 9, yVar2);
            this.f40769a.a(yVar2, zzca.zzk());
            return null;
        }
        e12 = mVar.e1(str, this.f40771c, 9);
        if (e12.b() != null) {
            this.f40769a.a(e12.a(), e12.b());
            return null;
        }
        this.f40769a.a(e12.a(), zzca.zzk());
        return null;
    }
}
