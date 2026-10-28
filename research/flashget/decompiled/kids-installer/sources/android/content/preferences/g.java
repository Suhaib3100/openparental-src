package android.content.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.migrations.c;
import android.content.preferences.core.d;
import android.content.preferences.core.f;
import d5.d;
import d5.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.b0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import p3.j;
import q3.p;
import q3.q;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a4\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Landroidx/datastore/migrations/a;", "Landroidx/datastore/preferences/core/d;", "d", "Landroid/content/Context;", "context", "sharedPreferencesName", "b", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "Lkotlin/coroutines/d;", "", "h", "()Lq3/q;", "Lkotlin/Function2;", "", "i", "(Ljava/util/Set;)Lq3/p;", "a", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d
    private static final Set<String> f7120a = new LinkedHashSet();

    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Landroidx/datastore/migrations/c;", "sharedPrefs", "Landroidx/datastore/preferences/core/d;", "currentData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements q<c, android.content.preferences.core.d, Continuation<? super android.content.preferences.core.d>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7121s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7122t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f7123u;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            int b02;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f7121s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            c cVar = (c) this.f7122t;
            android.content.preferences.core.d dVar = (android.content.preferences.core.d) this.f7123u;
            Set<d.a<?>> keySet = dVar.a().keySet();
            b02 = b0.b0(keySet, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d.a) it.next()).getName());
            }
            Map<String, Object> c6 = cVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : c6.entrySet()) {
                if (Boolean.valueOf(!arrayList.contains(entry.getKey())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            android.content.preferences.core.a d6 = dVar.d();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    d6.o(f.a(str), value);
                } else if (value instanceof Float) {
                    d6.o(f.c(str), value);
                } else if (value instanceof Integer) {
                    d6.o(f.d(str), value);
                } else if (value instanceof Long) {
                    d6.o(f.e(str), value);
                } else if (value instanceof String) {
                    d6.o(f.f(str), value);
                } else if (value instanceof Set) {
                    d.a<Set<String>> g5 = f.g(str);
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    d6.o(g5, (Set) value);
                } else {
                    continue;
                }
            }
            return d6.e();
        }

        @Override // q3.q
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d c cVar, @d5.d android.content.preferences.core.d dVar, @e Continuation<? super android.content.preferences.core.d> continuation) {
            a aVar = new a(continuation);
            aVar.f7122t = cVar;
            aVar.f7123u = dVar;
            return aVar.A(m2.f23662a);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/d;", "prefs", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<android.content.preferences.core.d, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7124s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7125t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Set<String> f7126u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f7126u = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d5.d Object obj) {
            int b02;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f7124s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            Set<d.a<?>> keySet = ((android.content.preferences.core.d) this.f7125t).a().keySet();
            b02 = b0.b0(keySet, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d.a) it.next()).getName());
            }
            boolean z5 = true;
            if (this.f7126u != g.g()) {
                Set<String> set = this.f7126u;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (Boolean.valueOf(!arrayList.contains((String) it2.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d android.content.preferences.core.d dVar, @e Continuation<? super Boolean> continuation) {
            return ((b) c(dVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f7126u, continuation);
            bVar.f7125t = obj;
            return bVar;
        }
    }

    @d5.d
    @j
    public static final android.content.migrations.a<android.content.preferences.core.d> a(@d5.d Context context, @d5.d String sharedPreferencesName) {
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        return e(context, sharedPreferencesName, null, 4, null);
    }

    @d5.d
    @j
    public static final android.content.migrations.a<android.content.preferences.core.d> b(@d5.d Context context, @d5.d String sharedPreferencesName, @d5.d Set<String> keysToMigrate) {
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f7120a ? new android.content.migrations.a<>(context, sharedPreferencesName, null, i(keysToMigrate), h(), 4, null) : new android.content.migrations.a<>(context, sharedPreferencesName, keysToMigrate, i(keysToMigrate), h());
    }

    @d5.d
    @j
    public static final android.content.migrations.a<android.content.preferences.core.d> c(@d5.d q3.a<? extends SharedPreferences> produceSharedPreferences) {
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        return f(produceSharedPreferences, null, 2, null);
    }

    @d5.d
    @j
    public static final android.content.migrations.a<android.content.preferences.core.d> d(@d5.d q3.a<? extends SharedPreferences> produceSharedPreferences, @d5.d Set<String> keysToMigrate) {
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f7120a ? new android.content.migrations.a<>(produceSharedPreferences, (Set) null, i(keysToMigrate), h(), 2, (w) null) : new android.content.migrations.a<>(produceSharedPreferences, keysToMigrate, i(keysToMigrate), h());
    }

    public static /* synthetic */ android.content.migrations.a e(Context context, String str, Set set, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            set = f7120a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ android.content.migrations.a f(q3.a aVar, Set set, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            set = f7120a;
        }
        return d(aVar, set);
    }

    @d5.d
    public static final Set<String> g() {
        return f7120a;
    }

    private static final q<c, android.content.preferences.core.d, Continuation<? super android.content.preferences.core.d>, Object> h() {
        return new a(null);
    }

    private static final p<android.content.preferences.core.d, Continuation<? super Boolean>, Object> i(Set<String> set) {
        return new b(set, null);
    }
}
