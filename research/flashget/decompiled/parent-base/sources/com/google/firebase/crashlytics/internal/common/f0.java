package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* compiled from: CrashlyticsReportWithSessionId.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class f0 {
    @androidx.annotation.o0
    public static f0 a(com.google.firebase.crashlytics.internal.model.g0 g0Var, String str, File file) {
        return new b(g0Var, str, file);
    }

    public abstract com.google.firebase.crashlytics.internal.model.g0 b();

    public abstract File c();

    public abstract String d();
}
