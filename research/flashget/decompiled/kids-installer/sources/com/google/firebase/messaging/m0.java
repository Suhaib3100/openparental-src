package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.h;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ProtoEncoderDoNotUse.java */
@j2.a
/* loaded from: classes2.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f17339a;

    static {
        h.a aVar = new h.a();
        a.f17086b.a(aVar);
        f17339a = aVar.d();
    }

    private m0() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f17339a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f17339a.c(obj);
    }

    public abstract com.google.firebase.messaging.reporting.b c();
}
