package p3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KClass;

/* compiled from: JvmClassMapping.kt */
@i(name = "JvmClassMappingKt")
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u001f\u001a\u00020 \"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0014*\u0006\u0012\u0002\b\u00030!¢\u0006\u0002\u0010\"\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\";\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\b0\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"-\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015\";\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\"-\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012\"+\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", "Ljava/lang/Class;", "E", "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "java", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @d5.d
    public static final <T extends Annotation> KClass<? extends T> a(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("棶"));
        Class<? extends Annotation> annotationType = t5.annotationType();
        l0.o(annotationType, ProtectedSandApp.s("棷"));
        KClass<? extends T> i5 = i(annotationType);
        l0.n(i5, ProtectedSandApp.s("棸"));
        return i5;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        l0.p(r12, ProtectedSandApp.s("棹"));
        Class<E> declaringClass = r12.getDeclaringClass();
        l0.o(declaringClass, ProtectedSandApp.s("棺"));
        return declaringClass;
    }

    @SinceKotlin(version = "1.7")
    @InlineOnly
    public static /* synthetic */ void c(Enum r02) {
    }

    @d5.d
    public static final <T> Class<T> d(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("棻"));
        Class<T> cls = (Class<T>) t5.getClass();
        l0.n(cls, ProtectedSandApp.s("棼"));
        return cls;
    }

    @i(name = "getJavaClass")
    @d5.d
    public static final <T> Class<T> e(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("棽"));
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).f();
        l0.n(cls, ProtectedSandApp.s("棾"));
        return cls;
    }

    public static /* synthetic */ void f(KClass kClass) {
    }

    @d5.d
    public static final <T> Class<T> g(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("棿"));
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).f();
        boolean isPrimitive = cls.isPrimitive();
        String s5 = ProtectedSandApp.s("椀");
        if (!isPrimitive) {
            l0.n(cls, s5);
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(ProtectedSandApp.s("椉"))) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(ProtectedSandApp.s("椈"))) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals(ProtectedSandApp.s("椇"))) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals(ProtectedSandApp.s("椆"))) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(ProtectedSandApp.s("椅"))) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals(ProtectedSandApp.s("椄"))) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(ProtectedSandApp.s("椃"))) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(ProtectedSandApp.s("椂"))) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals(ProtectedSandApp.s("椁"))) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        l0.n(cls, s5);
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @d5.e
    public static final <T> Class<T> h(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("椊"));
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).f();
        if (cls.isPrimitive()) {
            l0.n(cls, ProtectedSandApp.s("椋"));
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(ProtectedSandApp.s("椔"))) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals(ProtectedSandApp.s("椓"))) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals(ProtectedSandApp.s("椒"))) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals(ProtectedSandApp.s("椑"))) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals(ProtectedSandApp.s("椐"))) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals(ProtectedSandApp.s("椏"))) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals(ProtectedSandApp.s("椎"))) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals(ProtectedSandApp.s("植"))) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals(ProtectedSandApp.s("椌"))) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @i(name = "getKotlinClass")
    @d5.d
    public static final <T> KClass<T> i(@d5.d Class<T> cls) {
        l0.p(cls, ProtectedSandApp.s("椕"));
        return l1.d(cls);
    }

    @i(name = "getRuntimeClassOfKClassInstance")
    @d5.d
    public static final <T> Class<KClass<T>> j(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("椖"));
        Class<KClass<T>> cls = (Class<KClass<T>>) kClass.getClass();
        l0.n(cls, ProtectedSandApp.s("椗"));
        return cls;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(KClass kClass) {
    }

    public static final boolean l(Object[] objArr) {
        l0.p(objArr, ProtectedSandApp.s("椘"));
        l0.P();
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
