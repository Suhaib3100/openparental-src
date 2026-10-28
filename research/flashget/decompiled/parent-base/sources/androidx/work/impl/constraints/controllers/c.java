package androidx.work.impl.constraints.controllers;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.model.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* loaded from: classes3.dex */
public abstract class c<T> implements androidx.work.impl.constraints.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f36116a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private T f36117b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.impl.constraints.trackers.d<T> f36118c;

    /* renamed from: d, reason: collision with root package name */
    private a f36119d;

    /* compiled from: ConstraintController.java */
    public interface a {
        void a(@o0 List<String> workSpecIds);

        void b(@o0 List<String> workSpecIds);
    }

    c(androidx.work.impl.constraints.trackers.d<T> tracker) {
        this.f36118c = tracker;
    }

    private void h(@q0 a callback, @q0 T currentValue) {
        if (this.f36116a.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || c(currentValue)) {
            callback.b(this.f36116a);
        } else {
            callback.a(this.f36116a);
        }
    }

    @Override // androidx.work.impl.constraints.a
    public void a(@q0 T newValue) {
        this.f36117b = newValue;
        h(this.f36119d, newValue);
    }

    abstract boolean b(@o0 r workSpec);

    abstract boolean c(@o0 T currentValue);

    public boolean d(@o0 String workSpecId) {
        T t4 = this.f36117b;
        return t4 != null && c(t4) && this.f36116a.contains(workSpecId);
    }

    public void e(@o0 Iterable<r> workSpecs) {
        this.f36116a.clear();
        for (r rVar : workSpecs) {
            if (b(rVar)) {
                this.f36116a.add(rVar.f36346a);
            }
        }
        if (this.f36116a.isEmpty()) {
            this.f36118c.c(this);
        } else {
            this.f36118c.a(this);
        }
        h(this.f36119d, this.f36117b);
    }

    public void f() {
        if (this.f36116a.isEmpty()) {
            return;
        }
        this.f36116a.clear();
        this.f36118c.c(this);
    }

    public void g(@q0 a callback) {
        if (this.f36119d != callback) {
            this.f36119d = callback;
            h(callback, this.f36117b);
        }
    }
}
