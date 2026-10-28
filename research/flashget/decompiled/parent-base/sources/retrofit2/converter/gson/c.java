package retrofit2.converter.gson;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.g0;
import retrofit2.f;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes9.dex */
final class c<T> implements f<g0, T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f89896a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f89897b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f89896a = gson;
        this.f89897b = typeAdapter;
    }

    @Override // retrofit2.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(g0 g0Var) throws IOException {
        JsonReader newJsonReader = this.f89896a.newJsonReader(g0Var.d());
        try {
            T read2 = this.f89897b.read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException(ProtectedSandApp.s("ꖵ\u0001"));
        } finally {
            g0Var.close();
        }
    }
}
