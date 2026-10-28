package com.googlecode.mp4parser.authoring;

import androidx.collection.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: SampleImpl.java */
/* loaded from: classes6.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final long f63413a;

    /* renamed from: b, reason: collision with root package name */
    private final long f63414b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f63415c;

    /* renamed from: d, reason: collision with root package name */
    private final com.coremedia.iso.boxes.c f63416d;

    public g(ByteBuffer byteBuffer) {
        this.f63413a = -1L;
        this.f63414b = byteBuffer.limit();
        this.f63415c = new ByteBuffer[]{byteBuffer};
        this.f63416d = null;
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public ByteBuffer a() {
        c();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[com.googlecode.mp4parser.util.c.a(this.f63414b)]);
        for (ByteBuffer byteBuffer : this.f63415c) {
            wrap.put(byteBuffer.duplicate());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public void b(WritableByteChannel writableByteChannel) throws IOException {
        c();
        for (ByteBuffer byteBuffer : this.f63415c) {
            writableByteChannel.write(byteBuffer.duplicate());
        }
    }

    protected void c() {
        if (this.f63415c != null) {
            return;
        }
        com.coremedia.iso.boxes.c cVar = this.f63416d;
        if (cVar == null) {
            throw new RuntimeException(ProtectedSandApp.s("ೕ\u0001") + this);
        }
        try {
            this.f63415c = new ByteBuffer[]{cVar.getByteBuffer(this.f63413a, this.f63414b)};
        } catch (IOException e4) {
            throw new RuntimeException(ProtectedSandApp.s("\u0cd4\u0001") + this, e4);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public long getSize() {
        return this.f63414b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ೖ\u0001"));
        sb.append(this.f63413a);
        sb.append(ProtectedSandApp.s("\u0cd7\u0001"));
        return y0.a(sb, this.f63414b, '}');
    }

    public g(ByteBuffer[] byteBufferArr) {
        this.f63413a = -1L;
        int i4 = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i4 += byteBuffer.remaining();
        }
        this.f63414b = i4;
        this.f63415c = byteBufferArr;
        this.f63416d = null;
    }

    public g(long j4, long j5, ByteBuffer byteBuffer) {
        this.f63413a = j4;
        this.f63414b = j5;
        this.f63415c = new ByteBuffer[]{byteBuffer};
        this.f63416d = null;
    }

    public g(long j4, long j5, com.coremedia.iso.boxes.c cVar) {
        this.f63413a = j4;
        this.f63414b = j5;
        this.f63415c = null;
        this.f63416d = cVar;
    }
}
