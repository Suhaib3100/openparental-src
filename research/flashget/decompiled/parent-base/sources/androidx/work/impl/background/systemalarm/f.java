package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.impl.model.r;
import androidx.work.s;

/* compiled from: SystemAlarmScheduler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class f implements androidx.work.impl.e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36095c = s.f("SystemAlarmScheduler");

    /* renamed from: b, reason: collision with root package name */
    private final Context f36096b;

    public f(@o0 Context context) {
        this.f36096b = context.getApplicationContext();
    }

    private void b(@o0 r workSpec) {
        s.c().a(f36095c, String.format("Scheduling work with workSpecId %s", workSpec.f36346a), new Throwable[0]);
        this.f36096b.startService(b.f(this.f36096b, workSpec.f36346a));
    }

    @Override // androidx.work.impl.e
    public void a(@o0 String workSpecId) {
        this.f36096b.startService(b.g(this.f36096b, workSpecId));
    }

    @Override // androidx.work.impl.e
    public void c(@o0 r... workSpecs) {
        for (r rVar : workSpecs) {
            b(rVar);
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return true;
    }
}
