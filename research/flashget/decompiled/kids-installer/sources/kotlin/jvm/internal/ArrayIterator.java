package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ArrayIterator.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class ArrayIterator<T> implements Iterator<T>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final T[] f23554o;

    /* renamed from: p, reason: collision with root package name */
    private int f23555p;

    public ArrayIterator(@d5.d T[] tArr) {
        l0.p(tArr, ProtectedSandApp.s("䅓"));
        this.f23554o = tArr;
    }

    @d5.d
    public final T[] a() {
        return this.f23554o;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23555p < this.f23554o.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f23554o;
            int i5 = this.f23555p;
            this.f23555p = i5 + 1;
            return tArr[i5];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f23555p--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅔"));
    }
}
