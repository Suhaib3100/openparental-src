package com.bumptech.glide;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.content.preferences.protobuf.o1;
import androidx.core.util.v;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final q f42784a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.provider.a f42785b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.provider.e f42786c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.provider.f f42787d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f42788e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.f f42789f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.provider.b f42790g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.provider.d f42791h = new com.bumptech.glide.provider.d();

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.provider.c f42792i = new com.bumptech.glide.provider.c();

    /* renamed from: j, reason: collision with root package name */
    private final v.a<List<Throwable>> f42793j;

    /* renamed from: p, reason: collision with root package name */
    private static final String f42783p = ProtectedSandApp.s("ࠈ");

    /* renamed from: k, reason: collision with root package name */
    public static final String f42778k = ProtectedSandApp.s("ࠇ");

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final String f42779l = ProtectedSandApp.s("ࠇ");

    /* renamed from: m, reason: collision with root package name */
    public static final String f42780m = ProtectedSandApp.s("ࠅ");

    /* renamed from: n, reason: collision with root package name */
    public static final String f42781n = ProtectedSandApp.s("ࠆ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f42782o = ProtectedSandApp.s("ࠉ");

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@o0 String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super(ProtectedSandApp.s("\u07fc"));
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@o0 Class<?> cls) {
            super(ProtectedSandApp.s("ࠂ") + cls + ProtectedSandApp.s("ࠃ"));
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@o0 Class<?> cls) {
            super(o1.a(ProtectedSandApp.s("ࠄ"), cls));
        }
    }

    public Registry() {
        v.a<List<Throwable>> g4 = com.bumptech.glide.util.pool.a.g();
        this.f42793j = g4;
        this.f42784a = new q(g4);
        this.f42785b = new com.bumptech.glide.provider.a();
        this.f42786c = new com.bumptech.glide.provider.e();
        this.f42787d = new com.bumptech.glide.provider.f();
        this.f42788e = new com.bumptech.glide.load.data.f();
        this.f42789f = new com.bumptech.glide.load.resource.transcode.f();
        this.f42790g = new com.bumptech.glide.provider.b();
        z(Arrays.asList(ProtectedSandApp.s("ࠇ"), ProtectedSandApp.s("ࠅ"), ProtectedSandApp.s("ࠆ")));
    }

    @o0
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f42786c.d(cls, cls2)) {
            for (Class cls5 : this.f42789f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f42786c.b(cls, cls4), this.f42789f.a(cls4, cls5), this.f42793j));
            }
        }
        return arrayList;
    }

    @o0
    public <Data> Registry a(@o0 Class<Data> cls, @o0 com.bumptech.glide.load.d<Data> dVar) {
        this.f42785b.a(cls, dVar);
        return this;
    }

    @o0
    public <TResource> Registry b(@o0 Class<TResource> cls, @o0 com.bumptech.glide.load.l<TResource> lVar) {
        this.f42787d.a(cls, lVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry c(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        e(ProtectedSandApp.s("ࠈ"), cls, cls2, kVar);
        return this;
    }

    @o0
    public <Model, Data> Registry d(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<Model, Data> pVar) {
        this.f42784a.a(cls, cls2, pVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry e(@o0 String str, @o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f42786c.a(str, kVar, cls, cls2);
        return this;
    }

    @o0
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b5 = this.f42790g.b();
        if (b5.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b5;
    }

    @q0
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        s<Data, TResource, Transcode> a5 = this.f42792i.a(cls, cls2, cls3);
        if (this.f42792i.c(a5)) {
            return null;
        }
        if (a5 == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f4 = f(cls, cls2, cls3);
            a5 = f4.isEmpty() ? null : new s<>(cls, cls2, cls3, f4, this.f42793j);
            this.f42792i.d(cls, cls2, cls3, a5);
        }
        return a5;
    }

    @o0
    public <Model> List<com.bumptech.glide.load.model.o<Model, ?>> i(@o0 Model model) {
        return this.f42784a.e(model);
    }

    @o0
    public <Model, TResource, Transcode> List<Class<?>> j(@o0 Class<Model> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        List<Class<?>> b5 = this.f42791h.b(cls, cls2, cls3);
        List<Class<?>> list = b5;
        if (b5 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<?>> it = this.f42784a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f42786c.d(it.next(), cls2)) {
                    if (!this.f42789f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            this.f42791h.c(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    @o0
    public <X> com.bumptech.glide.load.l<X> k(@o0 u<X> uVar) throws NoResultEncoderAvailableException {
        com.bumptech.glide.load.l<X> b5 = this.f42787d.b(uVar.a());
        if (b5 != null) {
            return b5;
        }
        throw new NoResultEncoderAvailableException(uVar.a());
    }

    @o0
    public <X> com.bumptech.glide.load.data.e<X> l(@o0 X x4) {
        return this.f42788e.a(x4);
    }

    @o0
    public <X> com.bumptech.glide.load.d<X> m(@o0 X x4) throws NoSourceEncoderAvailableException {
        com.bumptech.glide.load.d<X> b5 = this.f42785b.b(x4.getClass());
        if (b5 != null) {
            return b5;
        }
        throw new NoSourceEncoderAvailableException(x4.getClass());
    }

    public boolean n(@o0 u<?> uVar) {
        return this.f42787d.b(uVar.a()) != null;
    }

    @o0
    public <Data> Registry o(@o0 Class<Data> cls, @o0 com.bumptech.glide.load.d<Data> dVar) {
        this.f42785b.c(cls, dVar);
        return this;
    }

    @o0
    public <TResource> Registry p(@o0 Class<TResource> cls, @o0 com.bumptech.glide.load.l<TResource> lVar) {
        this.f42787d.c(cls, lVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry q(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        s(ProtectedSandApp.s("ࠉ"), cls, cls2, kVar);
        return this;
    }

    @o0
    public <Model, Data> Registry r(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<Model, Data> pVar) {
        this.f42784a.g(cls, cls2, pVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry s(@o0 String str, @o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f42786c.e(str, kVar, cls, cls2);
        return this;
    }

    @o0
    public Registry t(@o0 ImageHeaderParser imageHeaderParser) {
        this.f42790g.a(imageHeaderParser);
        return this;
    }

    @o0
    public Registry u(@o0 e.a<?> aVar) {
        this.f42788e.b(aVar);
        return this;
    }

    @o0
    @Deprecated
    public <Data> Registry v(@o0 Class<Data> cls, @o0 com.bumptech.glide.load.d<Data> dVar) {
        return a(cls, dVar);
    }

    @o0
    @Deprecated
    public <TResource> Registry w(@o0 Class<TResource> cls, @o0 com.bumptech.glide.load.l<TResource> lVar) {
        return b(cls, lVar);
    }

    @o0
    public <TResource, Transcode> Registry x(@o0 Class<TResource> cls, @o0 Class<Transcode> cls2, @o0 com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> eVar) {
        this.f42789f.c(cls, cls2, eVar);
        return this;
    }

    @o0
    public <Model, Data> Registry y(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 p<? extends Model, ? extends Data> pVar) {
        this.f42784a.i(cls, cls2, pVar);
        return this;
    }

    @o0
    public final Registry z(@o0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(ProtectedSandApp.s("ࠉ"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(ProtectedSandApp.s("ࠈ"));
        this.f42786c.f(arrayList);
        return this;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@o0 Object obj) {
            super(ProtectedSandApp.s("߿") + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@o0 M m4, @o0 List<com.bumptech.glide.load.model.o<M, ?>> list) {
            super(ProtectedSandApp.s("ࠀ") + list + ProtectedSandApp.s("ࠁ") + m4);
        }

        public NoModelLoaderAvailableException(@o0 Class<?> cls, @o0 Class<?> cls2) {
            super(ProtectedSandApp.s("߽") + cls + ProtectedSandApp.s("߾") + cls2);
        }
    }
}
