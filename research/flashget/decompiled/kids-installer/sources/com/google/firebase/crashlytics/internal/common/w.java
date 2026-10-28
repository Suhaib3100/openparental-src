package com.google.firebase.crashlytics.internal.common;

import com.google.auto.value.AutoValue;
import java.io.File;

/* compiled from: CrashlyticsReportWithSessionId.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class w {
    @androidx.annotation.o0
    public static w a(com.google.firebase.crashlytics.internal.model.f0 f0Var, String str, File file) {
        return new b(f0Var, str, file);
    }

    public abstract com.google.firebase.crashlytics.internal.model.f0 b();

    public abstract File c();

    public abstract String d();
}
