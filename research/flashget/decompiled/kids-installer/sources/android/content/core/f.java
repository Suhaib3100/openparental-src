package android.content.core;

import d5.d;
import d5.e;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import p3.j;
import q3.a;
import t.b;

/* compiled from: DataStoreFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/f;", "", "T", "Landroidx/datastore/core/j;", "serializer", "Lt/b;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/e;", "b", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final f f6957a = new f();

    private f() {
    }

    public static e e(f fVar, j jVar, b bVar, List list, u0 u0Var, a aVar, int i5, Object obj) {
        b bVar2 = (i5 & 2) != 0 ? null : bVar;
        if ((i5 & 4) != 0) {
            list = EmptyList.f23167o;
        }
        List list2 = list;
        if ((i5 & 8) != 0) {
            m1 m1Var = m1.f28809a;
            u0Var = v0.a(m1.c().B(q3.c(null, 1, null)));
        }
        return fVar.b(jVar, bVar2, list2, u0Var, aVar);
    }

    @d
    @j
    public final <T> e<T> a(@d j<T> serializer, @d a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, null, null, null, produceFile, 14, null);
    }

    @d
    @j
    public final <T> e<T> b(@d j<T> serializer, @e b<T> bVar, @d List<? extends c<T>> migrations, @d u0 scope, @d a<? extends File> produceFile) {
        List k5;
        l0.p(serializer, "serializer");
        l0.p(migrations, "migrations");
        l0.p(scope, "scope");
        l0.p(produceFile, "produceFile");
        if (bVar == null) {
            bVar = (b<T>) new t.a();
        }
        b<T> bVar2 = bVar;
        k5 = z.k(d.INSTANCE.b(migrations));
        return new l(produceFile, serializer, k5, bVar2, scope);
    }

    @d
    @j
    public final <T> e<T> c(@d j<T> serializer, @e b<T> bVar, @d List<? extends c<T>> migrations, @d a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(migrations, "migrations");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    @d
    @j
    public final <T> e<T> d(@d j<T> serializer, @e b<T> bVar, @d a<? extends File> produceFile) {
        l0.p(serializer, "serializer");
        l0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, null, null, produceFile, 12, null);
    }
}
