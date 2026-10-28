package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.f0;
import okhttp3.h0;

/* compiled from: Converter.java */
/* loaded from: classes5.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        protected static Type a(int i5, ParameterizedType parameterizedType) {
            return a0.g(i5, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return a0.h(type);
        }

        @Nullable
        public f<?, f0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
            return null;
        }

        @Nullable
        public f<h0, ?> d(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }

        @Nullable
        public f<?, String> e(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }
    }

    @Nullable
    T a(F f6) throws IOException;
}
