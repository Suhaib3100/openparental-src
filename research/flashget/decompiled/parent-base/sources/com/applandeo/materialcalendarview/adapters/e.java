package com.applandeo.materialcalendarview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.o0;
import com.annimon.stream.function.z0;
import com.annimon.stream.p;
import com.applandeo.materialcalendarview.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import t3.h;
import t3.j;
import t3.m;
import t3.n;
import t3.o;

/* compiled from: CalendarDayAdapter.java */
/* loaded from: classes3.dex */
class e extends ArrayAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    private f f41878b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f41879c;

    /* renamed from: d, reason: collision with root package name */
    private int f41880d;

    /* renamed from: e, reason: collision with root package name */
    private Calendar f41881e;

    /* renamed from: f, reason: collision with root package name */
    private t3.f f41882f;

    e(f fVar, Context context, t3.f fVar2, ArrayList<Date> arrayList, int i4) {
        super(context, fVar2.y(), arrayList);
        this.f41881e = h.a();
        this.f41878b = fVar;
        this.f41882f = fVar2;
        this.f41880d = i4 < 0 ? 11 : i4;
        this.f41879c = LayoutInflater.from(context);
    }

    private boolean e(Calendar calendar) {
        return !this.f41882f.n().contains(calendar);
    }

    private boolean f(Calendar calendar) {
        return calendar.get(2) == this.f41880d;
    }

    private boolean g(Calendar calendar) {
        return m.d(calendar, this.f41882f);
    }

    private boolean h(Calendar calendar) {
        return this.f41882f.j() != 0 && calendar.get(2) == this.f41880d && this.f41878b.A().contains(new o(calendar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i(Calendar calendar, com.applandeo.materialcalendarview.m mVar) {
        return mVar.a().equals(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ImageView imageView, Calendar calendar, com.applandeo.materialcalendarview.m mVar) {
        n.a(imageView, mVar.b());
        if (f(calendar) && e(calendar)) {
            return;
        }
        imageView.setAlpha(0.12f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k(Calendar calendar, o oVar) {
        return oVar.a().equals(calendar);
    }

    private void m(final ImageView imageView, final Calendar calendar) {
        if (this.f41882f.p() == null || !this.f41882f.q()) {
            imageView.setVisibility(8);
        } else {
            p.N0(this.f41882f.p()).t(new z0() { // from class: com.applandeo.materialcalendarview.adapters.c
                @Override // com.annimon.stream.function.z0
                public final boolean test(Object obj) {
                    boolean i4;
                    i4 = e.i(calendar, (com.applandeo.materialcalendarview.m) obj);
                    return i4;
                }
            }).z().d(new com.annimon.stream.function.h() { // from class: com.applandeo.materialcalendarview.adapters.d
                @Override // com.annimon.stream.function.h
                public final void accept(Object obj) {
                    e.this.j(imageView, calendar, (com.applandeo.materialcalendarview.m) obj);
                }
            });
        }
    }

    private boolean n(Calendar calendar) {
        return (this.f41882f.B() == null || !calendar.before(this.f41882f.B())) && (this.f41882f.z() == null || !calendar.after(this.f41882f.z()));
    }

    private void o(final TextView textView, final Calendar calendar) {
        if (!f(calendar)) {
            j.e(textView, this.f41882f.h(), 0, n.g.f42222v0);
            return;
        }
        if (!n(calendar)) {
            j.e(textView, this.f41882f.k(), 0, n.g.f42222v0);
            return;
        }
        if (h(calendar)) {
            p.N0(this.f41878b.A()).t(new z0() { // from class: com.applandeo.materialcalendarview.adapters.a
                @Override // com.annimon.stream.function.z0
                public final boolean test(Object obj) {
                    boolean k4;
                    k4 = e.k(calendar, (o) obj);
                    return k4;
                }
            }).z().i(new com.annimon.stream.function.h() { // from class: com.applandeo.materialcalendarview.adapters.b
                @Override // com.annimon.stream.function.h
                public final void accept(Object obj) {
                    ((o) obj).c(textView);
                }
            });
            j.i(textView, this.f41882f);
        } else if (!e(calendar)) {
            j.e(textView, this.f41882f.o(), 0, n.g.f42222v0);
        } else if (g(calendar)) {
            j.c(calendar, this.f41881e, textView, this.f41882f);
        } else {
            j.c(calendar, this.f41881e, textView, this.f41882f);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @o0
    public View getView(int i4, View view, @o0 ViewGroup viewGroup) {
        if (view == null) {
            view = this.f41879c.inflate(this.f41882f.y(), viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(n.h.O);
        ImageView imageView = (ImageView) view.findViewById(n.h.N);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime((Date) getItem(i4));
        if (imageView != null) {
            m(imageView, gregorianCalendar);
        }
        o(textView, gregorianCalendar);
        textView.setText(String.valueOf(gregorianCalendar.get(5)));
        return view;
    }
}
