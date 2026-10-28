package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.i;
import androidx.work.impl.model.j;
import androidx.work.impl.model.m;
import androidx.work.impl.model.r;
import androidx.work.impl.model.v;
import androidx.work.s;
import java.util.List;
import java.util.concurrent.TimeUnit;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: h, reason: collision with root package name */
    private static final String f36576h = s.f("DiagnosticsWrkr");

    public DiagnosticsWorker(@o0 Context context, @o0 WorkerParameters parameters) {
        super(context, parameters);
    }

    @o0
    private static String A(@o0 m workNameDao, @o0 v workTagDao, @o0 j systemIdInfoDao, @o0 List<r> workSpecs) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (r rVar : workSpecs) {
            i a5 = systemIdInfoDao.a(rVar.f36346a);
            sb.append(z(rVar, TextUtils.join(",", workNameDao.b(rVar.f36346a)), a5 != null ? Integer.valueOf(a5.f36323b) : null, TextUtils.join(",", workTagDao.a(rVar.f36346a))));
        }
        return sb.toString();
    }

    @o0
    private static String z(@o0 r workSpec, @q0 String name, @q0 Integer systemId, @o0 String tags) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.f36346a, workSpec.f36348c, systemId, workSpec.f36347b.name(), name, tags);
    }

    @Override // androidx.work.Worker
    @o0
    public ListenableWorker.a y() {
        WorkDatabase M = androidx.work.impl.j.H(a()).M();
        androidx.work.impl.model.s k4 = M.k();
        m i4 = M.i();
        v l4 = M.l();
        j h4 = M.h();
        List<r> d5 = k4.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<r> x4 = k4.x();
        List<r> p4 = k4.p(200);
        if (d5 != null && !d5.isEmpty()) {
            s c5 = s.c();
            String str = f36576h;
            c5.d(str, "Recently completed work:\n\n", new Throwable[0]);
            s.c().d(str, A(i4, l4, h4, d5), new Throwable[0]);
        }
        if (x4 != null && !x4.isEmpty()) {
            s c6 = s.c();
            String str2 = f36576h;
            c6.d(str2, "Running work:\n\n", new Throwable[0]);
            s.c().d(str2, A(i4, l4, h4, x4), new Throwable[0]);
        }
        if (p4 != null && !p4.isEmpty()) {
            s c7 = s.c();
            String str3 = f36576h;
            c7.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            s.c().d(str3, A(i4, l4, h4, p4), new Throwable[0]);
        }
        return new ListenableWorker.a.c();
    }
}
