package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class TransitionSet extends Transition {

    /* renamed from: p0, reason: collision with root package name */
    private static final int f9811p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f9812q0 = 2;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f9813r0 = 4;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f9814s0 = 8;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f9815t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f9816u0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    private ArrayList<Transition> f9817k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f9818l0;

    /* renamed from: m0, reason: collision with root package name */
    int f9819m0;

    /* renamed from: n0, reason: collision with root package name */
    boolean f9820n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f9821o0;

    class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Transition f9822a;

        a(Transition transition) {
            this.f9822a = transition;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            this.f9822a.C0();
            transition.u0(this);
        }
    }

    static class b extends y {

        /* renamed from: a, reason: collision with root package name */
        TransitionSet f9824a;

        b(TransitionSet transitionSet) {
            this.f9824a = transitionSet;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            TransitionSet transitionSet = this.f9824a;
            if (transitionSet.f9820n0) {
                return;
            }
            transitionSet.M0();
            this.f9824a.f9820n0 = true;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            TransitionSet transitionSet = this.f9824a;
            int i5 = transitionSet.f9819m0 - 1;
            transitionSet.f9819m0 = i5;
            if (i5 == 0) {
                transitionSet.f9820n0 = false;
                transitionSet.w();
            }
            transition.u0(this);
        }
    }

    public TransitionSet() {
        this.f9817k0 = new ArrayList<>();
        this.f9818l0 = true;
        this.f9820n0 = false;
        this.f9821o0 = 0;
    }

    private void W0(@androidx.annotation.o0 Transition transition) {
        this.f9817k0.add(transition);
        transition.F = this;
    }

    private void m1() {
        b bVar = new b(this);
        Iterator<Transition> it = this.f9817k0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f9819m0 = this.f9817k0.size();
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void A0(View view) {
        super.A0(view);
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).A0(view);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition C(int i5, boolean z5) {
        for (int i6 = 0; i6 < this.f9817k0.size(); i6++) {
            this.f9817k0.get(i6).C(i5, z5);
        }
        return super.C(i5, z5);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void C0() {
        if (this.f9817k0.isEmpty()) {
            M0();
            w();
            return;
        }
        m1();
        if (this.f9818l0) {
            Iterator<Transition> it = this.f9817k0.iterator();
            while (it.hasNext()) {
                it.next().C0();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5 - 1).a(new a(this.f9817k0.get(i5)));
        }
        Transition transition = this.f9817k0.get(0);
        if (transition != null) {
            transition.C0();
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition D(@androidx.annotation.o0 View view, boolean z5) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).D(view, z5);
        }
        return super.D(view, z5);
    }

    @Override // androidx.transition.Transition
    void D0(boolean z5) {
        this.K = z5;
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).D0(z5);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition E(@androidx.annotation.o0 Class<?> cls, boolean z5) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).E(cls, z5);
        }
        return super.E(cls, z5);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition F(@androidx.annotation.o0 String str, boolean z5) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).F(str, z5);
        }
        return super.F(str, z5);
    }

    @Override // androidx.transition.Transition
    public void F0(Transition.f fVar) {
        super.F0(fVar);
        this.f9821o0 |= 8;
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).F0(fVar);
        }
    }

    @Override // androidx.transition.Transition
    public void I0(PathMotion pathMotion) {
        super.I0(pathMotion);
        this.f9821o0 |= 4;
        if (this.f9817k0 != null) {
            for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
                this.f9817k0.get(i5).I0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void J(ViewGroup viewGroup) {
        super.J(viewGroup);
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).J(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    public void J0(a0 a0Var) {
        this.R = a0Var;
        this.f9821o0 |= 2;
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).J0(a0Var);
        }
    }

    @Override // androidx.transition.Transition
    String O0(String str) {
        String O0 = super.O0(str);
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(O0, "\n");
            a6.append(this.f9817k0.get(i5).O0(androidx.concurrent.futures.b.a(str, "  ")));
            O0 = a6.toString();
        }
        return O0;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public TransitionSet a(@androidx.annotation.o0 Transition.h hVar) {
        return (TransitionSet) super.a(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public TransitionSet b(@androidx.annotation.d0 int i5) {
        for (int i6 = 0; i6 < this.f9817k0.size(); i6++) {
            this.f9817k0.get(i6).b(i5);
        }
        return (TransitionSet) super.b(i5);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public TransitionSet c(@androidx.annotation.o0 View view) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).c(view);
        }
        this.f9796t.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public TransitionSet d(@androidx.annotation.o0 Class<?> cls) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).d(cls);
        }
        return (TransitionSet) super.d(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public TransitionSet e(@androidx.annotation.o0 String str) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).e(str);
        }
        return (TransitionSet) super.e(str);
    }

    @androidx.annotation.o0
    public TransitionSet V0(@androidx.annotation.o0 Transition transition) {
        W0(transition);
        long j5 = this.f9793q;
        if (j5 >= 0) {
            transition.E0(j5);
        }
        if ((this.f9821o0 & 1) != 0) {
            transition.G0(N());
        }
        if ((this.f9821o0 & 2) != 0) {
            transition.J0(V());
        }
        if ((this.f9821o0 & 4) != 0) {
            transition.I0(T());
        }
        if ((this.f9821o0 & 8) != 0) {
            transition.F0(M());
        }
        return this;
    }

    public int X0() {
        return !this.f9818l0 ? 1 : 0;
    }

    @androidx.annotation.q0
    public Transition Y0(int i5) {
        if (i5 < 0 || i5 >= this.f9817k0.size()) {
            return null;
        }
        return this.f9817k0.get(i5);
    }

    public int Z0() {
        return this.f9817k0.size();
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public TransitionSet u0(@androidx.annotation.o0 Transition.h hVar) {
        return (TransitionSet) super.u0(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public TransitionSet v0(@androidx.annotation.d0 int i5) {
        for (int i6 = 0; i6 < this.f9817k0.size(); i6++) {
            this.f9817k0.get(i6).v0(i5);
        }
        return (TransitionSet) super.v0(i5);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public TransitionSet w0(@androidx.annotation.o0 View view) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).w0(view);
        }
        this.f9796t.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        super.cancel();
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).cancel();
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public TransitionSet x0(@androidx.annotation.o0 Class<?> cls) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).x0(cls);
        }
        return (TransitionSet) super.x0(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public TransitionSet z0(@androidx.annotation.o0 String str) {
        for (int i5 = 0; i5 < this.f9817k0.size(); i5++) {
            this.f9817k0.get(i5).z0(str);
        }
        return (TransitionSet) super.z0(str);
    }

    @androidx.annotation.o0
    public TransitionSet f1(@androidx.annotation.o0 Transition transition) {
        this.f9817k0.remove(transition);
        transition.F = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public TransitionSet E0(long j5) {
        ArrayList<Transition> arrayList;
        this.f9793q = j5;
        if (j5 >= 0 && (arrayList = this.f9817k0) != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f9817k0.get(i5).E0(j5);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public TransitionSet G0(@androidx.annotation.q0 TimeInterpolator timeInterpolator) {
        this.f9821o0 |= 1;
        ArrayList<Transition> arrayList = this.f9817k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f9817k0.get(i5).G0(timeInterpolator);
            }
        }
        return (TransitionSet) super.G0(timeInterpolator);
    }

    @androidx.annotation.o0
    public TransitionSet j1(int i5) {
        if (i5 == 0) {
            this.f9818l0 = true;
        } else {
            if (i5 != 1) {
                throw new AndroidRuntimeException(androidx.appcompat.view.menu.s.a("Invalid parameter for TransitionSet ordering: ", i5));
            }
            this.f9818l0 = false;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public TransitionSet K0(ViewGroup viewGroup) {
        super.K0(viewGroup);
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).K0(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        if (j0(d0Var.f9860b)) {
            Iterator<Transition> it = this.f9817k0.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.j0(d0Var.f9860b)) {
                    next.l(d0Var);
                    d0Var.f9861c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public TransitionSet L0(long j5) {
        return (TransitionSet) super.L0(j5);
    }

    @Override // androidx.transition.Transition
    void n(d0 d0Var) {
        super.n(d0Var);
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).n(d0Var);
        }
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        if (j0(d0Var.f9860b)) {
            Iterator<Transition> it = this.f9817k0.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.j0(d0Var.f9860b)) {
                    next.o(d0Var);
                    d0Var.f9861c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: s */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f9817k0 = new ArrayList<>();
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            transitionSet.W0(this.f9817k0.get(i5).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void s0(View view) {
        super.s0(view);
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9817k0.get(i5).s0(view);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void v(ViewGroup viewGroup, e0 e0Var, e0 e0Var2, ArrayList<d0> arrayList, ArrayList<d0> arrayList2) {
        long Y = Y();
        int size = this.f9817k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            Transition transition = this.f9817k0.get(i5);
            if (Y > 0 && (this.f9818l0 || i5 == 0)) {
                long Y2 = transition.Y();
                if (Y2 > 0) {
                    transition.L0(Y2 + Y);
                } else {
                    transition.L0(Y);
                }
            }
            transition.v(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9817k0 = new ArrayList<>();
        this.f9818l0 = true;
        this.f9820n0 = false;
        this.f9821o0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10088i);
        j1(androidx.core.content.res.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
