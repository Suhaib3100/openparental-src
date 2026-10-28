package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.k2;

/* compiled from: locks.kt */
/* loaded from: classes7.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f78335a = a.f78336a;

    /* compiled from: locks.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f78336a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final d a(@fg.m Runnable runnable, @fg.m ld.l<? super InterruptedException, k2> lVar) {
            if (runnable != null && lVar != null) {
                return new c(runnable, lVar);
            }
            return new d(null, 1, 0 == true ? 1 : 0);
        }
    }

    void lock();

    void unlock();
}
