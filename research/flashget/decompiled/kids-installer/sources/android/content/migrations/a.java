package android.content.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.j0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import p3.j;
import p3.n;
import q3.p;
import q3.q;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001 B\u008c\u0001\b\u0002\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u001c\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b+\u0010,Bz\b\u0017\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u001c\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019ø\u0001\u0000¢\u0006\u0004\b+\u0010-B|\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u001c\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019ø\u0001\u0000¢\u0006\u0004\b+\u0010/J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R3\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R9\u0010\u001c\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00198\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/datastore/migrations/a;", "T", "Landroidx/datastore/core/c;", "Landroid/content/Context;", "context", "", "name", "Lkotlin/m2;", "d", "Ljava/io/File;", "g", "prefsFile", "f", "currentData", "", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lq3/p;", "shouldRunMigration", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "Lq3/q;", "migrate", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "e", "Lkotlin/b0;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "Ljava/util/Set;", "keySet", "Lkotlin/Function0;", "produceSharedPreferences", "", "keysToMigrate", "<init>", "(Lq3/a;Ljava/util/Set;Lq3/p;Lq3/q;Landroid/content/Context;Ljava/lang/String;)V", "(Lq3/a;Ljava/util/Set;Lq3/p;Lq3/q;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lq3/p;Lq3/q;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a<T> implements android.content.core.c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q<android.content.migrations.c, T, Continuation<? super T>, Object> migrate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Lazy sharedPrefs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Set<String> keySet;

    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.migrations.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0077a extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7077s;

        C0077a(Continuation<? super C0077a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f7077s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(T t5, @d5.e Continuation<? super Boolean> continuation) {
            return new C0077a(continuation).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new C0077a(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    public static final class b extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7078s;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f7078s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(T t5, @d5.e Continuation<? super Boolean> continuation) {
            return new b(continuation).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new b(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    public static final class c extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7079s;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f7079s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(T t5, @d5.e Continuation<? super Boolean> continuation) {
            return new c(continuation).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new c(continuation);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Landroid/content/SharedPreferences;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class d extends Lambda implements q3.a<SharedPreferences> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f7080p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f7081q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str) {
            super(0);
            this.f7080p = context;
            this.f7081q = str;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences n() {
            SharedPreferences sharedPreferences = this.f7080p.getSharedPreferences(this.f7081q, 0);
            l0.o(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/datastore/migrations/a$e;", "", "Landroid/content/Context;", "context", "", "name", "", "a", "<init>", "()V", "datastore_release"}, k = 1, mv = {1, 5, 1})
    @x0(24)
    /* loaded from: classes.dex */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final e f7082a = new e();

        private e() {
        }

        @u
        @n
        public static final boolean a(@d5.d Context context, @d5.d String name) {
            l0.p(context, "context");
            l0.p(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class f extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7083r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7084s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ a<T> f7085t;

        /* renamed from: u, reason: collision with root package name */
        int f7086u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, Continuation<? super f> continuation) {
            super(continuation);
            this.f7085t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7084s = obj;
            this.f7086u |= Integer.MIN_VALUE;
            return this.f7085t.b(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d Context context, @d5.d String sharedPreferencesName, @d5.d Set<String> keysToMigrate, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(migrate, "migrate");
    }

    private final void d(Context context, String str) {
        e eVar = e.f7082a;
        if (!e.a(context, str)) {
            throw new IOException(l0.C("Unable to delete SharedPreferences: ", str));
        }
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    private final File f(File prefsFile) {
        return new File(l0.C(prefsFile.getPath(), ".bak"));
    }

    private final File g(Context context, String name) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), l0.C(name, ".xml"));
    }

    @Override // android.content.core.c
    @d5.e
    public Object a(@d5.d Continuation<? super m2> continuation) throws IOException {
        m2 m2Var;
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 == null) {
            m2Var = null;
        } else {
            set2.clear();
            m2Var = m2.f23662a;
        }
        return m2Var == CoroutineSingletons.COROUTINE_SUSPENDED ? m2Var : m2.f23662a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // android.content.core.c
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.a.f
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.a$f r0 = (androidx.datastore.migrations.a.f) r0
            int r1 = r0.f7086u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7086u = r1
            goto L18
        L13:
            androidx.datastore.migrations.a$f r0 = new androidx.datastore.migrations.a$f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7084s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7086u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f7083r
            androidx.datastore.migrations.a r5 = (android.content.migrations.a) r5
            kotlin.a1.n(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.a1.n(r6)
            q3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.f7083r = r4
            r0.f7086u = r3
            java.lang.Object r6 = r6.g0(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4f:
            java.util.Set<java.lang.String> r6 = r5.keySet
            r0 = 0
            if (r6 != 0) goto L6a
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.l0.o(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L68
            goto L97
        L68:
            r3 = r0
            goto L97
        L6a:
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L79
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L79
            goto L68
        L79:
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7d
        L97:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.migrations.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // android.content.core.c
    @d5.e
    public Object c(T t5, @d5.d Continuation<? super T> continuation) {
        return this.migrate.G(new android.content.migrations.c(e(), this.keySet), t5, continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d Context context, @d5.d String sharedPreferencesName, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d q3.a<? extends SharedPreferences> produceSharedPreferences, @d5.d Set<String> keysToMigrate, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (p) null, migrate, 4, (w) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d q3.a<? extends SharedPreferences> produceSharedPreferences, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (p) null, migrate, 6, (w) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(q3.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, Context context, String str) {
        Lazy c6;
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        c6 = d0.c(aVar);
        this.sharedPrefs = c6;
        this.keySet = set == android.content.migrations.b.a() ? null : j0.Z5(set);
    }

    /* synthetic */ a(q3.a aVar, Set set, p pVar, q qVar, Context context, String str, int i5, w wVar) {
        this((q3.a<? extends SharedPreferences>) aVar, (Set<String>) set, (i5 & 4) != 0 ? new C0077a(null) : pVar, qVar, context, str);
    }

    public /* synthetic */ a(q3.a aVar, Set set, p pVar, q qVar, int i5, w wVar) {
        this((q3.a<? extends SharedPreferences>) aVar, (Set<String>) ((i5 & 2) != 0 ? android.content.migrations.b.a() : set), (i5 & 4) != 0 ? new b(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d q3.a<? extends SharedPreferences> produceSharedPreferences, @d5.d Set<String> keysToMigrate, @d5.d p<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(shouldRunMigration, "shouldRunMigration");
        l0.p(migrate, "migrate");
    }

    public /* synthetic */ a(Context context, String str, Set set, p pVar, q qVar, int i5, w wVar) {
        this(context, str, (i5 & 4) != 0 ? android.content.migrations.b.a() : set, (i5 & 8) != 0 ? new c(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@d5.d Context context, @d5.d String sharedPreferencesName, @d5.d Set<String> keysToMigrate, @d5.d p<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @d5.d q<? super android.content.migrations.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new d(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(shouldRunMigration, "shouldRunMigration");
        l0.p(migrate, "migrate");
    }
}
