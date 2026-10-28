package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c1;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r1;

/* compiled from: TypesJVM.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/s;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lkotlin/reflect/s;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/u;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "j", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lkotlin/reflect/s;)Ljava/lang/reflect/Type;", "h", "(Lkotlin/reflect/s;)V", "javaType", "g", "(Lkotlin/reflect/u;)Ljava/lang/reflect/Type;", "i", "(Lkotlin/reflect/u;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes7.dex */
public final class b0 {

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75516a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75516a = iArr;
        }
    }

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends h0 implements ld.l<Class<?>, Class<?>> {

        /* renamed from: d, reason: collision with root package name */
        public static final b f75517d = new b();

        b() {
            super(1, Class.class, ProtectedSandApp.s("昈\u0001"), ProtectedSandApp.s("昇\u0001"), 0);
        }

        @Override // ld.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(@fg.l Class<?> cls) {
            l0.p(cls, ProtectedSandApp.s("昉\u0001"));
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.r
    public static final Type c(s sVar, boolean z4) {
        g d5 = sVar.d();
        if (d5 instanceof t) {
            return new a0((t) d5);
        }
        if (!(d5 instanceof d)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("昋\u0001") + sVar);
        }
        d dVar = (d) d5;
        Class g4 = z4 ? kd.b.g(dVar) : kd.b.e(dVar);
        List<u> c5 = sVar.c();
        if (c5.isEmpty()) {
            return g4;
        }
        if (!g4.isArray()) {
            return e(g4, c5);
        }
        if (g4.getComponentType().isPrimitive()) {
            return g4;
        }
        u uVar = (u) kotlin.collections.w.k5(c5);
        if (uVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("昊\u0001") + sVar);
        }
        v variance = uVar.getVariance();
        s type = uVar.getType();
        int i4 = variance == null ? -1 : a.f75516a[variance.ordinal()];
        if (i4 == -1 || i4 == 1) {
            return g4;
        }
        if (i4 != 2 && i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        l0.m(type);
        Type d6 = d(type, false, 1, null);
        return d6 instanceof Class ? g4 : new kotlin.reflect.a(d6);
    }

    static /* synthetic */ Type d(s sVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return c(sVar, z4);
    }

    @kotlin.r
    private static final Type e(Class<?> cls, List<u> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<u> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((u) it.next()));
            }
            return new x(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<u> list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((u) it2.next()));
            }
            return new x(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e4 = e(declaringClass, list.subList(length, list.size()));
        List<u> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((u) it3.next()));
        }
        return new x(cls, e4, arrayList3);
    }

    @fg.l
    public static final Type f(@fg.l s sVar) {
        Type s4;
        l0.p(sVar, ProtectedSandApp.s("昌\u0001"));
        return (!(sVar instanceof m0) || (s4 = ((m0) sVar).s()) == null) ? d(sVar, false, 1, null) : s4;
    }

    private static final Type g(u uVar) {
        v h4 = uVar.h();
        if (h4 == null) {
            c0.INSTANCE.getClass();
            return c0.f75519e;
        }
        s g4 = uVar.g();
        l0.m(g4);
        int i4 = a.f75516a[h4.ordinal()];
        if (i4 == 1) {
            return new c0(null, c(g4, true));
        }
        if (i4 == 2) {
            return c(g4, true);
        }
        if (i4 == 3) {
            return new c0(c(g4, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @kotlin.r
    @c1(version = "1.4")
    @kotlin.internal.h
    public static /* synthetic */ void h(s sVar) {
    }

    @kotlin.r
    private static /* synthetic */ void i(u uVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            kotlin.sequences.m l4 = kotlin.sequences.p.l(type, b.f75517d);
            name = ((Class) kotlin.sequences.p.f1(l4)).getName() + kotlin.text.v.e2(ProtectedSandApp.s("昍\u0001"), kotlin.sequences.p.g0(l4));
        } else {
            name = cls.getName();
        }
        l0.m(name);
        return name;
    }
}
