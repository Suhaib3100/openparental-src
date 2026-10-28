package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.q0;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: classes6.dex */
class k extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    static final int f53199g = q.v().getMaximum(4);

    /* renamed from: b, reason: collision with root package name */
    final Month f53200b;

    /* renamed from: c, reason: collision with root package name */
    final DateSelector<?> f53201c;

    /* renamed from: d, reason: collision with root package name */
    private Collection<Long> f53202d;

    /* renamed from: e, reason: collision with root package name */
    b f53203e;

    /* renamed from: f, reason: collision with root package name */
    final CalendarConstraints f53204f;

    k(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f53200b = month;
        this.f53201c = dateSelector;
        this.f53204f = calendarConstraints;
        this.f53202d = dateSelector.j3();
    }

    private void e(Context context) {
        if (this.f53203e == null) {
            this.f53203e = new b(context);
        }
    }

    private boolean h(long j4) {
        Iterator<Long> it = this.f53201c.j3().iterator();
        while (it.hasNext()) {
            if (q.a(j4) == q.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(@q0 TextView textView, long j4) {
        a aVar;
        if (textView == null) {
            return;
        }
        if (this.f53204f.f().j1(j4)) {
            textView.setEnabled(true);
            aVar = h(j4) ? this.f53203e.f53092b : q.t().getTimeInMillis() == j4 ? this.f53203e.f53093c : this.f53203e.f53091a;
        } else {
            textView.setEnabled(false);
            aVar = this.f53203e.f53097g;
        }
        aVar.f(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j4) {
        if (Month.c(j4).equals(this.f53200b)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.b().a(this.f53200b.g(j4)) - materialCalendarGridView.getFirstVisiblePosition()), j4);
        }
    }

    int a(int i4) {
        return b() + (i4 - 1);
    }

    int b() {
        return this.f53200b.e();
    }

    @Override // android.widget.Adapter
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i4) {
        if (i4 < this.f53200b.e() || i4 > i()) {
            return null;
        }
        return Long.valueOf(this.f53200b.f(j(i4)));
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
            int r0 = s8.a.k.f91182m0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L79
            com.google.android.material.datepicker.Month r8 = r5.f53200b
            int r2 = r8.f53065f
            if (r7 < r2) goto L2d
            goto L79
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "\uf1b0"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f53200b
            long r7 = r8.f(r7)
            com.google.android.material.datepicker.Month r3 = r5.f53200b
            int r3 = r3.f53063d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.d()
            int r4 = r4.f53063d
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

    boolean f(int i4) {
        return i4 % this.f53200b.f53064e == 0;
    }

    boolean g(int i4) {
        return (i4 + 1) % this.f53200b.f53064e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f53200b.f53065f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4 / this.f53200b.f53064e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i() {
        return (this.f53200b.e() + this.f53200b.f53065f) - 1;
    }

    int j(int i4) {
        return (i4 - this.f53200b.e()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f53202d.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f53201c;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.j3().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f53202d = this.f53201c.j3();
        }
    }

    boolean n(int i4) {
        return i4 >= b() && i4 <= i();
    }
}
