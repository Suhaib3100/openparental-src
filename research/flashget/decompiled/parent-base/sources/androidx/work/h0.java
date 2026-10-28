package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.work.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkQuery.java */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<UUID> f35981a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f35982b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f35983c;

    /* renamed from: d, reason: collision with root package name */
    private final List<f0.a> f35984d;

    /* compiled from: WorkQuery.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<UUID> f35985a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<String> f35986b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<String> f35987c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        List<f0.a> f35988d = new ArrayList();

        private a() {
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public static a f(@o0 List<UUID> ids) {
            a aVar = new a();
            aVar.a(ids);
            return aVar;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public static a g(@o0 List<f0.a> states) {
            a aVar = new a();
            aVar.b(states);
            return aVar;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public static a h(@o0 List<String> tags) {
            a aVar = new a();
            aVar.c(tags);
            return aVar;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public static a i(@o0 List<String> uniqueWorkNames) {
            a aVar = new a();
            aVar.d(uniqueWorkNames);
            return aVar;
        }

        @o0
        public a a(@o0 List<UUID> ids) {
            this.f35985a.addAll(ids);
            return this;
        }

        @o0
        public a b(@o0 List<f0.a> states) {
            this.f35988d.addAll(states);
            return this;
        }

        @o0
        public a c(@o0 List<String> tags) {
            this.f35987c.addAll(tags);
            return this;
        }

        @o0
        public a d(@o0 List<String> uniqueWorkNames) {
            this.f35986b.addAll(uniqueWorkNames);
            return this;
        }

        @o0
        public h0 e() {
            if (this.f35985a.isEmpty() && this.f35986b.isEmpty() && this.f35987c.isEmpty() && this.f35988d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new h0(this);
        }
    }

    h0(@o0 a builder) {
        this.f35981a = builder.f35985a;
        this.f35982b = builder.f35986b;
        this.f35983c = builder.f35987c;
        this.f35984d = builder.f35988d;
    }

    @o0
    public List<UUID> a() {
        return this.f35981a;
    }

    @o0
    public List<f0.a> b() {
        return this.f35984d;
    }

    @o0
    public List<String> c() {
        return this.f35983c;
    }

    @o0
    public List<String> d() {
        return this.f35982b;
    }
}
