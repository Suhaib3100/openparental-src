package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f76208a = new c();

    private c() {
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.f a(Class<?> cls) {
        int i4 = 0;
        while (cls.isArray()) {
            i4++;
            cls = cls.getComponentType();
            l0.o(cls, ProtectedSandApp.s("湄\u0001"));
        }
        if (!cls.isPrimitive()) {
            kotlin.reflect.jvm.internal.impl.name.b a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
            kotlin.reflect.jvm.internal.impl.name.c b5 = a5.b();
            l0.o(b5, ProtectedSandApp.s("湇\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b m4 = cVar.m(b5);
            if (m4 != null) {
                a5 = m4;
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(a5, i4);
        }
        boolean g4 = l0.g(cls, Void.TYPE);
        String s4 = ProtectedSandApp.s("湅\u0001");
        if (g4) {
            kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f75848f.l());
            l0.o(m5, s4);
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m5, i4);
        }
        kotlin.reflect.jvm.internal.impl.builtins.i primitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(cls.getName()).getPrimitiveType();
        l0.o(primitiveType, ProtectedSandApp.s("湆\u0001"));
        if (i4 > 0) {
            kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getArrayTypeFqName());
            l0.o(m6, s4);
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m6, i4 - 1);
        }
        kotlin.reflect.jvm.internal.impl.name.b m7 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getTypeFqName());
        l0.o(m7, s4);
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m7, i4);
    }

    private final void c(Class<?> cls, t.d dVar) {
        Constructor<?>[] constructorArr;
        int i4;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        l0.o(declaredConstructors, ProtectedSandApp.s("湈\u0001"));
        int length = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length) {
            Constructor<?> constructor = declaredConstructors[i5];
            kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.name.h.f77596i;
            m mVar = m.f76222a;
            l0.m(constructor);
            t.e b5 = dVar.b(fVar, mVar.a(constructor));
            if (b5 == null) {
                constructorArr = declaredConstructors;
                i4 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("湉\u0001"));
                for (Annotation annotation : declaredAnnotations) {
                    l0.m(annotation);
                    f(b5, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                l0.m(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i6 = 0; i6 < length3; i6++) {
                        Annotation[] annotationArr = parameterAnnotations[i6];
                        l0.m(annotationArr);
                        int length4 = annotationArr.length;
                        int i7 = 0;
                        while (i7 < length4) {
                            Annotation annotation2 = annotationArr[i7];
                            Class<?> e4 = kd.b.e(kd.b.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            kotlin.reflect.jvm.internal.impl.name.b a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e4);
                            int i10 = length;
                            l0.m(annotation2);
                            t.a b6 = b5.b(i6 + length2, a5, new b(annotation2));
                            if (b6 != null) {
                                f76208a.h(b6, annotation2, e4);
                            }
                            i7++;
                            declaredConstructors = constructorArr2;
                            length = i10;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i4 = length;
                b5.a();
            }
            i5++;
            declaredConstructors = constructorArr;
            length = i4;
        }
    }

    private final void d(Class<?> cls, t.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("湊\u0001"));
        for (Field field : declaredFields) {
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(field.getName());
            l0.o(f4, ProtectedSandApp.s("湋\u0001"));
            m mVar = m.f76222a;
            l0.m(field);
            t.c a5 = dVar.a(f4, mVar.b(field), null);
            if (a5 != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("湉\u0001"));
                for (Annotation annotation : declaredAnnotations) {
                    l0.m(annotation);
                    f(a5, annotation);
                }
                a5.a();
            }
        }
    }

    private final void e(Class<?> cls, t.d dVar) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("湌\u0001"));
        for (Method method : declaredMethods) {
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(method.getName());
            l0.o(f4, ProtectedSandApp.s("湋\u0001"));
            m mVar = m.f76222a;
            l0.m(method);
            t.e b5 = dVar.b(f4, mVar.c(method));
            if (b5 != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("湉\u0001"));
                for (Annotation annotation : declaredAnnotations) {
                    l0.m(annotation);
                    f(b5, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                l0.o(parameterAnnotations, ProtectedSandApp.s("湍\u0001"));
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    Annotation[] annotationArr2 = annotationArr[i4];
                    l0.m(annotationArr2);
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> e4 = kd.b.e(kd.b.a(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.b a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e4);
                        l0.m(annotation2);
                        t.a b6 = b5.b(i4, a5, new b(annotation2));
                        if (b6 != null) {
                            f76208a.h(b6, annotation2, e4);
                        }
                    }
                }
                b5.a();
            }
        }
    }

    private final void f(t.c cVar, Annotation annotation) {
        Class<?> e4 = kd.b.e(kd.b.a(annotation));
        t.a c5 = cVar.c(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e4), new b(annotation));
        if (c5 != null) {
            f76208a.h(c5, annotation, e4);
        }
    }

    private final void g(t.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        boolean g4 = l0.g(cls, Class.class);
        String s4 = ProtectedSandApp.s("湎\u0001");
        if (g4) {
            l0.n(obj, s4);
            aVar.d(fVar, a((Class) obj));
            return;
        }
        set = i.f76215a;
        if (set.contains(cls)) {
            aVar.e(fVar, obj);
            return;
        }
        boolean h4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.h(cls);
        String s5 = ProtectedSandApp.s("湋\u0001");
        String s6 = ProtectedSandApp.s("湏\u0001");
        if (h4) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            l0.m(cls);
            kotlin.reflect.jvm.internal.impl.name.b a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls);
            l0.n(obj, s6);
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(((Enum) obj).name());
            l0.o(f4, s5);
            aVar.b(fVar, a5, f4);
            return;
        }
        boolean isAssignableFrom = Annotation.class.isAssignableFrom(cls);
        String s7 = ProtectedSandApp.s("湐\u0001");
        if (isAssignableFrom) {
            Class<?>[] interfaces = cls.getInterfaces();
            l0.o(interfaces, ProtectedSandApp.s("湑\u0001"));
            Class<?> cls2 = (Class) kotlin.collections.l.gt(interfaces);
            l0.m(cls2);
            t.a c5 = aVar.c(fVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls2));
            if (c5 == null) {
                return;
            }
            l0.n(obj, s7);
            h(c5, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("湓\u0001") + cls + ProtectedSandApp.s("湔\u0001") + obj);
        }
        t.b f5 = aVar.f(fVar);
        if (f5 == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        boolean isEnum = componentType.isEnum();
        int i4 = 0;
        String s10 = ProtectedSandApp.s("湒\u0001");
        if (isEnum) {
            l0.m(componentType);
            kotlin.reflect.jvm.internal.impl.name.b a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(componentType);
            l0.n(obj, s10);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i4 < length) {
                Object obj2 = objArr[i4];
                l0.n(obj2, s6);
                kotlin.reflect.jvm.internal.impl.name.f f6 = kotlin.reflect.jvm.internal.impl.name.f.f(((Enum) obj2).name());
                l0.o(f6, s5);
                f5.d(a6, f6);
                i4++;
            }
        } else if (l0.g(componentType, Class.class)) {
            l0.n(obj, s10);
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i4 < length2) {
                Object obj3 = objArr2[i4];
                l0.n(obj3, s4);
                f5.e(a((Class) obj3));
                i4++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            l0.n(obj, s10);
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i4 < length3) {
                Object obj4 = objArr3[i4];
                l0.m(componentType);
                t.a b5 = f5.b(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(componentType));
                if (b5 != null) {
                    l0.n(obj4, s7);
                    h(b5, (Annotation) obj4, componentType);
                }
                i4++;
            }
        } else {
            l0.n(obj, s10);
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i4 < length4) {
                f5.c(objArr4[i4]);
                i4++;
            }
        }
        f5.a();
    }

    private final void h(t.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("湌\u0001"));
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                l0.m(invoke);
                kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(method.getName());
                l0.o(f4, ProtectedSandApp.s("湋\u0001"));
                g(aVar, f4, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(@fg.l Class<?> cls, @fg.l t.c cVar) {
        l0.p(cls, ProtectedSandApp.s("湕\u0001"));
        l0.p(cVar, ProtectedSandApp.s("湖\u0001"));
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        l0.o(declaredAnnotations, ProtectedSandApp.s("湉\u0001"));
        for (Annotation annotation : declaredAnnotations) {
            l0.m(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(@fg.l Class<?> cls, @fg.l t.d dVar) {
        l0.p(cls, ProtectedSandApp.s("湕\u0001"));
        l0.p(dVar, ProtectedSandApp.s("湗\u0001"));
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
