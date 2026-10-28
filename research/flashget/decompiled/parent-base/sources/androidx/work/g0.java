package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.view.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes3.dex */
public abstract class g0 {
    @c1({c1.a.LIBRARY_GROUP})
    protected g0() {
    }

    public static void A(@o0 Context context, @o0 b configuration) {
        androidx.work.impl.j.A(context, configuration);
    }

    @o0
    @Deprecated
    public static g0 o() {
        androidx.work.impl.j G = androidx.work.impl.j.G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @o0
    public static g0 p(@o0 Context context) {
        return androidx.work.impl.j.H(context);
    }

    @o0
    public abstract w B();

    @o0
    public final e0 a(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 u work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @o0
    public abstract e0 b(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 List<u> work);

    @o0
    public final e0 c(@o0 u work) {
        return d(Collections.singletonList(work));
    }

    @o0
    public abstract e0 d(@o0 List<u> work);

    @o0
    public abstract w e();

    @o0
    public abstract w f(@o0 String tag);

    @o0
    public abstract w g(@o0 String uniqueWorkName);

    @o0
    public abstract w h(@o0 UUID id2);

    @o0
    public abstract PendingIntent i(@o0 UUID id2);

    @o0
    public final w j(@o0 i0 workRequest) {
        return k(Collections.singletonList(workRequest));
    }

    @o0
    public abstract w k(@o0 List<? extends i0> requests);

    @o0
    public abstract w l(@o0 String uniqueWorkName, @o0 j existingPeriodicWorkPolicy, @o0 z periodicWork);

    @o0
    public w m(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 u work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @o0
    public abstract w n(@o0 String uniqueWorkName, @o0 k existingWorkPolicy, @o0 List<u> work);

    @o0
    public abstract ListenableFuture<Long> q();

    @o0
    public abstract LiveData<Long> r();

    @o0
    public abstract ListenableFuture<f0> s(@o0 UUID id2);

    @o0
    public abstract LiveData<f0> t(@o0 UUID id2);

    @o0
    public abstract ListenableFuture<List<f0>> u(@o0 h0 workQuery);

    @o0
    public abstract ListenableFuture<List<f0>> v(@o0 String tag);

    @o0
    public abstract LiveData<List<f0>> w(@o0 String tag);

    @o0
    public abstract ListenableFuture<List<f0>> x(@o0 String uniqueWorkName);

    @o0
    public abstract LiveData<List<f0>> y(@o0 String uniqueWorkName);

    @o0
    public abstract LiveData<List<f0>> z(@o0 h0 workQuery);
}
