package androidx.work;

import android.content.Context;
import androidx.annotation.o0;
import androidx.work.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class WorkManagerInitializer implements androidx.startup.b<g0> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35901a = s.f("WrkMgrInitializer");

    @Override // androidx.startup.b
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 create(@o0 Context context) {
        s.c().a(f35901a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        androidx.work.impl.j.A(context, new b(new b.C0639b()));
        return androidx.work.impl.j.H(context);
    }

    @Override // androidx.startup.b
    @o0
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
