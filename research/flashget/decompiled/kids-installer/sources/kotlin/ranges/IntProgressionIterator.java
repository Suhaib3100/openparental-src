package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.k, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: o, reason: collision with root package name */
    private final int f23727o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23728p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23729q;

    /* renamed from: r, reason: collision with root package name */
    private int f23730r;

    public IntProgressionIterator(int i5, int i6, int i7) {
        this.f23727o = i7;
        this.f23728p = i6;
        boolean z5 = true;
        if (i7 <= 0 ? i5 < i6 : i5 > i6) {
            z5 = false;
        }
        this.f23729q = z5;
        this.f23730r = z5 ? i5 : i6;
    }

    /* renamed from: a, reason: from getter */
    public final int getF23727o() {
        return this.f23727o;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23729q;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i5 = this.f23730r;
        if (i5 != this.f23728p) {
            this.f23730r = this.f23727o + i5;
        } else {
            if (!this.f23729q) {
                throw new NoSuchElementException();
            }
            this.f23729q = false;
        }
        return i5;
    }
}
