package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes6.dex */
abstract class n<S> extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedHashSet<m<S>> f53214b = new LinkedHashSet<>();

    n() {
    }

    boolean n(m<S> mVar) {
        return this.f53214b.add(mVar);
    }

    void o() {
        this.f53214b.clear();
    }

    abstract DateSelector<S> p();

    boolean q(m<S> mVar) {
        return this.f53214b.remove(mVar);
    }
}
