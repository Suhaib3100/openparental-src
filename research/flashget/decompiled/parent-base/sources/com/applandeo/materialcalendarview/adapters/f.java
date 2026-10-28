package com.applandeo.materialcalendarview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.applandeo.materialcalendarview.extensions.CalendarGridView;
import com.applandeo.materialcalendarview.n;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import s3.g;
import t3.o;

/* compiled from: CalendarPageAdapter.java */
/* loaded from: classes3.dex */
public class f extends androidx.viewpager.widget.a {

    /* renamed from: e, reason: collision with root package name */
    private Context f41883e;

    /* renamed from: f, reason: collision with root package name */
    private CalendarGridView f41884f;

    /* renamed from: g, reason: collision with root package name */
    private t3.f f41885g;

    /* renamed from: h, reason: collision with root package name */
    private int f41886h;

    public f(Context context, t3.f fVar) {
        this.f41883e = context;
        this.f41885g = fVar;
        B();
    }

    private void B() {
        if (this.f41885g.I() != null) {
            this.f41885g.I().a(this.f41885g.M().size() > 0);
        }
    }

    private void C(int i4) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = (Calendar) this.f41885g.r().clone();
        calendar.add(2, i4);
        calendar.set(5, 1);
        int i5 = calendar.get(7);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        calendar.add(5, -(((i5 >= firstDayOfWeek ? 0 : 7) + i5) - firstDayOfWeek));
        while (arrayList.size() < 42) {
            arrayList.add(calendar.getTime());
            calendar.add(5, 1);
        }
        this.f41886h = calendar.get(2) - 1;
        this.f41884f.setAdapter((ListAdapter) new e(this, this.f41883e, this.f41885g, arrayList, this.f41886h));
    }

    public List<o> A() {
        return this.f41885g.M();
    }

    public void D(o oVar) {
        this.f41885g.E0(oVar);
        B();
    }

    @Override // androidx.viewpager.widget.a
    public void e(ViewGroup viewGroup, int i4, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int h() {
        return t3.f.O;
    }

    @Override // androidx.viewpager.widget.a
    public int i(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public Object m(ViewGroup viewGroup, int i4) {
        this.f41884f = (CalendarGridView) ((LayoutInflater) this.f41883e.getSystemService(ProtectedSandApp.s("ߺ"))).inflate(n.j.E, (ViewGroup) null);
        C(i4);
        this.f41884f.setOnItemClickListener(new g(this, this.f41885g, this.f41886h));
        viewGroup.addView(this.f41884f);
        return this.f41884f;
    }

    @Override // androidx.viewpager.widget.a
    public boolean n(View view, Object obj) {
        return view == obj;
    }

    public void y(o oVar) {
        if (this.f41885g.M().contains(oVar)) {
            this.f41885g.M().remove(oVar);
            B();
        } else {
            this.f41885g.M().add(oVar);
            B();
        }
    }

    public o z() {
        return this.f41885g.M().get(0);
    }
}
