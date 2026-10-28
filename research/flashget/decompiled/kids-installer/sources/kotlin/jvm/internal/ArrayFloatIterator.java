package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.FloatIterator;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayFloatIterator;", "Lkotlin/collections/FloatIterator;", "array", "", "([F)V", "index", "", "hasNext", "", "nextFloat", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.f, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ArrayFloatIterator extends FloatIterator {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final float[] f23548o;

    /* renamed from: p, reason: collision with root package name */
    private int f23549p;

    public ArrayFloatIterator(@d5.d float[] fArr) {
        l0.p(fArr, ProtectedSandApp.s("绱"));
        this.f23548o = fArr;
    }

    @Override // kotlin.collections.FloatIterator
    public float d() {
        try {
            float[] fArr = this.f23548o;
            int i5 = this.f23549p;
            this.f23549p = i5 + 1;
            return fArr[i5];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f23549p--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23549p < this.f23548o.length;
    }
}
