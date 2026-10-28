package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;

/* compiled from: ULongRange.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/z;", "", "Lkotlin/a2;", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "", "hasNext", "()Z", "b", "()J", "J", "finalElement", "c", "Z", "d", "e", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class z implements Iterator<a2>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long finalElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long next;

    public /* synthetic */ z(long j4, long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6);
    }

    public long b() {
        long j4 = this.next;
        if (j4 != this.finalElement) {
            this.next = a2.h(this.step + j4);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ a2 next() {
        return a2.b(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("昀\u0001"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private z(long r4, long r6, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.finalElement = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L15
            int r0 = androidx.collection.j1.a(r4, r6)
            if (r0 > 0) goto L1c
        L13:
            r1 = r2
            goto L1c
        L15:
            int r0 = androidx.collection.j1.a(r4, r6)
            if (r0 < 0) goto L1c
            goto L13
        L1c:
            r3.hasNext = r1
            long r8 = kotlin.a2.h(r8)
            r3.step = r8
            boolean r8 = r3.hasNext
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.next = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.z.<init>(long, long, long):void");
    }
}
