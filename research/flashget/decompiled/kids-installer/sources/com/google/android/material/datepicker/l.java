package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.datepicker.f;
import n1.a;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes3.dex */
class l extends RecyclerView.h<b> {

    /* renamed from: d, reason: collision with root package name */
    private final Context f13429d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final CalendarConstraints f13430e;

    /* renamed from: f, reason: collision with root package name */
    private final DateSelector<?> f13431f;

    /* renamed from: g, reason: collision with root package name */
    private final f.l f13432g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13433h;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f13434o;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f13434o = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            if (this.f13434o.getAdapter().n(i5)) {
                l.this.f13432g.a(this.f13434o.getAdapter().getItem(i5).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    public static class b extends RecyclerView.d0 {
        final TextView I;
        final MaterialCalendarGridView J;

        b(@o0 LinearLayout linearLayout, boolean z5) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(a.h.P2);
            this.I = textView;
            y1.C1(textView, true);
            this.J = (MaterialCalendarGridView) linearLayout.findViewById(a.h.K2);
            if (z5) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    l(@o0 Context context, DateSelector<?> dateSelector, @o0 CalendarConstraints calendarConstraints, f.l lVar) {
        Month j5 = calendarConstraints.j();
        Month g5 = calendarConstraints.g();
        Month i5 = calendarConstraints.i();
        if (j5.compareTo(i5) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⛠"));
        }
        if (i5.compareTo(g5) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⛟"));
        }
        int s5 = k.f13423t * f.s(context);
        int s6 = g.z(context) ? f.s(context) : 0;
        this.f13429d = context;
        this.f13433h = s5 + s6;
        this.f13430e = calendarConstraints;
        this.f13431f = dateSelector;
        this.f13432g = lVar;
        G(true);
    }

    @o0
    Month K(int i5) {
        return this.f13430e.j().u(i5);
    }

    @o0
    CharSequence L(int i5) {
        return K(i5).s(this.f13429d);
    }

    int M(@o0 Month month) {
        return this.f13430e.j().v(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void x(@o0 b bVar, int i5) {
        Month u5 = this.f13430e.j().u(i5);
        bVar.I.setText(u5.s(bVar.f9003a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.J.findViewById(a.h.K2);
        if (materialCalendarGridView.getAdapter() == null || !u5.equals(materialCalendarGridView.getAdapter().f13424o)) {
            k kVar = new k(u5, this.f13431f, this.f13430e);
            materialCalendarGridView.setNumColumns(u5.f13311r);
            materialCalendarGridView.setAdapter((ListAdapter) kVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b z(@o0 ViewGroup viewGroup, int i5) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f29920r0, viewGroup, false);
        if (!g.z(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f13433h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f13430e.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long h(int i5) {
        return this.f13430e.j().u(i5).t();
    }
}
