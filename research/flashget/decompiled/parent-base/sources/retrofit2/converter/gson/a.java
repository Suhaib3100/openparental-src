package retrofit2.converter.gson;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.f;
import retrofit2.y;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes9.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f89891a;

    private a(Gson gson) {
        this.f89891a = gson;
    }

    public static a f() {
        return g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException(ProtectedSandApp.s("ꖲ\u0001"));
    }

    @Override // retrofit2.f.a
    public f<?, e0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new b(this.f89891a, this.f89891a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.f.a
    public f<g0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        return new c(this.f89891a, this.f89891a.getAdapter(TypeToken.get(type)));
    }
}
