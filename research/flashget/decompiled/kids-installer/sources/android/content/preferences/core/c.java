package android.content.preferences.core;

import android.content.core.e;
import android.content.core.f;
import d5.d;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.io.n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import p3.j;
import t.b;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/c;", "", "Lt/b;", "Landroidx/datastore/preferences/core/d;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/e;", "b", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final c f7106a = new c();

    /* compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    static final class a extends Lambda implements q3.a<File> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a<File> f7107p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q3.a<? extends File> aVar) {
            super(0);
            this.f7107p = aVar;
        }

        @Override // q3.a
        @d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File n() {
            String Y;
            File n5 = this.f7107p.n();
            Y = n.Y(n5);
            h hVar = h.f7114a;
            if (l0.g(Y, hVar.c())) {
                return n5;
            }
            throw new IllegalStateException(("File extension for file: " + n5 + " does not match required extension for Preferences file: " + hVar.c()).toString());
        }
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e e(c cVar, b bVar, List list, u0 u0Var, q3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bVar = null;
        }
        if ((i5 & 2) != 0) {
            list = EmptyList.f23167o;
        }
        if ((i5 & 4) != 0) {
            m1 m1Var = m1.f28809a;
            u0Var = v0.a(m1.c().B(q3.c(null, 1, null)));
        }
        return cVar.b(bVar, list, u0Var, aVar);
    }

    @d
    @j
    public final e<d> a(@d q3.a<? extends File> produceFile) {
        l0.p(produceFile, "produceFile");
        return e(this, null, null, null, produceFile, 7, null);
    }

    @d
    @j
    public final e<d> b(@d5.e b<d> bVar, @d List<? extends android.content.core.c<d>> migrations, @d u0 scope, @d q3.a<? extends File> produceFile) {
        l0.p(migrations, "migrations");
        l0.p(scope, "scope");
        l0.p(produceFile, "produceFile");
        return new b(f.f6957a.b(h.f7114a, bVar, migrations, scope, new a(produceFile)));
    }

    @d
    @j
    public final e<d> c(@d5.e b<d> bVar, @d List<? extends android.content.core.c<d>> migrations, @d q3.a<? extends File> produceFile) {
        l0.p(migrations, "migrations");
        l0.p(produceFile, "produceFile");
        return e(this, bVar, migrations, null, produceFile, 4, null);
    }

    @d
    @j
    public final e<d> d(@d5.e b<d> bVar, @d q3.a<? extends File> produceFile) {
        l0.p(produceFile, "produceFile");
        return e(this, bVar, null, null, produceFile, 6, null);
    }
}
