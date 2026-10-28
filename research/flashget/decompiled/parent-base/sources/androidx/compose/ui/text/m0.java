package androidx.compose.ui.text;

import androidx.compose.animation.d1;
import androidx.compose.ui.graphics.k6;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextLayoutResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001dJ\u0082\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010$R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b3\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b:\u0010?R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b6\u0010AR\u001d\u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b/\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u0015\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010I\u001a\u0004\bB\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/ui/text/m0;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/x$b;Landroidx/compose/ui/text/font/y$b;J)V", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/x$b;JLkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/y$b;JLkotlin/jvm/internal/w;)V", "a", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/x$b;J)Landroidx/compose/ui/text/m0;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/e;", "n", "()Landroidx/compose/ui/text/e;", "b", "Landroidx/compose/ui/text/v0;", "m", "()Landroidx/compose/ui/text/v0;", "c", "Ljava/util/List;", "i", "()Ljava/util/List;", "d", "I", "g", "e", "Z", "l", "()Z", "f", "h", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/w;", "()Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/text/font/y$b;", "()Landroidx/compose/ui/text/font/y$b;", "j", "J", "()J", "k", "Landroidx/compose/ui/text/font/x$b;", "_developerSuppliedResourceLoader", "()Landroidx/compose/ui/text/font/x$b;", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f21176l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e.b<a0>> placeholders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private x.b _developerSuppliedResourceLoader;

    @kotlin.k(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @kotlin.x0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ m0(e eVar, v0 v0Var, List list, int i4, boolean z4, int i5, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, x.b bVar, long j4, kotlin.jvm.internal.w wVar2) {
        this(eVar, v0Var, (List<e.b<a0>>) list, i4, z4, i5, dVar, wVar, bVar, j4);
    }

    @kotlin.k(message = "Replaced with FontFamily.Resolver", replaceWith = @kotlin.x0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void k() {
    }

    @fg.l
    @kotlin.k(message = "Font.ResourceLoader is deprecated", replaceWith = @kotlin.x0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    public final m0 a(@fg.l e text, @fg.l v0 style, @fg.l List<e.b<a0>> placeholders, int maxLines, boolean softWrap, int overflow, @fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l x.b resourceLoader, long constraints) {
        return new m0(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, resourceLoader, this.fontFamilyResolver, constraints);
    }

    /* renamed from: c, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final y.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) other;
        return kotlin.jvm.internal.l0.g(this.text, m0Var.text) && kotlin.jvm.internal.l0.g(this.style, m0Var.style) && kotlin.jvm.internal.l0.g(this.placeholders, m0Var.placeholders) && this.maxLines == m0Var.maxLines && this.softWrap == m0Var.softWrap && androidx.compose.ui.text.style.t.g(this.overflow, m0Var.overflow) && kotlin.jvm.internal.l0.g(this.density, m0Var.density) && this.layoutDirection == m0Var.layoutDirection && kotlin.jvm.internal.l0.g(this.fontFamilyResolver, m0Var.fontFamilyResolver) && androidx.compose.ui.unit.b.g(this.constraints, m0Var.constraints);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: g, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: h, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public int hashCode() {
        return androidx.compose.ui.unit.b.t(this.constraints) + ((this.fontFamilyResolver.hashCode() + ((this.layoutDirection.hashCode() + ((this.density.hashCode() + ((androidx.compose.ui.text.style.t.h(this.overflow) + d1.a(this.softWrap, (k6.a(this.placeholders, androidx.compose.foundation.text.modifiers.h.a(this.style, this.text.hashCode() * 31, 31), 31) + this.maxLines) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    @fg.l
    public final List<e.b<a0>> i() {
        return this.placeholders;
    }

    @fg.l
    public final x.b j() {
        x.b bVar = this._developerSuppliedResourceLoader;
        return bVar == null ? i.INSTANCE.a(this.fontFamilyResolver) : bVar;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final v0 getStyle() {
        return this.style;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final e getText() {
        return this.text;
    }

    @fg.l
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) androidx.compose.ui.text.style.t.i(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.constraints)) + ')';
    }

    private m0(e eVar, v0 v0Var, List<e.b<a0>> list, int i4, boolean z4, int i5, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, x.b bVar, y.b bVar2, long j4) {
        this.text = eVar;
        this.style = v0Var;
        this.placeholders = list;
        this.maxLines = i4;
        this.softWrap = z4;
        this.overflow = i5;
        this.density = dVar;
        this.layoutDirection = wVar;
        this.fontFamilyResolver = bVar2;
        this.constraints = j4;
        this._developerSuppliedResourceLoader = bVar;
    }

    private m0(e eVar, v0 v0Var, List<e.b<a0>> list, int i4, boolean z4, int i5, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, x.b bVar, long j4) {
        this(eVar, v0Var, list, i4, z4, i5, dVar, wVar, bVar, androidx.compose.ui.text.font.s.a(bVar), j4);
    }

    private m0(e eVar, v0 v0Var, List<e.b<a0>> list, int i4, boolean z4, int i5, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, y.b bVar, long j4) {
        this(eVar, v0Var, list, i4, z4, i5, dVar, wVar, (x.b) null, bVar, j4);
    }

    public m0(e eVar, v0 v0Var, List list, int i4, boolean z4, int i5, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, y.b bVar, long j4, kotlin.jvm.internal.w wVar2) {
        this(eVar, v0Var, (List<e.b<a0>>) list, i4, z4, i5, dVar, wVar, (x.b) null, bVar, j4);
    }
}
