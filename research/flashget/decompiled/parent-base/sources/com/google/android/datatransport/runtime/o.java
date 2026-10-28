package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.proto.h;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ProtoEncoderDoNotUse.java */
@t9.a
/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f52083a;

    static {
        h.a aVar = new h.a();
        b.f51938b.a(aVar);
        f52083a = aVar.d();
    }

    private o() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f52083a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f52083a.c(obj);
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.a c();
}
