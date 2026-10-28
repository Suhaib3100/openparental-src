package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.e;
import androidx.constraintlayout.solver.widgets.j;
import java.util.ArrayList;

/* compiled from: HelperReference.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final e f2306a;

    /* renamed from: b, reason: collision with root package name */
    final e.EnumC0020e f2307b;

    /* renamed from: c, reason: collision with root package name */
    protected ArrayList<Object> f2308c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private j f2309d;

    public c(e eVar, e.EnumC0020e enumC0020e) {
        this.f2306a = eVar;
        this.f2307b = enumC0020e;
    }

    public c a(Object... objArr) {
        for (Object obj : objArr) {
            this.f2308c.add(obj);
        }
        return this;
    }

    public void b() {
    }

    public j c() {
        return this.f2309d;
    }

    public e.EnumC0020e d() {
        return this.f2307b;
    }

    public void e(j jVar) {
        this.f2309d = jVar;
    }
}
