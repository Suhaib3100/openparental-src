package androidx.content.preferences.core;

import androidx.content.core.e;
import androidx.content.core.f;
import fg.l;
import fg.m;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.io.j;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import o1.b;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/datastore/preferences/core/c;", "", "<init>", "()V", "Lo1/b;", "Landroidx/datastore/preferences/core/d;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/e;", "b", "(Lo1/b;Ljava/util/List;Lkotlinx/coroutines/r0;Lld/a;)Landroidx/datastore/core/e;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f28560a = new c();

    /* compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends n0 implements ld.a<File> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<File> f28561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<? extends File> aVar) {
            super(0);
            this.f28561b = aVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File invoke = this.f28561b.invoke();
            String Y = j.Y(invoke);
            h hVar = h.f28568a;
            if (l0.g(Y, hVar.c())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + hVar.c()).toString());
        }
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e e(c cVar, b bVar, List list, r0 r0Var, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bVar = null;
        }
        if ((i4 & 2) != 0) {
            list = j0.f74919b;
        }
        if ((i4 & 4) != 0) {
            j1 j1Var = j1.f80845a;
            r0Var = s0.a(j1.c().O(k3.c(null, 1, null)));
        }
        return cVar.b(bVar, list, r0Var, aVar);
    }

    @l
    @kd.j
    public final e<d> a(@l ld.a<? extends File> produceFile) {
        l0.p(produceFile, "produceFile");
        return e(this, null, null, null, produceFile, 7, null);
    }

    @l
    @kd.j
    public final e<d> b(@m b<d> corruptionHandler, @l List<? extends androidx.content.core.c<d>> migrations, @l r0 scope, @l ld.a<? extends File> produceFile) {
        l0.p(migrations, "migrations");
        l0.p(scope, "scope");
        l0.p(produceFile, "produceFile");
        return new b(f.f28411a.b(h.f28568a, corruptionHandler, migrations, scope, new a(produceFile)));
    }

    @l
    @kd.j
    public final e<d> c(@m b<d> bVar, @l List<? extends androidx.content.core.c<d>> migrations, @l ld.a<? extends File> produceFile) {
        l0.p(migrations, "migrations");
        l0.p(produceFile, "produceFile");
        return e(this, bVar, migrations, null, produceFile, 4, null);
    }

    @l
    @kd.j
    public final e<d> d(@m b<d> bVar, @l ld.a<? extends File> produceFile) {
        l0.p(produceFile, "produceFile");
        return e(this, bVar, null, null, produceFile, 6, null);
    }
}
