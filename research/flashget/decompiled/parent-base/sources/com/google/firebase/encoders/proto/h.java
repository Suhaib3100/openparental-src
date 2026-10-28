package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f59643a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f59644b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f59645c;

    /* compiled from: ProtobufEncoder.java */
    public static final class a implements u9.b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d<Object> f59646d = new g();

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.d<?>> f59647a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.f<?>> f59648b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.encoders.d<Object> f59649c = f59646d;

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
            throw new EncodingException(ProtectedSandApp.s("Z\u0001") + obj.getClass().getCanonicalName());
        }

        public h d() {
            return new h(new HashMap(this.f59647a), new HashMap(this.f59648b), this.f59649c);
        }

        @o0
        public a e(@o0 u9.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // u9.b
        @o0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public <U> a b(@o0 Class<U> cls, @o0 com.google.firebase.encoders.d<? super U> dVar) {
            this.f59647a.put(cls, dVar);
            this.f59648b.remove(cls);
            return this;
        }

        @Override // u9.b
        @o0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public <U> a a(@o0 Class<U> cls, @o0 com.google.firebase.encoders.f<? super U> fVar) {
            this.f59648b.put(cls, fVar);
            this.f59647a.remove(cls);
            return this;
        }

        @o0
        public a i(@o0 com.google.firebase.encoders.d<Object> dVar) {
            this.f59649c = dVar;
            return this;
        }
    }

    h(Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f59643a = map;
        this.f59644b = map2;
        this.f59645c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@o0 Object obj, @o0 OutputStream outputStream) throws IOException {
        new f(outputStream, this.f59643a, this.f59644b, this.f59645c).C(obj);
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
