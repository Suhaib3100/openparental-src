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
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class j<S> extends n<S> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f53192f = ProtectedSandApp.s("\uf1ac");

    /* renamed from: g, reason: collision with root package name */
    private static final String f53193g = ProtectedSandApp.s("\uf1ad");

    /* renamed from: h, reason: collision with root package name */
    private static final String f53194h = ProtectedSandApp.s("\uf1ae");

    /* renamed from: c, reason: collision with root package name */
    @h1
    private int f53195c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private DateSelector<S> f53196d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private CalendarConstraints f53197e;

    /* compiled from: MaterialTextInputPicker.java */
    class a extends m<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.m
        public void a() {
            Iterator<m<S>> it = j.this.f53214b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.m
        public void b(S s4) {
            Iterator<m<S>> it = j.this.f53214b.iterator();
            while (it.hasNext()) {
                it.next().b(s4);
            }
        }
    }

    @o0
    static <T> j<T> r(DateSelector<T> dateSelector, @h1 int i4, @o0 CalendarConstraints calendarConstraints) {
        j<T> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("\uf1ac"), i4);
        bundle.putParcelable(ProtectedSandApp.s("\uf1ad"), dateSelector);
        bundle.putParcelable(ProtectedSandApp.s("\uf1ae"), calendarConstraints);
        jVar.setArguments(bundle);
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f53195c = bundle.getInt(ProtectedSandApp.s("\uf1ac"));
        this.f53196d = (DateSelector) bundle.getParcelable(ProtectedSandApp.s("\uf1ad"));
        this.f53197e = (CalendarConstraints) bundle.getParcelable(ProtectedSandApp.s("\uf1ae"));
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        return this.f53196d.T2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f53195c)), viewGroup, bundle, this.f53197e, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("\uf1ac"), this.f53195c);
        bundle.putParcelable(ProtectedSandApp.s("\uf1ad"), this.f53196d);
        bundle.putParcelable(ProtectedSandApp.s("\uf1ae"), this.f53197e);
    }

    @Override // com.google.android.material.datepicker.n
    @o0
    public DateSelector<S> p() {
        DateSelector<S> dateSelector = this.f53196d;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\uf1af"));
    }
}
