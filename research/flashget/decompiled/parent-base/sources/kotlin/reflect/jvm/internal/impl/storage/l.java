package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SingleThreadValue.java */
/* loaded from: classes7.dex */
class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f78337a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f78338b = Thread.currentThread();

    l(T t4) {
        this.f78337a = t4;
    }

    public T a() {
        if (b()) {
            return this.f78337a;
        }
        throw new IllegalStateException(ProtectedSandApp.s("紪\u0001"));
    }

    public boolean b() {
        return this.f78338b == Thread.currentThread();
    }
}
