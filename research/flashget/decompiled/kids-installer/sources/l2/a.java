package l2;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Event.java */
/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f29107a;

    /* renamed from: b, reason: collision with root package name */
    private final T f29108b;

    public a(Class<T> cls, T t5) {
        cls.getClass();
        this.f29107a = cls;
        t5.getClass();
        this.f29108b = t5;
    }

    public T a() {
        return this.f29108b;
    }

    public Class<T> b() {
        return this.f29107a;
    }

    public String toString() {
        return String.format(ProtectedSandApp.s("᭐"), this.f29107a, this.f29108b);
    }
}
