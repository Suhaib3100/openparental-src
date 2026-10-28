package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: DecoderConfigDescriptor.java */
@g(tags = {4})
/* loaded from: classes6.dex */
public class e extends b {

    /* renamed from: o, reason: collision with root package name */
    private static Logger f63968o = Logger.getLogger(e.class.getName());

    /* renamed from: e, reason: collision with root package name */
    int f63969e;

    /* renamed from: f, reason: collision with root package name */
    int f63970f;

    /* renamed from: g, reason: collision with root package name */
    int f63971g;

    /* renamed from: h, reason: collision with root package name */
    int f63972h;

    /* renamed from: i, reason: collision with root package name */
    long f63973i;

    /* renamed from: j, reason: collision with root package name */
    long f63974j;

    /* renamed from: k, reason: collision with root package name */
    f f63975k;

    /* renamed from: l, reason: collision with root package name */
    a f63976l;

    /* renamed from: m, reason: collision with root package name */
    List<n> f63977m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    byte[] f63978n;

    public e() {
        this.f63958a = 4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        a aVar = this.f63976l;
        int b5 = (aVar == null ? 0 : aVar.b()) + 13;
        f fVar = this.f63975k;
        int b6 = b5 + (fVar != null ? fVar.b() : 0);
        Iterator<n> it = this.f63977m.iterator();
        while (it.hasNext()) {
            b6 += it.next().b();
        }
        return b6;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        int b5;
        this.f63969e = com.coremedia.iso.g.p(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f63970f = p4 >>> 2;
        this.f63971g = (p4 >> 1) & 1;
        this.f63972h = com.coremedia.iso.g.k(byteBuffer);
        this.f63973i = com.coremedia.iso.g.l(byteBuffer);
        this.f63974j = com.coremedia.iso.g.l(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a5 = m.a(this.f63969e, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f63968o;
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(ProtectedSandApp.s("ጫ\u0001"));
            sb.append(position2);
            sb.append(ProtectedSandApp.s("ጬ\u0001"));
            sb.append(a5 != null ? Integer.valueOf(a5.b()) : null);
            logger.finer(sb.toString());
            if (a5 != null && position2 < (b5 = a5.b())) {
                byte[] bArr = new byte[b5 - position2];
                this.f63978n = bArr;
                byteBuffer.get(bArr);
            }
            if (a5 instanceof f) {
                this.f63975k = (f) a5;
            } else if (a5 instanceof a) {
                this.f63976l = (a) a5;
            } else if (a5 instanceof n) {
                this.f63977m.add((n) a5);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, this.f63958a);
        h(allocate, a());
        com.coremedia.iso.i.m(allocate, this.f63969e);
        com.coremedia.iso.i.m(allocate, (this.f63970f << 2) | (this.f63971g << 1) | 1);
        com.coremedia.iso.i.h(allocate, this.f63972h);
        allocate.putInt((int) this.f63973i);
        allocate.putInt((int) this.f63974j);
        f fVar = this.f63975k;
        if (fVar != null) {
            allocate.put(fVar.g());
        }
        a aVar = this.f63976l;
        if (aVar != null) {
            allocate.put(aVar.g());
        }
        Iterator<n> it = this.f63977m.iterator();
        while (it.hasNext()) {
            allocate.put(it.next().g());
        }
        return (ByteBuffer) allocate.rewind();
    }

    public a i() {
        return this.f63976l;
    }

    public long j() {
        return this.f63974j;
    }

    public int k() {
        return this.f63972h;
    }

    public f l() {
        return this.f63975k;
    }

    public long m() {
        return this.f63973i;
    }

    public int n() {
        return this.f63969e;
    }

    public List<n> o() {
        return this.f63977m;
    }

    public int p() {
        return this.f63970f;
    }

    public int q() {
        return this.f63971g;
    }

    public void r(a aVar) {
        this.f63976l = aVar;
    }

    public void s(long j4) {
        this.f63974j = j4;
    }

    public void t(int i4) {
        this.f63972h = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ጭ\u0001"));
        sb.append(this.f63969e);
        sb.append(ProtectedSandApp.s("ጮ\u0001"));
        sb.append(this.f63970f);
        sb.append(ProtectedSandApp.s("ጯ\u0001"));
        sb.append(this.f63971g);
        sb.append(ProtectedSandApp.s("ጰ\u0001"));
        sb.append(this.f63972h);
        sb.append(ProtectedSandApp.s("ጱ\u0001"));
        sb.append(this.f63973i);
        sb.append(ProtectedSandApp.s("ጲ\u0001"));
        sb.append(this.f63974j);
        sb.append(ProtectedSandApp.s("ጳ\u0001"));
        sb.append(this.f63975k);
        sb.append(ProtectedSandApp.s("ጴ\u0001"));
        sb.append(this.f63976l);
        sb.append(ProtectedSandApp.s("ጵ\u0001"));
        byte[] bArr = this.f63978n;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(com.coremedia.iso.e.b(bArr));
        sb.append(ProtectedSandApp.s("ጶ\u0001"));
        List<n> list = this.f63977m;
        return f3.a(sb, list == null ? ProtectedSandApp.s("ጷ\u0001") : Arrays.asList(list).toString(), '}');
    }

    public void u(f fVar) {
        this.f63975k = fVar;
    }

    public void v(long j4) {
        this.f63973i = j4;
    }

    public void w(int i4) {
        this.f63969e = i4;
    }

    public void x(int i4) {
        this.f63970f = i4;
    }

    public void y(int i4) {
        this.f63971g = i4;
    }
}
