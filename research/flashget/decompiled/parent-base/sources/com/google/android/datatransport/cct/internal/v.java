package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Reader;

/* compiled from: LogResponse.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f51931a = ProtectedSandApp.s("알");

    static v a(long j4) {
        return new l(j4);
    }

    @o0
    public static v b(@o0 Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(ProtectedSandApp.s("않"))) {
                    return jsonReader.peek() == JsonToken.STRING ? new l(Long.parseLong(jsonReader.nextString())) : new l(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException(ProtectedSandApp.s("앋"));
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
