package androidx.content.core;

import fg.l;
import fg.m;
import java.io.File;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.a;
import o1.b;

/* compiled from: DataStoreFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/f;", "", "<init>", "()V", "T", "Landroidx/datastore/core/j;", "serializer", "Lo1/b;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/e;", "b", "(Landroidx/datastore/core/j;Lo1/b;Ljava/util/List;Lkotlinx/coroutines/r0;Lld/a;)Landroidx/datastore/core/e;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final f f28411a = new f();

    private f() {
    }

    public static e e(f fVar, j jVar, b bVar, List list, r0 r0Var, a aVar, int i4, Object obj) {
        b bVar2 = (i4 & 2) != 0 ? null : bVar;
        if ((i4 & 4) != 0) {
            list = j0.f74919b;
        }
        List list2 = list;
        if ((i4 & 8) != 0) {
            j1 j1Var = j1.f80845a;
            r0Var = s0.a(j1.c().O(k3.c(null, 1, null)));
        }
        return fVar.b(jVar, bVar2, list2, r0Var, aVar);
    }

    @l
    @j
    public final <T> e<T> a(@l j<T> serializer, @l a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, null, null, null, produceFile, 14, null);
    }

    @l
    @j
    public final <T> e<T> b(@l j<T> serializer, @m b<T> corruptionHandler, @l List<? extends c<T>> migrations, @l r0 scope, @l a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(migrations, "migrations");
        l0.p(scope, "scope");
        l0.p(produceFile, "produceFile");
        if (corruptionHandler == null) {
            corruptionHandler = (b<T>) new o1.a();
        }
        return new l(produceFile, serializer, w.k(d.INSTANCE.b(migrations)), corruptionHandler, scope);
    }

    @l
    @j
    public final <T> e<T> c(@l j<T> serializer, @m b<T> bVar, @l List<? extends c<T>> migrations, @l a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(migrations, "migrations");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    @l
    @j
    public final <T> e<T> d(@l j<T> serializer, @m b<T> bVar, @l a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, null, null, produceFile, 12, null);
    }
}
