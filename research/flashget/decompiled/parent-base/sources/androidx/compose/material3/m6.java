package androidx.compose.material3;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010\"\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"Landroidx/compose/material3/m6;", "T", "Landroidx/compose/material3/t4;", "", "", "anchors", "<init>", "(Ljava/util/Map;)V", "value", "e", "(Ljava/lang/Object;)F", "", "c", "(Ljava/lang/Object;)Z", "position", "b", "(F)Ljava/lang/Object;", "searchUpwards", "a", "(FZ)Ljava/lang/Object;", "d", "()F", "f", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getSize", "size", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/MapDraggableAnchors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
/* loaded from: classes.dex */
final class m6<T> implements t4<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<T, Float> anchors;

    public m6(@fg.l Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.material3.t4
    @fg.m
    public T a(float position, boolean searchUpwards) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f4 = searchUpwards ? floatValue - position : position - floatValue;
                if (f4 < 0.0f) {
                    f4 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f5 = searchUpwards ? floatValue2 - position : position - floatValue2;
                    if (f5 < 0.0f) {
                        f5 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f4, f5) > 0) {
                        next = next2;
                        f4 = f5;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.t4
    @fg.m
    public T b(float position) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(position - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(position - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.t4
    public boolean c(T value) {
        return this.anchors.containsKey(value);
    }

    @Override // androidx.compose.material3.t4
    public float d() {
        Float j4 = kotlin.collections.w.j4(this.anchors.values());
        if (j4 != null) {
            return j4.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.t4
    public float e(T value) {
        Float f4 = this.anchors.get(value);
        if (f4 != null) {
            return f4.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m6) {
            return kotlin.jvm.internal.l0.g(this.anchors, ((m6) other).anchors);
        }
        return false;
    }

    @Override // androidx.compose.material3.t4
    public float f() {
        Float R3 = kotlin.collections.w.R3(this.anchors.values());
        if (R3 != null) {
            return R3.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.t4
    public int getSize() {
        return this.anchors.size();
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @fg.l
    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }
}
