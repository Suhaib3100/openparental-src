package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Stack.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\rR\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/n1;", "", "<init>", "()V", "", "value", "Lkotlin/k2;", "j", "(I)V", "i", "()I", "default", "h", "(I)I", "f", "index", "g", "", "d", "()Z", "e", "a", "c", "", "[I", "slots", "b", "I", "tos", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16857c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] slots = new int[10];

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int tos;

    public final void a() {
        this.tos = 0;
    }

    /* renamed from: b, reason: from getter */
    public final int getTos() {
        return this.tos;
    }

    public final int c(int value) {
        int i4 = this.tos;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.slots[i5] == value) {
                return i5;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.tos == 0;
    }

    public final boolean e() {
        return this.tos != 0;
    }

    public final int f() {
        return this.slots[this.tos - 1];
    }

    public final int g(int index) {
        return this.slots[index];
    }

    public final int h(int r22) {
        return this.tos > 0 ? f() : r22;
    }

    public final int i() {
        int[] iArr = this.slots;
        int i4 = this.tos - 1;
        this.tos = i4;
        return iArr[i4];
    }

    public final void j(int value) {
        int i4 = this.tos;
        int[] iArr = this.slots;
        if (i4 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.slots = copyOf;
        }
        int[] iArr2 = this.slots;
        int i5 = this.tos;
        this.tos = i5 + 1;
        iArr2[i5] = value;
    }
}
