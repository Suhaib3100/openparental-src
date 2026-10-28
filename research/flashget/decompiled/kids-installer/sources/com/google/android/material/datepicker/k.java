package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.q0;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
class k extends BaseAdapter {

    /* renamed from: t, reason: collision with root package name */
    static final int f13423t = q.v().getMaximum(4);

    /* renamed from: o, reason: collision with root package name */
    final Month f13424o;

    /* renamed from: p, reason: collision with root package name */
    final DateSelector<?> f13425p;

    /* renamed from: q, reason: collision with root package name */
    private Collection<Long> f13426q;

    /* renamed from: r, reason: collision with root package name */
    b f13427r;

    /* renamed from: s, reason: collision with root package name */
    final CalendarConstraints f13428s;

    k(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f13424o = month;
        this.f13425p = dateSelector;
        this.f13428s = calendarConstraints;
        this.f13426q = dateSelector.M0();
    }

    private void e(Context context) {
        if (this.f13427r == null) {
            this.f13427r = new b(context);
        }
    }

    private boolean h(long j5) {
        Iterator<Long> it = this.f13425p.M0().iterator();
        while (it.hasNext()) {
            if (q.a(j5) == q.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(@q0 TextView textView, long j5) {
        a aVar;
        if (textView == null) {
            return;
        }
        if (this.f13428s.f().E0(j5)) {
            textView.setEnabled(true);
            aVar = h(j5) ? this.f13427r.f13339b : q.t().getTimeInMillis() == j5 ? this.f13427r.f13340c : this.f13427r.f13338a;
        } else {
            textView.setEnabled(false);
            aVar = this.f13427r.f13344g;
        }
        aVar.f(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j5) {
        if (Month.j(j5).equals(this.f13424o)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f13424o.r(j5)) - materialCalendarGridView.getFirstVisiblePosition()), j5);
        }
    }

    int a(int i5) {
        return b() + (i5 - 1);
    }

    int b() {
        return this.f13424o.p();
    }

    @Override // android.widget.Adapter
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i5) {
        if (i5 < this.f13424o.p() || i5 > i()) {
            return null;
        }
        return Long.valueOf(this.f13424o.q(j(i5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    @Override // android.widget.Adapter
    @androidx.annotation.o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.q0 android.view.View r7, @androidx.annotation.o0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = n1.a.k.f29910m0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L79
            com.google.android.material.datepicker.Month r8 = r5.f13424o
            int r2 = r8.f13312s
            if (r7 < r2) goto L2d
            goto L79
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "ሜ"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f13424o
            long r7 = r8.q(r7)
            com.google.android.material.datepicker.Month r3 = r5.f13424o
            int r3 = r3.f13310q
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.l()
            int r4 = r4.f13310q
            if (r3 != r4) goto L6b
            java.lang.String r7 = com.google.android.material.datepicker.d.g(r7)
            r0.setContentDescription(r7)
            goto L72
        L6b:
            java.lang.String r7 = com.google.android.material.datepicker.d.l(r7)
            r0.setContentDescription(r7)
        L72:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L81
        L79:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L81:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L88
            return r0
        L88:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.k.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean f(int i5) {
        return i5 % this.f13424o.f13311r == 0;
    }

    boolean g(int i5) {
        return (i5 + 1) % this.f13424o.f13311r == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13424o.f13312s + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5 / this.f13424o.f13311r;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i() {
        return (this.f13424o.p() + this.f13424o.f13312s) - 1;
    }

    int j(int i5) {
        return (i5 - this.f13424o.p()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f13426q.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f13425p;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.M0().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f13426q = this.f13425p.M0();
        }
    }

    boolean n(int i5) {
        return i5 >= b() && i5 <= i();
    }
}
