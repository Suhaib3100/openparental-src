package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.e0;
import androidx.work.f;
import androidx.work.f0;
import androidx.work.h0;
import androidx.work.i0;
import androidx.work.impl.j;
import androidx.work.k;
import androidx.work.u;
import androidx.work.z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: RemoteWorkManager.java */
/* loaded from: classes3.dex */
public abstract class e {
    @c1({c1.a.LIBRARY_GROUP})
    protected e() {
    }

    @o0
    public static e o(@o0 Context context) {
        e K = j.H(context).K();
        if (K != null) {
            return K;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @o0
    public final d a(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 u work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @o0
    public abstract d b(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 List<u> work);

    @o0
    public final d c(@o0 u work) {
        return d(Collections.singletonList(work));
    }

    @o0
    public abstract d d(@o0 List<u> work);

    @o0
    public abstract ListenableFuture<Void> e();

    @o0
    public abstract ListenableFuture<Void> f(@o0 String tag);

    @o0
    public abstract ListenableFuture<Void> g(@o0 String uniqueWorkName);

    @o0
    public abstract ListenableFuture<Void> h(@o0 UUID id2);

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public abstract ListenableFuture<Void> i(@o0 e0 continuation);

    @o0
    public abstract ListenableFuture<Void> j(@o0 i0 request);

    @o0
    public abstract ListenableFuture<Void> k(@o0 List<i0> requests);

    @o0
    public abstract ListenableFuture<Void> l(@o0 String uniqueWorkName, @o0 androidx.work.j existingPeriodicWorkPolicy, @o0 z periodicWork);

    @o0
    public final ListenableFuture<Void> m(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 u work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @o0
    public abstract ListenableFuture<Void> n(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 List<u> work);

    @o0
    public abstract ListenableFuture<List<f0>> p(@o0 h0 workQuery);

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public abstract ListenableFuture<Void> q(@o0 UUID id2, @o0 f data);
}
