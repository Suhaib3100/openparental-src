package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PeekSource.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lokio/f0;", "Lokio/o0;", "Lokio/o;", "upstream", "<init>", "(Lokio/o;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lkotlin/k2;", "close", "()V", "b", "Lokio/m;", "buffer", "Lokio/j0;", "c", "Lokio/j0;", "expectedSegment", "", "d", "I", "expectedPos", "", "e", "Z", "closed", "f", "J", "pos", "g", "Lokio/o;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class f0 implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j0 expectedSegment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int expectedPos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long pos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o upstream;

    public f0(@fg.l o oVar) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ἳ"));
        this.upstream = oVar;
        m bufferField = oVar.getBufferField();
        this.buffer = bufferField;
        j0 j0Var = bufferField.head;
        this.expectedSegment = j0Var;
        this.expectedPos = j0Var != null ? j0Var.pos : -1;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // okio.o0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return this.upstream.getTimeout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r5 == r6.pos) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // okio.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long w3(@fg.l okio.m r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ἴ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
            if (r5 == 0) goto L8a
            boolean r5 = r8.closed
            if (r5 != 0) goto L7e
            okio.j0 r5 = r8.expectedSegment
            if (r5 == 0) goto L2d
            okio.m r6 = r8.buffer
            okio.j0 r6 = r6.head
            if (r5 != r6) goto L2e
            int r5 = r8.expectedPos
            kotlin.jvm.internal.l0.m(r6)
            int r6 = r6.pos
            if (r5 != r6) goto L2e
        L2d:
            r3 = r4
        L2e:
            if (r3 == 0) goto L72
            if (r2 != 0) goto L33
            return r0
        L33:
            okio.o r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.h1(r1)
            if (r0 != 0) goto L43
            r9 = -1
            return r9
        L43:
            okio.j0 r0 = r8.expectedSegment
            if (r0 != 0) goto L56
            okio.m r0 = r8.buffer
            okio.j0 r0 = r0.head
            if (r0 == 0) goto L56
            r8.expectedSegment = r0
            kotlin.jvm.internal.l0.m(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L56:
            okio.m r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.m r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r10
            r2.n(r3, r4, r6)
            long r0 = r8.pos
            long r0 = r0 + r10
            r8.pos = r0
            return r10
        L72:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "ἵ"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
            r9.<init>(r10)
            throw r9
        L7e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "ἶ"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
            r9.<init>(r10)
            throw r9
        L8a:
            java.lang.String r9 = "ἷ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            java.lang.String r9 = androidx.collection.p0.a(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f0.w3(okio.m, long):long");
    }
}
