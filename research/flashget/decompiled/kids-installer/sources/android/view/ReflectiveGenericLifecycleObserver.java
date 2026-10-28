package android.view;

import android.view.C0527d;
import android.view.t;
import androidx.annotation.o0;

@Deprecated
/* loaded from: classes3.dex */
class ReflectiveGenericLifecycleObserver implements w {

    /* renamed from: o, reason: collision with root package name */
    private final Object f8435o;

    /* renamed from: p, reason: collision with root package name */
    private final C0527d.a f8436p;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f8435o = obj;
        this.f8436p = C0527d.f8514c.c(obj.getClass());
    }

    @Override // android.view.w
    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
        this.f8436p.a(a0Var, bVar, this.f8435o);
    }
}
