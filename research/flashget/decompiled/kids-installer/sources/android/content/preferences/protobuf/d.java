package android.content.preferences.protobuf;

import androidx.appcompat.view.menu.s;
import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* loaded from: classes.dex */
abstract class d {

    /* compiled from: AllocatedBuffer.java */
    /* loaded from: classes3.dex */
    static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f7206a;

        a(ByteBuffer byteBuffer) {
            this.f7206a = byteBuffer;
        }

        @Override // android.content.preferences.protobuf.d
        public byte[] a() {
            return this.f7206a.array();
        }

        @Override // android.content.preferences.protobuf.d
        public int b() {
            return this.f7206a.arrayOffset();
        }

        @Override // android.content.preferences.protobuf.d
        public boolean c() {
            return this.f7206a.hasArray();
        }

        @Override // android.content.preferences.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // android.content.preferences.protobuf.d
        public int e() {
            return this.f7206a.limit();
        }

        @Override // android.content.preferences.protobuf.d
        public ByteBuffer f() {
            return this.f7206a;
        }

        @Override // android.content.preferences.protobuf.d
        public int g() {
            return this.f7206a.position();
        }

        @Override // android.content.preferences.protobuf.d
        public d h(int i5) {
            this.f7206a.position(i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.d
        public int i() {
            return this.f7206a.remaining();
        }
    }

    /* compiled from: AllocatedBuffer.java */
    /* loaded from: classes3.dex */
    static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private int f7207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f7208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7210d;

        b(byte[] bArr, int i5, int i6) {
            this.f7208b = bArr;
            this.f7209c = i5;
            this.f7210d = i6;
        }

        @Override // android.content.preferences.protobuf.d
        public byte[] a() {
            return this.f7208b;
        }

        @Override // android.content.preferences.protobuf.d
        public int b() {
            return this.f7209c;
        }

        @Override // android.content.preferences.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // android.content.preferences.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // android.content.preferences.protobuf.d
        public int e() {
            return this.f7210d;
        }

        @Override // android.content.preferences.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // android.content.preferences.protobuf.d
        public int g() {
            return this.f7207a;
        }

        @Override // android.content.preferences.protobuf.d
        public d h(int i5) {
            if (i5 < 0 || i5 > this.f7210d) {
                throw new IllegalArgumentException(s.a("Invalid position: ", i5));
            }
            this.f7207a = i5;
            return this;
        }

        @Override // android.content.preferences.protobuf.d
        public int i() {
            return this.f7210d - this.f7207a;
        }
    }

    d() {
    }

    public static d j(ByteBuffer byteBuffer) {
        o1.e(byteBuffer, "buffer");
        return new a(byteBuffer);
    }

    public static d k(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static d l(byte[] bArr, int i5, int i6) {
        if (i5 < 0 || i6 < 0 || i5 + i6 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        return new b(bArr, i5, i6);
    }

    private static d m(byte[] bArr, int i5, int i6) {
        return new b(bArr, i5, i6);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract d h(int i5);

    public abstract int i();
}
