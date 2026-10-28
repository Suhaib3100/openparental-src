package android.content;

import android.content.Context;
import android.content.core.c;
import android.content.core.e;
import android.content.core.j;
import d5.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import q3.l;
import t.b;

/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ar\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"T", "", "fileName", "Landroidx/datastore/core/j;", "serializer", "Lt/b;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/e;", "a", "datastore_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: DataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Landroid/content/Context;", "it", "", "Landroidx/datastore/core/c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0071a extends Lambda implements l<Context, List<? extends c<Object>>> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0071a f6927p = new C0071a();

        C0071a() {
            super(1);
        }

        @Override // q3.l
        @d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<c<Object>> N(@d Context it) {
            l0.p(it, "it");
            return EmptyList.f23167o;
        }
    }

    @d
    public static final <T> ReadOnlyProperty<Context, e<T>> a(@d String fileName, @d j<T> serializer, @d5.e b<T> bVar, @d l<? super Context, ? extends List<? extends c<T>>> produceMigrations, @d u0 scope) {
        l0.p(fileName, "fileName");
        l0.p(serializer, "serializer");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        return new c(fileName, serializer, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, j jVar, b bVar, l lVar, u0 u0Var, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            bVar = null;
        }
        if ((i5 & 8) != 0) {
            lVar = C0071a.f6927p;
        }
        if ((i5 & 16) != 0) {
            m1 m1Var = m1.f28809a;
            u0Var = v0.a(m1.c().B(q3.c(null, 1, null)));
        }
        return a(str, jVar, bVar, lVar, u0Var);
    }
}
