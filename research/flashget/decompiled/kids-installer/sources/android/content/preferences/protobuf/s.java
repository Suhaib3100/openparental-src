package android.content.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: BufferAllocator.java */
/* loaded from: classes.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final s f7499a = new a();

    /* compiled from: BufferAllocator.java */
    /* loaded from: classes3.dex */
    static class a extends s {
        a() {
        }

        @Override // android.content.preferences.protobuf.s
        public d a(int i5) {
            return d.j(ByteBuffer.allocateDirect(i5));
        }

        @Override // android.content.preferences.protobuf.s
        public d b(int i5) {
            return d.k(new byte[i5]);
        }
    }

    s() {
    }

    public static s c() {
        return f7499a;
    }

    public abstract d a(int i5);

    public abstract d b(int i5);
}
