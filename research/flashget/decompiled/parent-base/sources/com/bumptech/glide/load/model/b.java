package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes3.dex */
public class b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0747b<Data> f44256a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        class C0746a implements InterfaceC0747b<ByteBuffer> {
            C0746a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0747b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0747b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<byte[], ByteBuffer> e(@o0 s sVar) {
            return new b(new C0746a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    public interface InterfaceC0747b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f44258b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0747b<Data> f44259c;

        c(byte[] bArr, InterfaceC0747b<Data> interfaceC0747b) {
            this.f44258b = bArr;
            this.f44259c = interfaceC0747b;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f44259c.a();
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
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super Data> aVar) {
            aVar.f(this.f44259c.b(this.f44258b));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        class a implements InterfaceC0747b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0747b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0747b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<byte[], InputStream> e(@o0 s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0747b<Data> interfaceC0747b) {
        this.f44256a = interfaceC0747b;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 byte[] bArr, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(bArr), new c(bArr, this.f44256a));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 byte[] bArr) {
        return true;
    }
}
