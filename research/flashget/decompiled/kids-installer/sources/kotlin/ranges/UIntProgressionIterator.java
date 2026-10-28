package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;

/* compiled from: UIntRange.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.w, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class UIntProgressionIterator implements Iterator<UInt>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    private final int f23751o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23752p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23753q;

    /* renamed from: r, reason: collision with root package name */
    private int f23754r;

    public /* synthetic */ UIntProgressionIterator(int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(i5, i6, i7);
    }

    public int a() {
        int i5 = this.f23754r;
        if (i5 != this.f23751o) {
            this.f23754r = UInt.r(this.f23753q + i5);
        } else {
            if (!this.f23752p) {
                throw new NoSuchElementException();
            }
            this.f23752p = false;
        }
        return i5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23752p;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.h(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䋀"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if (r2 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private UIntProgressionIterator(int r4, int r5, int r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.f23751o = r5
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L10
            int r2 = kotlin.q1.a(r4, r5)
            if (r2 > 0) goto L17
            goto L18
        L10:
            int r2 = kotlin.q1.a(r4, r5)
            if (r2 < 0) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            r3.f23752p = r0
            int r6 = kotlin.UInt.r(r6)
            r3.f23753q = r6
            boolean r6 = r3.f23752p
            if (r6 == 0) goto L25
            goto L26
        L25:
            r4 = r5
        L26:
            r3.f23754r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntProgressionIterator.<init>(int, int, int):void");
    }
}
