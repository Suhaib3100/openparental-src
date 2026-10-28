package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.k;
import com.google.android.datatransport.m;
import com.google.android.datatransport.runtime.x;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.f0;
import com.google.firebase.crashlytics.internal.common.s0;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import java.nio.charset.Charset;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f59447a;

    /* renamed from: b, reason: collision with root package name */
    private final k<g0, byte[]> f59448b;

    /* renamed from: f, reason: collision with root package name */
    private static final String f59445f = ProtectedSandApp.s("ﾙ");

    /* renamed from: c, reason: collision with root package name */
    private static final j f59442c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f59443d = e(ProtectedSandApp.s("ﾚ"), ProtectedSandApp.s("ﾛ"));

    /* renamed from: e, reason: collision with root package name */
    private static final String f59444e = e(ProtectedSandApp.s("ﾜ"), ProtectedSandApp.s("ﾝ"));

    /* renamed from: g, reason: collision with root package name */
    private static final k<g0, byte[]> f59446g = new a();

    b(e eVar, k<g0, byte[]> kVar) {
        this.f59447a = eVar;
        this.f59448b = kVar;
    }

    public static b b(Context context, com.google.firebase.crashlytics.internal.settings.k kVar, s0 s0Var) {
        x.f(context);
        m g4 = x.c().g(new com.google.android.datatransport.cct.a(f59443d, f59444e));
        com.google.android.datatransport.e b5 = com.google.android.datatransport.e.b(ProtectedSandApp.s("ﾞ"));
        k<g0, byte[]> kVar2 = f59446g;
        return new b(new e(g4.b(ProtectedSandApp.s("ﾙ"), g0.class, b5, kVar2), kVar.b(), s0Var), kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(g0 g0Var) {
        return f59442c.O(g0Var).getBytes(Charset.forName(ProtectedSandApp.s("ﾟ")));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ﾠ"));
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
        }
        return sb.toString();
    }

    @o0
    public Task<f0> c(@o0 f0 f0Var, boolean z4) {
        return this.f59447a.i(f0Var, z4).getTask();
    }
}
