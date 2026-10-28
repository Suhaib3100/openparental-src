package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: caches.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a \u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a6\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a6\u0010\u0011\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\"*\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0013*\u0004\u0018\u00010\u00000\u00000\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"<\u0010\u001d\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u000f0\u001a0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014*0\b\u0002\u0010\u001e\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001b2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001b¨\u0006\u001f"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/m;", "d", "Lkotlin/reflect/h;", "e", "Lkotlin/m2;", "a", "", "Lkotlin/reflect/u;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/s;", "b", "c", "Lkotlin/reflect/jvm/internal/a;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/a;", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/u;", "K_PACKAGE_CACHE", "CACHE_FOR_BASE_CLASSIFIERS", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/q0;", "Lkotlin/reflect/jvm/internal/Key;", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.a<m<? extends Object>> f23808a = kotlin.reflect.jvm.internal.b.a(d.f23816p);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.a<u> f23809b = kotlin.reflect.jvm.internal.b.a(e.f23817p);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.a<KType> f23810c = kotlin.reflect.jvm.internal.b.a(a.f23813p);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.a<KType> f23811d = kotlin.reflect.jvm.internal.b.a(C0263c.f23815p);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.a<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> f23812e = kotlin.reflect.jvm.internal.b.a(b.f23814p);

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/s;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<Class<?>, KType> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f23813p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KType N(@d5.d Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("羕"));
            m d6 = c.d(cls);
            EmptyList emptyList = EmptyList.f23167o;
            return kotlin.reflect.full.g.b(d6, emptyList, false, emptyList);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/lang/Class;", "it", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/q0;", "", "Lkotlin/reflect/u;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends KTypeProjection>, ? extends Boolean>, KType>> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f23814p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> N(@d5.d Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("羖"));
            return new ConcurrentHashMap<>();
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/s;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/s;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0263c extends Lambda implements q3.l<Class<?>, KType> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0263c f23815p = new C0263c();

        C0263c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KType N(@d5.d Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("羗"));
            m d6 = c.d(cls);
            EmptyList emptyList = EmptyList.f23167o;
            return kotlin.reflect.full.g.b(d6, emptyList, true, emptyList);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/m;", "", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/m;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<Class<?>, m<? extends Object>> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f23816p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m<? extends Object> N(@d5.d Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("羘"));
            return new m<>(cls);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/u;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/u;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<Class<?>, u> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f23817p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u N(@d5.d Class<?> cls) {
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("羙"));
            return new u(cls);
        }
    }

    public static final void a() {
        f23808a.a();
        f23809b.a();
        f23810c.a();
        f23811d.a();
        f23812e.a();
    }

    @d5.d
    public static final <T> KType b(@d5.d Class<T> cls, @d5.d List<KTypeProjection> list, boolean z5) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("䍛"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("䍜"));
        return list.isEmpty() ? z5 ? f23811d.b(cls) : f23810c.b(cls) : c(cls, list, z5);
    }

    private static final <T> KType c(Class<T> cls, List<KTypeProjection> list, boolean z5) {
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> b6 = f23812e.b(cls);
        Pair<List<KTypeProjection>, Boolean> pair = new Pair<>(list, Boolean.valueOf(z5));
        KType kType = b6.get(pair);
        if (kType == null) {
            KType b7 = kotlin.reflect.full.g.b(d(cls), list, z5, EmptyList.f23167o);
            KType putIfAbsent = b6.putIfAbsent(pair, b7);
            kType = putIfAbsent == null ? b7 : putIfAbsent;
        }
        kotlin.jvm.internal.l0.o(kType, ProtectedSandApp.s("䍝"));
        return kType;
    }

    @d5.d
    public static final <T> m<T> d(@d5.d Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("䍞"));
        KDeclarationContainer b6 = f23808a.b(cls);
        kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("䍟"));
        return (m) b6;
    }

    @d5.d
    public static final <T> KDeclarationContainer e(@d5.d Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("䍠"));
        return f23809b.b(cls);
    }
}
