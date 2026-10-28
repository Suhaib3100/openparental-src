package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: AnnotationUtils.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final org.apache.commons.lang3.builder.t f85630a = new C1332a();

    /* compiled from: AnnotationUtils.java */
    /* renamed from: org.apache.commons.lang3.a$a, reason: collision with other inner class name */
    static class C1332a extends org.apache.commons.lang3.builder.t {
        private static final long E = 1;

        C1332a() {
            T0(true);
            N0(true);
            d1(true);
            g1(true);
            f1(false);
            S0("(");
            R0(")");
            V0(", ");
            Q0("[");
            O0("]");
        }

        @Override // org.apache.commons.lang3.builder.t
        protected void D(StringBuffer stringBuffer, String str, Object obj) {
            if (obj instanceof Annotation) {
                obj = a.i((Annotation) obj);
            }
            stringBuffer.append(obj);
        }

        @Override // org.apache.commons.lang3.builder.t
        protected String v0(Class<?> cls) {
            for (Class<?> cls2 : s.g(cls)) {
                if (Annotation.class.isAssignableFrom(cls2)) {
                    return "@".concat(cls2.getName());
                }
            }
            return "";
        }
    }

    private static boolean a(Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (annotationArr.length != annotationArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < annotationArr.length; i4++) {
            if (!d(annotationArr[i4], annotationArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(Class<?> cls, Object obj, Object obj2) {
        return cls.isAnnotation() ? a((Annotation[]) obj, (Annotation[]) obj2) : cls.equals(Byte.TYPE) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : cls.equals(Short.TYPE) ? Arrays.equals((short[]) obj, (short[]) obj2) : cls.equals(Integer.TYPE) ? Arrays.equals((int[]) obj, (int[]) obj2) : cls.equals(Character.TYPE) ? Arrays.equals((char[]) obj, (char[]) obj2) : cls.equals(Long.TYPE) ? Arrays.equals((long[]) obj, (long[]) obj2) : cls.equals(Float.TYPE) ? Arrays.equals((float[]) obj, (float[]) obj2) : cls.equals(Double.TYPE) ? Arrays.equals((double[]) obj, (double[]) obj2) : cls.equals(Boolean.TYPE) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    private static int c(Class<?> cls, Object obj) {
        return cls.equals(Byte.TYPE) ? Arrays.hashCode((byte[]) obj) : cls.equals(Short.TYPE) ? Arrays.hashCode((short[]) obj) : cls.equals(Integer.TYPE) ? Arrays.hashCode((int[]) obj) : cls.equals(Character.TYPE) ? Arrays.hashCode((char[]) obj) : cls.equals(Long.TYPE) ? Arrays.hashCode((long[]) obj) : cls.equals(Float.TYPE) ? Arrays.hashCode((float[]) obj) : cls.equals(Double.TYPE) ? Arrays.hashCode((double[]) obj) : cls.equals(Boolean.TYPE) ? Arrays.hashCode((boolean[]) obj) : Arrays.hashCode((Object[]) obj);
    }

    public static boolean d(Annotation annotation, Annotation annotation2) {
        if (annotation == annotation2) {
            return true;
        }
        if (annotation != null && annotation2 != null) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<? extends Annotation> annotationType2 = annotation2.annotationType();
            k1.b0(annotationType, "Annotation %s with null annotationType()", annotation);
            k1.b0(annotationType2, "Annotation %s with null annotationType()", annotation2);
            if (!annotationType.equals(annotationType2)) {
                return false;
            }
            try {
                for (Method method : annotationType.getDeclaredMethods()) {
                    if (method.getParameterTypes().length == 0 && g(method.getReturnType())) {
                        if (!h(method.getReturnType(), method.invoke(annotation, null), method.invoke(annotation2, null))) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static int e(Annotation annotation) {
        int i4 = 0;
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, null);
                if (invoke == null) {
                    throw new IllegalStateException(String.format("Annotation method %s returned null", method));
                }
                i4 += f(method.getName(), invoke);
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
        return i4;
    }

    private static int f(String str, Object obj) {
        return (str.hashCode() * 127) ^ (obj.getClass().isArray() ? c(obj.getClass().getComponentType(), obj) : obj instanceof Annotation ? e((Annotation) obj) : obj.hashCode());
    }

    public static boolean g(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isPrimitive() || cls.isEnum() || cls.isAnnotation() || String.class.equals(cls) || Class.class.equals(cls);
    }

    private static boolean h(Class<?> cls, Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return cls.isArray() ? b(cls.getComponentType(), obj, obj2) : cls.isAnnotation() ? d((Annotation) obj, (Annotation) obj2) : obj.equals(obj2);
    }

    public static String i(Annotation annotation) {
        org.apache.commons.lang3.builder.r rVar = new org.apache.commons.lang3.builder.r(annotation, f85630a, null);
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            if (method.getParameterTypes().length <= 0) {
                try {
                    rVar.o(method.getName(), method.invoke(annotation, null));
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return rVar.toString();
    }
}
