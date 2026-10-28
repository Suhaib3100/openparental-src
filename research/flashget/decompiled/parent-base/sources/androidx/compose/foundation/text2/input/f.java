package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: InputTransformation.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text2/input/f;", "Landroidx/compose/foundation/text2/input/h;", "first", "second", "<init>", "(Landroidx/compose/foundation/text2/input/h;Landroidx/compose/foundation/text2/input/h;)V", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroidx/compose/foundation/text2/input/h;", "c", "Landroidx/compose/foundation/text/f0;", "()Landroidx/compose/foundation/text/f0;", "keyboardOptions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f implements h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h second;

    public f(@fg.l h hVar, @fg.l h hVar2) {
        this.first = hVar;
        this.second = hVar2;
    }

    @Override // androidx.compose.foundation.text2.input.h
    public void a(@fg.l q originalValue, @fg.l o valueWithChanges) {
        this.first.a(originalValue, valueWithChanges);
        this.second.a(originalValue, valueWithChanges);
    }

    @Override // androidx.compose.foundation.text2.input.h
    @fg.m
    public f0 b() {
        f0 b5 = this.second.b();
        return b5 == null ? this.first.b() : b5;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || f.class != other.getClass()) {
            return false;
        }
        f fVar = (f) other;
        return l0.g(this.first, fVar.first) && l0.g(this.second, fVar.second) && l0.g(b(), fVar.b());
    }

    public int hashCode() {
        int hashCode = (this.second.hashCode() + (this.first.hashCode() * 31)) * 32;
        f0 b5 = b();
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }
}
