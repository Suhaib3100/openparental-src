package androidx.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Pools.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/core/util/v;", "", "<init>", "()V", "a", "b", "c", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    /* compiled from: Pools.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/core/util/v$a;", "", "T", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<T> {
        @fg.m
        T acquire();

        boolean release(@fg.l T instance);
    }

    /* compiled from: Pools.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/core/util/v$b;", "", "T", "Landroidx/core/util/v$a;", "", "maxPoolSize", "<init>", "(I)V", "instance", "", "a", "(Ljava/lang/Object;)Z", "acquire", "()Ljava/lang/Object;", "release", "", "[Ljava/lang/Object;", "pool", "b", "I", "poolSize", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object[] pool;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int poolSize;

        public b(@androidx.annotation.g0(from = 1) int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.pool = new Object[i4];
        }

        private final boolean a(T instance) {
            int i4 = this.poolSize;
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.pool[i5] == instance) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.v.a
        @fg.m
        public T acquire() {
            int i4 = this.poolSize;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            T t4 = (T) this.pool[i5];
            kotlin.jvm.internal.l0.n(t4, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i5] = null;
            this.poolSize--;
            return t4;
        }

        @Override // androidx.core.util.v.a
        public boolean release(@fg.l T instance) {
            kotlin.jvm.internal.l0.p(instance, "instance");
            if (a(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i4 = this.poolSize;
            Object[] objArr = this.pool;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = instance;
            this.poolSize = i4 + 1;
            return true;
        }
    }

    /* compiled from: Pools.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/core/util/v$c;", "", "T", "Landroidx/core/util/v$b;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "lock", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object lock;

        public c(int i4) {
            super(i4);
            this.lock = new Object();
        }

        @Override // androidx.core.util.v.b, androidx.core.util.v.a
        @fg.m
        public T acquire() {
            T t4;
            synchronized (this.lock) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // androidx.core.util.v.b, androidx.core.util.v.a
        public boolean release(@fg.l T instance) {
            boolean release;
            kotlin.jvm.internal.l0.p(instance, "instance");
            synchronized (this.lock) {
                release = super.release(instance);
            }
            return release;
        }
    }

    private v() {
    }
}
