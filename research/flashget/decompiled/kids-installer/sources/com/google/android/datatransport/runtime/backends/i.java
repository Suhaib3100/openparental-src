package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.auto.value.AutoValue;

/* compiled from: CreationContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12430a = ProtectedSandApp.s("ड");

    public static i a(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new c(context, aVar, aVar2, ProtectedSandApp.s("ठ"));
    }

    public static i b(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context c();

    @o0
    public abstract String d();

    public abstract com.google.android.datatransport.runtime.time.a e();

    public abstract com.google.android.datatransport.runtime.time.a f();
}
