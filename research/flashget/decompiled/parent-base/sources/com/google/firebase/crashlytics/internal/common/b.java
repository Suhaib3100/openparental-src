package com.google.firebase.crashlytics.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes6.dex */
final class b extends f0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.model.g0 f58626a;

    /* renamed from: b, reason: collision with root package name */
    private final String f58627b;

    /* renamed from: c, reason: collision with root package name */
    private final File f58628c;

    b(com.google.firebase.crashlytics.internal.model.g0 g0Var, String str, File file) {
        if (g0Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﯓ"));
        }
        this.f58626a = g0Var;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ufbd2"));
        }
        this.f58627b = str;
        if (file == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ufbd1"));
        }
        this.f58628c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public com.google.firebase.crashlytics.internal.model.g0 b() {
        return this.f58626a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public File c() {
        return this.f58628c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public String d() {
        return this.f58627b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f58626a.equals(f0Var.b()) && this.f58627b.equals(f0Var.d()) && this.f58628c.equals(f0Var.c());
    }

    public int hashCode() {
        return ((((this.f58626a.hashCode() ^ 1000003) * 1000003) ^ this.f58627b.hashCode()) * 1000003) ^ this.f58628c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ﯔ") + this.f58626a + ProtectedSandApp.s("ﯕ") + this.f58627b + ProtectedSandApp.s("ﯖ") + this.f58628c + ProtectedSandApp.s("ﯗ");
    }
}
