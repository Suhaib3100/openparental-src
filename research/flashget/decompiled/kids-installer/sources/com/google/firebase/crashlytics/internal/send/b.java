package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.g;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.x;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import java.nio.charset.Charset;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f16321a;

    /* renamed from: b, reason: collision with root package name */
    private final g<f0, byte[]> f16322b;

    /* renamed from: f, reason: collision with root package name */
    private static final String f16319f = ProtectedSandApp.s("ᗂ");

    /* renamed from: c, reason: collision with root package name */
    private static final j f16316c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f16317d = e(ProtectedSandApp.s("ᗃ"), ProtectedSandApp.s("ᗄ"));

    /* renamed from: e, reason: collision with root package name */
    private static final String f16318e = e(ProtectedSandApp.s("ᗅ"), ProtectedSandApp.s("ᗆ"));

    /* renamed from: g, reason: collision with root package name */
    private static final g<f0, byte[]> f16320g = new g() { // from class: com.google.firebase.crashlytics.internal.send.a
        @Override // com.google.android.datatransport.g
        public final Object apply(Object obj) {
            byte[] d6;
            d6 = b.d((f0) obj);
            return d6;
        }
    };

    b(e eVar, g<f0, byte[]> gVar) {
        this.f16321a = eVar;
        this.f16322b = gVar;
    }

    public static b b(Context context, com.google.firebase.crashlytics.internal.settings.j jVar, i0 i0Var) {
        x.f(context);
        i g5 = x.c().g(new com.google.android.datatransport.cct.a(f16317d, f16318e));
        com.google.android.datatransport.c b6 = com.google.android.datatransport.c.b(ProtectedSandApp.s("ᗇ"));
        g<f0, byte[]> gVar = f16320g;
        return new b(new e(g5.b(ProtectedSandApp.s("ᗈ"), f0.class, b6, gVar), jVar.b(), i0Var), gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(f0 f0Var) {
        return f16316c.O(f0Var).getBytes(Charset.forName(ProtectedSandApp.s("ᗉ")));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᗊ"));
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb.append(str2.charAt(i5));
            }
        }
        return sb.toString();
    }

    @o0
    public Task<w> c(@o0 w wVar, boolean z5) {
        return this.f16321a.i(wVar, z5).getTask();
    }
}
