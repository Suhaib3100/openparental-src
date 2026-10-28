package androidx.content.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* loaded from: classes3.dex */
abstract class d {

    /* compiled from: AllocatedBuffer.java */
    static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f28663a;

        a(ByteBuffer byteBuffer) {
            this.f28663a = byteBuffer;
        }

        @Override // androidx.content.preferences.protobuf.d
        public byte[] a() {
            return this.f28663a.array();
        }

        @Override // androidx.content.preferences.protobuf.d
        public int b() {
            return this.f28663a.arrayOffset();
        }

        @Override // androidx.content.preferences.protobuf.d
        public boolean c() {
            return this.f28663a.hasArray();
        }

        @Override // androidx.content.preferences.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int e() {
            return this.f28663a.limit();
        }

        @Override // androidx.content.preferences.protobuf.d
        public ByteBuffer f() {
            return this.f28663a;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int g() {
            return this.f28663a.position();
        }

        @Override // androidx.content.preferences.protobuf.d
        public d h(int i4) {
            this.f28663a.position(i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int i() {
            return this.f28663a.remaining();
        }
    }

    /* compiled from: AllocatedBuffer.java */
    static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private int f28664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f28665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28667d;

        b(byte[] bArr, int i4, int i5) {
            this.f28665b = bArr;
            this.f28666c = i4;
            this.f28667d = i5;
        }

        @Override // androidx.content.preferences.protobuf.d
        public byte[] a() {
            return this.f28665b;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int b() {
            return this.f28666c;
        }

        @Override // androidx.content.preferences.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // androidx.content.preferences.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int e() {
            return this.f28667d;
        }

        @Override // androidx.content.preferences.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.content.preferences.protobuf.d
        public int g() {
            return this.f28664a;
        }

        @Override // androidx.content.preferences.protobuf.d
        public d h(int i4) {
            if (i4 < 0 || i4 > this.f28667d) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid position: ", i4));
            }
            this.f28664a = i4;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.d
        public int i() {
            return this.f28667d - this.f28664a;
        }
    }

    d() {
    }

    public static d j(ByteBuffer byteBuffer) {
        p1.e(byteBuffer, "buffer");
        return new a(byteBuffer);
    }

    public static d k(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static d l(byte[] bArr, int i4, int i5) {
        if (i4 < 0 || i5 < 0 || i4 + i5 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        return new b(bArr, i4, i5);
    }

    private static d m(byte[] bArr, int i4, int i5) {
        return new b(bArr, i4, i5);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract d h(int i4);

    public abstract int i();
}
