package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* compiled from: LogResponse.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12396a = ProtectedSandApp.s("࣪");

    static n a(long j5) {
        return new h(j5);
    }

    @o0
    public static n b(@o0 Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(ProtectedSandApp.s("ࣨ"))) {
                    return jsonReader.peek() == JsonToken.STRING ? new h(Long.parseLong(jsonReader.nextString())) : new h(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException(ProtectedSandApp.s("ࣩ"));
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
