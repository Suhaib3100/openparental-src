package androidx.compose.ui.semantics;

import kotlin.Metadata;

/* compiled from: SemanticsProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/j;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Lld/a;Lld/a;Z)V", "", "toString", "()Ljava/lang/String;", "a", "Lld/a;", "c", "()Lld/a;", "b", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20317d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Float> value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Float> maxValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    public j(@fg.l ld.a<Float> aVar, @fg.l ld.a<Float> aVar2, boolean z4) {
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z4;
    }

    @fg.l
    public final ld.a<Float> a() {
        return this.maxValue;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @fg.l
    public final ld.a<Float> c() {
        return this.value;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.value.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.maxValue.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return androidx.compose.animation.l.a(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ j(ld.a aVar, ld.a aVar2, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(aVar, aVar2, (i4 & 4) != 0 ? false : z4);
    }
}
