package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class d4 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g4 f40349b;

    /* synthetic */ d4(g4 g4Var, e4 e4Var) {
        Objects.requireNonNull(g4Var);
        this.f40349b = g4Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm(ProtectedSandApp.s("Ϊ"), ProtectedSandApp.s("Ϋ"));
        g4 g4Var = this.f40349b;
        g4Var.Q = zzaz.zzb(iBinder);
        g4Var.P = 2;
        g4Var.F2(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn(ProtectedSandApp.s("Ϊ"), ProtectedSandApp.s("ά"));
        g4 g4Var = this.f40349b;
        g4Var.Q = null;
        g4Var.P = 0;
    }
}
