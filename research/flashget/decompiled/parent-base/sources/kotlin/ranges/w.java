package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.w1;

/* compiled from: UIntRange.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/w;", "", "Lkotlin/w1;", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/w;)V", "", "hasNext", "()Z", "b", "()I", "I", "finalElement", "c", "Z", "d", "e", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class w implements Iterator<w1>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int next;

    public /* synthetic */ w(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(i4, i5, i6);
    }

    public int b() {
        int i4 = this.next;
        if (i4 != this.finalElement) {
            this.next = w1.h(this.step + i4);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ w1 next() {
        return w1.b(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("旽\u0001"));
    }

    private w(int i4, int i5, int i6) {
        int compare;
        this.finalElement = i5;
        boolean z4 = false;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (i6 <= 0 ? compare >= 0 : compare <= 0) {
            z4 = true;
        }
        this.hasNext = z4;
        this.step = w1.h(i6);
        this.next = this.hasNext ? i4 : i5;
    }
}
