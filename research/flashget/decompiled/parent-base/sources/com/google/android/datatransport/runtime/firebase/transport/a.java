package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.o;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t9.a;

/* compiled from: ClientMetrics.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f52032e = new C0789a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f52033a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f52034b;

    /* renamed from: c, reason: collision with root package name */
    private final b f52035c;

    /* renamed from: d, reason: collision with root package name */
    private final String f52036d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a, reason: collision with other inner class name */
    public static final class C0789a {

        /* renamed from: a, reason: collision with root package name */
        private f f52037a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f52038b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f52039c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f52040d = "";

        C0789a() {
        }

        public C0789a a(d dVar) {
            this.f52038b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f52037a, Collections.unmodifiableList(this.f52038b), this.f52039c, this.f52040d);
        }

        public C0789a c(String str) {
            this.f52040d = str;
            return this;
        }

        public C0789a d(b bVar) {
            this.f52039c = bVar;
            return this;
        }

        public C0789a e(List<d> list) {
            this.f52038b = list;
            return this;
        }

        public C0789a f(f fVar) {
            this.f52037a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f52033a = fVar;
        this.f52034b = list;
        this.f52035c = bVar;
        this.f52036d = str;
    }

    public static a b() {
        return f52032e;
    }

    public static C0789a h() {
        return new C0789a();
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public String a() {
        return this.f52036d;
    }

    @a.b
    public b c() {
        b bVar = this.f52035c;
        return bVar == null ? b.a() : bVar;
    }

    @a.InterfaceC1396a(name = "globalMetrics")
    @com.google.firebase.encoders.proto.d(tag = 3)
    public b d() {
        return this.f52035c;
    }

    @a.InterfaceC1396a(name = "logSourceMetrics")
    @com.google.firebase.encoders.proto.d(tag = 2)
    public List<d> e() {
        return this.f52034b;
    }

    @a.b
    public f f() {
        f fVar = this.f52033a;
        return fVar == null ? f.a() : fVar;
    }

    @a.InterfaceC1396a(name = "window")
    @com.google.firebase.encoders.proto.d(tag = 1)
    public f g() {
        return this.f52033a;
    }

    public byte[] i() {
        return o.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        o.a(this, outputStream);
    }
}
