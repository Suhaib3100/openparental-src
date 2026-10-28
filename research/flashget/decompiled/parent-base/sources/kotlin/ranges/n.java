package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.v0;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlin/ranges/n;", "Lkotlin/collections/v0;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "c", "()J", "b", "J", "d", "finalElement", "Z", "e", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n extends v0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long finalElement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long next;

    public n(long j4, long j5, long j6) {
        this.step = j6;
        this.finalElement = j5;
        boolean z4 = false;
        if (j6 <= 0 ? j4 >= j5 : j4 <= j5) {
            z4 = true;
        }
        this.hasNext = z4;
        this.next = z4 ? j4 : j5;
    }

    @Override // kotlin.collections.v0
    public long c() {
        long j4 = this.next;
        if (j4 != this.finalElement) {
            this.next = this.step + j4;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j4;
    }

    /* renamed from: d, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }
}
