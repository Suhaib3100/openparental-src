package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.b;
import com.bumptech.glide.request.target.r;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final m<?, ?> f10744k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f10745a;

    /* renamed from: b, reason: collision with root package name */
    private final Registry f10746b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.k f10747c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f10748d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.h<Object>> f10749e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f10750f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f10751g;

    /* renamed from: h, reason: collision with root package name */
    private final e f10752h;

    /* renamed from: i, reason: collision with root package name */
    private final int f10753i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    @b0("this")
    private com.bumptech.glide.request.i f10754j;

    public d(@o0 Context context, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @o0 Registry registry, @o0 com.bumptech.glide.request.target.k kVar, @o0 b.a aVar, @o0 Map<Class<?>, m<?, ?>> map, @o0 List<com.bumptech.glide.request.h<Object>> list, @o0 com.bumptech.glide.load.engine.k kVar2, @o0 e eVar, int i5) {
        super(context.getApplicationContext());
        this.f10745a = bVar;
        this.f10746b = registry;
        this.f10747c = kVar;
        this.f10748d = aVar;
        this.f10749e = list;
        this.f10750f = map;
        this.f10751g = kVar2;
        this.f10752h = eVar;
        this.f10753i = i5;
    }

    @o0
    public <X> r<ImageView, X> a(@o0 ImageView imageView, @o0 Class<X> cls) {
        return this.f10747c.a(imageView, cls);
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f10745a;
    }

    public List<com.bumptech.glide.request.h<Object>> c() {
        return this.f10749e;
    }

    public synchronized com.bumptech.glide.request.i d() {
        if (this.f10754j == null) {
            this.f10754j = this.f10748d.build().x0();
        }
        return this.f10754j;
    }

    @o0
    public <T> m<?, T> e(@o0 Class<T> cls) {
        m<?, T> mVar = (m) this.f10750f.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : this.f10750f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? (m<?, T>) f10744k : mVar;
    }

    @o0
    public com.bumptech.glide.load.engine.k f() {
        return this.f10751g;
    }

    public e g() {
        return this.f10752h;
    }

    public int h() {
        return this.f10753i;
    }

    @o0
    public Registry i() {
        return this.f10746b;
    }
}
