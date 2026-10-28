package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.g0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.f;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes9.dex */
final class n extends f.a {

    /* renamed from: a, reason: collision with root package name */
    static final f.a f89959a = new n();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    static final class a<T> implements f<g0, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        final f<g0, T> f89960a;

        a(f<g0, T> fVar) {
            this.f89960a = fVar;
        }

        @Override // retrofit2.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(g0 g0Var) throws IOException {
            return Optional.ofNullable(this.f89960a.a(g0Var));
        }
    }

    n() {
    }

    @Override // retrofit2.f.a
    @zc.h
    public f<g0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (c0.h(type) != Optional.class) {
            return null;
        }
        return new a(yVar.n(c0.g(0, (ParameterizedType) type), annotationArr));
    }
}
