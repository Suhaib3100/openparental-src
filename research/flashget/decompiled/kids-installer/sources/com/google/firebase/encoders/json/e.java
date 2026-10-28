package com.google.firebase.encoders.json;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class e implements k2.b<e> {

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Object> f16592e = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.json.b
        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.e eVar) {
            e.m(obj, eVar);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<String> f16593f = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.c
        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.g gVar) {
            gVar.m((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<Boolean> f16594g = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.d
        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.g gVar) {
            e.o((Boolean) obj, gVar);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f16595h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f16596a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f16597b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.d<Object> f16598c = f16592e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16599d = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    class a implements com.google.firebase.encoders.a {
        a() {
        }

        @Override // com.google.firebase.encoders.a
        public String a(@o0 Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.encoders.a
        public void b(@o0 Object obj, @o0 Writer writer) throws IOException {
            f fVar = new f(writer, e.this.f16596a, e.this.f16597b, e.this.f16598c, e.this.f16599d);
            fVar.w(obj, false);
            fVar.G();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    private static final class b implements com.google.firebase.encoders.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f16601a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("⩰"), Locale.US);
            f16601a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("⩱")));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@o0 Date date, @o0 com.google.firebase.encoders.g gVar) throws IOException {
            gVar.m(f16601a.format(date));
        }

        b(a aVar) {
        }
    }

    public e() {
        a(String.class, f16593f);
        a(Boolean.class, f16594g);
        a(Date.class, f16595h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
        throw new EncodingException(ProtectedSandApp.s("⩲") + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Boolean bool, com.google.firebase.encoders.g gVar) throws IOException {
        gVar.n(bool.booleanValue());
    }

    @o0
    public com.google.firebase.encoders.a j() {
        return new a();
    }

    @o0
    public e k(@o0 k2.a aVar) {
        aVar.a(this);
        return this;
    }

    @o0
    public e l(boolean z5) {
        this.f16599d = z5;
        return this;
    }

    @Override // k2.b
    @o0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public <T> e b(@o0 Class<T> cls, @o0 com.google.firebase.encoders.d<? super T> dVar) {
        this.f16596a.put(cls, dVar);
        this.f16597b.remove(cls);
        return this;
    }

    @Override // k2.b
    @o0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public <T> e a(@o0 Class<T> cls, @o0 com.google.firebase.encoders.f<? super T> fVar) {
        this.f16597b.put(cls, fVar);
        this.f16596a.remove(cls);
        return this;
    }

    @o0
    public e r(@o0 com.google.firebase.encoders.d<Object> dVar) {
        this.f16598c = dVar;
        return this;
    }
}
