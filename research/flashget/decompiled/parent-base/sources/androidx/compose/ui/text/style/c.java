package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.a6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\"\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/style/c;", "Landroidx/compose/ui/text/style/n;", "Landroidx/compose/ui/graphics/a6;", "value", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/a6;F)V", "e", "()Landroidx/compose/ui/graphics/a6;", "f", "()F", "h", "(Landroidx/compose/ui/graphics/a6;F)Landroidx/compose/ui/text/style/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/graphics/a6;", "j", "c", "F", "g", "Landroidx/compose/ui/graphics/d2;", "a", "()J", "color", "Landroidx/compose/ui/graphics/t1;", "d", "()Landroidx/compose/ui/graphics/t1;", "brush", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class c implements n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a6 value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    public c(@fg.l a6 a6Var, float f4) {
        this.value = a6Var;
        this.alpha = f4;
    }

    public static c i(c cVar, a6 a6Var, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a6Var = cVar.value;
        }
        if ((i4 & 2) != 0) {
            f4 = cVar.alpha;
        }
        cVar.getClass();
        return new c(a6Var, f4);
    }

    @Override // androidx.compose.ui.text.style.n
    /* renamed from: a */
    public long getValue() {
        d2.INSTANCE.getClass();
        return d2.f17778o;
    }

    @Override // androidx.compose.ui.text.style.n
    @fg.l
    public t1 d() {
        return this.value;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final a6 getValue() {
        return this.value;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return l0.g(this.value, cVar.value) && Float.compare(this.alpha, cVar.alpha) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.n
    public float g() {
        return this.alpha;
    }

    @fg.l
    public final c h(@fg.l a6 value, float alpha) {
        return new c(value, alpha);
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.value.hashCode() * 31);
    }

    @fg.l
    public final a6 j() {
        return this.value;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.value);
        sb.append(", alpha=");
        return androidx.compose.animation.b.a(sb, this.alpha, ')');
    }
}
