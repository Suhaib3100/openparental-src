package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes4.dex */
abstract class n<S> extends Fragment {

    /* renamed from: o, reason: collision with root package name */
    protected final LinkedHashSet<m<S>> f13436o = new LinkedHashSet<>();

    n() {
    }

    boolean a(m<S> mVar) {
        return this.f13436o.add(mVar);
    }

    void b() {
        this.f13436o.clear();
    }

    abstract DateSelector<S> d();

    boolean e(m<S> mVar) {
        return this.f13436o.remove(mVar);
    }
}
