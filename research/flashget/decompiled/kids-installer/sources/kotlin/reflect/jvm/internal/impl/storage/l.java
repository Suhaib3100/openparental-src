package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SingleThreadValue.java */
/* loaded from: classes5.dex */
class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f26329a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f26330b = Thread.currentThread();

    l(T t5) {
        this.f26329a = t5;
    }

    public T a() {
        if (b()) {
            return this.f26329a;
        }
        throw new IllegalStateException(ProtectedSandApp.s("咷"));
    }

    public boolean b() {
        return this.f26330b == Thread.currentThread();
    }
}
