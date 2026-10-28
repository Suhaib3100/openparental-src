package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/jvm/internal/b;", "Lkotlin/collections/t;", "", "array", "<init>", "([Z)V", "", "hasNext", "()Z", "c", "b", "[Z", "", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b extends kotlin.collections.t {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final boolean[] array;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    public b(@fg.l boolean[] zArr) {
        l0.p(zArr, ProtectedSandApp.s("擛\u0001"));
        this.array = zArr;
    }

    @Override // kotlin.collections.t
    public boolean c() {
        try {
            boolean[] zArr = this.array;
            int i4 = this.index;
            this.index = i4 + 1;
            return zArr[i4];
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
