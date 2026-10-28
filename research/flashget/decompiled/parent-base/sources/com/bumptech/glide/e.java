package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.c;
import com.bumptech.glide.request.target.r;
import com.bumptech.glide.util.h;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes3.dex */
public class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final o<?, ?> f42883k = new b();

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f42884a;

    /* renamed from: b, reason: collision with root package name */
    private final h.b<Registry> f42885b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.k f42886c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f42887d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.h<Object>> f42888e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, o<?, ?>> f42889f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f42890g;

    /* renamed from: h, reason: collision with root package name */
    private final f f42891h;

    /* renamed from: i, reason: collision with root package name */
    private final int f42892i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    @b0("this")
    private com.bumptech.glide.request.i f42893j;

    public e(@o0 Context context, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @o0 h.b<Registry> bVar2, @o0 com.bumptech.glide.request.target.k kVar, @o0 c.a aVar, @o0 Map<Class<?>, o<?, ?>> map, @o0 List<com.bumptech.glide.request.h<Object>> list, @o0 com.bumptech.glide.load.engine.k kVar2, @o0 f fVar, int i4) {
        super(context.getApplicationContext());
        this.f42884a = bVar;
        this.f42886c = kVar;
        this.f42887d = aVar;
        this.f42888e = list;
        this.f42889f = map;
        this.f42890g = kVar2;
        this.f42891h = fVar;
        this.f42892i = i4;
        this.f42885b = com.bumptech.glide.util.h.a(bVar2);
    }

    @o0
    public <X> r<ImageView, X> a(@o0 ImageView imageView, @o0 Class<X> cls) {
        return this.f42886c.a(imageView, cls);
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f42884a;
    }

    public List<com.bumptech.glide.request.h<Object>> c() {
        return this.f42888e;
    }

    public synchronized com.bumptech.glide.request.i d() {
        try {
            if (this.f42893j == null) {
                this.f42893j = this.f42887d.a().u0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f42893j;
    }

    @o0
    public <T> o<?, T> e(@o0 Class<T> cls) {
        o<?, T> oVar = (o) this.f42889f.get(cls);
        if (oVar == null) {
            for (Map.Entry<Class<?>, o<?, ?>> entry : this.f42889f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    oVar = (o) entry.getValue();
                }
            }
        }
        return oVar == null ? (o<?, T>) f42883k : oVar;
    }

    @o0
    public com.bumptech.glide.load.engine.k f() {
        return this.f42890g;
    }

    public f g() {
        return this.f42891h;
    }

    public int h() {
        return this.f42892i;
    }

    @o0
    public Registry i() {
        return this.f42885b.get();
    }
}
