package androidx.content.preferences;

import android.content.Context;
import androidx.content.core.c;
import androidx.content.preferences.core.d;
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

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "Lo1/b;", "Landroidx/datastore/preferences/core/d;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/e;", "a", "(Ljava/lang/String;Lo1/b;Lld/l;Lkotlinx/coroutines/r0;)Lkotlin/properties/e;", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "Landroidx/datastore/core/c;", "Landroidx/datastore/preferences/core/d;", "<anonymous>", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    public static final class C0467a extends n0 implements l<Context, List<? extends c<d>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0467a f28544b = new C0467a(1);

        C0467a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<c<d>> invoke(@fg.l Context it) {
            l0.p(it, "it");
            return j0.f74919b;
        }
    }

    @fg.l
    public static final e<Context, androidx.content.core.e<d>> a(@fg.l String name, @m b<d> bVar, @fg.l l<? super Context, ? extends List<? extends c<d>>> produceMigrations, @fg.l r0 scope) {
        l0.p(name, "name");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ e b(String str, b bVar, l lVar, r0 r0Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar = C0467a.f28544b;
        }
        if ((i4 & 8) != 0) {
            j1 j1Var = j1.f80845a;
            r0Var = s0.a(j1.c().O(k3.c(null, 1, null)));
        }
        return a(str, bVar, lVar, r0Var);
    }
}
