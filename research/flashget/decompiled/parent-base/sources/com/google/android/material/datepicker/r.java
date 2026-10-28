package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.datepicker.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import s8.a;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes6.dex */
class r extends RecyclerView.h<b> {

    /* renamed from: b, reason: collision with root package name */
    private final f<?> f53222b;

    /* compiled from: YearGridAdapter.java */
    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f53223b;

        a(int i4) {
            this.f53223b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r.this.f53222b.H(r.this.f53222b.A().e(Month.b(this.f53223b, r.this.f53222b.C().f53062c)));
            r.this.f53222b.I(f.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    public static class b extends RecyclerView.e0 {

        /* renamed from: b, reason: collision with root package name */
        final TextView f53225b;

        b(TextView textView) {
            super(textView);
            this.f53225b = textView;
        }
    }

    r(f<?> fVar) {
        this.f53222b = fVar;
    }

    @o0
    private View.OnClickListener e(int i4) {
        return new a(i4);
    }

    int f(int i4) {
        return i4 - this.f53222b.A().k().f53063d;
    }

    int g(int i4) {
        return this.f53222b.A().k().f53063d + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f53222b.A().n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@o0 b bVar, int i4) {
        int g4 = g(i4);
        String string = bVar.f53225b.getContext().getString(a.m.B0);
        bVar.f53225b.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("\uf1c0"), Integer.valueOf(g4)));
        bVar.f53225b.setContentDescription(String.format(string, Integer.valueOf(g4)));
        com.google.android.material.datepicker.b B = this.f53222b.B();
        Calendar t4 = q.t();
        com.google.android.material.datepicker.a aVar = t4.get(1) == g4 ? B.f53096f : B.f53094d;
        Iterator<Long> it = this.f53222b.p().j3().iterator();
        while (it.hasNext()) {
            t4.setTimeInMillis(it.next().longValue());
            if (t4.get(1) == g4) {
                aVar = B.f53095e;
            }
        }
        aVar.f(bVar.f53225b);
        bVar.f53225b.setOnClickListener(new a(g4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f91200v0, viewGroup, false));
    }
}
