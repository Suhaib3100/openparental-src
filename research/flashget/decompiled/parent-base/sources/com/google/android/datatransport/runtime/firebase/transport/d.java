package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t9.a;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f52049c = new a().b();

    /* renamed from: a, reason: collision with root package name */
    private final String f52050a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f52051b;

    /* compiled from: LogSourceMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f52052a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f52053b = new ArrayList();

        a() {
        }

        public a a(c cVar) {
            this.f52053b.add(cVar);
            return this;
        }

        public d b() {
            return new d(this.f52052a, Collections.unmodifiableList(this.f52053b));
        }

        public a c(List<c> list) {
            this.f52053b = list;
            return this;
        }

        public a d(String str) {
            this.f52052a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f52050a = str;
        this.f52051b = list;
    }

    public static d a() {
        return f52049c;
    }

    public static a d() {
        return new a();
    }

    @a.InterfaceC1396a(name = "logEventDropped")
    @com.google.firebase.encoders.proto.d(tag = 2)
    public List<c> b() {
        return this.f52051b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public String c() {
        return this.f52050a;
    }
}
