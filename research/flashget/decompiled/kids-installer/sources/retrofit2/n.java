package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.h0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.f;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes6.dex */
final class n extends f.a {

    /* renamed from: a, reason: collision with root package name */
    static final f.a f33043a = new n();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    static final class a<T> implements f<h0, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        final f<h0, T> f33044a;

        a(f<h0, T> fVar) {
            this.f33044a = fVar;
        }

        @Override // retrofit2.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(h0 h0Var) throws IOException {
            return Optional.ofNullable(this.f33044a.a(h0Var));
        }
    }

    n() {
    }

    @Override // retrofit2.f.a
    @Nullable
    public f<h0, ?> d(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.h(type) != Optional.class) {
            return null;
        }
        return new a(wVar.l(null, a0.g(0, (ParameterizedType) type), annotationArr));
    }
}
