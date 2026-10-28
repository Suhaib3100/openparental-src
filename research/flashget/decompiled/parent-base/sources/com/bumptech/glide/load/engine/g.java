package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: classes3.dex */
final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o.a<?>> f44025a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f44026b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f44027c;

    /* renamed from: d, reason: collision with root package name */
    private Object f44028d;

    /* renamed from: e, reason: collision with root package name */
    private int f44029e;

    /* renamed from: f, reason: collision with root package name */
    private int f44030f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f44031g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f44032h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.i f44033i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.m<?>> f44034j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f44035k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f44036l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f44037m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.f f44038n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.j f44039o;

    /* renamed from: p, reason: collision with root package name */
    private j f44040p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44041q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f44042r;

    g() {
    }

    void a() {
        this.f44027c = null;
        this.f44028d = null;
        this.f44038n = null;
        this.f44031g = null;
        this.f44035k = null;
        this.f44033i = null;
        this.f44039o = null;
        this.f44034j = null;
        this.f44040p = null;
        this.f44025a.clear();
        this.f44036l = false;
        this.f44026b.clear();
        this.f44037m = false;
    }

    com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f44027c.b();
    }

    List<com.bumptech.glide.load.f> c() {
        if (!this.f44037m) {
            this.f44037m = true;
            this.f44026b.clear();
            List<o.a<?>> g4 = g();
            int size = g4.size();
            for (int i4 = 0; i4 < size; i4++) {
                o.a<?> aVar = g4.get(i4);
                if (!this.f44026b.contains(aVar.f44319a)) {
                    this.f44026b.add(aVar.f44319a);
                }
                for (int i5 = 0; i5 < aVar.f44320b.size(); i5++) {
                    if (!this.f44026b.contains(aVar.f44320b.get(i5))) {
                        this.f44026b.add(aVar.f44320b.get(i5));
                    }
                }
            }
        }
        return this.f44026b;
    }

    com.bumptech.glide.load.engine.cache.a d() {
        return this.f44032h.a();
    }

    j e() {
        return this.f44040p;
    }

    int f() {
        return this.f44030f;
    }

    List<o.a<?>> g() {
        if (!this.f44036l) {
            this.f44036l = true;
            this.f44025a.clear();
            List i4 = this.f44027c.i().i(this.f44028d);
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                o.a<?> b5 = ((com.bumptech.glide.load.model.o) i4.get(i5)).b(this.f44028d, this.f44029e, this.f44030f, this.f44033i);
                if (b5 != null) {
                    this.f44025a.add(b5);
                }
            }
        }
        return this.f44025a;
    }

    <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f44027c.i().h(cls, this.f44031g, this.f44035k);
    }

    Class<?> i() {
        return this.f44028d.getClass();
    }

    List<com.bumptech.glide.load.model.o<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f44027c.i().i(file);
    }

    com.bumptech.glide.load.i k() {
        return this.f44033i;
    }

    com.bumptech.glide.j l() {
        return this.f44039o;
    }

    List<Class<?>> m() {
        return this.f44027c.i().j(this.f44028d.getClass(), this.f44031g, this.f44035k);
    }

    <Z> com.bumptech.glide.load.l<Z> n(u<Z> uVar) {
        return this.f44027c.i().k(uVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t4) {
        return this.f44027c.i().l(t4);
    }

    com.bumptech.glide.load.f p() {
        return this.f44038n;
    }

    <X> com.bumptech.glide.load.d<X> q(X x4) throws Registry.NoSourceEncoderAvailableException {
        return this.f44027c.i().m(x4);
    }

    Class<?> r() {
        return this.f44035k;
    }

    <Z> com.bumptech.glide.load.m<Z> s(Class<Z> cls) {
        com.bumptech.glide.load.m<Z> mVar = (com.bumptech.glide.load.m) this.f44034j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.m<?>>> it = this.f44034j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (com.bumptech.glide.load.m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f44034j.isEmpty() || !this.f44041q) {
            return com.bumptech.glide.load.resource.k.c();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ࣨ") + cls + ProtectedSandApp.s("ࣩ"));
    }

    int t() {
        return this.f44029e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.f fVar, int i4, int i5, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.j jVar2, com.bumptech.glide.load.i iVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z4, boolean z5, h.e eVar2) {
        this.f44027c = eVar;
        this.f44028d = obj;
        this.f44038n = fVar;
        this.f44029e = i4;
        this.f44030f = i5;
        this.f44040p = jVar;
        this.f44031g = cls;
        this.f44032h = eVar2;
        this.f44035k = cls2;
        this.f44039o = jVar2;
        this.f44033i = iVar;
        this.f44034j = map;
        this.f44041q = z4;
        this.f44042r = z5;
    }

    boolean w(u<?> uVar) {
        return this.f44027c.i().n(uVar);
    }

    boolean x() {
        return this.f44042r;
    }

    boolean y(com.bumptech.glide.load.f fVar) {
        List<o.a<?>> g4 = g();
        int size = g4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (g4.get(i4).f44319a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
