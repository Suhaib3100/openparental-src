package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f24358a = new c();

    private c() {
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.f a(Class<?> cls) {
        int i5 = 0;
        while (cls.isArray()) {
            i5++;
            cls = cls.getComponentType();
            l0.o(cls, ProtectedSandApp.s("䠠"));
        }
        if (!cls.isPrimitive()) {
            kotlin.reflect.jvm.internal.impl.name.b a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
            kotlin.reflect.jvm.internal.impl.name.c b6 = a6.b();
            l0.o(b6, ProtectedSandApp.s("䠥"));
            kotlin.reflect.jvm.internal.impl.name.b m5 = cVar.m(b6);
            if (m5 != null) {
                a6 = m5;
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(a6, i5);
        }
        if (l0.g(cls, Void.TYPE)) {
            kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f24051f.l());
            l0.o(m6, ProtectedSandApp.s("䠡"));
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m6, i5);
        }
        kotlin.reflect.jvm.internal.impl.builtins.i primitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(cls.getName()).getPrimitiveType();
        l0.o(primitiveType, ProtectedSandApp.s("䠢"));
        if (i5 > 0) {
            kotlin.reflect.jvm.internal.impl.name.b m7 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getArrayTypeFqName());
            l0.o(m7, ProtectedSandApp.s("䠣"));
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m7, i5 - 1);
        }
        kotlin.reflect.jvm.internal.impl.name.b m8 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getTypeFqName());
        l0.o(m8, ProtectedSandApp.s("䠤"));
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(m8, i5);
    }

    private final void c(Class<?> cls, r.d dVar) {
        String s5;
        Constructor<?>[] constructorArr;
        int i5;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        l0.o(declaredConstructors, ProtectedSandApp.s("䠦"));
        int length = declaredConstructors.length;
        int i6 = 0;
        while (i6 < length) {
            Constructor<?> constructor = declaredConstructors[i6];
            kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.name.h.f25614j;
            m mVar = m.f24372a;
            l0.o(constructor, ProtectedSandApp.s("䠧"));
            r.e b6 = dVar.b(fVar, mVar.a(constructor));
            if (b6 == null) {
                constructorArr = declaredConstructors;
                i5 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("䠨"));
                int length2 = declaredAnnotations.length;
                int i7 = 0;
                while (true) {
                    s5 = ProtectedSandApp.s("䠩");
                    if (i7 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i7];
                    l0.o(annotation, s5);
                    f(b6, annotation);
                    i7++;
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                l0.o(parameterAnnotations, ProtectedSandApp.s("䠪"));
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    for (int i8 = 0; i8 < length4; i8++) {
                        Annotation[] annotationArr = parameterAnnotations[i8];
                        l0.o(annotationArr, ProtectedSandApp.s("䠫"));
                        int length5 = annotationArr.length;
                        int i9 = 0;
                        while (i9 < length5) {
                            Annotation annotation2 = annotationArr[i9];
                            Class<?> e6 = p3.b.e(p3.b.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i10 = length;
                            kotlin.reflect.jvm.internal.impl.name.b a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e6);
                            int i11 = length3;
                            l0.o(annotation2, s5);
                            r.a c6 = b6.c(i8 + length3, a6, new b(annotation2));
                            if (c6 != null) {
                                f24358a.h(c6, annotation2, e6);
                            }
                            i9++;
                            declaredConstructors = constructorArr2;
                            length = i10;
                            length3 = i11;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i5 = length;
                b6.a();
            }
            i6++;
            declaredConstructors = constructorArr;
            length = i5;
        }
    }

    private final void d(Class<?> cls, r.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("䠬"));
        for (Field field : declaredFields) {
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(field.getName());
            l0.o(p5, ProtectedSandApp.s("䠭"));
            m mVar = m.f24372a;
            l0.o(field, ProtectedSandApp.s("䠮"));
            r.c a6 = dVar.a(p5, mVar.b(field), null);
            if (a6 != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("䠯"));
                for (Annotation annotation : declaredAnnotations) {
                    l0.o(annotation, ProtectedSandApp.s("䠰"));
                    f(a6, annotation);
                }
                a6.a();
            }
        }
    }

    private final void e(Class<?> cls, r.d dVar) {
        String s5;
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("䠱"));
        int length = declaredMethods.length;
        int i5 = 0;
        while (i5 < length) {
            Method method = declaredMethods[i5];
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(method.getName());
            l0.o(p5, ProtectedSandApp.s("䠲"));
            m mVar = m.f24372a;
            l0.o(method, ProtectedSandApp.s("䠳"));
            r.e b6 = dVar.b(p5, mVar.c(method));
            if (b6 == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                l0.o(declaredAnnotations, ProtectedSandApp.s("䠴"));
                int length2 = declaredAnnotations.length;
                int i6 = 0;
                while (true) {
                    s5 = ProtectedSandApp.s("䠵");
                    if (i6 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i6];
                    l0.o(annotation, s5);
                    f(b6, annotation);
                    i6++;
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                l0.o(parameterAnnotations, ProtectedSandApp.s("䠶"));
                Annotation[][] annotationArr = parameterAnnotations;
                int length3 = annotationArr.length;
                for (int i7 = 0; i7 < length3; i7++) {
                    Annotation[] annotationArr2 = annotationArr[i7];
                    l0.o(annotationArr2, ProtectedSandApp.s("䠷"));
                    int length4 = annotationArr2.length;
                    int i8 = 0;
                    while (i8 < length4) {
                        Annotation annotation2 = annotationArr2[i8];
                        Class<?> e6 = p3.b.e(p3.b.a(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.b a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e6);
                        Method[] methodArr2 = declaredMethods;
                        l0.o(annotation2, s5);
                        r.a c6 = b6.c(i7, a6, new b(annotation2));
                        if (c6 != null) {
                            f24358a.h(c6, annotation2, e6);
                        }
                        i8++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                b6.a();
            }
            i5++;
            declaredMethods = methodArr;
        }
    }

    private final void f(r.c cVar, Annotation annotation) {
        Class<?> e6 = p3.b.e(p3.b.a(annotation));
        r.a b6 = cVar.b(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(e6), new b(annotation));
        if (b6 != null) {
            f24358a.h(b6, annotation, e6);
        }
    }

    private final void g(r.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        Set set;
        Object ft;
        Class<?> cls = obj.getClass();
        boolean g5 = l0.g(cls, Class.class);
        String s5 = ProtectedSandApp.s("䠸");
        if (g5) {
            l0.n(obj, s5);
            aVar.b(fVar, a((Class) obj));
            return;
        }
        set = i.f24365a;
        if (set.contains(cls)) {
            aVar.c(fVar, obj);
            return;
        }
        boolean h5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.h(cls);
        String s6 = ProtectedSandApp.s("䠹");
        if (h5) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            l0.o(cls, ProtectedSandApp.s("䠺"));
            kotlin.reflect.jvm.internal.impl.name.b a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls);
            l0.n(obj, s6);
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(((Enum) obj).name());
            l0.o(p5, ProtectedSandApp.s("䠻"));
            aVar.d(fVar, a6, p5);
            return;
        }
        boolean isAssignableFrom = Annotation.class.isAssignableFrom(cls);
        String s7 = ProtectedSandApp.s("䠼");
        if (isAssignableFrom) {
            Class<?>[] interfaces = cls.getInterfaces();
            l0.o(interfaces, ProtectedSandApp.s("䠽"));
            ft = t.ft(interfaces);
            Class<?> cls2 = (Class) ft;
            l0.o(cls2, ProtectedSandApp.s("䠾"));
            r.a e6 = aVar.e(fVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(cls2));
            if (e6 == null) {
                return;
            }
            l0.n(obj, s7);
            h(e6, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䡂") + cls + ProtectedSandApp.s("䡃") + obj);
        }
        r.b f6 = aVar.f(fVar);
        if (f6 == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        boolean isEnum = componentType.isEnum();
        String s8 = ProtectedSandApp.s("䠿");
        int i5 = 0;
        String s9 = ProtectedSandApp.s("䡀");
        if (isEnum) {
            l0.o(componentType, s8);
            kotlin.reflect.jvm.internal.impl.name.b a7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(componentType);
            l0.n(obj, s9);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i5 < length) {
                Object obj2 = objArr[i5];
                l0.n(obj2, s6);
                kotlin.reflect.jvm.internal.impl.name.f p6 = kotlin.reflect.jvm.internal.impl.name.f.p(((Enum) obj2).name());
                l0.o(p6, ProtectedSandApp.s("䡁"));
                f6.c(a7, p6);
                i5++;
            }
        } else if (l0.g(componentType, Class.class)) {
            l0.n(obj, s9);
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i5 < length2) {
                Object obj3 = objArr2[i5];
                l0.n(obj3, s5);
                f6.e(a((Class) obj3));
                i5++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            l0.n(obj, s9);
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i5 < length3) {
                Object obj4 = objArr3[i5];
                l0.o(componentType, s8);
                r.a d6 = f6.d(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(componentType));
                if (d6 != null) {
                    l0.n(obj4, s7);
                    h(d6, (Annotation) obj4, componentType);
                }
                i5++;
            }
        } else {
            l0.n(obj, s9);
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i5 < length4) {
                f6.b(objArr4[i5]);
                i5++;
            }
        }
        f6.a();
    }

    private final void h(r.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("䡄"));
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                l0.m(invoke);
                kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(method.getName());
                l0.o(p5, ProtectedSandApp.s("䡅"));
                g(aVar, p5, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(@d5.d Class<?> cls, @d5.d r.c cVar) {
        l0.p(cls, ProtectedSandApp.s("䡆"));
        l0.p(cVar, ProtectedSandApp.s("䡇"));
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        l0.o(declaredAnnotations, ProtectedSandApp.s("䡈"));
        for (Annotation annotation : declaredAnnotations) {
            l0.o(annotation, ProtectedSandApp.s("䡉"));
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(@d5.d Class<?> cls, @d5.d r.d dVar) {
        l0.p(cls, ProtectedSandApp.s("䡊"));
        l0.p(dVar, ProtectedSandApp.s("䡋"));
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
