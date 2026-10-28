package android.view;

import android.content.Context;
import androidx.annotation.o0;
import androidx.startup.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ProcessLifecycleInitializer implements b<a0> {
    @Override // androidx.startup.b
    @o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 a(@o0 Context context) {
        v.a(context);
        o0.j(context);
        return o0.i();
    }

    @Override // androidx.startup.b
    @o0
    public List<Class<? extends b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
