package org.threeten.bp.format;

import androidx.compose.animation.core.k1;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeTextProvider.java */
/* loaded from: classes9.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<g> f88210a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final g f88211a = a();

        a() {
        }

        static g a() {
            k1.a(g.f88210a, null, new m());
            return (g) g.f88210a.get();
        }
    }

    static g b() {
        return a.f88211a;
    }

    public static void e(g gVar) {
        if (!k1.a(f88210a, null, gVar)) {
            throw new IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    public abstract String c(org.threeten.bp.temporal.j jVar, long j4, n nVar, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, n nVar, Locale locale);
}
