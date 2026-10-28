package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.r;
import androidx.work.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConstraintsCommandHandler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f36058e = s.f("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f36059a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36060b;

    /* renamed from: c, reason: collision with root package name */
    private final e f36061c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.constraints.d f36062d;

    c(@o0 Context context, int startId, @o0 e dispatcher) {
        this.f36059a = context;
        this.f36060b = startId;
        this.f36061c = dispatcher;
        this.f36062d = new androidx.work.impl.constraints.d(context, dispatcher.f(), null);
    }

    @n1
    void a() {
        List<r> f4 = this.f36061c.g().M().k().f();
        ConstraintProxy.a(this.f36059a, f4);
        this.f36062d.d(f4);
        ArrayList arrayList = new ArrayList(f4.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (r rVar : f4) {
            String str = rVar.f36346a;
            if (currentTimeMillis >= rVar.a() && (!rVar.b() || this.f36062d.c(str))) {
                arrayList.add(rVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((r) it.next()).f36346a;
            Intent b5 = b.b(this.f36059a, str2);
            s.c().a(f36058e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f36061c;
            eVar.k(new e.b(eVar, b5, this.f36060b));
        }
        this.f36062d.e();
    }
}
