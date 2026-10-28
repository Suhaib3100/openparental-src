package android.content.preferences;

import android.content.Context;
import android.content.core.c;
import android.content.core.e;
import android.content.preferences.core.d;
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

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"", "name", "Lt/b;", "Landroidx/datastore/preferences/core/d;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/e;", "a", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "Landroidx/datastore/core/c;", "Landroidx/datastore/preferences/core/d;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0078a extends Lambda implements l<Context, List<? extends c<d>>> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0078a f7090p = new C0078a();

        C0078a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<c<d>> N(@d5.d Context it) {
            l0.p(it, "it");
            return EmptyList.f23167o;
        }
    }

    @d5.d
    public static final ReadOnlyProperty<Context, e<d>> a(@d5.d String name, @d5.e b<d> bVar, @d5.d l<? super Context, ? extends List<? extends c<d>>> produceMigrations, @d5.d u0 scope) {
        l0.p(name, "name");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, b bVar, l lVar, u0 u0Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar = C0078a.f7090p;
        }
        if ((i5 & 8) != 0) {
            m1 m1Var = m1.f28809a;
            u0Var = v0.a(m1.c().B(q3.c(null, 1, null)));
        }
        return a(str, bVar, lVar, u0Var);
    }
}
