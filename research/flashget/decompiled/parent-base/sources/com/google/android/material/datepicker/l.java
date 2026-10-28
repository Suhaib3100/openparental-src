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
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.datepicker.f;
import s8.a;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes6.dex */
class l extends RecyclerView.h<b> {

    /* renamed from: b, reason: collision with root package name */
    private final Context f53205b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final CalendarConstraints f53206c;

    /* renamed from: d, reason: collision with root package name */
    private final DateSelector<?> f53207d;

    /* renamed from: e, reason: collision with root package name */
    private final f.l f53208e;

    /* renamed from: f, reason: collision with root package name */
    private final int f53209f;

    /* compiled from: MonthsPagerAdapter.java */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f53210b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f53210b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (this.f53210b.b().n(i4)) {
                l.this.f53208e.a(this.f53210b.b().getItem(i4).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    public static class b extends RecyclerView.e0 {

        /* renamed from: b, reason: collision with root package name */
        final TextView f53212b;

        /* renamed from: c, reason: collision with root package name */
        final MaterialCalendarGridView f53213c;

        b(@o0 LinearLayout linearLayout, boolean z4) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(a.h.P2);
            this.f53212b = textView;
            x1.I1(textView, true);
            this.f53213c = (MaterialCalendarGridView) linearLayout.findViewById(a.h.K2);
            if (z4) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    l(@o0 Context context, DateSelector<?> dateSelector, @o0 CalendarConstraints calendarConstraints, f.l lVar) {
        Month k4 = calendarConstraints.k();
        Month g4 = calendarConstraints.g();
        Month j4 = calendarConstraints.j();
        if (k4.compareTo(j4) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1b2"));
        }
        if (j4.compareTo(g4) > 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1b1"));
        }
        int D = k.f53199g * f.D(context);
        int D2 = g.K(context) ? f.D(context) : 0;
        this.f53205b = context;
        this.f53209f = D + D2;
        this.f53206c = calendarConstraints;
        this.f53207d = dateSelector;
        this.f53208e = lVar;
        setHasStableIds(true);
    }

    @o0
    Month e(int i4) {
        return this.f53206c.k().k(i4);
    }

    @o0
    CharSequence f(int i4) {
        return e(i4).h(this.f53205b);
    }

    int g(@o0 Month month) {
        return this.f53206c.k().n(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f53206c.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i4) {
        return this.f53206c.k().k(i4).j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@o0 b bVar, int i4) {
        Month k4 = this.f53206c.k().k(i4);
        bVar.f53212b.setText(k4.h(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f53213c.findViewById(a.h.K2);
        if (materialCalendarGridView.b() == null || !k4.equals(materialCalendarGridView.b().f53200b)) {
            k kVar = new k(k4, this.f53207d, this.f53206c);
            materialCalendarGridView.setNumColumns(k4.f53064e);
            materialCalendarGridView.setAdapter((ListAdapter) kVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.b().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f91192r0, viewGroup, false);
        if (!g.K(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f53209f));
        return new b(linearLayout, true);
    }
}
