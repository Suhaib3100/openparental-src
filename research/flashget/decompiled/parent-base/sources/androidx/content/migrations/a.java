package androidx.content.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.u;
import androidx.annotation.x0;
import fg.l;
import fg.m;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.b0;
import kotlin.c0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;
import ld.q;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001,B\u008c\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015Bz\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016B|\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010$J\u0013\u0010&\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010'R3\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010(R9\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u001b\u0010/\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001c\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/datastore/migrations/a;", "T", "Landroidx/datastore/core/c;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lld/a;Ljava/util/Set;Lld/p;Lld/q;Landroid/content/Context;Ljava/lang/String;)V", "(Lld/a;Ljava/util/Set;Lld/p;Lld/q;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lld/p;Lld/q;)V", "Lkotlin/k2;", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "Ljava/io/File;", "g", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "prefsFile", "f", "(Ljava/io/File;)Ljava/io/File;", "currentData", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lld/p;", "Lld/q;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Lkotlin/b0;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a<T> implements androidx.content.core.c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<T, kotlin.coroutines.d<? super Boolean>, Object> shouldRunMigration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final q<androidx.content.migrations.c, T, kotlin.coroutines.d<? super T>, Object> migrate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 sharedPrefs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final Set<String> keySet;

    /* compiled from: SharedPreferencesMigration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.migrations.a$a, reason: collision with other inner class name */
    static final class C0466a extends o implements p<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28531b;

        C0466a(kotlin.coroutines.d<? super C0466a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t4, @m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C0466a) create(t4, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new C0466a(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f28531b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends o implements p<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28532b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t4, @m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(t4, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new b(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f28532b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends o implements p<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28533b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t4, @m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(t4, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new c(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f28533b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            return Boolean.TRUE;
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends n0 implements ld.a<SharedPreferences> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str) {
            super(0);
            this.f28534b = context;
            this.f28535c = str;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f28534b.getSharedPreferences(this.f28535c, 0);
            l0.o(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/migrations/a$e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @x0(24)
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final e f28536a = new e();

        private e() {
        }

        @u
        @n
        public static final boolean a(@l Context context, @l String name) {
            l0.p(context, "context");
            l0.p(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28537b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28538c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a<T> f28539d;

        /* renamed from: e, reason: collision with root package name */
        int f28540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
            this.f28539d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f28538c = obj;
            this.f28540e |= Integer.MIN_VALUE;
            return this.f28539d.a(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l Context context, @l String sharedPreferencesName, @l Set<String> keysToMigrate, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(migrate, "migrate");
    }

    private final void d(Context context, String name) {
        e eVar = e.f28536a;
        if (!e.a(context, name)) {
            throw new IOException(l0.C("Unable to delete SharedPreferences: ", name));
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.content.core.c
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(T r5, @fg.l kotlin.coroutines.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.a.f
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.a$f r0 = (androidx.datastore.migrations.a.f) r0
            int r1 = r0.f28540e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28540e = r1
            goto L18
        L13:
            androidx.datastore.migrations.a$f r0 = new androidx.datastore.migrations.a$f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f28538c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28540e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f28537b
            androidx.datastore.migrations.a r5 = (androidx.content.migrations.a) r5
            kotlin.a1.n(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.a1.n(r6)
            ld.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.f28537b = r4
            r0.f28540e = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
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
            goto L94
        L68:
            r3 = r0
            goto L94
        L6a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L7e
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            goto L68
        L7e:
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L82
        L94:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.migrations.a.a(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.content.core.c
    @m
    public Object b(@l kotlin.coroutines.d<? super k2> dVar) throws IOException {
        k2 k2Var;
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
            k2Var = null;
        } else {
            set2.clear();
            k2Var = k2.f75408a;
        }
        return k2Var == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? k2Var : k2.f75408a;
    }

    @Override // androidx.content.core.c
    @m
    public Object c(T t4, @l kotlin.coroutines.d<? super T> dVar) {
        return this.migrate.R(new androidx.content.migrations.c(e(), this.keySet), t4, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l Context context, @l String sharedPreferencesName, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l ld.a<? extends SharedPreferences> produceSharedPreferences, @l Set<String> keysToMigrate, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (p) null, migrate, 4, (w) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l ld.a<? extends SharedPreferences> produceSharedPreferences, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (p) null, migrate, 6, (w) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(ld.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, Context context, String str) {
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = c0.c(aVar);
        this.keySet = set == androidx.content.migrations.b.a() ? null : kotlin.collections.w.Z5(set);
    }

    a(ld.a aVar, Set set, p pVar, q qVar, Context context, String str, int i4, w wVar) {
        this((ld.a<? extends SharedPreferences>) aVar, (Set<String>) set, (i4 & 4) != 0 ? new C0466a(2, null) : pVar, qVar, context, str);
    }

    public a(ld.a aVar, Set set, p pVar, q qVar, int i4, w wVar) {
        this((ld.a<? extends SharedPreferences>) aVar, (Set<String>) ((i4 & 2) != 0 ? androidx.content.migrations.b.a() : set), (i4 & 4) != 0 ? new b(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l ld.a<? extends SharedPreferences> produceSharedPreferences, @l Set<String> keysToMigrate, @l p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> shouldRunMigration, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        l0.p(produceSharedPreferences, "produceSharedPreferences");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(shouldRunMigration, "shouldRunMigration");
        l0.p(migrate, "migrate");
    }

    public a(Context context, String str, Set set, p pVar, q qVar, int i4, w wVar) {
        this(context, str, (i4 & 4) != 0 ? androidx.content.migrations.b.a() : set, (i4 & 8) != 0 ? new c(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@l Context context, @l String sharedPreferencesName, @l Set<String> keysToMigrate, @l p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> shouldRunMigration, @l q<? super androidx.content.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(new d(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        l0.p(context, "context");
        l0.p(sharedPreferencesName, "sharedPreferencesName");
        l0.p(keysToMigrate, "keysToMigrate");
        l0.p(shouldRunMigration, "shouldRunMigration");
        l0.p(migrate, "migrate");
    }
}
