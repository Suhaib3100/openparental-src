package androidx.work.impl;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.room.b2;
import androidx.room.c2;
import androidx.room.m;
import androidx.room.u2;
import androidx.work.impl.h;
import androidx.work.impl.model.o;
import androidx.work.impl.model.p;
import androidx.work.impl.model.r;
import androidx.work.impl.model.s;
import androidx.work.impl.model.u;
import androidx.work.impl.model.v;
import androidx.work.impl.model.x;
import f3.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@m(entities = {androidx.work.impl.model.a.class, r.class, u.class, androidx.work.impl.model.i.class, androidx.work.impl.model.l.class, o.class, androidx.work.impl.model.d.class}, version = 12)
@u2({androidx.work.f.class, x.class})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class WorkDatabase extends c2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36000a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";

    /* renamed from: b, reason: collision with root package name */
    private static final String f36001b = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

    /* renamed from: c, reason: collision with root package name */
    private static final long f36002c = TimeUnit.DAYS.toMillis(1);

    class a implements e.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36003a;

        a(final Context val$context) {
            this.f36003a = val$context;
        }

        @Override // f3.e.c
        @o0
        public f3.e a(@o0 e.b configuration) {
            e.b.a a5 = e.b.a(this.f36003a);
            a5.d(configuration.name).c(configuration.callback).e(true);
            return new androidx.sqlite.db.framework.f().a(a5.b());
        }
    }

    class b extends c2.b {
        b() {
        }

        @Override // androidx.room.c2.b
        public void c(@o0 f3.d db2) {
            super.c(db2);
            db2.R();
            try {
                db2.b0(WorkDatabase.e());
                db2.G0();
            } finally {
                db2.Y0();
            }
        }
    }

    @o0
    public static WorkDatabase a(@o0 final Context context, @o0 Executor queryExecutor, boolean useTestDatabase) {
        c2.a a5;
        if (useTestDatabase) {
            a5 = b2.c(context, WorkDatabase.class).e();
        } else {
            a5 = b2.a(context, WorkDatabase.class, i.d());
            a5.q(new a(context));
        }
        return (WorkDatabase) a5.v(queryExecutor).b(new b()).c(h.f36244y).c(new h.C0642h(context, 2, 3)).c(h.f36245z).c(h.A).c(new h.C0642h(context, 5, 6)).c(h.B).c(h.C).c(h.D).c(new h.i(context)).c(new h.C0642h(context, 10, 11)).c(h.E).n().f();
    }

    static c2.b c() {
        return new b();
    }

    static long d() {
        return System.currentTimeMillis() - f36002c;
    }

    @o0
    static String e() {
        return android.support.v4.media.session.b.a(new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "), d(), " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
    }

    @o0
    public abstract androidx.work.impl.model.b b();

    @o0
    public abstract androidx.work.impl.model.e f();

    @o0
    public abstract androidx.work.impl.model.g g();

    @o0
    public abstract androidx.work.impl.model.j h();

    @o0
    public abstract androidx.work.impl.model.m i();

    @o0
    public abstract p j();

    @o0
    public abstract s k();

    @o0
    public abstract v l();
}
