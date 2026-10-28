package retrofit2.converter.gson;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.f0;
import okhttp3.h0;
import retrofit2.f;
import retrofit2.w;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes6.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f32975a;

    private a(Gson gson) {
        this.f32975a = gson;
    }

    public static a f() {
        return g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException(ProtectedSandApp.s("鐊"));
    }

    @Override // retrofit2.f.a
    public f<?, f0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        return new b(this.f32975a, this.f32975a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.f.a
    public f<h0, ?> d(Type type, Annotation[] annotationArr, w wVar) {
        return new c(this.f32975a, this.f32975a.getAdapter(TypeToken.get(type)));
    }
}
