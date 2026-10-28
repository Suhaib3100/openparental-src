package androidx.compose.foundation.text;

import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* compiled from: TextFieldSize.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\n\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r8\u0006@BX\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b&\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/text/a1;", "", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/v0;", "resolvedStyle", "typeface", "<init>", "(Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/text/v0;Ljava/lang/Object;)V", "Landroidx/compose/ui/unit/u;", "a", "()J", "Lkotlin/k2;", "m", "Landroidx/compose/ui/unit/w;", "d", "()Landroidx/compose/ui/unit/w;", "j", "(Landroidx/compose/ui/unit/w;)V", "b", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "h", "(Landroidx/compose/ui/unit/d;)V", "c", "Landroidx/compose/ui/text/font/y$b;", "()Landroidx/compose/ui/text/font/y$b;", "i", "(Landroidx/compose/ui/text/font/y$b;)V", "Landroidx/compose/ui/text/v0;", "f", "()Landroidx/compose/ui/text/v0;", "k", "(Landroidx/compose/ui/text/v0;)V", "e", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "<set-?>", "J", "minSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private y.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.v0 resolvedStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object typeface;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minSize = a();

    public a1(@fg.l androidx.compose.ui.unit.w wVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l androidx.compose.ui.text.v0 v0Var, @fg.l Object obj) {
        this.layoutDirection = wVar;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = v0Var;
        this.typeface = obj;
    }

    private final long a() {
        return r0.b(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final y.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: e, reason: from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final androidx.compose.ui.text.v0 getResolvedStyle() {
        return this.resolvedStyle;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final Object getTypeface() {
        return this.typeface;
    }

    public final void h(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
    }

    public final void i(@fg.l y.b bVar) {
        this.fontFamilyResolver = bVar;
    }

    public final void j(@fg.l androidx.compose.ui.unit.w wVar) {
        this.layoutDirection = wVar;
    }

    public final void k(@fg.l androidx.compose.ui.text.v0 v0Var) {
        this.resolvedStyle = v0Var;
    }

    public final void l(@fg.l Object obj) {
        this.typeface = obj;
    }

    public final void m(@fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density, @fg.l y.b fontFamilyResolver, @fg.l androidx.compose.ui.text.v0 resolvedStyle, @fg.l Object typeface) {
        if (layoutDirection == this.layoutDirection && kotlin.jvm.internal.l0.g(density, this.density) && kotlin.jvm.internal.l0.g(fontFamilyResolver, this.fontFamilyResolver) && kotlin.jvm.internal.l0.g(resolvedStyle, this.resolvedStyle) && kotlin.jvm.internal.l0.g(typeface, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }
}
