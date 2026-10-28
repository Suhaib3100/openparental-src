package com.booking.rtlviewpager;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;

/* compiled from: PagerAdapterWrapper.java */
/* loaded from: classes3.dex */
class a extends androidx.viewpager.widget.a {

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final androidx.viewpager.widget.a f42776e;

    protected a(@o0 androidx.viewpager.widget.a aVar) {
        this.f42776e = aVar;
    }

    @Override // androidx.viewpager.widget.a
    public void e(ViewGroup viewGroup, int i4, Object obj) {
        this.f42776e.e(viewGroup, i4, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void g(ViewGroup viewGroup) {
        this.f42776e.g(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public int h() {
        return this.f42776e.h();
    }

    @Override // androidx.viewpager.widget.a
    public int i(Object obj) {
        return this.f42776e.i(obj);
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence j(int i4) {
        return this.f42776e.j(i4);
    }

    @Override // androidx.viewpager.widget.a
    public float k(int i4) {
        return this.f42776e.k(i4);
    }

    @Override // androidx.viewpager.widget.a
    public Object m(ViewGroup viewGroup, int i4) {
        return this.f42776e.m(viewGroup, i4);
    }

    @Override // androidx.viewpager.widget.a
    public boolean n(View view, Object obj) {
        return this.f42776e.n(view, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void o() {
        this.f42776e.o();
    }

    @Override // androidx.viewpager.widget.a
    public void p(DataSetObserver dataSetObserver) {
        this.f42776e.p(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.a
    public void q(Parcelable parcelable, ClassLoader classLoader) {
        this.f42776e.q(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable r() {
        return this.f42776e.r();
    }

    @Override // androidx.viewpager.widget.a
    public void t(ViewGroup viewGroup, int i4, Object obj) {
        this.f42776e.t(viewGroup, i4, obj);
    }

    @Override // androidx.viewpager.widget.a
    public void w(ViewGroup viewGroup) {
        this.f42776e.w(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public void x(DataSetObserver dataSetObserver) {
        this.f42776e.x(dataSetObserver);
    }

    @o0
    public androidx.viewpager.widget.a y() {
        return this.f42776e;
    }
}
