package v9;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Event.java */
/* loaded from: classes6.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f92841a;

    /* renamed from: b, reason: collision with root package name */
    private final T f92842b;

    public a(Class<T> cls, T t4) {
        cls.getClass();
        this.f92841a = cls;
        t4.getClass();
        this.f92842b = t4;
    }

    public T a() {
        return this.f92842b;
    }

    public Class<T> b() {
        return this.f92841a;
    }

    public String toString() {
        return String.format(ProtectedSandApp.s("㣉\u0001"), this.f92841a, this.f92842b);
    }
}
