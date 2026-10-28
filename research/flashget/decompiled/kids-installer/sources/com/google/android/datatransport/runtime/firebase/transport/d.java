package com.google.android.datatransport.runtime.firebase.transport;

import j2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f12521c = new a().b();

    /* renamed from: a, reason: collision with root package name */
    private final String f12522a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f12523b;

    /* compiled from: LogSourceMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f12524a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f12525b = new ArrayList();

        a() {
        }

        public a a(c cVar) {
            this.f12525b.add(cVar);
            return this;
        }

        public d b() {
            return new d(this.f12524a, Collections.unmodifiableList(this.f12525b));
        }

        public a c(List<c> list) {
            this.f12525b = list;
            return this;
        }

        public a d(String str) {
            this.f12524a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f12522a = str;
        this.f12523b = list;
    }

    public static d a() {
        return f12521c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    @a.InterfaceC0250a(name = "logEventDropped")
    public List<c> b() {
        return this.f12523b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public String c() {
        return this.f12522a;
    }
}
