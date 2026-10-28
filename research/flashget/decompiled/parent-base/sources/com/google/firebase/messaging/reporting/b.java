package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.d;
import com.google.firebase.messaging.r0;
import java.io.IOException;
import java.io.OutputStream;
import t9.a;

/* compiled from: MessagingClientEventExtension.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f60310b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.messaging.reporting.a f60311a;

    /* compiled from: MessagingClientEventExtension.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.firebase.messaging.reporting.a f60312a = null;

        a() {
        }

        public b a() {
            return new b(this.f60312a);
        }

        public a b(com.google.firebase.messaging.reporting.a aVar) {
            this.f60312a = aVar;
            return this;
        }
    }

    b(com.google.firebase.messaging.reporting.a aVar) {
        this.f60311a = aVar;
    }

    public static b a() {
        return f60310b;
    }

    public static a d() {
        return new a();
    }

    @a.b
    public com.google.firebase.messaging.reporting.a b() {
        com.google.firebase.messaging.reporting.a aVar = this.f60311a;
        return aVar == null ? com.google.firebase.messaging.reporting.a.f() : aVar;
    }

    @a.InterfaceC1396a(name = "messagingClientEvent")
    @d(tag = 1)
    public com.google.firebase.messaging.reporting.a c() {
        return this.f60311a;
    }

    public byte[] e() {
        return r0.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        r0.a(this, outputStream);
    }
}
