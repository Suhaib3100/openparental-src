package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlin/jvm/internal/c;", "Lkotlin/collections/u;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "", "q", "()B", "b", "[B", "", "c", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class c extends kotlin.collections.u {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] array;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    public c(@fg.l byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("擞\u0001"));
        this.array = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.u
    public byte q() {
        try {
            byte[] bArr = this.array;
            int i4 = this.index;
            this.index = i4 + 1;
            return bArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.index--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }
}
