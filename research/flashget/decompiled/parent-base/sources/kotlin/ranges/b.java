package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/collections/v;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "c", "()C", "b", "I", "d", "()I", "finalElement", "Z", "e", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends kotlin.collections.v {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int next;

    public b(char c5, char c6, int i4) {
        this.step = i4;
        this.finalElement = c6;
        boolean z4 = false;
        if (i4 <= 0 ? l0.t(c5, c6) >= 0 : l0.t(c5, c6) <= 0) {
            z4 = true;
        }
        this.hasNext = z4;
        this.next = z4 ? c5 : c6;
    }

    @Override // kotlin.collections.v
    public char c() {
        int i4 = this.next;
        if (i4 != this.finalElement) {
            this.next = this.step + i4;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i4;
    }

    /* renamed from: d, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }
}
