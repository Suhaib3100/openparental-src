package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Shapes.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/w8;", "", "Landroidx/compose/foundation/shape/e;", "extraSmall", "small", "medium", "large", "extraLarge", "<init>", "(Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;)V", "a", "(Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;)Landroidx/compose/material3/w8;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/shape/e;", "d", "()Landroidx/compose/foundation/shape/e;", "b", "g", "c", "f", "e", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w8 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f15295f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.shape.e extraSmall;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.shape.e small;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.shape.e medium;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.shape.e large;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.shape.e extraLarge;

    public w8() {
        this(null, null, null, null, null, 31, null);
    }

    public static w8 b(w8 w8Var, androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = w8Var.extraSmall;
        }
        if ((i4 & 2) != 0) {
            eVar2 = w8Var.small;
        }
        androidx.compose.foundation.shape.e eVar6 = eVar2;
        if ((i4 & 4) != 0) {
            eVar3 = w8Var.medium;
        }
        androidx.compose.foundation.shape.e eVar7 = eVar3;
        if ((i4 & 8) != 0) {
            eVar4 = w8Var.large;
        }
        androidx.compose.foundation.shape.e eVar8 = eVar4;
        if ((i4 & 16) != 0) {
            eVar5 = w8Var.extraLarge;
        }
        w8Var.getClass();
        return new w8(eVar, eVar6, eVar7, eVar8, eVar5);
    }

    @fg.l
    public final w8 a(@fg.l androidx.compose.foundation.shape.e extraSmall, @fg.l androidx.compose.foundation.shape.e small, @fg.l androidx.compose.foundation.shape.e medium, @fg.l androidx.compose.foundation.shape.e large, @fg.l androidx.compose.foundation.shape.e extraLarge) {
        return new w8(extraSmall, small, medium, large, extraLarge);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.foundation.shape.e getExtraLarge() {
        return this.extraLarge;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.foundation.shape.e getExtraSmall() {
        return this.extraSmall;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final androidx.compose.foundation.shape.e getLarge() {
        return this.large;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) other;
        return kotlin.jvm.internal.l0.g(this.extraSmall, w8Var.extraSmall) && kotlin.jvm.internal.l0.g(this.small, w8Var.small) && kotlin.jvm.internal.l0.g(this.medium, w8Var.medium) && kotlin.jvm.internal.l0.g(this.large, w8Var.large) && kotlin.jvm.internal.l0.g(this.extraLarge, w8Var.extraLarge);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final androidx.compose.foundation.shape.e getMedium() {
        return this.medium;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final androidx.compose.foundation.shape.e getSmall() {
        return this.small;
    }

    public int hashCode() {
        return this.extraLarge.hashCode() + ((this.large.hashCode() + ((this.medium.hashCode() + ((this.small.hashCode() + (this.extraSmall.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }

    public w8(@fg.l androidx.compose.foundation.shape.e eVar, @fg.l androidx.compose.foundation.shape.e eVar2, @fg.l androidx.compose.foundation.shape.e eVar3, @fg.l androidx.compose.foundation.shape.e eVar4, @fg.l androidx.compose.foundation.shape.e eVar5) {
        this.extraSmall = eVar;
        this.small = eVar2;
        this.medium = eVar3;
        this.large = eVar4;
        this.extraLarge = eVar5;
    }

    public /* synthetic */ w8(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? v8.f15186a.b() : eVar, (i4 & 2) != 0 ? v8.f15186a.e() : eVar2, (i4 & 4) != 0 ? v8.f15186a.d() : eVar3, (i4 & 8) != 0 ? v8.f15186a.c() : eVar4, (i4 & 16) != 0 ? v8.f15186a.a() : eVar5);
    }
}
