package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.z0;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", "E", "exception", "g", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "(Ljava/lang/Class;)Lld/l;", "block", "f", "(Lld/l;)Lld/l;", "", "defaultValue", "e", "(Ljava/lang/Class;I)I", "accumulator", "c", "a", "I", "throwableFields", "Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/internal/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80793a = e(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final k f80794b;

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "E", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f80795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Constructor<?> constructor) {
            super(1);
            this.f80795b = constructor;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@fg.l Throwable th) {
            Object newInstance = this.f80795b.newInstance(th.getMessage(), th);
            kotlin.jvm.internal.l0.n(newInstance, ProtectedSandApp.s("蟲\u0001"));
            return (Throwable) newInstance;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "E", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f80796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Constructor<?> constructor) {
            super(1);
            this.f80796b = constructor;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@fg.l Throwable th) {
            Object newInstance = this.f80796b.newInstance(th.getMessage());
            kotlin.jvm.internal.l0.n(newInstance, ProtectedSandApp.s("蟳\u0001"));
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "E", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f80797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Constructor<?> constructor) {
            super(1);
            this.f80797b = constructor;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@fg.l Throwable th) {
            Object newInstance = this.f80797b.newInstance(th);
            kotlin.jvm.internal.l0.n(newInstance, ProtectedSandApp.s("蟴\u0001"));
            return (Throwable) newInstance;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "E", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f80798b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Constructor<?> constructor) {
            super(1);
            this.f80798b = constructor;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@fg.l Throwable th) {
            Object newInstance = this.f80798b.newInstance(null);
            kotlin.jvm.internal.l0.n(newInstance, ProtectedSandApp.s("蟵\u0001"));
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final e f80799b = new e(1);

        e() {
            super(1);
        }

        @fg.m
        public final Void a(@fg.l Throwable th) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Throwable, Throwable> f80800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.f80800b = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(@fg.l Throwable th) {
            Object obj;
            ld.l<Throwable, Throwable> lVar = this.f80800b;
            try {
                z0.Companion companion = kotlin.z0.INSTANCE;
                Throwable invoke = lVar.invoke(th);
                boolean g4 = kotlin.jvm.internal.l0.g(th.getMessage(), invoke.getMessage());
                obj = invoke;
                if (!g4) {
                    boolean g5 = kotlin.jvm.internal.l0.g(invoke.getMessage(), th.toString());
                    obj = invoke;
                    if (!g5) {
                        obj = null;
                    }
                }
            } catch (Throwable th2) {
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                obj = kotlin.a1.a(th2);
            }
            return (Throwable) (kotlin.z0.i(obj) ? null : obj);
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? f1.f80769a : kotlinx.coroutines.internal.d.f80753a;
        } catch (Throwable unused) {
            kVar = f1.f80769a;
        }
        f80794b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> ld.l<Throwable, Throwable> b(Class<E> cls) {
        Object obj;
        ld.l<Throwable, Throwable> lVar;
        kotlin.q0 q0Var;
        e eVar = e.f80799b;
        if (f80793a != e(cls, 0)) {
            return eVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i4 = 0;
        while (true) {
            obj = null;
            if (i4 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i4];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                q0Var = new kotlin.q0(new f(new d(constructor)), 0);
            } else if (length2 != 1) {
                q0Var = length2 != 2 ? new kotlin.q0(null, -1) : (kotlin.jvm.internal.l0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.l0.g(parameterTypes[1], Throwable.class)) ? new kotlin.q0(new f(new a(constructor)), 3) : new kotlin.q0(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                q0Var = kotlin.jvm.internal.l0.g(cls2, String.class) ? new kotlin.q0(new f(new b(constructor)), 2) : kotlin.jvm.internal.l0.g(cls2, Throwable.class) ? new kotlin.q0(new f(new c(constructor)), 1) : new kotlin.q0(null, -1);
            }
            arrayList.add(q0Var);
            i4++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((kotlin.q0) obj).f()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((kotlin.q0) next).f()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.q0 q0Var2 = (kotlin.q0) obj;
        return (q0Var2 == null || (lVar = (ld.l) q0Var2.e()) == null) ? eVar : lVar;
    }

    private static final int c(Class<?> cls, int i4) {
        do {
            int i5 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i5++;
                }
            }
            i4 += i5;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i4;
    }

    static /* synthetic */ int d(Class cls, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return c(cls, i4);
    }

    private static final int e(Class<?> cls, int i4) {
        Object a5;
        kd.b.i(cls);
        try {
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5 = Integer.valueOf(d(cls, 0, 1, null));
        } catch (Throwable th) {
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            a5 = kotlin.a1.a(th);
        }
        Integer valueOf = Integer.valueOf(i4);
        if (kotlin.z0.i(a5)) {
            a5 = valueOf;
        }
        return ((Number) a5).intValue();
    }

    private static final ld.l<Throwable, Throwable> f(ld.l<? super Throwable, ? extends Throwable> lVar) {
        return new f(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public static final <E extends Throwable> E g(@fg.l E e4) {
        Object a5;
        if (!(e4 instanceof kotlinx.coroutines.k0)) {
            return (E) f80794b.a(e4.getClass()).invoke(e4);
        }
        try {
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5 = ((kotlinx.coroutines.k0) e4).a();
        } catch (Throwable th) {
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            a5 = kotlin.a1.a(th);
        }
        if (kotlin.z0.i(a5)) {
            a5 = null;
        }
        return (E) a5;
    }
}
