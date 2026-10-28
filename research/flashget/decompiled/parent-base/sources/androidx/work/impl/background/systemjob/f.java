package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.work.e;
import androidx.work.impl.model.r;
import androidx.work.s;
import androidx.work.t;
import java.util.Iterator;

/* compiled from: SystemJobInfoConverter.java */
@c1({c1.a.LIBRARY_GROUP})
@x0(api = 23)
/* loaded from: classes3.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f36103a;

    /* renamed from: c, reason: collision with root package name */
    static final String f36101c = "EXTRA_WORK_SPEC_ID";

    /* renamed from: d, reason: collision with root package name */
    static final String f36102d = "EXTRA_IS_PERIODIC";

    /* renamed from: b, reason: collision with root package name */
    private static final String f36100b = s.f("SystemJobInfoConverter");

    /* compiled from: SystemJobInfoConverter.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36104a;

        static {
            int[] iArr = new int[t.values().length];
            f36104a = iArr;
            try {
                iArr[t.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36104a[t.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36104a[t.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36104a[t.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36104a[t.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @m1(otherwise = 3)
    f(@o0 Context context) {
        this.f36103a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    @x0(24)
    private static JobInfo.TriggerContentUri b(e.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(t networkType) {
        int i4 = a.f36104a[networkType.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 == 4) {
            return 3;
        }
        if (i4 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        s.c().a(f36100b, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
        return 1;
    }

    static void d(@o0 JobInfo.Builder builder, @o0 t networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != t.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(r workSpec, int jobId) {
        androidx.work.d dVar = workSpec.f36355j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.f36346a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.d());
        JobInfo.Builder extras = new JobInfo.Builder(jobId, this.f36103a).setRequiresCharging(dVar.g()).setRequiresDeviceIdle(dVar.h()).setExtras(persistableBundle);
        d(extras, dVar.b());
        if (!dVar.h()) {
            extras.setBackoffCriteria(workSpec.f36358m, workSpec.f36357l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.f36362q) {
            extras.setImportantWhileForeground(true);
        }
        if (dVar.e()) {
            Iterator<e.a> it = dVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(dVar.c());
            extras.setTriggerContentMaxDelay(dVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f());
            extras.setRequiresStorageNotLow(dVar.i());
        }
        boolean z4 = workSpec.f36356k > 0;
        boolean z5 = max > 0;
        if (androidx.core.os.b.i() && workSpec.f36362q && !z4 && !z5) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
