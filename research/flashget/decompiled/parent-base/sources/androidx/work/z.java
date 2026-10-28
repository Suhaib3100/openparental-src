package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.work.i0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest.java */
/* loaded from: classes3.dex */
public final class z extends i0 {

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f36620g = 900000;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f36621h = 300000;

    z(a builder) {
        super(builder.f35996b, builder.f35997c, builder.f35998d);
    }

    /* compiled from: PeriodicWorkRequest.java */
    public static final class a extends i0.a<a, z> {
        public a(@o0 Class<? extends ListenableWorker> workerClass, long repeatInterval, @o0 TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.f35997c.f(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        @Override // androidx.work.i0.a
        @o0
        a d() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.i0.a
        @o0
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public z c() {
            if (this.f35995a && this.f35997c.f36355j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (this.f35997c.f36362q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new z(this);
        }

        @o0
        a s() {
            return this;
        }

        @x0(26)
        public a(@o0 Class<? extends ListenableWorker> workerClass, @o0 Duration repeatInterval) {
            super(workerClass);
            long millis;
            androidx.work.impl.model.r rVar = this.f35997c;
            millis = repeatInterval.toMillis();
            rVar.f(millis);
        }

        public a(@o0 Class<? extends ListenableWorker> workerClass, long repeatInterval, @o0 TimeUnit repeatIntervalTimeUnit, long flexInterval, @o0 TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.f35997c.g(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        @x0(26)
        public a(@o0 Class<? extends ListenableWorker> workerClass, @o0 Duration repeatInterval, @o0 Duration flexInterval) {
            super(workerClass);
            long millis;
            long millis2;
            androidx.work.impl.model.r rVar = this.f35997c;
            millis = repeatInterval.toMillis();
            millis2 = flexInterval.toMillis();
            rVar.g(millis, millis2);
        }
    }
}
