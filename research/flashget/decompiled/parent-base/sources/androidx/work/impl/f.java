package androidx.work.impl;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.r;
import androidx.work.s;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36171a = "androidx.work.impl.background.gcm.GcmScheduler";

    /* renamed from: b, reason: collision with root package name */
    private static final String f36172b = s.f("Schedulers");

    private f() {
    }

    @o0
    static e a(@o0 Context context, @o0 j workManager) {
        androidx.work.impl.background.systemjob.g gVar = new androidx.work.impl.background.systemjob.g(context, workManager);
        androidx.work.impl.utils.h.c(context, SystemJobService.class, true);
        s.c().a(f36172b, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return gVar;
    }

    public static void b(@o0 androidx.work.b configuration, @o0 WorkDatabase workDatabase, List<e> schedulers) {
        if (schedulers == null || schedulers.size() == 0) {
            return;
        }
        androidx.work.impl.model.s k4 = workDatabase.k();
        workDatabase.beginTransaction();
        try {
            List<r> t4 = k4.t(configuration.h());
            List<r> p4 = k4.p(200);
            if (t4 != null && t4.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<r> it = t4.iterator();
                while (it.hasNext()) {
                    k4.r(it.next().f36346a, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (t4 != null && t4.size() > 0) {
                r[] rVarArr = (r[]) t4.toArray(new r[t4.size()]);
                for (e eVar : schedulers) {
                    if (eVar.d()) {
                        eVar.c(rVarArr);
                    }
                }
            }
            if (p4 == null || p4.size() <= 0) {
                return;
            }
            r[] rVarArr2 = (r[]) p4.toArray(new r[p4.size()]);
            for (e eVar2 : schedulers) {
                if (!eVar2.d()) {
                    eVar2.c(rVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    @q0
    private static e c(@o0 Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            s.c().a(f36172b, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            s.c().a(f36172b, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
