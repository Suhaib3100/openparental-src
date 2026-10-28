package g0;

import androidx.compose.foundation.w1;
import androidx.compose.runtime.internal.u;
import androidx.view.e;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: ComposableMethod.jvm.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lg0/a;", "", "", "isComposable", "", "realParamsCount", "changedParams", "defaultParams", "<init>", "(ZIII)V", "a", "()Z", "b", "()I", "c", "d", "e", "(ZIII)Lg0/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "I", "i", "g", "h", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f73889e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isComposable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int realParamsCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int changedParams;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int defaultParams;

    public a(boolean z4, int i4, int i5, int i6) {
        this.isComposable = z4;
        this.realParamsCount = i4;
        this.changedParams = i5;
        this.defaultParams = i6;
    }

    public static a f(a aVar, boolean z4, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z4 = aVar.isComposable;
        }
        if ((i7 & 2) != 0) {
            i4 = aVar.realParamsCount;
        }
        if ((i7 & 4) != 0) {
            i5 = aVar.changedParams;
        }
        if ((i7 & 8) != 0) {
            i6 = aVar.defaultParams;
        }
        aVar.getClass();
        return new a(z4, i4, i5, i6);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsComposable() {
        return this.isComposable;
    }

    /* renamed from: b, reason: from getter */
    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    /* renamed from: c, reason: from getter */
    public final int getChangedParams() {
        return this.changedParams;
    }

    /* renamed from: d, reason: from getter */
    public final int getDefaultParams() {
        return this.defaultParams;
    }

    @l
    public final a e(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
        return new a(isComposable, realParamsCount, changedParams, defaultParams);
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.isComposable == aVar.isComposable && this.realParamsCount == aVar.realParamsCount && this.changedParams == aVar.changedParams && this.defaultParams == aVar.defaultParams;
    }

    public final int g() {
        return this.changedParams;
    }

    public final int h() {
        return this.defaultParams;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultParams) + w1.a(this.changedParams, w1.a(this.realParamsCount, Boolean.hashCode(this.isComposable) * 31, 31), 31);
    }

    public final int i() {
        return this.realParamsCount;
    }

    public final boolean j() {
        return this.isComposable;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("ComposableInfo(isComposable=");
        sb.append(this.isComposable);
        sb.append(", realParamsCount=");
        sb.append(this.realParamsCount);
        sb.append(", changedParams=");
        sb.append(this.changedParams);
        sb.append(", defaultParams=");
        return e.a(sb, this.defaultParams, ')');
    }
}
