package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.h;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: HelperReference.java */
/* loaded from: classes.dex */
public class c extends a implements androidx.constraintlayout.core.state.helpers.e {

    /* renamed from: j0, reason: collision with root package name */
    protected final h f22680j0;

    /* renamed from: k0, reason: collision with root package name */
    final h.e f22681k0;

    /* renamed from: l0, reason: collision with root package name */
    protected ArrayList<Object> f22682l0;

    /* renamed from: m0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.j f22683m0;

    public c(h hVar, h.e eVar) {
        super(hVar);
        this.f22682l0 = new ArrayList<>();
        this.f22680j0 = hVar;
        this.f22681k0 = eVar;
    }

    public c L0(Object... objArr) {
        Collections.addAll(this.f22682l0, objArr);
        return this;
    }

    public androidx.constraintlayout.core.widgets.j M0() {
        return this.f22683m0;
    }

    public h.e N0() {
        return this.f22681k0;
    }

    public void O0(androidx.constraintlayout.core.widgets.j jVar) {
        this.f22683m0 = jVar;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public androidx.constraintlayout.core.widgets.e a() {
        return M0();
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
    }
}
