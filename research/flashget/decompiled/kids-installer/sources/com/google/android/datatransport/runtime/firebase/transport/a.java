package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.o;
import j2.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ClientMetrics.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f12504e = new C0163a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f12505a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f12506b;

    /* renamed from: c, reason: collision with root package name */
    private final b f12507c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12508d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a, reason: collision with other inner class name */
    public static final class C0163a {

        /* renamed from: a, reason: collision with root package name */
        private f f12509a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f12510b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f12511c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f12512d = "";

        C0163a() {
        }

        public C0163a a(d dVar) {
            this.f12510b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f12509a, Collections.unmodifiableList(this.f12510b), this.f12511c, this.f12512d);
        }

        public C0163a c(String str) {
            this.f12512d = str;
            return this;
        }

        public C0163a d(b bVar) {
            this.f12511c = bVar;
            return this;
        }

        public C0163a e(List<d> list) {
            this.f12510b = list;
            return this;
        }

        public C0163a f(f fVar) {
            this.f12509a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f12505a = fVar;
        this.f12506b = list;
        this.f12507c = bVar;
        this.f12508d = str;
    }

    public static a b() {
        return f12504e;
    }

    public static C0163a h() {
        return new C0163a();
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public String a() {
        return this.f12508d;
    }

    @a.b
    public b c() {
        b bVar = this.f12507c;
        return bVar == null ? b.a() : bVar;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    @a.InterfaceC0250a(name = "globalMetrics")
    public b d() {
        return this.f12507c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    @a.InterfaceC0250a(name = "logSourceMetrics")
    public List<d> e() {
        return this.f12506b;
    }

    @a.b
    public f f() {
        f fVar = this.f12505a;
        return fVar == null ? f.a() : fVar;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    @a.InterfaceC0250a(name = "window")
    public f g() {
        return this.f12505a;
    }

    public byte[] i() {
        return o.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        o.a(this, outputStream);
    }
}
