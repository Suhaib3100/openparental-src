package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes3.dex */
final class b extends w {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.model.f0 f15550a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15551b;

    /* renamed from: c, reason: collision with root package name */
    private final File f15552c;

    b(com.google.firebase.crashlytics.internal.model.f0 f0Var, String str, File file) {
        if (f0Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("⠅"));
        }
        this.f15550a = f0Var;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⠄"));
        }
        this.f15551b = str;
        if (file == null) {
            throw new NullPointerException(ProtectedSandApp.s("⠃"));
        }
        this.f15552c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.w
    public com.google.firebase.crashlytics.internal.model.f0 b() {
        return this.f15550a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.w
    public File c() {
        return this.f15552c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.w
    public String d() {
        return this.f15551b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f15550a.equals(wVar.b()) && this.f15551b.equals(wVar.d()) && this.f15552c.equals(wVar.c());
    }

    public int hashCode() {
        return ((((this.f15550a.hashCode() ^ 1000003) * 1000003) ^ this.f15551b.hashCode()) * 1000003) ^ this.f15552c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⠆") + this.f15550a + ProtectedSandApp.s("⠇") + this.f15551b + ProtectedSandApp.s("⠈") + this.f15552c + ProtectedSandApp.s("⠉");
    }
}
