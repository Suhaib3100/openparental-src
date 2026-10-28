package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.m2;

/* compiled from: locks.kt */
/* loaded from: classes5.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f26327a = a.f26328a;

    /* compiled from: locks.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26328a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final d a(@d5.e Runnable runnable, @d5.e q3.l<? super InterruptedException, m2> lVar) {
            if (runnable != null && lVar != null) {
                return new c(runnable, lVar);
            }
            return new d(null, 1, 0 == true ? 1 : 0);
        }
    }

    void lock();

    void unlock();
}
