package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.datepicker.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import n1.a;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes3.dex */
class r extends RecyclerView.h<b> {

    /* renamed from: d, reason: collision with root package name */
    private final f<?> f13443d;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13444o;

        a(int i5) {
            this.f13444o = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r.this.f13443d.w(r.this.f13443d.p().e(Month.h(this.f13444o, r.this.f13443d.r().f13309p)));
            r.this.f13443d.x(f.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    public static class b extends RecyclerView.d0 {
        final TextView I;

        b(TextView textView) {
            super(textView);
            this.I = textView;
        }
    }

    r(f<?> fVar) {
        this.f13443d = fVar;
    }

    @o0
    private View.OnClickListener K(int i5) {
        return new a(i5);
    }

    int L(int i5) {
        return i5 - this.f13443d.p().j().f13310q;
    }

    int M(int i5) {
        return this.f13443d.p().j().f13310q + i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void x(@o0 b bVar, int i5) {
        int M = M(i5);
        String string = bVar.I.getContext().getString(a.m.B0);
        bVar.I.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("⛡"), Integer.valueOf(M)));
        bVar.I.setContentDescription(String.format(string, Integer.valueOf(M)));
        com.google.android.material.datepicker.b q5 = this.f13443d.q();
        Calendar t5 = q.t();
        com.google.android.material.datepicker.a aVar = t5.get(1) == M ? q5.f13343f : q5.f13341d;
        Iterator<Long> it = this.f13443d.d().M0().iterator();
        while (it.hasNext()) {
            t5.setTimeInMillis(it.next().longValue());
            if (t5.get(1) == M) {
                aVar = q5.f13342e;
            }
        }
        aVar.f(bVar.I);
        bVar.I.setOnClickListener(new a(M));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b z(@o0 ViewGroup viewGroup, int i5) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f29928v0, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f13443d.p().k();
    }
}
