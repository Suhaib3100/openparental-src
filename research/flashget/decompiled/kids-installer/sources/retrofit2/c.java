package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: CallAdapter.java */
/* loaded from: classes5.dex */
public interface c<R, T> {

    /* compiled from: CallAdapter.java */
    public static abstract class a {
        protected static Type b(int i5, ParameterizedType parameterizedType) {
            return a0.g(i5, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return a0.h(type);
        }

        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, w wVar);
    }

    Type a();

    T b(b<R> bVar);
}
