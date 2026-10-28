package kotlin.reflect.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.h;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.n;
import kotlin.reflect.jvm.internal.p0;
import kotlin.reflect.jvm.internal.w;
import kotlin.reflect.o;
import kotlin.reflect.s;

/* compiled from: ReflectJvmMapping.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"/\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e\"\u0004\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \"\u0015\u0010(\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u001b\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-\"-\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u001d*\u00020/*\b\u0012\u0004\u0012\u00028\u00000\u001e8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Ljava/lang/reflect/Member;", "Lkotlin/reflect/h;", "j", "(Ljava/lang/reflect/Member;)Lkotlin/reflect/h;", "", "Lkotlin/reflect/c;", "Ljava/lang/reflect/Method;", "method", "Lkotlin/reflect/i;", "a", "(Ljava/util/Collection;Ljava/lang/reflect/Method;)Lkotlin/reflect/i;", "Ljava/lang/reflect/Field;", "field", "Lkotlin/reflect/o;", "b", "(Ljava/util/Collection;Ljava/lang/reflect/Field;)Lkotlin/reflect/o;", "e", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Field;", "javaField", "f", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/j;", "h", "(Lkotlin/reflect/j;)Ljava/lang/reflect/Method;", "javaSetter", "g", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "c", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Constructor;", "d", "(Lkotlin/reflect/i;)V", "javaConstructor", "Lkotlin/reflect/s;", "Ljava/lang/reflect/Type;", "i", "(Lkotlin/reflect/s;)Ljava/lang/reflect/Type;", "javaType", "m", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/o;", "kotlinProperty", "l", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/i;", "kotlinFunction", "", "k", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/i;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i(name = "ReflectJvmMapping")
@r1({"SMAP\nReflectJvmMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n288#3,2:181\n*S KotlinDebug\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n*L\n177#1:181,2\n*E\n"})
/* loaded from: classes7.dex */
public final class e {

    /* compiled from: ReflectJvmMapping.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75541a;

        static {
            int[] iArr = new int[a.EnumC1104a.values().length];
            try {
                iArr[a.EnumC1104a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1104a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1104a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75541a = iArr;
        }
    }

    private static final kotlin.reflect.i<?> a(Collection<? extends kotlin.reflect.c<?>> collection, Method method) {
        for (kotlin.reflect.c<?> cVar : collection) {
            if ((cVar instanceof kotlin.reflect.i) && l0.g(cVar.getName(), method.getName())) {
                kotlin.reflect.i<?> iVar = (kotlin.reflect.i) cVar;
                if (l0.g(g(iVar), method)) {
                    return iVar;
                }
            }
        }
        for (kotlin.reflect.c<?> cVar2 : collection) {
            if ((cVar2 instanceof kotlin.reflect.i) && !l0.g(cVar2.getName(), method.getName())) {
                kotlin.reflect.i<?> iVar2 = (kotlin.reflect.i) cVar2;
                if (l0.g(g(iVar2), method)) {
                    return iVar2;
                }
            }
        }
        return null;
    }

    private static final o<?> b(Collection<? extends kotlin.reflect.c<?>> collection, Field field) {
        for (kotlin.reflect.c<?> cVar : collection) {
            if ((cVar instanceof o) && l0.g(cVar.getName(), field.getName())) {
                o<?> oVar = (o) cVar;
                if (l0.g(e(oVar), field)) {
                    return oVar;
                }
            }
        }
        for (kotlin.reflect.c<?> cVar2 : collection) {
            if ((cVar2 instanceof o) && !l0.g(cVar2.getName(), field.getName())) {
                o<?> oVar2 = (o) cVar2;
                if (l0.g(e(oVar2), field)) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    @m
    public static final <T> Constructor<T> c(@l kotlin.reflect.i<? extends T> iVar) {
        kotlin.reflect.jvm.internal.calls.e<?> m02;
        l0.p(iVar, ProtectedSandApp.s("晘\u0001"));
        n<?> b5 = p0.b(iVar);
        Object d5 = (b5 == null || (m02 = b5.m0()) == null) ? null : m02.d();
        if (d5 instanceof Constructor) {
            return (Constructor) d5;
        }
        return null;
    }

    public static /* synthetic */ void d(kotlin.reflect.i iVar) {
    }

    @m
    public static final Field e(@l o<?> oVar) {
        l0.p(oVar, ProtectedSandApp.s("晘\u0001"));
        b0<?> d5 = p0.d(oVar);
        if (d5 != null) {
            return d5.z0();
        }
        return null;
    }

    @m
    public static final Method f(@l o<?> oVar) {
        l0.p(oVar, ProtectedSandApp.s("晘\u0001"));
        return g(oVar.getGetter());
    }

    @m
    public static final Method g(@l kotlin.reflect.i<?> iVar) {
        kotlin.reflect.jvm.internal.calls.e<?> m02;
        l0.p(iVar, ProtectedSandApp.s("晘\u0001"));
        n<?> b5 = p0.b(iVar);
        Object d5 = (b5 == null || (m02 = b5.m0()) == null) ? null : m02.d();
        if (d5 instanceof Method) {
            return (Method) d5;
        }
        return null;
    }

    @m
    public static final Method h(@l j<?> jVar) {
        l0.p(jVar, ProtectedSandApp.s("晘\u0001"));
        return g(jVar.getSetter());
    }

    @l
    public static final Type i(@l s sVar) {
        l0.p(sVar, ProtectedSandApp.s("晘\u0001"));
        Type s4 = ((d0) sVar).s();
        return s4 == null ? kotlin.reflect.b0.f(sVar) : s4;
    }

    private static final h j(Member member) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4;
        f.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f76210c;
        Class<?> declaringClass = member.getDeclaringClass();
        String s4 = ProtectedSandApp.s("晙\u0001");
        l0.o(declaringClass, s4);
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a5 = aVar.a(declaringClass);
        a.EnumC1104a c5 = (a5 == null || (o4 = a5.o()) == null) ? null : o4.c();
        int i4 = c5 == null ? -1 : a.f75541a[c5.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        l0.o(declaringClass2, s4);
        return new w(declaringClass2);
    }

    @m
    public static final <T> kotlin.reflect.i<T> k(@l Constructor<T> constructor) {
        T t4;
        l0.p(constructor, ProtectedSandApp.s("晘\u0001"));
        Class<T> declaringClass = constructor.getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("晙\u0001"));
        Iterator<T> it = kd.b.i(declaringClass).h().iterator();
        while (true) {
            if (!it.hasNext()) {
                t4 = null;
                break;
            }
            t4 = it.next();
            if (l0.g(c((kotlin.reflect.i) t4), constructor)) {
                break;
            }
        }
        return (kotlin.reflect.i) t4;
    }

    @m
    public static final kotlin.reflect.i<?> l(@l Method method) {
        kotlin.reflect.i<?> a5;
        l0.p(method, ProtectedSandApp.s("晘\u0001"));
        boolean isStatic = Modifier.isStatic(method.getModifiers());
        String s4 = ProtectedSandApp.s("晙\u0001");
        if (isStatic) {
            h j4 = j(method);
            if (j4 != null) {
                return a(j4.r(), method);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            l0.o(declaringClass, s4);
            kotlin.reflect.d<?> j5 = kotlin.reflect.full.f.j(kd.b.i(declaringClass));
            if (j5 != null) {
                Class e4 = kd.b.e(j5);
                String name = method.getName();
                l0.o(name, ProtectedSandApp.s("晚\u0001"));
                Class<?>[] parameterTypes = method.getParameterTypes();
                l0.o(parameterTypes, ProtectedSandApp.s("晛\u0001"));
                Method j6 = p0.j(e4, name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                if (j6 != null && (a5 = a(kotlin.reflect.full.f.B(j5), j6)) != null) {
                    return a5;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        l0.o(declaringClass2, s4);
        return a(kotlin.reflect.full.f.B(kd.b.i(declaringClass2)), method);
    }

    @m
    public static final o<?> m(@l Field field) {
        o<?> b5;
        l0.p(field, ProtectedSandApp.s("晘\u0001"));
        if (field.isSynthetic()) {
            return null;
        }
        boolean isStatic = Modifier.isStatic(field.getModifiers());
        String s4 = ProtectedSandApp.s("晙\u0001");
        if (isStatic) {
            h j4 = j(field);
            if (j4 != null) {
                return b(j4.r(), field);
            }
            Class<?> declaringClass = field.getDeclaringClass();
            l0.o(declaringClass, s4);
            kotlin.reflect.d<?> j5 = kotlin.reflect.full.f.j(kd.b.i(declaringClass));
            if (j5 != null) {
                Class<?> declaringClass2 = field.getDeclaringClass();
                l0.o(declaringClass2, s4);
                String name = field.getName();
                l0.o(name, ProtectedSandApp.s("晚\u0001"));
                Field i4 = p0.i(declaringClass2, name);
                if (i4 != null && (b5 = b(kotlin.reflect.full.f.J(j5), i4)) != null) {
                    return b5;
                }
            }
        }
        Class<?> declaringClass3 = field.getDeclaringClass();
        l0.o(declaringClass3, s4);
        return b(kotlin.reflect.full.f.J(kd.b.i(declaringClass3)), field);
    }
}
