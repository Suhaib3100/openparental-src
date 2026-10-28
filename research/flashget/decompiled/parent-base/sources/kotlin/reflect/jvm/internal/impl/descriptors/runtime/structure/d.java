package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.compose.foundation.layout.f3;
import androidx.content.preferences.protobuf.o1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: reflectClassUtil.kt */
@r1({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1549#2:100\n1620#2,3:101\n1549#2:104\n1620#2,3:105\n1559#2:108\n1590#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final List<kotlin.reflect.d<? extends Object>> f76245a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Map<Class<? extends Object>, Class<? extends Object>> f76246b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Map<Class<? extends Object>, Class<? extends Object>> f76247c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Map<Class<? extends kotlin.v<?>>, Integer> f76248d;

    /* compiled from: reflectClassUtil.kt */
    static final class a extends n0 implements ld.l<ParameterizedType, ParameterizedType> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76249b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(@fg.l ParameterizedType parameterizedType) {
            l0.p(parameterizedType, ProtectedSandApp.s("溣\u0001"));
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    static final class b extends n0 implements ld.l<ParameterizedType, kotlin.sequences.m<? extends Type>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76250b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.sequences.m<Type> invoke(@fg.l ParameterizedType parameterizedType) {
            l0.p(parameterizedType, ProtectedSandApp.s("溤\u0001"));
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l0.o(actualTypeArguments, ProtectedSandApp.s("溥\u0001"));
            return kotlin.collections.l.K5(actualTypeArguments);
        }
    }

    static {
        int i4 = 0;
        List<kotlin.reflect.d<? extends Object>> O = kotlin.collections.w.O(l1.d(Boolean.TYPE), l1.d(Byte.TYPE), l1.d(Character.TYPE), l1.d(Double.TYPE), l1.d(Float.TYPE), l1.d(Integer.TYPE), l1.d(Long.TYPE), l1.d(Short.TYPE));
        f76245a = O;
        List<kotlin.reflect.d<? extends Object>> list = O;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.d dVar = (kotlin.reflect.d) it.next();
            arrayList.add(new q0(kd.b.g(dVar), kd.b.h(dVar)));
        }
        f76246b = z0.B0(arrayList);
        List<kotlin.reflect.d<? extends Object>> list2 = f76245a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) it2.next();
            arrayList2.add(new q0(kd.b.h(dVar2), kd.b.g(dVar2)));
        }
        f76247c = z0.B0(arrayList2);
        List O2 = kotlin.collections.w.O(ld.a.class, ld.l.class, ld.p.class, ld.q.class, ld.r.class, ld.s.class, ld.t.class, ld.u.class, ld.v.class, ld.w.class, ld.b.class, ld.c.class, ld.d.class, ld.e.class, ld.f.class, ld.g.class, ld.h.class, ld.i.class, ld.j.class, ld.k.class, ld.m.class, ld.n.class, ld.o.class);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(O2, 10));
        for (Object obj : O2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            arrayList3.add(new q0((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f76248d = z0.B0(arrayList3);
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.b a(@fg.l Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.name.b m4;
        kotlin.reflect.jvm.internal.impl.name.b a5;
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(o1.a(ProtectedSandApp.s("溩\u0001"), cls));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(o1.a(ProtectedSandApp.s("溨\u0001"), cls));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            l0.o(simpleName, ProtectedSandApp.s("溧\u0001"));
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (a5 = a(declaringClass)) == null || (m4 = a5.d(kotlin.reflect.jvm.internal.impl.name.f.f(cls.getSimpleName()))) == null) {
                    m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getName()));
                }
                l0.m(m4);
                return m4;
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(cls.getName());
        return new kotlin.reflect.jvm.internal.impl.name.b(cVar.e(), kotlin.reflect.jvm.internal.impl.name.c.k(cVar.g()), true);
    }

    @fg.l
    public static final String b(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
            String s4 = ProtectedSandApp.s("溽\u0001");
            if (isArray) {
                String name = cls.getName();
                l0.o(name, s4);
                return kotlin.text.v.h2(name, '.', '/', false, 4, null);
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("溾\u0001"));
            String name2 = cls.getName();
            l0.o(name2, s4);
            return f3.a(sb, kotlin.text.v.h2(name2, '.', '/', false, 4, null), ';');
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals(ProtectedSandApp.s("溺\u0001"))) {
                    return ProtectedSandApp.s("溻\u0001");
                }
                break;
            case 104431:
                if (name3.equals(ProtectedSandApp.s("溸\u0001"))) {
                    return ProtectedSandApp.s("溹\u0001");
                }
                break;
            case 3039496:
                if (name3.equals(ProtectedSandApp.s("溶\u0001"))) {
                    return ProtectedSandApp.s("溷\u0001");
                }
                break;
            case 3052374:
                if (name3.equals(ProtectedSandApp.s("溴\u0001"))) {
                    return ProtectedSandApp.s("溵\u0001");
                }
                break;
            case 3327612:
                if (name3.equals(ProtectedSandApp.s("溲\u0001"))) {
                    return ProtectedSandApp.s("溳\u0001");
                }
                break;
            case 3625364:
                if (name3.equals(ProtectedSandApp.s("溰\u0001"))) {
                    return ProtectedSandApp.s("溱\u0001");
                }
                break;
            case 64711720:
                if (name3.equals(ProtectedSandApp.s("溮\u0001"))) {
                    return ProtectedSandApp.s("溯\u0001");
                }
                break;
            case 97526364:
                if (name3.equals(ProtectedSandApp.s("溬\u0001"))) {
                    return ProtectedSandApp.s("溭\u0001");
                }
                break;
            case 109413500:
                if (name3.equals(ProtectedSandApp.s("溪\u0001"))) {
                    return ProtectedSandApp.s("溫\u0001");
                }
                break;
        }
        throw new IllegalArgumentException(o1.a(ProtectedSandApp.s("溼\u0001"), cls));
    }

    @fg.m
    public static final Integer c(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        return f76248d.get(cls);
    }

    @fg.l
    public static final List<Type> d(@fg.l Type type) {
        l0.p(type, ProtectedSandApp.s("溦\u0001"));
        if (!(type instanceof ParameterizedType)) {
            return j0.f74919b;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.p.c3(kotlin.sequences.p.H0(kotlin.sequences.p.l(type, a.f76249b), b.f76250b));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        l0.o(actualTypeArguments, ProtectedSandApp.s("溿\u0001"));
        return kotlin.collections.l.Ky(actualTypeArguments);
    }

    @fg.m
    public static final Class<?> e(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        return f76246b.get(cls);
    }

    @fg.l
    public static final ClassLoader f(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        l0.o(systemClassLoader, ProtectedSandApp.s("滀\u0001"));
        return systemClassLoader;
    }

    @fg.m
    public static final Class<?> g(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        return f76247c.get(cls);
    }

    public static final boolean h(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溦\u0001"));
        return Enum.class.isAssignableFrom(cls);
    }
}
