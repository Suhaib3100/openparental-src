package com.bumptech.glide;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: k, reason: collision with root package name */
    public static final String f10696k = ProtectedSandApp.s("\u0094");

    /* renamed from: l, reason: collision with root package name */
    public static final String f10697l = ProtectedSandApp.s("\u0095");

    /* renamed from: m, reason: collision with root package name */
    public static final String f10698m = ProtectedSandApp.s("\u0096");

    /* renamed from: n, reason: collision with root package name */
    private static final String f10699n = ProtectedSandApp.s("\u0097");

    /* renamed from: o, reason: collision with root package name */
    private static final String f10700o = ProtectedSandApp.s("\u0098");

    /* renamed from: a, reason: collision with root package name */
    private final p f10701a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.provider.a f10702b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.provider.e f10703c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.provider.f f10704d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f10705e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.f f10706f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.provider.b f10707g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.provider.d f10708h = new com.bumptech.glide.provider.d();

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.provider.c f10709i = new com.bumptech.glide.provider.c();

    /* renamed from: j, reason: collision with root package name */
    private final p.a<List<Throwable>> f10710j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@o0 String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super(ProtectedSandApp.s("᱗"));
        }
    }

    /* loaded from: classes3.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@o0 Object obj) {
            super(ProtectedSandApp.s("ᱚ") + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@o0 M m5, @o0 List<n<M, ?>> list) {
            super(ProtectedSandApp.s("ᱛ") + list + ProtectedSandApp.s("ᱜ") + m5);
        }

        public NoModelLoaderAvailableException(@o0 Class<?> cls, @o0 Class<?> cls2) {
            super(ProtectedSandApp.s("᱘") + cls + ProtectedSandApp.s("᱙") + cls2);
        }
    }

    /* loaded from: classes3.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@o0 Class<?> cls) {
            super(ProtectedSandApp.s("ᱝ") + cls + ProtectedSandApp.s("ᱞ"));
        }
    }

    /* loaded from: classes3.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@o0 Class<?> cls) {
            super(ProtectedSandApp.s("ᱟ") + cls);
        }
    }

    public Registry() {
        p.a<List<Throwable>> f6 = com.bumptech.glide.util.pool.a.f();
        this.f10710j = f6;
        this.f10701a = new com.bumptech.glide.load.model.p(f6);
        this.f10702b = new com.bumptech.glide.provider.a();
        this.f10703c = new com.bumptech.glide.provider.e();
        this.f10704d = new com.bumptech.glide.provider.f();
        this.f10705e = new com.bumptech.glide.load.data.f();
        this.f10706f = new com.bumptech.glide.load.resource.transcode.f();
        this.f10707g = new com.bumptech.glide.provider.b();
        z(Arrays.asList(ProtectedSandApp.s("\u008f"), ProtectedSandApp.s("\u008d"), ProtectedSandApp.s("\u008e")));
    }

    @o0
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f10703c.d(cls, cls2)) {
            for (Class cls5 : this.f10706f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f10703c.b(cls, cls4), this.f10706f.a(cls4, cls5), this.f10710j));
            }
        }
        return arrayList;
    }

    @o0
    public <Data> Registry a(@o0 Class<Data> cls, @o0 com.bumptech.glide.load.d<Data> dVar) {
        this.f10702b.a(cls, dVar);
        return this;
    }

    @o0
    public <TResource> Registry b(@o0 Class<TResource> cls, @o0 com.bumptech.glide.load.l<TResource> lVar) {
        this.f10704d.a(cls, lVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry c(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        e(ProtectedSandApp.s("\u0090"), cls, cls2, kVar);
        return this;
    }

    @o0
    public <Model, Data> Registry d(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<Model, Data> oVar) {
        this.f10701a.a(cls, cls2, oVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry e(@o0 String str, @o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f10703c.a(str, kVar, cls, cls2);
        return this;
    }

    @o0
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b6 = this.f10707g.b();
        if (b6.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b6;
    }

    @q0
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        s<Data, TResource, Transcode> a6 = this.f10709i.a(cls, cls2, cls3);
        if (this.f10709i.c(a6)) {
            return null;
        }
        if (a6 == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f6 = f(cls, cls2, cls3);
            a6 = f6.isEmpty() ? null : new s<>(cls, cls2, cls3, f6, this.f10710j);
            this.f10709i.d(cls, cls2, cls3, a6);
        }
        return a6;
    }

    @o0
    public <Model> List<n<Model, ?>> i(@o0 Model model) {
        return this.f10701a.e(model);
    }

    @o0
    public <Model, TResource, Transcode> List<Class<?>> j(@o0 Class<Model> cls, @o0 Class<TResource> cls2, @o0 Class<Transcode> cls3) {
        List<Class<?>> b6 = this.f10708h.b(cls, cls2, cls3);
        List<Class<?>> list = b6;
        if (b6 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<?>> it = this.f10701a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f10703c.d(it.next(), cls2)) {
                    if (!this.f10706f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            this.f10708h.c(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    @o0
    public <X> com.bumptech.glide.load.l<X> k(@o0 u<X> uVar) throws NoResultEncoderAvailableException {
        com.bumptech.glide.load.l<X> b6 = this.f10704d.b(uVar.c());
        if (b6 != null) {
            return b6;
        }
        throw new NoResultEncoderAvailableException(uVar.c());
    }

    @o0
    public <X> com.bumptech.glide.load.data.e<X> l(@o0 X x5) {
        return this.f10705e.a(x5);
    }

    @o0
    public <X> com.bumptech.glide.load.d<X> m(@o0 X x5) throws NoSourceEncoderAvailableException {
        com.bumptech.glide.load.d<X> b6 = this.f10702b.b(x5.getClass());
        if (b6 != null) {
            return b6;
        }
        throw new NoSourceEncoderAvailableException(x5.getClass());
    }

    public boolean n(@o0 u<?> uVar) {
        return this.f10704d.b(uVar.c()) != null;
    }

    @o0
    public <Data> Registry o(@o0 Class<Data> cls, @o0 com.bumptech.glide.load.d<Data> dVar) {
        this.f10702b.c(cls, dVar);
        return this;
    }

    @o0
    public <TResource> Registry p(@o0 Class<TResource> cls, @o0 com.bumptech.glide.load.l<TResource> lVar) {
        this.f10704d.c(cls, lVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry q(@o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        s(ProtectedSandApp.s("\u0091"), cls, cls2, kVar);
        return this;
    }

    @o0
    public <Model, Data> Registry r(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<Model, Data> oVar) {
        this.f10701a.g(cls, cls2, oVar);
        return this;
    }

    @o0
    public <Data, TResource> Registry s(@o0 String str, @o0 Class<Data> cls, @o0 Class<TResource> cls2, @o0 com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f10703c.e(str, kVar, cls, cls2);
        return this;
    }

    @o0
    public Registry t(@o0 ImageHeaderParser imageHeaderParser) {
        this.f10707g.a(imageHeaderParser);
        return this;
    }

    @o0
    public Registry u(@o0 e.a<?> aVar) {
        this.f10705e.b(aVar);
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
        this.f10706f.c(cls, cls2, eVar);
        return this;
    }

    @o0
    public <Model, Data> Registry y(@o0 Class<Model> cls, @o0 Class<Data> cls2, @o0 o<? extends Model, ? extends Data> oVar) {
        this.f10701a.i(cls, cls2, oVar);
        return this;
    }

    @o0
    public final Registry z(@o0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(ProtectedSandApp.s("\u0092"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(ProtectedSandApp.s("\u0093"));
        this.f10703c.f(arrayList);
        return this;
    }
}
