package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes3.dex */
public class b0 extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f9152d;

    /* renamed from: e, reason: collision with root package name */
    private final a f9153e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final b0 f9154d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f9155e = new WeakHashMap();

        public a(@o0 b0 b0Var) {
            this.f9154d = b0Var;
        }

        @Override // androidx.core.view.a
        public boolean a(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        @q0
        public androidx.core.view.accessibility.k0 b(@o0 View view) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.g0 g0Var) {
            if (this.f9154d.o() || this.f9154d.f9152d.H0() == null) {
                super.g(view, g0Var);
                return;
            }
            this.f9154d.f9152d.H0().f1(view, g0Var);
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                aVar.g(view, g0Var);
            } else {
                super.g(view, g0Var);
            }
        }

        @Override // androidx.core.view.a
        public void h(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(@o0 ViewGroup viewGroup, @o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f9155e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i5, Bundle bundle) {
            if (this.f9154d.o() || this.f9154d.f9152d.H0() == null) {
                return super.j(view, i5, bundle);
            }
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i5, bundle)) {
                    return true;
                }
            } else if (super.j(view, i5, bundle)) {
                return true;
            }
            return this.f9154d.f9152d.H0().z1(view, i5, bundle);
        }

        @Override // androidx.core.view.a
        public void l(@o0 View view, int i5) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                aVar.l(view, i5);
            } else {
                super.l(view, i5);
            }
        }

        @Override // androidx.core.view.a
        public void m(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f9155e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.a n(View view) {
            return this.f9155e.remove(view);
        }

        void o(View view) {
            androidx.core.view.a E = y1.E(view);
            if (E == null || E == this) {
                return;
            }
            this.f9155e.put(view, E);
        }
    }

    public b0(@o0 RecyclerView recyclerView) {
        this.f9152d = recyclerView;
        androidx.core.view.a n5 = n();
        if (n5 == null || !(n5 instanceof a)) {
            this.f9153e = new a(this);
        } else {
            this.f9153e = (a) n5;
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.H0() != null) {
            recyclerView.H0().b1(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.accessibility.g0 g0Var) {
        super.g(view, g0Var);
        if (o() || this.f9152d.H0() == null) {
            return;
        }
        this.f9152d.H0().d1(g0Var);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i5, Bundle bundle) {
        if (super.j(view, i5, bundle)) {
            return true;
        }
        if (o() || this.f9152d.H0() == null) {
            return false;
        }
        return this.f9152d.H0().x1(i5, bundle);
    }

    @o0
    public androidx.core.view.a n() {
        return this.f9153e;
    }

    boolean o() {
        return this.f9152d.S0();
    }
}
