package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes3.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0148b<Data> f11516a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        class C0147a implements InterfaceC0148b<ByteBuffer> {
            C0147a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0148b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0148b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<byte[], ByteBuffer> c(@o0 r rVar) {
            return new b(new C0147a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0148b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: o, reason: collision with root package name */
        private final byte[] f11518o;

        /* renamed from: p, reason: collision with root package name */
        private final InterfaceC0148b<Data> f11519p;

        c(byte[] bArr, InterfaceC0148b<Data> interfaceC0148b) {
            this.f11518o = bArr;
            this.f11519p = interfaceC0148b;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f11519p.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super Data> aVar) {
            aVar.f(this.f11519p.b(this.f11518o));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        class a implements InterfaceC0148b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0148b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0148b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<byte[], InputStream> c(@o0 r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0148b<Data> interfaceC0148b) {
        this.f11516a = interfaceC0148b;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@o0 byte[] bArr, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(bArr), new c(bArr, this.f11516a));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 byte[] bArr) {
        return true;
    }
}
