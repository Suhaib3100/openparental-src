package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.proto.h;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ProtoEncoderDoNotUse.java */
@j2.a
/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f12553a;

    static {
        h.a aVar = new h.a();
        b.f12398b.a(aVar);
        f12553a = aVar.d();
    }

    private o() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f12553a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f12553a.c(obj);
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.a c();
}
