package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayCharIterator;", "Lkotlin/collections/CharIterator;", "array", "", "([C)V", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ArrayCharIterator extends CharIterator {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final char[] f23544o;

    /* renamed from: p, reason: collision with root package name */
    private int f23545p;

    public ArrayCharIterator(@d5.d char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("续"));
        this.f23544o = cArr;
    }

    @Override // kotlin.collections.CharIterator
    public char d() {
        try {
            char[] cArr = this.f23544o;
            int i5 = this.f23545p;
            this.f23545p = i5 + 1;
            return cArr[i5];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f23545p--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23545p < this.f23544o.length;
    }
}
