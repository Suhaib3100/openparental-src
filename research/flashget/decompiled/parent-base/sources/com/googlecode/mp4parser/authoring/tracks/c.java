package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AbstractH26XTrack.java */
/* loaded from: classes6.dex */
public abstract class c extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: l, reason: collision with root package name */
    public static int f63494l = 67107840;

    /* renamed from: e, reason: collision with root package name */
    private com.googlecode.mp4parser.a f63495e;

    /* renamed from: f, reason: collision with root package name */
    protected long[] f63496f;

    /* renamed from: g, reason: collision with root package name */
    protected List<CompositionTimeToSample.a> f63497g;

    /* renamed from: h, reason: collision with root package name */
    protected List<SampleDependencyTypeBox.a> f63498h;

    /* renamed from: i, reason: collision with root package name */
    protected List<Integer> f63499i;

    /* renamed from: j, reason: collision with root package name */
    protected com.googlecode.mp4parser.authoring.i f63500j;

    /* renamed from: k, reason: collision with root package name */
    boolean f63501k;

    /* compiled from: AbstractH26XTrack.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f63502a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f63503b = 0;

        /* renamed from: c, reason: collision with root package name */
        com.googlecode.mp4parser.a f63504c;

        /* renamed from: d, reason: collision with root package name */
        ByteBuffer f63505d;

        /* renamed from: e, reason: collision with root package name */
        long f63506e;

        public a(com.googlecode.mp4parser.a aVar) throws IOException {
            this.f63504c = aVar;
            c();
        }

        public void a() {
            this.f63503b++;
        }

        public void b() {
            int i4 = this.f63503b + 3;
            this.f63503b = i4;
            this.f63506e = this.f63502a + i4;
        }

        public void c() throws IOException {
            com.googlecode.mp4parser.a aVar = this.f63504c;
            this.f63505d = aVar.e3(this.f63502a, Math.min(aVar.size() - this.f63502a, c.f63494l));
        }

        public ByteBuffer d() {
            long j4 = this.f63506e;
            long j5 = this.f63502a;
            if (j4 < j5) {
                throw new RuntimeException(ProtectedSandApp.s("ഞ\u0001"));
            }
            this.f63505d.position((int) (j4 - j5));
            ByteBuffer slice = this.f63505d.slice();
            slice.limit((int) (this.f63503b - (this.f63506e - this.f63502a)));
            return slice;
        }

        public boolean e(boolean z4) throws IOException {
            int limit = this.f63505d.limit();
            int i4 = this.f63503b;
            if (limit - i4 >= 3) {
                return this.f63505d.get(i4) == 0 && this.f63505d.get(this.f63503b + 1) == 0 && ((this.f63505d.get(this.f63503b + 2) == 0 && z4) || this.f63505d.get(this.f63503b + 2) == 1);
            }
            if (this.f63502a + i4 + 3 > this.f63504c.size()) {
                return this.f63502a + ((long) this.f63503b) == this.f63504c.size();
            }
            this.f63502a = this.f63506e;
            this.f63503b = 0;
            c();
            return e(z4);
        }

        public boolean f() throws IOException {
            int limit = this.f63505d.limit();
            int i4 = this.f63503b;
            if (limit - i4 >= 3) {
                return this.f63505d.get(i4) == 0 && this.f63505d.get(this.f63503b + 1) == 0 && this.f63505d.get(this.f63503b + 2) == 1;
            }
            if (this.f63502a + i4 + 3 < this.f63504c.size()) {
                return false;
            }
            throw new EOFException();
        }
    }

    public c(com.googlecode.mp4parser.a aVar, boolean z4) {
        super(aVar.toString());
        this.f63497g = new ArrayList();
        this.f63498h = new ArrayList();
        this.f63499i = new ArrayList();
        this.f63500j = new com.googlecode.mp4parser.authoring.i();
        this.f63495e = aVar;
        this.f63501k = z4;
    }

    protected static InputStream a(InputStream inputStream) {
        return new k(inputStream);
    }

    protected static byte[] d(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int remaining = duplicate.remaining();
        byte[] bArr = new byte[remaining];
        duplicate.get(bArr, 0, remaining);
        return bArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63498h;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63496f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63497g;
    }

    protected com.googlecode.mp4parser.authoring.f b(List<? extends ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Iterator<? extends ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            wrap.putInt(it.next().remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 * 2;
            byteBufferArr[i5] = ByteBuffer.wrap(bArr, i4 * 4, 4);
            byteBufferArr[i5 + 1] = list.get(i4);
        }
        return new com.googlecode.mp4parser.authoring.g(byteBufferArr);
    }

    protected ByteBuffer c(a aVar) throws IOException {
        while (!aVar.f()) {
            try {
                aVar.a();
            } catch (EOFException unused) {
                return null;
            }
        }
        aVar.b();
        while (!aVar.e(this.f63501k)) {
            aVar.a();
        }
        return aVar.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63495e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63500j;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        long[] jArr = new long[this.f63499i.size()];
        for (int i4 = 0; i4 < this.f63499i.size(); i4++) {
            jArr[i4] = this.f63499i.get(i4).intValue();
        }
        return jArr;
    }

    public c(com.googlecode.mp4parser.a aVar) {
        this(aVar, true);
    }
}
