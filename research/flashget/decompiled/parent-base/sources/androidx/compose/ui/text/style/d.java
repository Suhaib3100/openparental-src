package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/style/d;", "Landroidx/compose/ui/text/style/n;", "Landroidx/compose/ui/graphics/d2;", "value", "<init>", "(JLkotlin/jvm/internal/w;)V", "e", "()J", "f", "(J)Landroidx/compose/ui/text/style/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "i", "a", "color", "Landroidx/compose/ui/graphics/t1;", "d", "()Landroidx/compose/ui/graphics/t1;", "brush", "", "g", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n646#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:150\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class d implements n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long value;

    public /* synthetic */ d(long j4, w wVar) {
        this(j4);
    }

    public static d h(d dVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = dVar.value;
        }
        dVar.getClass();
        return new d(j4);
    }

    @Override // androidx.compose.ui.text.style.n
    /* renamed from: a, reason: from getter */
    public long getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.n
    @fg.m
    public t1 d() {
        return null;
    }

    public final long e() {
        return this.value;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && d2.y(this.value, ((d) other).value);
    }

    @fg.l
    public final d f(long value) {
        return new d(value);
    }

    @Override // androidx.compose.ui.text.style.n
    public float g() {
        return d2.A(this.value);
    }

    public int hashCode() {
        return d2.K(this.value);
    }

    public final long i() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return "ColorStyle(value=" + ((Object) d2.L(this.value)) + ')';
    }

    private d(long j4) {
        this.value = j4;
        d2.INSTANCE.getClass();
        if (j4 == d2.f17778o) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
