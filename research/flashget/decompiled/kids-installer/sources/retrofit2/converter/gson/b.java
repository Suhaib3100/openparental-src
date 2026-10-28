package retrofit2.converter.gson;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.f0;
import okhttp3.y;
import okio.m;
import retrofit2.f;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes6.dex */
final class b<T> implements f<T, f0> {

    /* renamed from: c, reason: collision with root package name */
    private static final y f32976c = y.h(ProtectedSandApp.s("鐋"));

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f32977d = Charset.forName(ProtectedSandApp.s("鐌"));

    /* renamed from: a, reason: collision with root package name */
    private final Gson f32978a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f32979b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f32978a = gson;
        this.f32979b = typeAdapter;
    }

    @Override // retrofit2.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 a(T t5) throws IOException {
        m mVar = new m();
        JsonWriter newJsonWriter = this.f32978a.newJsonWriter(new OutputStreamWriter(mVar.k1(), f32977d));
        this.f32979b.write(newJsonWriter, t5);
        newJsonWriter.close();
        return f0.g(f32976c, mVar.x0());
    }
}
