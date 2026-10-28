package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.h;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ProtoEncoderDoNotUse.java */
@t9.a
/* loaded from: classes6.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f60277a;

    static {
        h.a aVar = new h.a();
        a.f59961b.a(aVar);
        f60277a = aVar.d();
    }

    private r0() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f60277a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f60277a.c(obj);
    }

    public abstract com.google.firebase.messaging.reporting.b c();
}
