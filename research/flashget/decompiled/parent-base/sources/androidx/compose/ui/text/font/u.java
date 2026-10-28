package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/t;", "familyName", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;Lkotlin/jvm/internal/w;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Ljava/lang/String;", "h", "Landroidx/compose/ui/text/font/o0;", "a", "()Landroidx/compose/ui/text/font/o0;", "i", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u extends d {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String familyName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 weight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int style;

    public /* synthetic */ u(String str, o0 o0Var, int i4, n0.e eVar, kotlin.jvm.internal.w wVar) {
        this(str, o0Var, i4, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    @fg.l
    /* renamed from: a, reason: from getter */
    public o0 getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.x
    /* renamed from: c, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return kotlin.jvm.internal.l0.g(this.familyName, uVar.familyName) && kotlin.jvm.internal.l0.g(this.weight, uVar.weight) && k0.f(this.style, uVar.style) && kotlin.jvm.internal.l0.g(getVariationSettings(), uVar.getVariationSettings());
    }

    @fg.m
    public final Typeface f(@fg.l Context context) {
        return a1.a().c(this.familyName, this.weight, this.style, getVariationSettings(), context);
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + ((k0.h(this.style) + ((this.weight.getWeight() + (this.familyName.hashCode() * 31)) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return "Font(familyName=\"" + ((Object) t.g(this.familyName)) + "\", weight=" + this.weight + ", style=" + ((Object) k0.i(this.style)) + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private u(String str, o0 o0Var, int i4, n0.e eVar) {
        super(i0.f20744d, s0.f20871a, eVar, null);
        i0.INSTANCE.getClass();
        this.familyName = str;
        this.weight = o0Var;
        this.style = i4;
    }
}
