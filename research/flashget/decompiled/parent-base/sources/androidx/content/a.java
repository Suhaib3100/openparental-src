package androidx.content;

import android.content.Context;
import androidx.content.core.c;
import androidx.content.core.j;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.properties.e;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.l;
import o1.b;

/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "", "fileName", "Landroidx/datastore/core/j;", "serializer", "Lo1/b;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/e;", "a", "(Ljava/lang/String;Landroidx/datastore/core/j;Lo1/b;Lld/l;Lkotlinx/coroutines/r0;)Lkotlin/properties/e;", "datastore_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroid/content/Context;", "it", "", "Landroidx/datastore/core/c;", "<anonymous>", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.a$a, reason: collision with other inner class name */
    static final class C0460a extends n0 implements l<Context, List<? extends c<Object>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0460a f28381b = new C0460a(1);

        C0460a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<c<Object>> invoke(@fg.l Context it) {
            l0.p(it, "it");
            return j0.f74919b;
        }
    }

    @fg.l
    public static final <T> e<Context, androidx.content.core.e<T>> a(@fg.l String fileName, @fg.l j<T> serializer, @m b<T> bVar, @fg.l l<? super Context, ? extends List<? extends c<T>>> produceMigrations, @fg.l r0 scope) {
        l0.p(fileName, "fileName");
        l0.p(serializer, "serializer");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        return new c(fileName, serializer, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ e b(String str, j jVar, b bVar, l lVar, r0 r0Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            bVar = null;
        }
        if ((i4 & 8) != 0) {
            lVar = C0460a.f28381b;
        }
        if ((i4 & 16) != 0) {
            j1 j1Var = j1.f80845a;
            r0Var = s0.a(j1.c().O(k3.c(null, 1, null)));
        }
        return a(str, jVar, bVar, lVar, r0Var);
    }
}
