package androidx.compose.foundation.text2.input;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MaxLengthTransformation.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text2/input/l;", "Landroidx/compose/foundation/text2/input/h;", "", "maxLength", "", "inCodepoints", "<init>", "(IZ)V", "c", "()I", "d", "()Z", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "", "toString", "()Ljava/lang/String;", "e", "(IZ)Landroidx/compose/foundation/text2/input/l;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMaxLengthTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxLengthTransformation.kt\nandroidx/compose/foundation/text2/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class l implements h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLength;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean inCodepoints;

    public l(int i4, boolean z4) {
        this.maxLength = i4;
        this.inCodepoints = z4;
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("maxLength must be at least zero, was ", i4).toString());
        }
    }

    /* renamed from: c, reason: from getter */
    private final int getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: d, reason: from getter */
    private final boolean getInCodepoints() {
        return this.inCodepoints;
    }

    public static l f(l lVar, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = lVar.maxLength;
        }
        if ((i5 & 2) != 0) {
            z4 = lVar.inCodepoints;
        }
        lVar.getClass();
        return new l(i4, z4);
    }

    @Override // androidx.compose.foundation.text2.input.h
    public void a(@fg.l q originalValue, @fg.l o valueWithChanges) {
        if ((this.inCodepoints ? valueWithChanges.i() : valueWithChanges.j()) > this.maxLength) {
            valueWithChanges.x();
        }
    }

    @fg.l
    public final l e(int maxLength, boolean inCodepoints) {
        return new l(maxLength, inCodepoints);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return this.maxLength == lVar.maxLength && this.inCodepoints == lVar.inCodepoints;
    }

    public int hashCode() {
        return Boolean.hashCode(this.inCodepoints) + (Integer.hashCode(this.maxLength) * 31);
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(androidx.appcompat.view.g.a("InputTransformation.", this.inCodepoints ? "maxLengthInCodepoints" : "maxLengthInChars", "(maxLength="), this.maxLength, ')');
    }
}
