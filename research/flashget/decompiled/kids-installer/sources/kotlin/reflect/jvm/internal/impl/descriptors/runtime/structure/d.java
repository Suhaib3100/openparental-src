package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.text.e0;

/* compiled from: reflectClassUtil.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final List<KClass<? extends Object>> f24395a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Map<Class<? extends Object>, Class<? extends Object>> f24396b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Map<Class<? extends Object>, Class<? extends Object>> f24397c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Map<Class<? extends Function<?>>, Integer> f24398d;

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<ParameterizedType, ParameterizedType> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24399p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType N(@d5.d ParameterizedType parameterizedType) {
            l0.p(parameterizedType, ProtectedSandApp.s("荧"));
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24400p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence<Type> N(@d5.d ParameterizedType parameterizedType) {
            Sequence<Type> K5;
            l0.p(parameterizedType, ProtectedSandApp.s("荨"));
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l0.o(actualTypeArguments, ProtectedSandApp.s("荩"));
            K5 = kotlin.collections.t.K5(actualTypeArguments);
            return K5;
        }
    }

    static {
        List<KClass<? extends Object>> O;
        int b02;
        Map<Class<? extends Object>, Class<? extends Object>> B0;
        int b03;
        Map<Class<? extends Object>, Class<? extends Object>> B02;
        List O2;
        int b04;
        Map<Class<? extends Function<?>>, Integer> B03;
        int i5 = 0;
        O = kotlin.collections.a0.O(l1.d(Boolean.TYPE), l1.d(Byte.TYPE), l1.d(Character.TYPE), l1.d(Double.TYPE), l1.d(Float.TYPE), l1.d(Integer.TYPE), l1.d(Long.TYPE), l1.d(Short.TYPE));
        f24395a = O;
        b02 = kotlin.collections.b0.b0(O, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = O.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(new Pair(p3.b.g(kClass), p3.b.h(kClass)));
        }
        B0 = f1.B0(arrayList);
        f24396b = B0;
        List<KClass<? extends Object>> list = f24395a;
        b03 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(new Pair(p3.b.h(kClass2), p3.b.g(kClass2)));
        }
        B02 = f1.B0(arrayList2);
        f24397c = B02;
        O2 = kotlin.collections.a0.O(q3.a.class, q3.l.class, q3.p.class, q3.q.class, q3.r.class, q3.s.class, q3.t.class, q3.u.class, q3.v.class, q3.w.class, q3.b.class, q3.c.class, q3.d.class, q3.e.class, q3.f.class, q3.g.class, q3.h.class, q3.i.class, q3.j.class, q3.k.class, q3.m.class, q3.n.class, q3.o.class);
        b04 = kotlin.collections.b0.b0(O2, 10);
        ArrayList arrayList3 = new ArrayList(b04);
        for (Object obj : O2) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        B03 = f1.B0(arrayList3);
        f24398d = B03;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.name.b a(@d5.d Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.name.b m5;
        kotlin.reflect.jvm.internal.impl.name.b a6;
        l0.p(cls, ProtectedSandApp.s("䢌"));
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䢐") + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䢏") + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            l0.o(simpleName, ProtectedSandApp.s("䢍"));
            if (!(simpleName.length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (a6 = a(declaringClass)) == null || (m5 = a6.d(kotlin.reflect.jvm.internal.impl.name.f.p(cls.getSimpleName()))) == null) {
                    m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getName()));
                }
                l0.o(m5, ProtectedSandApp.s("䢎"));
                return m5;
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(cls.getName());
        return new kotlin.reflect.jvm.internal.impl.name.b(cVar.e(), kotlin.reflect.jvm.internal.impl.name.c.k(cVar.g()), true);
    }

    @d5.d
    public static final String b(@d5.d Class<?> cls) {
        String h22;
        String h23;
        l0.p(cls, ProtectedSandApp.s("䢑"));
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
            String s5 = ProtectedSandApp.s("䢥");
            if (isArray) {
                String name = cls.getName();
                l0.o(name, s5);
                h23 = e0.h2(name, org.apache.commons.io.k.f32026a, org.apache.commons.io.n.f32060b, false, 4, null);
                return h23;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䢦"));
            String name2 = cls.getName();
            l0.o(name2, s5);
            h22 = e0.h2(name2, org.apache.commons.io.k.f32026a, org.apache.commons.io.n.f32060b, false, 4, null);
            return c1.c.a(sb, h22, ';');
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals(ProtectedSandApp.s("䢢"))) {
                    return ProtectedSandApp.s("䢣");
                }
                break;
            case 104431:
                if (name3.equals(ProtectedSandApp.s("䢠"))) {
                    return ProtectedSandApp.s("䢡");
                }
                break;
            case 3039496:
                if (name3.equals(ProtectedSandApp.s("䢞"))) {
                    return ProtectedSandApp.s("䢟");
                }
                break;
            case 3052374:
                if (name3.equals(ProtectedSandApp.s("䢜"))) {
                    return ProtectedSandApp.s("䢝");
                }
                break;
            case 3327612:
                if (name3.equals(ProtectedSandApp.s("䢚"))) {
                    return ProtectedSandApp.s("䢛");
                }
                break;
            case 3625364:
                if (name3.equals(ProtectedSandApp.s("䢘"))) {
                    return ProtectedSandApp.s("䢙");
                }
                break;
            case 64711720:
                if (name3.equals(ProtectedSandApp.s("䢖"))) {
                    return ProtectedSandApp.s("䢗");
                }
                break;
            case 97526364:
                if (name3.equals(ProtectedSandApp.s("䢔"))) {
                    return ProtectedSandApp.s("䢕");
                }
                break;
            case 109413500:
                if (name3.equals(ProtectedSandApp.s("䢒"))) {
                    return ProtectedSandApp.s("䢓");
                }
                break;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䢤") + cls);
    }

    @d5.e
    public static final Integer c(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢧"));
        return f24398d.get(cls);
    }

    @d5.d
    public static final List<Type> d(@d5.d Type type) {
        Sequence l5;
        Sequence H0;
        List<Type> Jy;
        l0.p(type, ProtectedSandApp.s("䢨"));
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.f23167o;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            l5 = kotlin.sequences.s.l(type, a.f24399p);
            H0 = kotlin.sequences.v.H0(l5, b.f24400p);
            return kotlin.sequences.v.c3(H0);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        l0.o(actualTypeArguments, ProtectedSandApp.s("䢩"));
        Jy = kotlin.collections.t.Jy(actualTypeArguments);
        return Jy;
    }

    @d5.e
    public static final Class<?> e(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢪"));
        return f24396b.get(cls);
    }

    @d5.d
    public static final ClassLoader f(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢫"));
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        l0.o(systemClassLoader, ProtectedSandApp.s("䢬"));
        return systemClassLoader;
    }

    @d5.e
    public static final Class<?> g(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢭"));
        return f24397c.get(cls);
    }

    public static final boolean h(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢮"));
        return Enum.class.isAssignableFrom(cls);
    }
}
