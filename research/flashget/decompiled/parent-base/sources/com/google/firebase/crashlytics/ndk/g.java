package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.h0;

/* compiled from: FirebaseCrashlyticsNdk.java */
/* loaded from: classes6.dex */
class g implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: e, reason: collision with root package name */
    private static g f59580e;

    /* renamed from: a, reason: collision with root package name */
    private final e f59581a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59582b;

    /* renamed from: c, reason: collision with root package name */
    private String f59583c;

    /* renamed from: d, reason: collision with root package name */
    private a f59584d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseCrashlyticsNdk.java */
    interface a {
        void a();
    }

    g(@o0 e eVar, boolean z4) {
        this.f59581a = eVar;
        this.f59582b = z4;
    }

    static g f(@o0 Context context, boolean z4) {
        g gVar = new g(new e(context, new JniNativeApi(context), new com.google.firebase.crashlytics.internal.persistence.g(context)), z4);
        f59580e = gVar;
        return gVar;
    }

    @o0
    public static g g() {
        g gVar = f59580e;
        if (gVar != null) {
            return gVar;
        }
        throw new NullPointerException(ProtectedSandApp.s("&\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, String str2, long j4, h0 h0Var) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("'\u0001") + str);
        if (this.f59581a.k(str, str2, j4, h0Var)) {
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("(\u0001") + str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @o0
    public com.google.firebase.crashlytics.internal.h a(@o0 String str) {
        return new l(this.f59581a.d(str));
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean b() {
        String str = this.f59583c;
        return str != null && d(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public synchronized void c(@o0 final String str, @o0 final String str2, final long j4, @o0 final h0 h0Var) {
        this.f59583c = str;
        a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.f
            @Override // com.google.firebase.crashlytics.ndk.g.a
            public final void a() {
                g.this.i(str, str2, j4, h0Var);
            }
        };
        this.f59584d = aVar;
        if (this.f59582b) {
            aVar.a();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean d(@o0 String str) {
        return this.f59581a.j(str);
    }

    public synchronized void h() {
        a aVar = this.f59584d;
        if (aVar != null) {
            aVar.a();
            return;
        }
        if (this.f59582b) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s(")\u0001"));
        } else {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("*\u0001"));
            this.f59582b = true;
        }
    }
}
