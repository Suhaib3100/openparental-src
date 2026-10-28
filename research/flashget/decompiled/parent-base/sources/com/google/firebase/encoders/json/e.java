package com.google.firebase.encoders.json;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public final class e implements u9.b<e> {

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Object> f59613e = new com.google.firebase.encoders.json.b();

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<String> f59614f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<Boolean> f59615g = new d();

    /* renamed from: h, reason: collision with root package name */
    private static final b f59616h = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f59617a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f59618b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.d<Object> f59619c = f59613e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f59620d = false;

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
            f fVar = new f(writer, e.this.f59617a, e.this.f59618b, e.this.f59619c, e.this.f59620d);
            fVar.y(obj, false);
            fVar.I();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    private static final class b implements com.google.firebase.encoders.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f59622a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("I\u0001"), Locale.US);
            f59622a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("J\u0001")));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@o0 Date date, @o0 com.google.firebase.encoders.g gVar) throws IOException {
            gVar.l(f59622a.format(date));
        }

        b(a aVar) {
        }
    }

    public e() {
        a(String.class, f59614f);
        a(Boolean.class, f59615g);
        a(Date.class, f59616h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
        throw new EncodingException(ProtectedSandApp.s("K\u0001") + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Boolean bool, com.google.firebase.encoders.g gVar) throws IOException {
        gVar.o(bool.booleanValue());
    }

    @o0
    public com.google.firebase.encoders.a j() {
        return new a();
    }

    @o0
    public e k(@o0 u9.a aVar) {
        aVar.a(this);
        return this;
    }

    @o0
    public e l(boolean z4) {
        this.f59620d = z4;
        return this;
    }

    @Override // u9.b
    @o0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public <T> e b(@o0 Class<T> cls, @o0 com.google.firebase.encoders.d<? super T> dVar) {
        this.f59617a.put(cls, dVar);
        this.f59618b.remove(cls);
        return this;
    }

    @Override // u9.b
    @o0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public <T> e a(@o0 Class<T> cls, @o0 com.google.firebase.encoders.f<? super T> fVar) {
        this.f59618b.put(cls, fVar);
        this.f59617a.remove(cls);
        return this;
    }

    @o0
    public e r(@o0 com.google.firebase.encoders.d<Object> dVar) {
        this.f59619c = dVar;
        return this;
    }
}
