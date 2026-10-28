package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;

/* compiled from: ULongRange.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "first", "last", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.z, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class ULongProgressionIterator implements Iterator<ULong>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    private final long f23761o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23762p;

    /* renamed from: q, reason: collision with root package name */
    private final long f23763q;

    /* renamed from: r, reason: collision with root package name */
    private long f23764r;

    public /* synthetic */ ULongProgressionIterator(long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7);
    }

    public long a() {
        long j5 = this.f23764r;
        if (j5 != this.f23761o) {
            this.f23764r = ULong.r(this.f23763q + j5);
        } else {
            if (!this.f23762p) {
                throw new NoSuchElementException();
            }
            this.f23762p = false;
        }
        return j5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23762p;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.h(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䋆"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r0 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ULongProgressionIterator(long r4, long r6, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f23761o = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L14
            int r0 = kotlin.s1.a(r4, r6)
            if (r0 > 0) goto L1b
            goto L1c
        L14:
            int r0 = kotlin.s1.a(r4, r6)
            if (r0 < 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3.f23762p = r1
            long r8 = kotlin.ULong.r(r8)
            r3.f23763q = r8
            boolean r8 = r3.f23762p
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.f23764r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ULongProgressionIterator.<init>(long, long, long):void");
    }
}
