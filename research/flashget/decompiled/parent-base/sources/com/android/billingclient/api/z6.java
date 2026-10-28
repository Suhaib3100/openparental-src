package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@androidx.annotation.m1
/* loaded from: classes3.dex */
final class z6 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40798a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40799b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a7 f40800c;

    z6(a7 a7Var, boolean z4) {
        Objects.requireNonNull(a7Var);
        this.f40800c = a7Var;
        this.f40799b = z4;
    }

    private final void d(Bundle bundle, y yVar, int i4, zzjz zzjzVar, long j4, boolean z4) {
        j4 j4Var;
        j4 j4Var2;
        String s4 = ProtectedSandApp.s("؏");
        try {
            if (bundle.getByteArray(s4) != null) {
                j4Var2 = this.f40800c.f40281e;
                j4Var2.n(zzjl.zzc(bundle.getByteArray(s4)), j4, z4);
            } else {
                j4Var = this.f40800c.f40281e;
                j4Var.n(i4.b(zzjs.zzw, i4, yVar, null, zzjzVar), j4, z4);
            }
        } catch (Throwable unused) {
            zzc.zzn(ProtectedSandApp.s("ؐ"), ProtectedSandApp.s("ؑ"));
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f40798a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f40799b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f40798a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        try {
            if (this.f40798a) {
                return;
            }
            int i4 = Build.VERSION.SDK_INT;
            String s4 = ProtectedSandApp.s("ؒ");
            if (i4 >= 33) {
                context.registerReceiver(this, intentFilter, s4, null, true != this.f40799b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, s4, null);
            }
            this.f40798a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f40798a) {
            zzc.zzn(ProtectedSandApp.s("ؐ"), ProtectedSandApp.s("ؓ"));
        } else {
            context.unregisterReceiver(this);
            this.f40798a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c5;
        int i4;
        y zzi;
        zzcf zzcfVar;
        a1 a1Var;
        j4 j4Var;
        f1 f1Var;
        j4 j4Var2;
        a1 a1Var2;
        f1 f1Var2;
        e0 e0Var;
        j4 j4Var3;
        f1 f1Var3;
        j4 j4Var4;
        a1 a1Var3;
        e0 e0Var2;
        j4 j4Var5;
        a1 a1Var4;
        a1 a1Var5;
        int intValue;
        j4 j4Var6;
        a1 a1Var6;
        a1 a1Var7;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals(ProtectedSandApp.s("ؖ"))) {
                c5 = 0;
            }
            c5 = 65535;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals(ProtectedSandApp.s("ؔ"))) {
                c5 = 2;
            }
            c5 = 65535;
        } else {
            if (action.equals(ProtectedSandApp.s("ؕ"))) {
                c5 = 1;
            }
            c5 = 65535;
        }
        zzjz zzjzVar = c5 != 0 ? c5 != 1 ? c5 != 2 ? zzjz.zza : zzjz.zzd : zzjz.zzc : zzjz.zzb;
        zzjz zzjzVar2 = zzjz.zzc;
        if (zzjzVar.equals(zzjzVar2) || zzjzVar.equals(zzjz.zzd)) {
            i4 = 2;
        } else {
            i4 = zzjzVar.equals(zzjz.zzb) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        String s4 = ProtectedSandApp.s("ؐ");
        if (extras == null) {
            zzc.zzn(s4, ProtectedSandApp.s("ؗ"));
            a7 a7Var = this.f40800c;
            j4Var6 = a7Var.f40281e;
            zzjs zzjsVar = zzjs.zzk;
            y yVar = n4.f40520h;
            j4Var6.m(i4.b(zzjsVar, i4, yVar, null, zzjzVar));
            a1Var6 = a7Var.f40278b;
            if (a1Var6 != null) {
                a1Var7 = a7Var.f40278b;
                a1Var7.e(yVar, null);
                return;
            }
            return;
        }
        if (i4 == 2) {
            int i5 = zzc.zza;
            y.a d5 = y.d();
            d5.d(zzc.zzb(intent.getExtras(), s4));
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                zzc.zzn(s4, ProtectedSandApp.s("ؘ"));
            } else {
                Object obj = extras2.get(ProtectedSandApp.s("ؙ"));
                if (obj == null) {
                    zzc.zzm(s4, ProtectedSandApp.s("ؚ"));
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    d5.c(intValue);
                    d5.b(zzc.zzj(intent.getExtras(), s4));
                    zzi = d5.a();
                } else {
                    zzc.zzn(s4, ProtectedSandApp.s("؛").concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            d5.c(intValue);
            d5.b(zzc.zzj(intent.getExtras(), s4));
            zzi = d5.a();
        } else {
            zzi = zzc.zzi(intent, s4);
        }
        long j4 = extras.getLong(ProtectedSandApp.s("\u061c"), 0L);
        boolean z4 = extras.getBoolean(ProtectedSandApp.s("؝"), false);
        if (zzjzVar.equals(zzjz.zzb) || zzjzVar.equals(zzjzVar2)) {
            a7 a7Var2 = this.f40800c;
            zzcfVar = a7Var2.f40285i;
            List<w0> zzl = zzc.zzl(extras, zzcfVar);
            if (zzi.c() == 0) {
                j4Var = a7Var2.f40281e;
                j4Var.c(i4.c(i4, zzjzVar), j4, z4);
            } else {
                d(extras, zzi, i4, zzjzVar, j4, z4);
            }
            a1Var = a7Var2.f40278b;
            a1Var.e(zzi, zzl);
            return;
        }
        if (zzjzVar.equals(zzjz.zzd)) {
            if (zzi.c() != 0) {
                d(extras, zzi, i4, zzjzVar, j4, z4);
                a1Var5 = this.f40800c.f40278b;
                a1Var5.e(zzi, zzca.zzk());
                return;
            }
            a7 a7Var3 = this.f40800c;
            f1Var = a7Var3.f40279c;
            if (f1Var == null) {
                e0Var2 = a7Var3.f40280d;
                if (e0Var2 == null) {
                    zzc.zzn(s4, ProtectedSandApp.s("؞"));
                    j4Var5 = a7Var3.f40281e;
                    zzjs zzjsVar2 = zzjs.zzbK;
                    y yVar2 = n4.f40520h;
                    j4Var5.n(i4.b(zzjsVar2, i4, yVar2, null, zzjzVar), j4, z4);
                    a1Var4 = a7Var3.f40278b;
                    a1Var4.e(yVar2, zzca.zzk());
                    return;
                }
            }
            String string = extras.getString(ProtectedSandApp.s("؟"));
            if (string == null) {
                zzc.zzn(s4, ProtectedSandApp.s("ء"));
                j4Var4 = a7Var3.f40281e;
                zzjs zzjsVar3 = zzjs.zzp;
                y yVar3 = n4.f40520h;
                j4Var4.n(i4.b(zzjsVar3, i4, yVar3, null, zzjzVar), j4, z4);
                a1Var3 = a7Var3.f40278b;
                a1Var3.e(yVar3, zzca.zzk());
                return;
            }
            try {
                f1Var2 = a7Var3.f40279c;
                if (f1Var2 != null) {
                    g1 g1Var = new g1(string);
                    f1Var3 = a7Var3.f40279c;
                    f1Var3.a(g1Var);
                } else {
                    d0 d0Var = new d0(string);
                    e0Var = a7Var3.f40280d;
                    e0Var.a(d0Var);
                }
                j4Var3 = this.f40800c.f40281e;
                j4Var3.c(i4.c(i4, zzjzVar), j4, z4);
            } catch (JSONException unused) {
                zzc.zzn(s4, String.format(ProtectedSandApp.s("ؠ"), string));
                a7 a7Var4 = this.f40800c;
                j4Var2 = a7Var4.f40281e;
                zzjs zzjsVar4 = zzjs.zzq;
                y yVar4 = n4.f40520h;
                j4Var2.n(i4.b(zzjsVar4, i4, yVar4, null, zzjzVar), j4, z4);
                a1Var2 = a7Var4.f40278b;
                a1Var2.e(yVar4, zzca.zzk());
            }
        }
    }
}
