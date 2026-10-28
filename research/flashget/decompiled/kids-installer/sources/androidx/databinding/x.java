package androidx.databinding;

import androidx.annotation.q0;
import java.io.Serializable;

/* compiled from: ObservableField.java */
/* loaded from: classes3.dex */
public class x<T> extends b implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    static final long f6925q = 1;

    /* renamed from: p, reason: collision with root package name */
    private T f6926p;

    public x(T t5) {
        this.f6926p = t5;
    }

    @q0
    public T e() {
        return this.f6926p;
    }

    public void f(T t5) {
        if (t5 != this.f6926p) {
            this.f6926p = t5;
            c();
        }
    }

    public x() {
    }

    public x(u... uVarArr) {
        super(uVarArr);
    }
}
