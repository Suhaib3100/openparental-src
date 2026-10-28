package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: CallAdapter.java */
/* loaded from: classes9.dex */
public interface c<R, T> {

    /* compiled from: CallAdapter.java */
    public static abstract class a {
        protected static Type b(int i4, ParameterizedType parameterizedType) {
            return c0.g(i4, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return c0.h(type);
        }

        @zc.h
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    T b(b<R> bVar);
}
