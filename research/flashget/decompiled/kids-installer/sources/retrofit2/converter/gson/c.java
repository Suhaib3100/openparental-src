package retrofit2.converter.gson;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.h0;
import retrofit2.f;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes6.dex */
final class c<T> implements f<h0, T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f32980a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f32981b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f32980a = gson;
        this.f32981b = typeAdapter;
    }

    @Override // retrofit2.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(h0 h0Var) throws IOException {
        JsonReader newJsonReader = this.f32980a.newJsonReader(h0Var.d());
        try {
            T read = this.f32981b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException(ProtectedSandApp.s("鐍"));
        } finally {
            h0Var.close();
        }
    }
}
