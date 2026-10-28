package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class j<S> extends n<S> {

    /* renamed from: s, reason: collision with root package name */
    private static final String f13416s = ProtectedSandApp.s("㌥");

    /* renamed from: t, reason: collision with root package name */
    private static final String f13417t = ProtectedSandApp.s("㌦");

    /* renamed from: u, reason: collision with root package name */
    private static final String f13418u = ProtectedSandApp.s("㌧");

    /* renamed from: p, reason: collision with root package name */
    @h1
    private int f13419p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private DateSelector<S> f13420q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private CalendarConstraints f13421r;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes3.dex */
    class a extends m<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.m
        public void a() {
            Iterator<m<S>> it = j.this.f13436o.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.m
        public void b(S s5) {
            Iterator<m<S>> it = j.this.f13436o.iterator();
            while (it.hasNext()) {
                it.next().b(s5);
            }
        }
    }

    @o0
    static <T> j<T> f(DateSelector<T> dateSelector, @h1 int i5, @o0 CalendarConstraints calendarConstraints) {
        j<T> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("㌛"), i5);
        bundle.putParcelable(ProtectedSandApp.s("㌜"), dateSelector);
        bundle.putParcelable(ProtectedSandApp.s("㌝"), calendarConstraints);
        jVar.setArguments(bundle);
        return jVar;
    }

    @Override // com.google.android.material.datepicker.n
    @o0
    public DateSelector<S> d() {
        DateSelector<S> dateSelector = this.f13420q;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㌞"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13419p = bundle.getInt(ProtectedSandApp.s("㌟"));
        this.f13420q = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("㌠"));
        this.f13421r = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("㌡"));
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        return this.f13420q.m0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f13419p)), viewGroup, bundle, this.f13421r, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("㌢"), this.f13419p);
        bundle.putParcelable(ProtectedSandApp.s("㌣"), this.f13420q);
        bundle.putParcelable(ProtectedSandApp.s("㌤"), this.f13421r);
    }
}
