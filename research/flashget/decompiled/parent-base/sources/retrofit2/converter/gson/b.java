package retrofit2.converter.gson;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.e0;
import okhttp3.x;
import okio.m;
import retrofit2.f;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes9.dex */
final class b<T> implements f<T, e0> {

    /* renamed from: c, reason: collision with root package name */
    private static final x f89892c = x.h(ProtectedSandApp.s("ꖳ\u0001"));

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f89893d = Charset.forName(ProtectedSandApp.s("ꖴ\u0001"));

    /* renamed from: a, reason: collision with root package name */
    private final Gson f89894a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f89895b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f89894a = gson;
        this.f89895b = typeAdapter;
    }

    @Override // retrofit2.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 a(T t4) throws IOException {
        m mVar = new m();
        JsonWriter newJsonWriter = this.f89894a.newJsonWriter(new OutputStreamWriter(mVar.G3(), f89893d));
        this.f89895b.write(newJsonWriter, t4);
        newJsonWriter.close();
        return e0.create(f89892c, mVar.b3());
    }
}
