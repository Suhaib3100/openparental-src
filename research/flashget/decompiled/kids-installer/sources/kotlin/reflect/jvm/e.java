package kotlin.reflect.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.l;
import kotlin.reflect.jvm.internal.n0;
import kotlin.reflect.jvm.internal.u;
import kotlin.reflect.jvm.internal.z;
import p3.i;

/* compiled from: ReflectJvmMapping.kt */
@i(name = "ReflectJvmMapping")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\"\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"/\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00108F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001b\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"-\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0014*\u00020&*\b\u0012\u0004\u0012\u00028\u00000\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ljava/lang/reflect/Member;", "Lkotlin/reflect/h;", "h", "Lkotlin/reflect/o;", "Ljava/lang/reflect/Field;", "c", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "d", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/j;", "f", "(Lkotlin/reflect/j;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/i;", "e", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/i;)V", "javaConstructor", "Lkotlin/reflect/s;", "Ljava/lang/reflect/Type;", "g", "(Lkotlin/reflect/s;)Ljava/lang/reflect/Type;", "javaType", "k", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/o;", "kotlinProperty", "j", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/i;", "kotlinFunction", "", "i", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/i;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: ReflectJvmMapping.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23792a;

        static {
            int[] iArr = new int[a.EnumC0299a.values().length];
            try {
                iArr[a.EnumC0299a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0299a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0299a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23792a = iArr;
        }
    }

    @d5.e
    public static final <T> Constructor<T> a(@d5.d KFunction<? extends T> kFunction) {
        kotlin.reflect.jvm.internal.calls.e<?> z02;
        l0.p(kFunction, ProtectedSandApp.s("䍂"));
        l<?> b6 = n0.b(kFunction);
        Object b7 = (b6 == null || (z02 = b6.z0()) == null) ? null : z02.b();
        if (b7 instanceof Constructor) {
            return (Constructor) b7;
        }
        return null;
    }

    public static /* synthetic */ void b(KFunction kFunction) {
    }

    @d5.e
    public static final Field c(@d5.d KProperty<?> kProperty) {
        l0.p(kProperty, ProtectedSandApp.s("䍃"));
        z<?> d6 = n0.d(kProperty);
        if (d6 != null) {
            return d6.L0();
        }
        return null;
    }

    @d5.e
    public static final Method d(@d5.d KProperty<?> kProperty) {
        l0.p(kProperty, ProtectedSandApp.s("䍄"));
        return e(kProperty.e());
    }

    @d5.e
    public static final Method e(@d5.d KFunction<?> kFunction) {
        kotlin.reflect.jvm.internal.calls.e<?> z02;
        l0.p(kFunction, ProtectedSandApp.s("䍅"));
        l<?> b6 = n0.b(kFunction);
        Object b7 = (b6 == null || (z02 = b6.z0()) == null) ? null : z02.b();
        if (b7 instanceof Method) {
            return (Method) b7;
        }
        return null;
    }

    @d5.e
    public static final Method f(@d5.d KMutableProperty<?> kMutableProperty) {
        l0.p(kMutableProperty, ProtectedSandApp.s("䍆"));
        return e(kMutableProperty.h());
    }

    @d5.d
    public static final Type g(@d5.d KType kType) {
        l0.p(kType, ProtectedSandApp.s("䍇"));
        Type W = ((b0) kType).W();
        return W == null ? kotlin.reflect.b0.f(kType) : W;
    }

    private static final KDeclarationContainer h(Member member) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6;
        f.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f24360c;
        Class<?> declaringClass = member.getDeclaringClass();
        String s5 = ProtectedSandApp.s("䍈");
        l0.o(declaringClass, s5);
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a7 = aVar.a(declaringClass);
        a.EnumC0299a c6 = (a7 == null || (a6 = a7.a()) == null) ? null : a6.c();
        int i5 = c6 == null ? -1 : a.f23792a[c6.ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        l0.o(declaringClass2, s5);
        return new u(declaringClass2);
    }

    @d5.e
    public static final <T> KFunction<T> i(@d5.d Constructor<T> constructor) {
        T t5;
        l0.p(constructor, ProtectedSandApp.s("䍉"));
        Class<T> declaringClass = constructor.getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("䍊"));
        Iterator<T> it = p3.b.i(declaringClass).l().iterator();
        while (true) {
            if (!it.hasNext()) {
                t5 = null;
                break;
            }
            t5 = it.next();
            if (l0.g(a((KFunction) t5), constructor)) {
                break;
            }
        }
        return (KFunction) t5;
    }

    @d5.e
    public static final KFunction<?> j(@d5.d Method method) {
        Object obj;
        l0.p(method, ProtectedSandApp.s("䍋"));
        boolean isStatic = Modifier.isStatic(method.getModifiers());
        String s5 = ProtectedSandApp.s("䍌");
        Object obj2 = null;
        if (isStatic) {
            KDeclarationContainer h5 = h(method);
            if (h5 != null) {
                Collection<KCallable<?>> A = h5.A();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : A) {
                    if (obj3 instanceof KFunction) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (l0.g(e((KFunction) next), method)) {
                        obj2 = next;
                        break;
                    }
                }
                return (KFunction) obj2;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            l0.o(declaringClass, s5);
            KClass<?> j5 = kotlin.reflect.full.f.j(p3.b.i(declaringClass));
            if (j5 != null) {
                Iterator<T> it2 = kotlin.reflect.full.f.B(j5).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Method e6 = e((KFunction) obj);
                    if (e6 != null && l0.g(e6.getName(), method.getName()) && Arrays.equals(e6.getParameterTypes(), method.getParameterTypes()) && l0.g(e6.getReturnType(), method.getReturnType())) {
                        break;
                    }
                }
                KFunction<?> kFunction = (KFunction) obj;
                if (kFunction != null) {
                    return kFunction;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        l0.o(declaringClass2, s5);
        Iterator<T> it3 = kotlin.reflect.full.f.B(p3.b.i(declaringClass2)).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (l0.g(e((KFunction) next2), method)) {
                obj2 = next2;
                break;
            }
        }
        return (KFunction) obj2;
    }

    @d5.e
    public static final KProperty<?> k(@d5.d Field field) {
        l0.p(field, ProtectedSandApp.s("䍍"));
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        KDeclarationContainer h5 = h(field);
        if (h5 == null) {
            Class<?> declaringClass = field.getDeclaringClass();
            l0.o(declaringClass, ProtectedSandApp.s("䍎"));
            Iterator it = kotlin.reflect.full.f.J(p3.b.i(declaringClass)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (l0.g(c((KProperty1) next), field)) {
                    obj = next;
                    break;
                }
            }
            return (KProperty) obj;
        }
        Collection<KCallable<?>> A = h5.A();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : A) {
            if (obj2 instanceof KProperty) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (l0.g(c((KProperty) next2), field)) {
                obj = next2;
                break;
            }
        }
        return (KProperty) obj;
    }
}
