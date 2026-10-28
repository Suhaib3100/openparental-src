package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/jvm/internal/k;", "Lkotlin/collections/v0;", "", "array", "<init>", "([J)V", "", "hasNext", "()Z", "", "c", "()J", "b", "[J", "", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class k extends kotlin.collections.v0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final long[] array;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    public k(@fg.l long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("擪\u0001"));
        this.array = jArr;
    }

    @Override // kotlin.collections.v0
    public long c() {
        try {
            long[] jArr = this.array;
            int i4 = this.index;
            this.index = i4 + 1;
            return jArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.index--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }
}
