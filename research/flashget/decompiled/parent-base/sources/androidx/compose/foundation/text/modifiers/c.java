package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import androidx.compose.ui.text.x;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MinLinesConstrainer.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/modifiers/c;", "", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/v0;", "inputTextStyle", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)V", "Landroidx/compose/ui/unit/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "Landroidx/compose/ui/unit/w;", "g", "()Landroidx/compose/ui/unit/w;", "b", "Landroidx/compose/ui/text/v0;", "f", "()Landroidx/compose/ui/text/v0;", "Landroidx/compose/ui/unit/d;", "d", "()Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/text/font/y$b;", "e", "()Landroidx/compose/ui/text/font/y$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    public static final int f7717i = 8;

    /* renamed from: j, reason: collision with root package name */
    @fg.m
    private static c f7718j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w layoutDirection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 inputTextStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 resolvedStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float lineHeightCache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float oneLineHeightCache;

    /* compiled from: MinLinesConstrainer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/modifiers/c$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/c;", "minMaxUtil", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/v0;", "paramStyle", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "a", "(Landroidx/compose/foundation/text/modifiers/c;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)Landroidx/compose/foundation/text/modifiers/c;", "last", "Landroidx/compose/foundation/text/modifiers/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final c a(@fg.m c minMaxUtil, @fg.l w layoutDirection, @fg.l v0 paramStyle, @fg.l androidx.compose.ui.unit.d density, @fg.l y.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && l0.g(paramStyle, minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            c cVar = c.f7718j;
            if (cVar != null && layoutDirection == cVar.getLayoutDirection() && l0.g(paramStyle, cVar.getInputTextStyle()) && density.getDensity() == cVar.getDensity().getDensity() && fontFamilyResolver == cVar.getFontFamilyResolver()) {
                return cVar;
            }
            c cVar2 = new c(layoutDirection, w0.d(paramStyle, layoutDirection), density, fontFamilyResolver, null);
            Companion companion = c.INSTANCE;
            c.f7718j = cVar2;
            return cVar2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ c(w wVar, v0 v0Var, androidx.compose.ui.unit.d dVar, y.b bVar, kotlin.jvm.internal.w wVar2) {
        this(wVar, v0Var, dVar, bVar);
    }

    public final long c(long inConstraints, int minLines) {
        String str;
        String str2;
        int q4;
        float f4 = this.oneLineHeightCache;
        float f5 = this.lineHeightCache;
        if (Float.isNaN(f4) || Float.isNaN(f5)) {
            str = d.f7727b;
            f4 = x.h(str, this.resolvedStyle, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 1, false, 96, null).getHeight();
            str2 = d.f7728c;
            f5 = x.h(str2, this.resolvedStyle, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, false, 96, null).getHeight() - f4;
            this.oneLineHeightCache = f4;
            this.lineHeightCache = f5;
        }
        if (minLines != 1) {
            q4 = kotlin.math.b.L0((f5 * (minLines - 1)) + f4);
            if (q4 < 0) {
                q4 = 0;
            }
            int o4 = androidx.compose.ui.unit.b.o(inConstraints);
            if (q4 > o4) {
                q4 = o4;
            }
        } else {
            q4 = androidx.compose.ui.unit.b.q(inConstraints);
        }
        return androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.r(inConstraints), androidx.compose.ui.unit.b.p(inConstraints), q4, androidx.compose.ui.unit.b.o(inConstraints));
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

    @fg.l
    /* renamed from: f, reason: from getter */
    public final v0 getInputTextStyle() {
        return this.inputTextStyle;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final w getLayoutDirection() {
        return this.layoutDirection;
    }

    private c(w wVar, v0 v0Var, androidx.compose.ui.unit.d dVar, y.b bVar) {
        this.layoutDirection = wVar;
        this.inputTextStyle = v0Var;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = w0.d(v0Var, wVar);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }
}
