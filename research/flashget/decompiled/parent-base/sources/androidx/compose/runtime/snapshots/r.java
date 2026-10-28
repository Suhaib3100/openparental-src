package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: SnapshotDoubleIndexHeap.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/runtime/snapshots/r;", "", "<init>", "()V", "", "index", "Lkotlin/k2;", "j", "(I)V", "i", "a", "b", "k", "(II)V", "atLeast", "c", "()I", "handle", "d", "default", "f", "(I)I", "value", "h", "l", "m", "<set-?>", "I", "e", "size", "", "[I", "values", "handles", "firstFreeHandle", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final int f17128f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] values = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] index = new int[16];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] handles;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    public r() {
        int[] iArr = new int[16];
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i4 + 1;
            iArr[i4] = i5;
            i4 = i5;
        }
        this.handles = iArr;
    }

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i4 = length * 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr[i5] = i6;
                i5 = i6;
            }
            kotlin.collections.l.I0(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i7 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i7];
        return i7;
    }

    private final void c(int atLeast) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (atLeast <= length) {
            return;
        }
        int i4 = length * 2;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        kotlin.collections.l.I0(iArr, iArr2, 0, 0, 0, 14, null);
        kotlin.collections.l.I0(this.index, iArr3, 0, 0, 0, 14, null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void d(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ int g(r rVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return rVar.f(i4);
    }

    private final void i(int index) {
        int i4;
        int[] iArr = this.values;
        int i5 = this.size >> 1;
        while (index < i5) {
            int i6 = (index + 1) << 1;
            int i7 = i6 - 1;
            if (i6 >= this.size || (i4 = iArr[i6]) >= iArr[i7]) {
                if (iArr[i7] >= iArr[index]) {
                    return;
                }
                k(i7, index);
                index = i7;
            } else {
                if (i4 >= iArr[index]) {
                    return;
                }
                k(i6, index);
                index = i6;
            }
        }
    }

    private final void j(int index) {
        int[] iArr = this.values;
        int i4 = iArr[index];
        while (index > 0) {
            int i5 = ((index + 1) >> 1) - 1;
            if (iArr[i5] <= i4) {
                return;
            }
            k(i5, index);
            index = i5;
        }
    }

    private final void k(int a5, int b5) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i4 = iArr[a5];
        iArr[a5] = iArr[b5];
        iArr[b5] = i4;
        int i5 = iArr2[a5];
        iArr2[a5] = iArr2[b5];
        iArr2[b5] = i5;
        iArr3[iArr2[a5]] = a5;
        iArr3[iArr2[b5]] = b5;
    }

    public final int a(int value) {
        c(this.size + 1);
        int i4 = this.size;
        this.size = i4 + 1;
        int b5 = b();
        this.values[i4] = value;
        this.index[i4] = b5;
        this.handles[b5] = i4;
        j(i4);
        return b5;
    }

    /* renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int f(int r22) {
        return this.size > 0 ? this.values[0] : r22;
    }

    public final void h(int handle) {
        int i4 = this.handles[handle];
        k(i4, this.size - 1);
        this.size--;
        j(i4);
        i(i4);
        d(handle);
    }

    @fg.p
    public final void l() {
        int i4 = this.size;
        int i5 = 1;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int[] iArr = this.values;
            if (iArr[(i6 >> 1) - 1] > iArr[i5]) {
                throw new IllegalStateException(("Index " + i5 + " is out of place").toString());
            }
            i5 = i6;
        }
    }

    @fg.p
    public final void m(int handle, int value) {
        int i4 = this.handles[handle];
        if (this.index[i4] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i4] == value) {
            return;
        }
        StringBuilder a5 = androidx.collection.s.a("Value for handle ", handle, " was ");
        a5.append(this.values[i4]);
        a5.append(" but was supposed to be ");
        a5.append(value);
        throw new IllegalStateException(a5.toString().toString());
    }
}
