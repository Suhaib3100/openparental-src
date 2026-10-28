package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.l0;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: o, reason: collision with root package name */
    private final int f23709o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23710p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23711q;

    /* renamed from: r, reason: collision with root package name */
    private int f23712r;

    public CharProgressionIterator(char c6, char c7, int i5) {
        this.f23709o = i5;
        this.f23710p = c7;
        boolean z5 = true;
        if (i5 <= 0 ? l0.t(c6, c7) < 0 : l0.t(c6, c7) > 0) {
            z5 = false;
        }
        this.f23711q = z5;
        this.f23712r = z5 ? c6 : c7;
    }

    @Override // kotlin.collections.CharIterator
    public char d() {
        int i5 = this.f23712r;
        if (i5 != this.f23710p) {
            this.f23712r = this.f23709o + i5;
        } else {
            if (!this.f23711q) {
                throw new NoSuchElementException();
            }
            this.f23711q = false;
        }
        return (char) i5;
    }

    /* renamed from: f, reason: from getter */
    public final int getF23709o() {
        return this.f23709o;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23711q;
    }
}
