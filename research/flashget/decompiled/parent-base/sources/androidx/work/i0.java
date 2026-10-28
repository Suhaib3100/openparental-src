package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.work.f0;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkRequest.java */
/* loaded from: classes3.dex */
public abstract class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f35989d = 30000;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f35990e = 18000000;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f35991f = 10000;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private UUID f35992a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private androidx.work.impl.model.r f35993b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private Set<String> f35994c;

    /* compiled from: WorkRequest.java */
    public static abstract class a<B extends a<?, ?>, W extends i0> {

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.model.r f35997c;

        /* renamed from: e, reason: collision with root package name */
        Class<? extends ListenableWorker> f35999e;

        /* renamed from: a, reason: collision with root package name */
        boolean f35995a = false;

        /* renamed from: d, reason: collision with root package name */
        Set<String> f35998d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f35996b = UUID.randomUUID();

        a(@o0 Class<? extends ListenableWorker> workerClass) {
            this.f35999e = workerClass;
            this.f35997c = new androidx.work.impl.model.r(this.f35996b.toString(), workerClass.getName());
            a(workerClass.getName());
        }

        @o0
        public final B a(@o0 String tag) {
            this.f35998d.add(tag);
            return d();
        }

        @o0
        public final W b() {
            W c5 = c();
            d dVar = this.f35997c.f36355j;
            boolean z4 = dVar.e() || dVar.f() || dVar.g() || dVar.h();
            androidx.work.impl.model.r rVar = this.f35997c;
            if (rVar.f36362q) {
                if (z4) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (rVar.f36352g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f35996b = UUID.randomUUID();
            androidx.work.impl.model.r rVar2 = new androidx.work.impl.model.r(this.f35997c);
            this.f35997c = rVar2;
            rVar2.f36346a = this.f35996b.toString();
            return c5;
        }

        @o0
        abstract W c();

        @o0
        abstract B d();

        @o0
        public final B e(long duration, @o0 TimeUnit timeUnit) {
            this.f35997c.f36360o = timeUnit.toMillis(duration);
            return d();
        }

        @o0
        @x0(26)
        public final B f(@o0 Duration duration) {
            long millis;
            androidx.work.impl.model.r rVar = this.f35997c;
            millis = duration.toMillis();
            rVar.f36360o = millis;
            return d();
        }

        @o0
        public final B g(@o0 androidx.work.a backoffPolicy, long backoffDelay, @o0 TimeUnit timeUnit) {
            this.f35995a = true;
            androidx.work.impl.model.r rVar = this.f35997c;
            rVar.f36357l = backoffPolicy;
            rVar.e(timeUnit.toMillis(backoffDelay));
            return d();
        }

        @o0
        @x0(26)
        public final B h(@o0 androidx.work.a backoffPolicy, @o0 Duration duration) {
            long millis;
            this.f35995a = true;
            androidx.work.impl.model.r rVar = this.f35997c;
            rVar.f36357l = backoffPolicy;
            millis = duration.toMillis();
            rVar.e(millis);
            return d();
        }

        @o0
        public final B i(@o0 d constraints) {
            this.f35997c.f36355j = constraints;
            return d();
        }

        @o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B j(@o0 y policy) {
            androidx.work.impl.model.r rVar = this.f35997c;
            rVar.f36362q = true;
            rVar.f36363r = policy;
            return d();
        }

        @o0
        public B k(long duration, @o0 TimeUnit timeUnit) {
            this.f35997c.f36352g = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f35997c.f36352g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @o0
        @x0(26)
        public B l(@o0 Duration duration) {
            long millis;
            androidx.work.impl.model.r rVar = this.f35997c;
            millis = duration.toMillis();
            rVar.f36352g = millis;
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f35997c.f36352g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @m1
        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public final B m(int runAttemptCount) {
            this.f35997c.f36356k = runAttemptCount;
            return d();
        }

        @m1
        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public final B n(@o0 f0.a state) {
            this.f35997c.f36347b = state;
            return d();
        }

        @o0
        public final B o(@o0 f inputData) {
            this.f35997c.f36350e = inputData;
            return d();
        }

        @m1
        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public final B p(long periodStartTime, @o0 TimeUnit timeUnit) {
            this.f35997c.f36359n = timeUnit.toMillis(periodStartTime);
            return d();
        }

        @m1
        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public final B q(long scheduleRequestedAt, @o0 TimeUnit timeUnit) {
            this.f35997c.f36361p = timeUnit.toMillis(scheduleRequestedAt);
            return d();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected i0(@o0 UUID id2, @o0 androidx.work.impl.model.r workSpec, @o0 Set<String> tags) {
        this.f35992a = id2;
        this.f35993b = workSpec;
        this.f35994c = tags;
    }

    @o0
    public UUID a() {
        return this.f35992a;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public String b() {
        return this.f35992a.toString();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public Set<String> c() {
        return this.f35994c;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.impl.model.r d() {
        return this.f35993b;
    }
}
