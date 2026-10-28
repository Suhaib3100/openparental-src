package com.google.android.material.datepicker;

import android.R;
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
import androidx.core.util.s;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import s8.a;

/* compiled from: MaterialCalendar.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class f<S> extends n<S> {

    /* renamed from: q, reason: collision with root package name */
    private static final int f53119q = 3;

    /* renamed from: c, reason: collision with root package name */
    @h1
    private int f53124c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private DateSelector<S> f53125d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private CalendarConstraints f53126e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private Month f53127f;

    /* renamed from: g, reason: collision with root package name */
    private k f53128g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.b f53129h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f53130i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView f53131j;

    /* renamed from: k, reason: collision with root package name */
    private View f53132k;

    /* renamed from: l, reason: collision with root package name */
    private View f53133l;

    /* renamed from: p, reason: collision with root package name */
    private static final String f53118p = ProtectedSandApp.s("\uf19b");

    /* renamed from: m, reason: collision with root package name */
    private static final String f53115m = ProtectedSandApp.s("\uf19c");

    /* renamed from: n, reason: collision with root package name */
    private static final String f53116n = ProtectedSandApp.s("\uf19d");

    /* renamed from: o, reason: collision with root package name */
    private static final String f53117o = ProtectedSandApp.s("\uf19e");

    /* renamed from: r, reason: collision with root package name */
    @m1
    static final Object f53120r = ProtectedSandApp.s("\uf19f");

    /* renamed from: s, reason: collision with root package name */
    @m1
    static final Object f53121s = ProtectedSandApp.s("\uf1a0");

    /* renamed from: t, reason: collision with root package name */
    @m1
    static final Object f53122t = ProtectedSandApp.s("\uf1a1");

    /* renamed from: u, reason: collision with root package name */
    @m1
    static final Object f53123u = ProtectedSandApp.s("\uf1a2");

    /* compiled from: MaterialCalendar.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f53134b;

        a(int i4) {
            this.f53134b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f53131j.smoothScrollToPosition(this.f53134b);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.l1(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    class c extends o {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f53137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i4, boolean z4, int i5) {
            super(context, i4, z4);
            this.f53137c = i5;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
            if (this.f53137c == 0) {
                iArr[0] = f.this.f53131j.getWidth();
                iArr[1] = f.this.f53131j.getWidth();
            } else {
                iArr[0] = f.this.f53131j.getHeight();
                iArr[1] = f.this.f53131j.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.f.l
        public void a(long j4) {
            if (f.this.f53126e.f().j1(j4)) {
                f.this.f53125d.E3(j4);
                Iterator<m<S>> it = f.this.f53214b.iterator();
                while (it.hasNext()) {
                    it.next().b(f.this.f53125d.getSelection());
                }
                f.this.f53131j.getAdapter().notifyDataSetChanged();
                if (f.this.f53130i != null) {
                    f.this.f53130i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class e extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f53140a = q.v();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f53141b = q.w(null);

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof r) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                r rVar = (r) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (s<Long, Long> sVar : f.this.f53125d.g2()) {
                    Long l4 = sVar.f26881a;
                    if (l4 != null && sVar.f26882b != null) {
                        this.f53140a.setTimeInMillis(l4.longValue());
                        this.f53141b.setTimeInMillis(sVar.f26882b.longValue());
                        int f4 = rVar.f(this.f53140a.get(1));
                        int f5 = rVar.f(this.f53141b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(f4);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(f5);
                        int M = f4 / gridLayoutManager.M();
                        int M2 = f5 / gridLayoutManager.M();
                        for (int i4 = M; i4 <= M2; i4++) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.M() * i4);
                            if (findViewByPosition3 != null) {
                                int top2 = findViewByPosition3.getTop() + f.this.f53129h.f53094d.e();
                                int bottom = findViewByPosition3.getBottom() - f.this.f53129h.f53094d.b();
                                canvas.drawRect(i4 == M ? (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft() : 0, top2, i4 == M2 ? (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft() : recyclerView.getWidth(), bottom, f.this.f53129h.f53098h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.f$f, reason: collision with other inner class name */
    class C0807f extends androidx.core.view.a {
        C0807f() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.A1(f.this.f53133l.getVisibility() == 0 ? f.this.getString(a.m.S0) : f.this.getString(a.m.Q0));
        }
    }

    /* compiled from: MaterialCalendar.java */
    class g extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f53144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f53145b;

        g(com.google.android.material.datepicker.l lVar, MaterialButton materialButton) {
            this.f53144a = lVar;
            this.f53145b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(@o0 RecyclerView recyclerView, int i4) {
            if (i4 == 0) {
                recyclerView.announceForAccessibility(this.f53145b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@o0 RecyclerView recyclerView, int i4, int i5) {
            int findFirstVisibleItemPosition = i4 < 0 ? f.this.E().findFirstVisibleItemPosition() : f.this.E().findLastVisibleItemPosition();
            f.this.f53127f = this.f53144a.e(findFirstVisibleItemPosition);
            this.f53145b.setText(this.f53144a.f(findFirstVisibleItemPosition));
        }
    }

    /* compiled from: MaterialCalendar.java */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.J();
        }
    }

    /* compiled from: MaterialCalendar.java */
    class i implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f53148b;

        i(com.google.android.material.datepicker.l lVar) {
            this.f53148b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = f.this.E().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < f.this.f53131j.getAdapter().getItemCount()) {
                f.this.H(this.f53148b.e(findFirstVisibleItemPosition));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    class j implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.l f53150b;

        j(com.google.android.material.datepicker.l lVar) {
            this.f53150b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = f.this.E().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                f.this.H(this.f53150b.e(findLastVisibleItemPosition));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    interface l {
        void a(long j4);
    }

    @u0
    static int D(@o0 Context context) {
        return context.getResources().getDimensionPixelSize(a.f.E3);
    }

    @o0
    public static <T> f<T> F(@o0 DateSelector<T> dateSelector, @h1 int i4, @o0 CalendarConstraints calendarConstraints) {
        f<T> fVar = new f<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("\uf19c"), i4);
        bundle.putParcelable(ProtectedSandApp.s("\uf19d"), dateSelector);
        bundle.putParcelable(ProtectedSandApp.s("\uf19e"), calendarConstraints);
        bundle.putParcelable(ProtectedSandApp.s("\uf19b"), calendarConstraints.j());
        fVar.setArguments(bundle);
        return fVar;
    }

    private void G(int i4) {
        this.f53131j.post(new a(i4));
    }

    private void y(@o0 View view, @o0 com.google.android.material.datepicker.l lVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(a.h.M2);
        materialButton.setTag(f53123u);
        x1.H1(materialButton, new C0807f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(a.h.O2);
        materialButton2.setTag(f53121s);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(a.h.N2);
        materialButton3.setTag(f53122t);
        this.f53132k = view.findViewById(a.h.Z2);
        this.f53133l = view.findViewById(a.h.S2);
        I(k.DAY);
        materialButton.setText(this.f53127f.h(view.getContext()));
        this.f53131j.addOnScrollListener(new g(lVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(lVar));
        materialButton2.setOnClickListener(new j(lVar));
    }

    @o0
    private RecyclerView.o z() {
        return new e();
    }

    @q0
    CalendarConstraints A() {
        return this.f53126e;
    }

    com.google.android.material.datepicker.b B() {
        return this.f53129h;
    }

    @q0
    Month C() {
        return this.f53127f;
    }

    @o0
    LinearLayoutManager E() {
        return (LinearLayoutManager) this.f53131j.getLayoutManager();
    }

    void H(Month month) {
        com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) this.f53131j.getAdapter();
        int g4 = lVar.g(month);
        int g5 = g4 - lVar.g(this.f53127f);
        boolean z4 = Math.abs(g5) > 3;
        boolean z5 = g5 > 0;
        this.f53127f = month;
        if (z4 && z5) {
            this.f53131j.scrollToPosition(g4 - 3);
            G(g4);
        } else if (!z4) {
            G(g4);
        } else {
            this.f53131j.scrollToPosition(g4 + 3);
            G(g4);
        }
    }

    void I(k kVar) {
        this.f53128g = kVar;
        if (kVar == k.YEAR) {
            this.f53130i.getLayoutManager().scrollToPosition(((r) this.f53130i.getAdapter()).f(this.f53127f.f53063d));
            this.f53132k.setVisibility(0);
            this.f53133l.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f53132k.setVisibility(8);
            this.f53133l.setVisibility(0);
            H(this.f53127f);
        }
    }

    void J() {
        k kVar = this.f53128g;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            I(k.DAY);
        } else if (kVar == k.DAY) {
            I(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.n
    public boolean n(@o0 m<S> mVar) {
        return this.f53214b.add(mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f53124c = bundle.getInt(ProtectedSandApp.s("\uf19c"));
        this.f53125d = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("\uf19d"));
        this.f53126e = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("\uf19e"));
        this.f53127f = (Month) bundle.getParcelable(ProtectedSandApp.s("\uf19b"));
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        int i4;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f53124c);
        this.f53129h = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month k4 = this.f53126e.k();
        if (com.google.android.material.datepicker.g.K(contextThemeWrapper)) {
            i4 = a.k.f91198u0;
            i5 = 1;
        } else {
            i4 = a.k.f91188p0;
            i5 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(a.h.T2);
        x1.H1(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.e());
        gridView.setNumColumns(k4.f53064e);
        gridView.setEnabled(false);
        this.f53131j = (RecyclerView) inflate.findViewById(a.h.W2);
        this.f53131j.setLayoutManager(new c(getContext(), i5, false, i5));
        this.f53131j.setTag(f53120r);
        com.google.android.material.datepicker.l lVar = new com.google.android.material.datepicker.l(contextThemeWrapper, this.f53125d, this.f53126e, new d());
        this.f53131j.setAdapter(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(a.i.f91133v);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(a.h.Z2);
        this.f53130i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f53130i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f53130i.setAdapter(new r(this));
            this.f53130i.addItemDecoration(new e());
        }
        if (inflate.findViewById(a.h.M2) != null) {
            y(inflate, lVar);
        }
        if (!com.google.android.material.datepicker.g.N(contextThemeWrapper, R.attr.windowFullscreen)) {
            new a0().b(this.f53131j);
        }
        this.f53131j.scrollToPosition(lVar.g(this.f53127f));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("\uf19c"), this.f53124c);
        bundle.putParcelable(ProtectedSandApp.s("\uf19d"), this.f53125d);
        bundle.putParcelable(ProtectedSandApp.s("\uf19e"), this.f53126e);
        bundle.putParcelable(ProtectedSandApp.s("\uf19b"), this.f53127f);
    }

    @Override // com.google.android.material.datepicker.n
    @q0
    public DateSelector<S> p() {
        return this.f53125d;
    }
}
