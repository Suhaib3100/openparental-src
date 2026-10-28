package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/w2;", "", "", "", "list", "<init>", "(Ljava/util/List;)V", "value", "Lkotlin/k2;", "a", "(I)V", "", "b", "()Z", "c", "d", "()I", "e", "f", "()V", "Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n4178#2,5:3746\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3690#1:3746,5\n*E\n"})
/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17274b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public w2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(int value) {
        if (this.list.isEmpty() || !(this.list.get(0).intValue() == value || ((Number) androidx.appcompat.view.menu.d.a(this.list, 1)).intValue() == value)) {
            int size = this.list.size();
            this.list.add(Integer.valueOf(value));
            while (size > 0) {
                int i4 = ((size + 1) >>> 1) - 1;
                int intValue = this.list.get(i4).intValue();
                if (value <= intValue) {
                    break;
                }
                this.list.set(size, Integer.valueOf(intValue));
                size = i4;
            }
            this.list.set(size, Integer.valueOf(value));
        }
    }

    public final boolean b() {
        return this.list.isEmpty();
    }

    public final boolean c() {
        return !this.list.isEmpty();
    }

    public final int d() {
        return ((Number) kotlin.collections.w.B2(this.list)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        int intValue;
        if (!(this.list.size() > 0)) {
            throw u.a("Set is empty");
        }
        int intValue2 = this.list.get(0).intValue();
        while (!this.list.isEmpty() && this.list.get(0).intValue() == intValue2) {
            List<Integer> list = this.list;
            list.set(0, kotlin.collections.w.p3(list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i4 = 0;
            while (i4 < size2) {
                int intValue3 = this.list.get(i4).intValue();
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int intValue4 = this.list.get(i6).intValue();
                if (i5 >= size || (intValue = this.list.get(i5).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        this.list.set(i4, Integer.valueOf(intValue4));
                        this.list.set(i6, Integer.valueOf(intValue3));
                        i4 = i6;
                    }
                } else if (intValue > intValue3) {
                    this.list.set(i4, Integer.valueOf(intValue));
                    this.list.set(i5, Integer.valueOf(intValue3));
                    i4 = i5;
                }
            }
        }
        return intValue2;
    }

    public final void f() {
        int size = this.list.size();
        int i4 = size / 2;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i6 * 2;
            if (this.list.get(i5).intValue() < this.list.get(i7 - 1).intValue()) {
                throw new IllegalStateException("Check failed.");
            }
            if (i7 < size && this.list.get(i5).intValue() < this.list.get(i7).intValue()) {
                throw new IllegalStateException("Check failed.");
            }
            i5 = i6;
        }
    }

    public w2(@fg.l List<Integer> list) {
        this.list = list;
    }

    public /* synthetic */ w2(List list, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new ArrayList() : list);
    }
}
