package androidx.content.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.content.migrations.c;
import androidx.content.preferences.core.d;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kd.j;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import ld.p;
import ld.q;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a4\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a<\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Landroidx/datastore/migrations/a;", "Landroidx/datastore/preferences/core/d;", "d", "(Lld/a;Ljava/util/Set;)Landroidx/datastore/migrations/a;", "Landroid/content/Context;", "context", "sharedPreferencesName", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Landroidx/datastore/migrations/a;", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "Lkotlin/coroutines/d;", "", "h", "()Lld/q;", "Lkotlin/Function2;", "", "i", "(Ljava/util/Set;)Lld/p;", "a", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final Set<String> f28574a = new LinkedHashSet();

    /* compiled from: SharedPreferencesMigration.kt */
    @f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/datastore/migrations/c;", "sharedPrefs", "Landroidx/datastore/preferences/core/d;", "currentData", "<anonymous>", "(Landroidx/datastore/migrations/c;Landroidx/datastore/preferences/core/d;)Landroidx/datastore/preferences/core/d;"}, k = 3, mv = {1, 5, 1})
    static final class a extends o implements q<c, d, kotlin.coroutines.d<? super d>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28575b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28576c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f28577d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@l c cVar, @l d dVar, @m kotlin.coroutines.d<? super d> dVar2) {
            a aVar = new a(3, dVar2);
            aVar.f28576c = cVar;
            aVar.f28577d = dVar;
            return aVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f28575b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            c cVar = (c) this.f28576c;
            d dVar = (d) this.f28577d;
            Set<d.a<?>> keySet = dVar.a().keySet();
            ArrayList arrayList = new ArrayList(w.b0(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d.a) it.next()).getName());
            }
            Map<String, Object> c5 = cVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : c5.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            androidx.content.preferences.core.a d5 = dVar.d();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    d5.o(androidx.content.preferences.core.f.a(str), value);
                } else if (value instanceof Float) {
                    d5.o(androidx.content.preferences.core.f.c(str), value);
                } else if (value instanceof Integer) {
                    d5.o(androidx.content.preferences.core.f.d(str), value);
                } else if (value instanceof Long) {
                    d5.o(androidx.content.preferences.core.f.e(str), value);
                } else if (value instanceof String) {
                    d5.o(androidx.content.preferences.core.f.f(str), value);
                } else if (value instanceof Set) {
                    d.a<Set<String>> g4 = androidx.content.preferences.core.f.g(str);
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    d5.o(g4, (Set) value);
                } else {
                    continue;
                }
            }
            return d5.e();
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/preferences/core/d;", "prefs", "", "<anonymous>", "(Landroidx/datastore/preferences/core/d;)Z"}, k = 3, mv = {1, 5, 1})
    static final class b extends o implements p<d, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28578b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f28580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f28580d = set;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l d dVar, @m kotlin.coroutines.d<? super Boolean> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f28580d, dVar);
            bVar.f28579c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f28578b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            Set<d.a<?>> keySet = ((d) this.f28579c).a().keySet();
            ArrayList arrayList = new ArrayList(w.b0(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d.a) it.next()).getName());
            }
            boolean z4 = true;
            if (this.f28580d != g.g()) {
                Set<String> set = this.f28580d;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                }
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    @l
    @j
    public static final androidx.content.migrations.a<d> a(@l Context context, @l String sharedPreferencesName) {
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        return e(context, sharedPreferencesName, null, 4, null);
    }

    @l
    @j
    public static final androidx.content.migrations.a<d> b(@l Context context, @l String sharedPreferencesName, @l Set<String> keysToMigrate) {
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f28574a ? new androidx.content.migrations.a<>(context, sharedPreferencesName, null, i(keysToMigrate), h(), 4, null) : new androidx.content.migrations.a<>(context, sharedPreferencesName, keysToMigrate, i(keysToMigrate), h());
    }

    @l
    @j
    public static final androidx.content.migrations.a<d> c(@l ld.a<? extends SharedPreferences> produceSharedPreferences) {
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        return f(produceSharedPreferences, null, 2, null);
    }

    @l
    @j
    public static final androidx.content.migrations.a<d> d(@l ld.a<? extends SharedPreferences> produceSharedPreferences, @l Set<String> keysToMigrate) {
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f28574a ? new androidx.content.migrations.a<>(produceSharedPreferences, (Set) null, i(keysToMigrate), h(), 2, (kotlin.jvm.internal.w) null) : new androidx.content.migrations.a<>(produceSharedPreferences, keysToMigrate, i(keysToMigrate), h());
    }

    public static /* synthetic */ androidx.content.migrations.a e(Context context, String str, Set set, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            set = f28574a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ androidx.content.migrations.a f(ld.a aVar, Set set, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            set = f28574a;
        }
        return d(aVar, set);
    }

    @l
    public static final Set<String> g() {
        return f28574a;
    }

    private static final q<c, d, kotlin.coroutines.d<? super d>, Object> h() {
        return new a(3, null);
    }

    private static final p<d, kotlin.coroutines.d<? super Boolean>, Object> i(Set<String> set) {
        return new b(set, null);
    }
}
