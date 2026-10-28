package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.d;
import com.google.firebase.messaging.m0;
import j2.a;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MessagingClientEventExtension.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f17402b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.messaging.reporting.a f17403a;

    /* compiled from: MessagingClientEventExtension.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.firebase.messaging.reporting.a f17404a = null;

        a() {
        }

        public b a() {
            return new b(this.f17404a);
        }

        public a b(com.google.firebase.messaging.reporting.a aVar) {
            this.f17404a = aVar;
            return this;
        }
    }

    b(com.google.firebase.messaging.reporting.a aVar) {
        this.f17403a = aVar;
    }

    public static b a() {
        return f17402b;
    }

    public static a d() {
        return new a();
    }

    @a.b
    public com.google.firebase.messaging.reporting.a b() {
        com.google.firebase.messaging.reporting.a aVar = this.f17403a;
        return aVar == null ? com.google.firebase.messaging.reporting.a.f() : aVar;
    }

    @d(tag = 1)
    @a.InterfaceC0250a(name = "messagingClientEvent")
    public com.google.firebase.messaging.reporting.a c() {
        return this.f17403a;
    }

    public byte[] e() {
        return m0.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        m0.a(this, outputStream);
    }
}
