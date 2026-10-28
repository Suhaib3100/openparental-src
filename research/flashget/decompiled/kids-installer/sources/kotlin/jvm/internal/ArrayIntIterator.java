package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/jvm/internal/ArrayIntIterator;", "Lkotlin/collections/IntIterator;", "array", "", "([I)V", "index", "", "hasNext", "", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.g, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ArrayIntIterator extends IntIterator {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final int[] f23550o;

    /* renamed from: p, reason: collision with root package name */
    private int f23551p;

    public ArrayIntIterator(@d5.d int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("绲"));
        this.f23550o = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23551p < this.f23550o.length;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f23550o;
            int i5 = this.f23551p;
            this.f23551p = i5 + 1;
            return iArr[i5];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f23551p--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }
}
