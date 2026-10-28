package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/jvm/internal/ArrayBooleanIterator;", "Lkotlin/collections/BooleanIterator;", "array", "", "([Z)V", "index", "", "hasNext", "", "nextBoolean", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ArrayBooleanIterator extends BooleanIterator {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final boolean[] f23533o;

    /* renamed from: p, reason: collision with root package name */
    private int f23534p;

    public ArrayBooleanIterator(@d5.d boolean[] zArr) {
        l0.p(zArr, ProtectedSandApp.s("绩"));
        this.f23533o = zArr;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean d() {
        try {
            boolean[] zArr = this.f23533o;
            int i5 = this.f23534p;
            this.f23534p = i5 + 1;
            return zArr[i5];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f23534p--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23534p < this.f23533o.length;
    }
}
