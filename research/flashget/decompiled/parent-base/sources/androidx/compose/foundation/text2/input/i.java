package androidx.compose.foundation.text2.input;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: InputTransformation.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B?\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u000028\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 RG\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text2/input/i;", "Landroidx/compose/foundation/text2/input/h;", "Lkotlin/Function2;", "", "Lkotlin/r0;", "name", "old", "proposed", "transformation", "<init>", "(Lld/p;)V", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "", "toString", "()Ljava/lang/String;", "c", "()Lld/p;", "d", "(Lld/p;)Landroidx/compose/foundation/text2/input/i;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lld/p;", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class i implements h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@fg.l ld.p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        this.transformation = pVar;
    }

    public static i e(i iVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = iVar.transformation;
        }
        iVar.getClass();
        return new i(pVar);
    }

    @Override // androidx.compose.foundation.text2.input.h
    public void a(@fg.l q originalValue, @fg.l o valueWithChanges) {
        q C = o.C(valueWithChanges, null, 1, null);
        CharSequence invoke = this.transformation.invoke(originalValue, C);
        if (invoke == C) {
            return;
        }
        if (invoke == originalValue) {
            valueWithChanges.x();
        } else {
            valueWithChanges.A(invoke);
        }
    }

    @fg.l
    public final ld.p<CharSequence, CharSequence, CharSequence> c() {
        return this.transformation;
    }

    @fg.l
    public final i d(@fg.l ld.p<? super CharSequence, ? super CharSequence, ? extends CharSequence> transformation) {
        return new i(transformation);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof i) && l0.g(this.transformation, ((i) other).transformation);
    }

    @fg.l
    public final ld.p<CharSequence, CharSequence, CharSequence> f() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    @fg.l
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }
}
