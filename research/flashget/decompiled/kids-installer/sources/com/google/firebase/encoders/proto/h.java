package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f16622a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f16623b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f16624c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes3.dex */
    public static final class a implements k2.b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d<Object> f16625d = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.proto.g
            @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
            public final void a(Object obj, com.google.firebase.encoders.e eVar) {
                h.a.f(obj, eVar);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.d<?>> f16626a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.f<?>> f16627b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.encoders.d<Object> f16628c = f16625d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
            throw new EncodingException(ProtectedSandApp.s("⩿") + obj.getClass().getCanonicalName());
        }

        public h d() {
            return new h(new HashMap(this.f16626a), new HashMap(this.f16627b), this.f16628c);
        }

        @o0
        public a e(@o0 k2.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // k2.b
        @o0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public <U> a b(@o0 Class<U> cls, @o0 com.google.firebase.encoders.d<? super U> dVar) {
            this.f16626a.put(cls, dVar);
            this.f16627b.remove(cls);
            return this;
        }

        @Override // k2.b
        @o0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public <U> a a(@o0 Class<U> cls, @o0 com.google.firebase.encoders.f<? super U> fVar) {
            this.f16627b.put(cls, fVar);
            this.f16626a.remove(cls);
            return this;
        }

        @o0
        public a i(@o0 com.google.firebase.encoders.d<Object> dVar) {
            this.f16628c = dVar;
            return this;
        }
    }

    h(Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f16622a = map;
        this.f16623b = map2;
        this.f16624c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@o0 Object obj, @o0 OutputStream outputStream) throws IOException {
        new f(outputStream, this.f16622a, this.f16623b, this.f16624c).C(obj);
    }

    @o0
    public byte[] c(@o0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
