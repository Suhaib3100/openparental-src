package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, d2 = {"Lokio/j0;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "Lkotlin/m2;", "a", "sink", "g", "", "[B", "data", "I", "pos", "limit", "", "Z", "shared", "owner", "Lokio/j0;", "next", "prev", "<init>", "()V", "([BIIZZ)V", "j", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f31646h = 8192;

    /* renamed from: i, reason: collision with root package name */
    public static final int f31647i = 1024;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public int pos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public boolean owner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public j0 next;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public j0 prev;

    public j0() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        j0 j0Var = this.prev;
        int i5 = 0;
        if (!(j0Var != this)) {
            throw new IllegalStateException(ProtectedSandApp.s("栾").toString());
        }
        kotlin.jvm.internal.l0.m(j0Var);
        if (j0Var.owner) {
            int i6 = this.limit - this.pos;
            j0 j0Var2 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var2);
            int i7 = 8192 - j0Var2.limit;
            j0 j0Var3 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var3);
            if (!j0Var3.shared) {
                j0 j0Var4 = this.prev;
                kotlin.jvm.internal.l0.m(j0Var4);
                i5 = j0Var4.pos;
            }
            if (i6 > i7 + i5) {
                return;
            }
            j0 j0Var5 = this.prev;
            kotlin.jvm.internal.l0.m(j0Var5);
            g(j0Var5, i6);
            b();
            k0.d(this);
        }
    }

    @d5.e
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

    @d5.d
    public final j0 c(@d5.d j0 segment) {
        kotlin.jvm.internal.l0.p(segment, ProtectedSandApp.s("栿"));
        segment.prev = this;
        segment.next = this.next;
        j0 j0Var = this.next;
        kotlin.jvm.internal.l0.m(j0Var);
        j0Var.prev = segment;
        this.next = segment;
        return segment;
    }

    @d5.d
    public final j0 d() {
        this.shared = true;
        return new j0(this.data, this.pos, this.limit, true, false);
    }

    @d5.d
    public final j0 e(int byteCount) {
        j0 e6;
        if (!(byteCount > 0 && byteCount <= this.limit - this.pos)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("桀").toString());
        }
        if (byteCount >= 1024) {
            e6 = d();
        } else {
            e6 = k0.e();
            byte[] bArr = this.data;
            byte[] bArr2 = e6.data;
            int i5 = this.pos;
            kotlin.collections.p.E0(bArr, bArr2, 0, i5, i5 + byteCount, 2, null);
        }
        e6.limit = e6.pos + byteCount;
        this.pos += byteCount;
        j0 j0Var = this.prev;
        kotlin.jvm.internal.l0.m(j0Var);
        j0Var.c(e6);
        return e6;
    }

    @d5.d
    public final j0 f() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("桁"));
        return new j0(copyOf, this.pos, this.limit, false, true);
    }

    public final void g(@d5.d j0 j0Var, int i5) {
        kotlin.jvm.internal.l0.p(j0Var, ProtectedSandApp.s("桂"));
        if (!j0Var.owner) {
            throw new IllegalStateException(ProtectedSandApp.s("桃").toString());
        }
        int i6 = j0Var.limit;
        if (i6 + i5 > 8192) {
            if (j0Var.shared) {
                throw new IllegalArgumentException();
            }
            int i7 = j0Var.pos;
            if ((i6 + i5) - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = j0Var.data;
            kotlin.collections.p.E0(bArr, bArr, 0, i7, i6, 2, null);
            j0Var.limit -= j0Var.pos;
            j0Var.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = j0Var.data;
        int i8 = j0Var.limit;
        int i9 = this.pos;
        kotlin.collections.p.v0(bArr2, bArr3, i8, i9, i9 + i5);
        j0Var.limit += i5;
        this.pos += i5;
    }

    public j0(@d5.d byte[] bArr, int i5, int i6, boolean z5, boolean z6) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("栽"));
        this.data = bArr;
        this.pos = i5;
        this.limit = i6;
        this.shared = z5;
        this.owner = z6;
    }
}
