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
    private static final int P2 = 1;
    private static final int Q2 = 2;
    private static final int R2 = 4;
    private static final int S2 = 8;
    public static final int T2 = 0;
    public static final int U2 = 1;
    private boolean L2;
    int M2;
    boolean N2;
    private int O2;
    private ArrayList<Transition> V1;

    class a extends w {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Transition f34327b;

        a(Transition transition) {
            this.f34327b = transition;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            this.f34327b.y0();
            transition.q0(this);
        }
    }

    static class b extends w {

        /* renamed from: b, reason: collision with root package name */
        TransitionSet f34329b;

        b(TransitionSet transitionSet) {
            this.f34329b = transitionSet;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            TransitionSet transitionSet = this.f34329b;
            if (transitionSet.N2) {
                return;
            }
            transitionSet.H0();
            this.f34329b.N2 = true;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            TransitionSet transitionSet = this.f34329b;
            int i4 = transitionSet.M2 - 1;
            transitionSet.M2 = i4;
            if (i4 == 0) {
                transitionSet.N2 = false;
                transitionSet.v();
            }
            transition.q0(this);
        }
    }

    public TransitionSet() {
        this.V1 = new ArrayList<>();
        this.L2 = true;
        this.N2 = false;
        this.O2 = 0;
    }

    private void R0(@androidx.annotation.o0 Transition transition) {
        this.V1.add(transition);
        transition.f34311s = this;
    }

    private void f1() {
        b bVar = new b(this);
        Iterator<Transition> it = this.V1.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.M2 = this.V1.size();
    }

    @Override // androidx.transition.Transition
    public void B0(Transition.f fVar) {
        super.B0(fVar);
        this.O2 |= 8;
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).B0(fVar);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition C(int i4, boolean z4) {
        for (int i5 = 0; i5 < this.V1.size(); i5++) {
            this.V1.get(i5).C(i4, z4);
        }
        return super.C(i4, z4);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition D(@androidx.annotation.o0 View view, boolean z4) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).D(view, z4);
        }
        return super.D(view, z4);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition E(@androidx.annotation.o0 Class<?> cls, boolean z4) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).E(cls, z4);
        }
        return super.E(cls, z4);
    }

    @Override // androidx.transition.Transition
    public void E0(PathMotion pathMotion) {
        super.E0(pathMotion);
        this.O2 |= 4;
        if (this.V1 != null) {
            for (int i4 = 0; i4 < this.V1.size(); i4++) {
                this.V1.get(i4).E0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public Transition F(@androidx.annotation.o0 String str, boolean z4) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).F(str, z4);
        }
        return super.F(str, z4);
    }

    @Override // androidx.transition.Transition
    public void F0(y yVar) {
        this.D = yVar;
        this.O2 |= 2;
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).F0(yVar);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void I(ViewGroup viewGroup) {
        super.I(viewGroup);
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).I(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    String I0(String str) {
        String I0 = super.I0(str);
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(I0, "\n");
            a5.append(this.V1.get(i4).I0(androidx.compose.runtime.changelist.j.a(str, "  ")));
            I0 = a5.toString();
        }
        return I0;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public TransitionSet b(@androidx.annotation.o0 Transition.h hVar) {
        return (TransitionSet) super.b(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public TransitionSet c(@androidx.annotation.d0 int i4) {
        for (int i5 = 0; i5 < this.V1.size(); i5++) {
            this.V1.get(i5).c(i4);
        }
        return (TransitionSet) super.c(i4);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public TransitionSet d(@androidx.annotation.o0 View view) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).d(view);
        }
        this.f34299g.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public TransitionSet e(@androidx.annotation.o0 Class<?> cls) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).e(cls);
        }
        return (TransitionSet) super.e(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public TransitionSet f(@androidx.annotation.o0 String str) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).f(str);
        }
        return (TransitionSet) super.f(str);
    }

    @androidx.annotation.o0
    public TransitionSet Q0(@androidx.annotation.o0 Transition transition) {
        R0(transition);
        long j4 = this.f34296d;
        if (j4 >= 0) {
            transition.A0(j4);
        }
        if ((this.O2 & 1) != 0) {
            transition.C0(N());
        }
        if ((this.O2 & 2) != 0) {
            transition.F0(S());
        }
        if ((this.O2 & 4) != 0) {
            transition.E0(R());
        }
        if ((this.O2 & 8) != 0) {
            transition.B0(M());
        }
        return this;
    }

    public int S0() {
        return !this.L2 ? 1 : 0;
    }

    @androidx.annotation.q0
    public Transition T0(int i4) {
        if (i4 < 0 || i4 >= this.V1.size()) {
            return null;
        }
        return this.V1.get(i4);
    }

    public int U0() {
        return this.V1.size();
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public TransitionSet q0(@androidx.annotation.o0 Transition.h hVar) {
        return (TransitionSet) super.q0(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public TransitionSet s0(@androidx.annotation.d0 int i4) {
        for (int i5 = 0; i5 < this.V1.size(); i5++) {
            this.V1.get(i5).s0(i4);
        }
        return (TransitionSet) super.s0(i4);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public TransitionSet t0(@androidx.annotation.o0 View view) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).t0(view);
        }
        this.f34299g.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public TransitionSet u0(@androidx.annotation.o0 Class<?> cls) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).u0(cls);
        }
        return (TransitionSet) super.u0(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public TransitionSet v0(@androidx.annotation.o0 String str) {
        for (int i4 = 0; i4 < this.V1.size(); i4++) {
            this.V1.get(i4).v0(str);
        }
        return (TransitionSet) super.v0(str);
    }

    @androidx.annotation.o0
    public TransitionSet a1(@androidx.annotation.o0 Transition transition) {
        this.V1.remove(transition);
        transition.f34311s = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public TransitionSet A0(long j4) {
        ArrayList<Transition> arrayList;
        this.f34296d = j4;
        if (j4 >= 0 && (arrayList = this.V1) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.V1.get(i4).A0(j4);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public TransitionSet C0(@androidx.annotation.q0 TimeInterpolator timeInterpolator) {
        this.O2 |= 1;
        ArrayList<Transition> arrayList = this.V1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.V1.get(i4).C0(timeInterpolator);
            }
        }
        return (TransitionSet) super.C0(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        super.cancel();
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).cancel();
        }
    }

    @androidx.annotation.o0
    public TransitionSet d1(int i4) {
        if (i4 == 0) {
            this.L2 = true;
        } else {
            if (i4 != 1) {
                throw new AndroidRuntimeException(android.support.v4.media.a.a("Invalid parameter for TransitionSet ordering: ", i4));
            }
            this.L2 = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public TransitionSet G0(long j4) {
        return (TransitionSet) super.G0(j4);
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        if (e0(b0Var.f34364b)) {
            Iterator<Transition> it = this.V1.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.e0(b0Var.f34364b)) {
                    next.m(b0Var);
                    b0Var.f34365c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void o(b0 b0Var) {
        super.o(b0Var);
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).o(b0Var);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o0(View view) {
        super.o0(view);
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).o0(view);
        }
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        if (e0(b0Var.f34364b)) {
            Iterator<Transition> it = this.V1.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.e0(b0Var.f34364b)) {
                    next.p(b0Var);
                    b0Var.f34365c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: s */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.V1 = new ArrayList<>();
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            transitionSet.R0(this.V1.get(i4).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void u(ViewGroup viewGroup, c0 c0Var, c0 c0Var2, ArrayList<b0> arrayList, ArrayList<b0> arrayList2) {
        long U = U();
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            Transition transition = this.V1.get(i4);
            if (U > 0 && (this.L2 || i4 == 0)) {
                long U3 = transition.U();
                if (U3 > 0) {
                    transition.G0(U3 + U);
                } else {
                    transition.G0(U);
                }
            }
            transition.u(viewGroup, c0Var, c0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void w0(View view) {
        super.w0(view);
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).w0(view);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void y0() {
        if (this.V1.isEmpty()) {
            H0();
            v();
            return;
        }
        f1();
        if (this.L2) {
            Iterator<Transition> it = this.V1.iterator();
            while (it.hasNext()) {
                it.next().y0();
            }
            return;
        }
        for (int i4 = 1; i4 < this.V1.size(); i4++) {
            this.V1.get(i4 - 1).b(new a(this.V1.get(i4)));
        }
        Transition transition = this.V1.get(0);
        if (transition != null) {
            transition.y0();
        }
    }

    @Override // androidx.transition.Transition
    void z0(boolean z4) {
        this.f34315w = z4;
        int size = this.V1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.V1.get(i4).z0(z4);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = new ArrayList<>();
        this.L2 = true;
        this.N2 = false;
        this.O2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35213i);
        d1(androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
