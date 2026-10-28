package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PeekSource.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lokio/f0;", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "Lkotlin/m2;", "close", "o", "Lokio/m;", "buffer", "Lokio/j0;", "p", "Lokio/j0;", "expectedSegment", "", "q", "I", "expectedPos", "", "r", "Z", "closed", "s", "J", "pos", "Lokio/o;", "t", "Lokio/o;", "upstream", "<init>", "(Lokio/o;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class f0 implements o0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final m buffer;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private j0 expectedSegment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int expectedPos;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long pos;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final o upstream;

    public f0(@d5.d o oVar) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("銛"));
        this.upstream = oVar;
        m i5 = oVar.i();
        this.buffer = i5;
        j0 j0Var = i5.head;
        this.expectedSegment = j0Var;
        this.expectedPos = j0Var != null ? j0Var.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r5 == r6.pos) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // okio.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long X0(@d5.d okio.m r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "銜"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L13
            r5 = r4
            goto L14
        L13:
            r5 = r3
        L14:
            if (r5 == 0) goto L93
            boolean r5 = r8.closed
            r5 = r5 ^ r4
            if (r5 == 0) goto L83
            okio.j0 r5 = r8.expectedSegment
            if (r5 == 0) goto L2e
            okio.m r6 = r8.buffer
            okio.j0 r6 = r6.head
            if (r5 != r6) goto L2f
            int r5 = r8.expectedPos
            kotlin.jvm.internal.l0.m(r6)
            int r6 = r6.pos
            if (r5 != r6) goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L73
            if (r2 != 0) goto L34
            return r0
        L34:
            okio.o r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.C0(r1)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            okio.j0 r0 = r8.expectedSegment
            if (r0 != 0) goto L57
            okio.m r0 = r8.buffer
            okio.j0 r0 = r0.head
            if (r0 == 0) goto L57
            r8.expectedSegment = r0
            kotlin.jvm.internal.l0.m(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L57:
            okio.m r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.m r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r10
            r2.o(r3, r4, r6)
            long r0 = r8.pos
            long r0 = r0 + r10
            r8.pos = r0
            return r10
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "銝"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L83:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "銞"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L93:
            java.lang.String r9 = "銟"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            java.lang.String r9 = com.bumptech.glide.load.resource.bitmap.p0.a(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f0.X0(okio.m, long):long");
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // okio.o0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return this.upstream.getTimeout();
    }
}
