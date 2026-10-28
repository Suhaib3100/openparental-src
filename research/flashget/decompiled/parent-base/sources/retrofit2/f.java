package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.e0;
import okhttp3.g0;

/* compiled from: Converter.java */
/* loaded from: classes9.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        protected static Type a(int i4, ParameterizedType parameterizedType) {
            return c0.g(i4, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return c0.h(type);
        }

        @zc.h
        public f<?, e0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
            return null;
        }

        @zc.h
        public f<g0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }

        @zc.h
        public f<?, String> e(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }
    }

    @zc.h
    T a(F f4) throws IOException;
}
