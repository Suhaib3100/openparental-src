package androidx.content.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: BufferAllocator.java */
/* loaded from: classes3.dex */
abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final t f28950a = new a();

    /* compiled from: BufferAllocator.java */
    static class a extends t {
        a() {
        }

        @Override // androidx.content.preferences.protobuf.t
        public d a(int i4) {
            return d.j(ByteBuffer.allocateDirect(i4));
        }

        @Override // androidx.content.preferences.protobuf.t
        public d b(int i4) {
            return d.k(new byte[i4]);
        }
    }

    t() {
    }

    public static t c() {
        return f28950a;
    }

    public abstract d a(int i4);

    public abstract d b(int i4);
}
