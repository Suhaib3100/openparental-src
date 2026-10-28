package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006#"}, d2 = {"Lokio/j0;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()Lokio/j0;", "f", "b", "segment", "c", "(Lokio/j0;)Lokio/j0;", "byteCount", "e", "(I)Lokio/j0;", "Lkotlin/k2;", "a", "sink", "g", "(Lokio/j0;I)V", "[B", "I", "Z", "Lokio/j0;", "next", "prev", "j", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f85202h = 8192;

    /* renamed from: i, reason: collision with root package name */
    public static final int f85203i = 1024;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int pos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public boolean owner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public j0 next;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public j0 prev;

    public j0() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        j0 j0Var = this.prev;
        int i4 = 0;
        if (!(j0Var != this)) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὧ"));
        }
        kotlin.jvm.internal.l0.m(j0Var);
        if (j0Var.owner) {
            int i5 = this.limit - this.pos;
            j0 j0Var2 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var2);
            int i6 = 8192 - j0Var2.limit;
            j0 j0Var3 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var3);
            if (!j0Var3.shared) {
                j0 j0Var4 = this.prev;
                kotlin.jvm.internal.l0.m(j0Var4);
                i4 = j0Var4.pos;
            }
            if (i5 > i6 + i4) {
                return;
            }
            j0 j0Var5 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var5);
            g(j0Var5, i5);
            b();
            k0.d(this);
        }
    }

    @fg.m
    public final j0 b() {
        j0 j0Var = this.next;
        if (j0Var == this) {
            j0Var = null;
        }
        j0 j0Var2 = this.prev;
        kotlin.jvm.internal.l0.m(j0Var2);
        j0Var2.next = this.next;
        j0 j0Var3 = this.next;
        kotlin.jvm.internal.l0.m(j0Var3);
        j0Var3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return j0Var;
    }

    @fg.l
    public final j0 c(@fg.l j0 segment) {
        kotlin.jvm.internal.l0.p(segment, ProtectedSandApp.s("ὰ"));
        segment.prev = this;
        segment.next = this.next;
        j0 j0Var = this.next;
        kotlin.jvm.internal.l0.m(j0Var);
        j0Var.prev = segment;
        this.next = segment;
        return segment;
    }

    @fg.l
    public final j0 d() {
        this.shared = true;
        return new j0(this.data, this.pos, this.limit, true, false);
    }

    @fg.l
    public final j0 e(int byteCount) {
        j0 e4;
        if (!(byteCount > 0 && byteCount <= this.limit - this.pos)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ά"));
        }
        if (byteCount >= 1024) {
            e4 = d();
        } else {
            e4 = k0.e();
            byte[] bArr = this.data;
            byte[] bArr2 = e4.data;
            int i4 = this.pos;
            kotlin.collections.l.E0(bArr, bArr2, 0, i4, i4 + byteCount, 2, null);
        }
        e4.limit = e4.pos + byteCount;
        this.pos += byteCount;
        j0 j0Var = this.prev;
        kotlin.jvm.internal.l0.m(j0Var);
        j0Var.c(e4);
        return e4;
    }

    @fg.l
    public final j0 f() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("ὲ"));
        return new j0(copyOf, this.pos, this.limit, false, true);
    }

    public final void g(@fg.l j0 sink, int byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("έ"));
        if (!sink.owner) {
            throw new IllegalStateException(ProtectedSandApp.s("ὴ"));
        }
        int i4 = sink.limit;
        if (i4 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.pos;
            if ((i4 + byteCount) - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            kotlin.collections.l.E0(bArr, bArr, 0, i5, i4, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i6 = sink.limit;
        int i7 = this.pos;
        kotlin.collections.l.v0(bArr2, bArr3, i6, i7, i7 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public j0(@fg.l byte[] bArr, int i4, int i5, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("Ὦ"));
        this.data = bArr;
        this.pos = i4;
        this.limit = i5;
        this.shared = z4;
        this.owner = z5;
    }
}
