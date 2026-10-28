package com.android.billingclient.api;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f40541a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40542b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int V0 = 0;
        public static final int W0 = 1;
    }

    public o0(int i4, @androidx.annotation.q0 String str) {
        this.f40541a = 0;
        this.f40542b = null;
    }

    static o0 c(Bundle bundle) {
        return bundle == null ? new o0(0, null) : new o0(zzc.zza(bundle, ProtectedSandApp.s("Է")), bundle.getString(ProtectedSandApp.s("Ը")), bundle.getString(ProtectedSandApp.s("Թ")));
    }

    @androidx.annotation.q0
    public String a() {
        return this.f40542b;
    }

    public int b() {
        return this.f40541a;
    }

    private o0(int i4, @androidx.annotation.q0 String str, @androidx.annotation.q0 String str2) {
        this.f40541a = i4;
        this.f40542b = str;
    }
}
