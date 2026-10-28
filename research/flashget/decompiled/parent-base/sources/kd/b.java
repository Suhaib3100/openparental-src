package kd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.x0;

/* compiled from: JvmClassMapping.kt */
@i(name = "JvmClassMappingKt")
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\t\"+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\"+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\";\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0017\u0010\t\"'\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0019*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\";\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001d*\b\u0012\u0004\u0012\u00028\u00000\u001d8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"", "T", "", "", "l", "([Ljava/lang/Object;)Z", "Lkotlin/reflect/d;", "Ljava/lang/Class;", "e", "(Lkotlin/reflect/d;)Ljava/lang/Class;", "f", "(Lkotlin/reflect/d;)V", "java", "h", "javaPrimitiveType", "g", "javaObjectType", "i", "(Ljava/lang/Class;)Lkotlin/reflect/d;", "kotlin", "d", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass", "j", "k", "", "a", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/d;", "annotationClass", "", "E", "b", "(Ljava/lang/Enum;)Ljava/lang/Class;", "c", "(Ljava/lang/Enum;)V", "declaringJavaClass", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @fg.l
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("恞\u0001"));
        Class<? extends Annotation> annotationType = t4.annotationType();
        l0.o(annotationType, ProtectedSandApp.s("恟\u0001"));
        kotlin.reflect.d<? extends T> i4 = i(annotationType);
        l0.n(i4, ProtectedSandApp.s("恠\u0001"));
        return i4;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        l0.p(r12, ProtectedSandApp.s("恞\u0001"));
        Class<E> declaringClass = r12.getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("恡\u0001"));
        return declaringClass;
    }

    @c1(version = "1.7")
    @kotlin.internal.f
    public static /* synthetic */ void c(Enum r02) {
    }

    @fg.l
    public static final <T> Class<T> d(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("恞\u0001"));
        Class<T> cls = (Class<T>) t4.getClass();
        l0.n(cls, ProtectedSandApp.s("恢\u0001"));
        return cls;
    }

    @fg.l
    @i(name = "getJavaClass")
    public static final <T> Class<T> e(@fg.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("恞\u0001"));
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).e();
        l0.n(cls, ProtectedSandApp.s("恣\u0001"));
        return cls;
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    @fg.l
    public static final <T> Class<T> g(@fg.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("恞\u0001"));
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).e();
        boolean isPrimitive = cls.isPrimitive();
        String s4 = ProtectedSandApp.s("恤\u0001");
        if (!isPrimitive) {
            l0.n(cls, s4);
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(ProtectedSandApp.s("恭\u0001"))) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(ProtectedSandApp.s("恬\u0001"))) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals(ProtectedSandApp.s("恫\u0001"))) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals(ProtectedSandApp.s("恪\u0001"))) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(ProtectedSandApp.s("恩\u0001"))) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals(ProtectedSandApp.s("恨\u0001"))) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(ProtectedSandApp.s("恧\u0001"))) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(ProtectedSandApp.s("恦\u0001"))) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals(ProtectedSandApp.s("恥\u0001"))) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        l0.n(cls, s4);
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @fg.m
    public static final <T> Class<T> h(@fg.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("恞\u0001"));
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).e();
        if (cls.isPrimitive()) {
            l0.n(cls, ProtectedSandApp.s("恮\u0001"));
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(ProtectedSandApp.s("恷\u0001"))) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals(ProtectedSandApp.s("恶\u0001"))) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals(ProtectedSandApp.s("恵\u0001"))) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals(ProtectedSandApp.s("恴\u0001"))) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals(ProtectedSandApp.s("恳\u0001"))) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals(ProtectedSandApp.s("恲\u0001"))) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals(ProtectedSandApp.s("恱\u0001"))) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals(ProtectedSandApp.s("恰\u0001"))) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals(ProtectedSandApp.s("息\u0001"))) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @fg.l
    @i(name = "getKotlinClass")
    public static final <T> kotlin.reflect.d<T> i(@fg.l Class<T> cls) {
        l0.p(cls, ProtectedSandApp.s("恞\u0001"));
        return l1.d(cls);
    }

    @fg.l
    @i(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<kotlin.reflect.d<T>> j(@fg.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("恞\u0001"));
        Class<kotlin.reflect.d<T>> cls = (Class<kotlin.reflect.d<T>>) dVar.getClass();
        l0.n(cls, ProtectedSandApp.s("恸\u0001"));
        return cls;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @x0(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    public static final boolean l(Object[] objArr) {
        l0.p(objArr, ProtectedSandApp.s("恞\u0001"));
        l0.P();
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
