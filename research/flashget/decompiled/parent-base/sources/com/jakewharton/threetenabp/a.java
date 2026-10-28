package com.jakewharton.threetenabp;

import android.app.Application;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.h;

/* compiled from: AndroidThreeTen.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f64826a = new AtomicBoolean();

    private a() {
        throw new AssertionError();
    }

    public static void a(Application application) {
        b(application);
    }

    public static void b(Context context) {
        c(context, ProtectedSandApp.s("ᑧ\u0001"));
    }

    public static void c(Context context, String str) {
        if (f64826a.getAndSet(true)) {
            return;
        }
        h.c(new b(context, str));
    }
}
