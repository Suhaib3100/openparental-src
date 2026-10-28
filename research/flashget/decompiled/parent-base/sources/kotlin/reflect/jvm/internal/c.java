package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: caches.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\"*\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0017*\u0004\u0018\u00010\u00000\u00000\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018\"<\u0010!\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001fj\u0002` \u0012\u0004\u0012\u00020\u00120\u001e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018*0\b\u0002\u0010\"\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001f2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001f¨\u0006#"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/o;", "d", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/o;", "Lkotlin/reflect/h;", "e", "(Ljava/lang/Class;)Lkotlin/reflect/h;", "Lkotlin/k2;", "a", "()V", "", "Lkotlin/reflect/u;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/s;", "b", "(Ljava/lang/Class;Ljava/util/List;Z)Lkotlin/reflect/s;", "c", "Lkotlin/reflect/jvm/internal/a;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/a;", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/w;", "K_PACKAGE_CACHE", "CACHE_FOR_BASE_CLASSIFIERS", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/q0;", "Lkotlin/reflect/jvm/internal/Key;", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n72#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.a<o<? extends Object>> f75569a = kotlin.reflect.jvm.internal.b.a(d.f75577b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.a<w> f75570b = kotlin.reflect.jvm.internal.b.a(e.f75578b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.a<kotlin.reflect.s> f75571c = kotlin.reflect.jvm.internal.b.a(a.f75574b);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.a<kotlin.reflect.s> f75572d = kotlin.reflect.jvm.internal.b.a(C1066c.f75576b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.a<ConcurrentHashMap<kotlin.q0<List<kotlin.reflect.u>, Boolean>, kotlin.reflect.s>> f75573e = kotlin.reflect.jvm.internal.b.a(b.f75575b);

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/s;"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, kotlin.reflect.s> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f75574b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.s invoke(@fg.l Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暑\u0001"));
            o d5 = c.d(cls);
            kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
            return kotlin.reflect.full.g.b(d5, j0Var, false, j0Var);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/lang/Class;", "it", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/q0;", "", "Lkotlin/reflect/u;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, ConcurrentHashMap<kotlin.q0<? extends List<? extends kotlin.reflect.u>, ? extends Boolean>, kotlin.reflect.s>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75575b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<kotlin.q0<List<kotlin.reflect.u>, Boolean>, kotlin.reflect.s> invoke(@fg.l Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暒\u0001"));
            return new ConcurrentHashMap<>();
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/s;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$c, reason: collision with other inner class name */
    static final class C1066c extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, kotlin.reflect.s> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1066c f75576b = new C1066c(1);

        C1066c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.s invoke(@fg.l Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暓\u0001"));
            o d5 = c.d(cls);
            kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
            return kotlin.reflect.full.g.b(d5, j0Var, true, j0Var);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/o;", "", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/o;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, o<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f75577b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o<? extends Object> invoke(@fg.l Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暔\u0001"));
            return new o<>(cls);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/w;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/w;"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, w> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f75578b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(@fg.l Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暕\u0001"));
            return new w(cls);
        }
    }

    public static final void a() {
        f75569a.a();
        f75570b.a();
        f75571c.a();
        f75572d.a();
        f75573e.a();
    }

    @fg.l
    public static final <T> kotlin.reflect.s b(@fg.l Class<T> cls, @fg.l List<kotlin.reflect.u> list, boolean z4) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暞\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("暟\u0001"));
        return list.isEmpty() ? z4 ? f75572d.b(cls) : f75571c.b(cls) : c(cls, list, z4);
    }

    private static final <T> kotlin.reflect.s c(Class<T> cls, List<kotlin.reflect.u> list, boolean z4) {
        ConcurrentHashMap<kotlin.q0<List<kotlin.reflect.u>, Boolean>, kotlin.reflect.s> b5 = f75573e.b(cls);
        kotlin.q0<List<kotlin.reflect.u>, Boolean> q0Var = new kotlin.q0<>(list, Boolean.valueOf(z4));
        kotlin.reflect.s sVar = b5.get(q0Var);
        if (sVar == null) {
            kotlin.reflect.s b6 = kotlin.reflect.full.g.b(d(cls), list, z4, kotlin.collections.j0.f74919b);
            kotlin.reflect.s putIfAbsent = b5.putIfAbsent(q0Var, b6);
            sVar = putIfAbsent == null ? b6 : putIfAbsent;
        }
        kotlin.jvm.internal.l0.o(sVar, ProtectedSandApp.s("暠\u0001"));
        return sVar;
    }

    @fg.l
    public static final <T> o<T> d(@fg.l Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暞\u0001"));
        kotlin.reflect.h b5 = f75569a.b(cls);
        kotlin.jvm.internal.l0.n(b5, ProtectedSandApp.s("暡\u0001"));
        return (o) b5;
    }

    @fg.l
    public static final <T> kotlin.reflect.h e(@fg.l Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("暞\u0001"));
        return f75570b.b(cls);
    }
}
