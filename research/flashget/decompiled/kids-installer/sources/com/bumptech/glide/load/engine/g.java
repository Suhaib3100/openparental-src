package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<n.a<?>> f11313a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f11314b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f11315c;

    /* renamed from: d, reason: collision with root package name */
    private Object f11316d;

    /* renamed from: e, reason: collision with root package name */
    private int f11317e;

    /* renamed from: f, reason: collision with root package name */
    private int f11318f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f11319g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f11320h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.i f11321i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.m<?>> f11322j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f11323k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11324l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11325m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.f f11326n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.i f11327o;

    /* renamed from: p, reason: collision with root package name */
    private j f11328p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11329q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11330r;

    g() {
    }

    void a() {
        this.f11315c = null;
        this.f11316d = null;
        this.f11326n = null;
        this.f11319g = null;
        this.f11323k = null;
        this.f11321i = null;
        this.f11327o = null;
        this.f11322j = null;
        this.f11328p = null;
        this.f11313a.clear();
        this.f11324l = false;
        this.f11314b.clear();
        this.f11325m = false;
    }

    com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f11315c.b();
    }

    List<com.bumptech.glide.load.f> c() {
        if (!this.f11325m) {
            this.f11325m = true;
            this.f11314b.clear();
            List<n.a<?>> g5 = g();
            int size = g5.size();
            for (int i5 = 0; i5 < size; i5++) {
                n.a<?> aVar = g5.get(i5);
                if (!this.f11314b.contains(aVar.f11569a)) {
                    this.f11314b.add(aVar.f11569a);
                }
                for (int i6 = 0; i6 < aVar.f11570b.size(); i6++) {
                    if (!this.f11314b.contains(aVar.f11570b.get(i6))) {
                        this.f11314b.add(aVar.f11570b.get(i6));
                    }
                }
            }
        }
        return this.f11314b;
    }

    com.bumptech.glide.load.engine.cache.a d() {
        return this.f11320h.a();
    }

    j e() {
        return this.f11328p;
    }

    int f() {
        return this.f11318f;
    }

    List<n.a<?>> g() {
        if (!this.f11324l) {
            this.f11324l = true;
            this.f11313a.clear();
            List i5 = this.f11315c.i().i(this.f11316d);
            int size = i5.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a<?> b6 = ((com.bumptech.glide.load.model.n) i5.get(i6)).b(this.f11316d, this.f11317e, this.f11318f, this.f11321i);
                if (b6 != null) {
                    this.f11313a.add(b6);
                }
            }
        }
        return this.f11313a;
    }

    <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f11315c.i().h(cls, this.f11319g, this.f11323k);
    }

    Class<?> i() {
        return this.f11316d.getClass();
    }

    List<com.bumptech.glide.load.model.n<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f11315c.i().i(file);
    }

    com.bumptech.glide.load.i k() {
        return this.f11321i;
    }

    com.bumptech.glide.i l() {
        return this.f11327o;
    }

    List<Class<?>> m() {
        return this.f11315c.i().j(this.f11316d.getClass(), this.f11319g, this.f11323k);
    }

    <Z> com.bumptech.glide.load.l<Z> n(u<Z> uVar) {
        return this.f11315c.i().k(uVar);
    }

    com.bumptech.glide.load.f o() {
        return this.f11326n;
    }

    <X> com.bumptech.glide.load.d<X> p(X x5) throws Registry.NoSourceEncoderAvailableException {
        return this.f11315c.i().m(x5);
    }

    Class<?> q() {
        return this.f11323k;
    }

    <Z> com.bumptech.glide.load.m<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.m<Z> mVar = (com.bumptech.glide.load.m) this.f11322j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.m<?>>> it = this.f11322j.entrySet().iterator();
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
        if (!this.f11322j.isEmpty() || !this.f11329q) {
            return com.bumptech.glide.load.resource.l.c();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ŀ") + cls + ProtectedSandApp.s("Ł"));
    }

    int s() {
        return this.f11317e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void u(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.f fVar, int i5, int i6, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.i iVar, com.bumptech.glide.load.i iVar2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z5, boolean z6, h.e eVar) {
        this.f11315c = dVar;
        this.f11316d = obj;
        this.f11326n = fVar;
        this.f11317e = i5;
        this.f11318f = i6;
        this.f11328p = jVar;
        this.f11319g = cls;
        this.f11320h = eVar;
        this.f11323k = cls2;
        this.f11327o = iVar;
        this.f11321i = iVar2;
        this.f11322j = map;
        this.f11329q = z5;
        this.f11330r = z6;
    }

    boolean v(u<?> uVar) {
        return this.f11315c.i().n(uVar);
    }

    boolean w() {
        return this.f11330r;
    }

    boolean x(com.bumptech.glide.load.f fVar) {
        List<n.a<?>> g5 = g();
        int size = g5.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (g5.get(i5).f11569a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
