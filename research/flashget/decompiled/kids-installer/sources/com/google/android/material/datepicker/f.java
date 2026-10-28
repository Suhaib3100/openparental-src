package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import n1.a;

/* compiled from: MaterialCalendar.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class f<S> extends n<S> {
    private static final int D = 3;

    /* renamed from: p, reason: collision with root package name */
    @h1
    private int f13363p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private DateSelector<S> f13364q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private CalendarConstraints f13365r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private Month f13366s;

    /* renamed from: t, reason: collision with root package name */
    private k f13367t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.android.material.datepicker.b f13368u;

    /* renamed from: v, reason: collision with root package name */
    private RecyclerView f13369v;

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView f13370w;

    /* renamed from: x, reason: collision with root package name */
    private View f13371x;

    /* renamed from: y, reason: collision with root package name */
    private View f13372y;
    private static final String A = ProtectedSandApp.s("㋭");
    private static final String B = ProtectedSandApp.s("㋮");
    private static final String C = ProtectedSandApp.s("㋯");

    /* renamed from: z, reason: collision with root package name */
    private static final String f13362z = ProtectedSandApp.s("㋰");

    @m1
    static final Object E = ProtectedSandApp.s("㋱");

    @m1
    static final Object F = ProtectedSandApp.s("㋲");

    @m1
    static final Object G = ProtectedSandApp.s("㋳");

    @m1
    static final Object H = ProtectedSandApp.s("㋴");

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13373o;

        a(int i5) {
            this.f13373o = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f13370w.u2(this.f13373o);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.Y0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class c extends o {
        final /* synthetic */ int P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i5, boolean z5, int i6) {
            super(context, i5, z5);
            this.P = i6;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void k2(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
            if (this.P == 0) {
                iArr[0] = f.this.f13370w.getWidth();
                iArr[1] = f.this.f13370w.getWidth();
            } else {
                iArr[0] = f.this.f13370w.getHeight();
                iArr[1] = f.this.f13370w.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.f.l
        public void a(long j5) {
            if (f.this.f13365r.f().E0(j5)) {
                f.this.f13364q.f1(j5);
                Iterator<m<S>> it = f.this.f13436o.iterator();
                while (it.hasNext()) {
                    it.next().b(f.this.f13364q.U0());
                }
                f.this.f13370w.o0().m();
                if (f.this.f13369v != null) {
                    f.this.f13369v.o0().m();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class e extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f13377a = q.v();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f13378b = q.w(null);

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.a0 a0Var) {
            if ((recyclerView.o0() instanceof r) && (recyclerView.H0() instanceof GridLayoutManager)) {
                r rVar = (r) recyclerView.o0();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.H0();
                for (androidx.core.util.m<Long, Long> mVar : f.this.f13364q.z()) {
                    Long l5 = mVar.f5251a;
                    if (l5 != null && mVar.f5252b != null) {
                        this.f13377a.setTimeInMillis(l5.longValue());
                        this.f13378b.setTimeInMillis(mVar.f5252b.longValue());
                        int L = rVar.L(this.f13377a.get(1));
                        int L2 = rVar.L(this.f13378b.get(1));
                        View J = gridLayoutManager.J(L);
                        View J2 = gridLayoutManager.J(L2);
                        int D3 = L / gridLayoutManager.D3();
                        int D32 = L2 / gridLayoutManager.D3();
                        for (int i5 = D3; i5 <= D32; i5++) {
                            View J3 = gridLayoutManager.J(gridLayoutManager.D3() * i5);
                            if (J3 != null) {
                                int top = J3.getTop() + f.this.f13368u.f13341d.e();
                                int bottom = J3.getBottom() - f.this.f13368u.f13341d.b();
                                canvas.drawRect(i5 == D3 ? (J.getWidth() / 2) + J.getLeft() : 0, top, i5 == D32 ? (J2.getWidth() / 2) + J2.getLeft() : recyclerView.getWidth(), bottom, f.this.f13368u.f13345h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0173f extends androidx.core.view.a {
        C0173f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.l1(f.this.f13372y.getVisibility() == 0 ? f.this.getString(a.m.S0) : f.this.getString(a.m.Q0));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class g extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f13381a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f13382b;

        g(com.google.android.material.datepicker.l lVar, MaterialButton materialButton) {
            this.f13381a = lVar;
            this.f13382b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@o0 RecyclerView recyclerView, int i5) {
            if (i5 == 0) {
                recyclerView.announceForAccessibility(this.f13382b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(@o0 RecyclerView recyclerView, int i5, int i6) {
            int x22 = i5 < 0 ? f.this.t().x2() : f.this.t().A2();
            f.this.f13366s = this.f13381a.K(x22);
            this.f13382b.setText(this.f13381a.L(x22));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.y();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class i implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f13385o;

        i(com.google.android.material.datepicker.l lVar) {
            this.f13385o = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int x22 = f.this.t().x2() + 1;
            if (x22 < f.this.f13370w.o0().g()) {
                f.this.w(this.f13385o.K(x22));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class j implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f13387o;

        j(com.google.android.material.datepicker.l lVar) {
            this.f13387o = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int A2 = f.this.t().A2() - 1;
            if (A2 >= 0) {
                f.this.w(this.f13387o.K(A2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    interface l {
        void a(long j5);
    }

    private void n(@o0 View view, @o0 com.google.android.material.datepicker.l lVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(a.h.M2);
        materialButton.setTag(H);
        y1.B1(materialButton, new C0173f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(a.h.O2);
        materialButton2.setTag(F);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(a.h.N2);
        materialButton3.setTag(G);
        this.f13371x = view.findViewById(a.h.Z2);
        this.f13372y = view.findViewById(a.h.S2);
        x(k.DAY);
        materialButton.setText(this.f13366s.s(view.getContext()));
        this.f13370w.s(new g(lVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(lVar));
        materialButton2.setOnClickListener(new j(lVar));
    }

    @o0
    private RecyclerView.o o() {
        return new e();
    }

    @u0
    static int s(@o0 Context context) {
        return context.getResources().getDimensionPixelSize(a.f.E3);
    }

    @o0
    public static <T> f<T> u(@o0 DateSelector<T> dateSelector, @h1 int i5, @o0 CalendarConstraints calendarConstraints) {
        f<T> fVar = new f<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("㋵"), i5);
        bundle.putParcelable(ProtectedSandApp.s("㋶"), dateSelector);
        bundle.putParcelable(ProtectedSandApp.s("㋷"), calendarConstraints);
        bundle.putParcelable(ProtectedSandApp.s("㋸"), calendarConstraints.i());
        fVar.setArguments(bundle);
        return fVar;
    }

    private void v(int i5) {
        this.f13370w.post(new a(i5));
    }

    @Override // com.google.android.material.datepicker.n
    public boolean a(@o0 m<S> mVar) {
        return super.a(mVar);
    }

    @Override // com.google.android.material.datepicker.n
    @q0
    public DateSelector<S> d() {
        return this.f13364q;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13363p = bundle.getInt(ProtectedSandApp.s("㋹"));
        this.f13364q = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("㋺"));
        this.f13365r = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("㋻"));
        this.f13366s = (Month) bundle.getParcelable(ProtectedSandApp.s("㋼"));
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        int i5;
        int i6;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f13363p);
        this.f13368u = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j5 = this.f13365r.j();
        if (com.google.android.material.datepicker.g.z(contextThemeWrapper)) {
            i5 = a.k.f29926u0;
            i6 = 1;
        } else {
            i5 = a.k.f29916p0;
            i6 = 0;
        }
        View inflate = cloneInContext.inflate(i5, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(a.h.T2);
        y1.B1(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.e());
        gridView.setNumColumns(j5.f13311r);
        gridView.setEnabled(false);
        this.f13370w = (RecyclerView) inflate.findViewById(a.h.W2);
        this.f13370w.g2(new c(getContext(), i6, false, i6));
        this.f13370w.setTag(E);
        com.google.android.material.datepicker.l lVar = new com.google.android.material.datepicker.l(contextThemeWrapper, this.f13364q, this.f13365r, new d());
        this.f13370w.X1(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(a.i.f29861v);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(a.h.Z2);
        this.f13369v = recyclerView;
        if (recyclerView != null) {
            recyclerView.c2(true);
            this.f13369v.g2(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f13369v.X1(new r(this));
            this.f13369v.o(new e());
        }
        if (inflate.findViewById(a.h.M2) != null) {
            n(inflate, lVar);
        }
        if (!com.google.android.material.datepicker.g.z(contextThemeWrapper)) {
            new a0().b(this.f13370w);
        }
        this.f13370w.V1(lVar.M(this.f13366s));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("㋽"), this.f13363p);
        bundle.putParcelable(ProtectedSandApp.s("㋾"), this.f13364q);
        bundle.putParcelable(ProtectedSandApp.s("㋿"), this.f13365r);
        bundle.putParcelable(ProtectedSandApp.s("㌀"), this.f13366s);
    }

    @q0
    CalendarConstraints p() {
        return this.f13365r;
    }

    com.google.android.material.datepicker.b q() {
        return this.f13368u;
    }

    @q0
    Month r() {
        return this.f13366s;
    }

    @o0
    LinearLayoutManager t() {
        return (LinearLayoutManager) this.f13370w.H0();
    }

    void w(Month month) {
        com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) this.f13370w.o0();
        int M = lVar.M(month);
        int M2 = M - lVar.M(this.f13366s);
        boolean z5 = Math.abs(M2) > 3;
        boolean z6 = M2 > 0;
        this.f13366s = month;
        if (z5 && z6) {
            this.f13370w.V1(M - 3);
            v(M);
        } else if (!z5) {
            v(M);
        } else {
            this.f13370w.V1(M + 3);
            v(M);
        }
    }

    void x(k kVar) {
        this.f13367t = kVar;
        if (kVar == k.YEAR) {
            this.f13369v.H0().R1(((r) this.f13369v.o0()).L(this.f13366s.f13310q));
            this.f13371x.setVisibility(0);
            this.f13372y.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f13371x.setVisibility(8);
            this.f13372y.setVisibility(0);
            w(this.f13366s);
        }
    }

    void y() {
        k kVar = this.f13367t;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            x(k.DAY);
        } else if (kVar == k.DAY) {
            x(kVar2);
        }
    }
}
