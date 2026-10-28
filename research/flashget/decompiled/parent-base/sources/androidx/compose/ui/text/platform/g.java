package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.b5;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.s1;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b$\u0010/R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010:R\u001a\u0010@\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010BR\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010BR\u0014\u0010F\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/platform/g;", "Landroidx/compose/ui/text/v;", "", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/unit/d;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/text/v0;", "l", "()Landroidx/compose/ui/text/v0;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", "d", "j", "e", "Landroidx/compose/ui/text/font/y$b;", "h", "()Landroidx/compose/ui/text/font/y$b;", "f", "Landroidx/compose/ui/unit/d;", "g", "()Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/text/platform/m;", "Landroidx/compose/ui/text/platform/m;", "o", "()Landroidx/compose/ui/text/platform/m;", "textPaint", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/o;", "i", "Landroidx/compose/ui/text/android/o;", "()Landroidx/compose/ui/text/android/o;", "layoutIntrinsics", "Landroidx/compose/ui/text/platform/a0;", "Landroidx/compose/ui/text/platform/a0;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "I", "n", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements androidx.compose.ui.text.v {

    /* renamed from: m, reason: collision with root package name */
    public static final int f21248m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e.b<i0>> spanStyles;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e.b<androidx.compose.ui.text.a0>> placeholders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m textPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence charSequence;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.android.o layoutIntrinsics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a0 resolvedTypefaces;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* compiled from: AndroidParagraphIntrinsics.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/y;", "fontFamily", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/o0;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.r<androidx.compose.ui.text.font.y, o0, k0, l0, Typeface> {
        a() {
            super(4);
        }

        @fg.l
        public final Typeface a(@fg.m androidx.compose.ui.text.font.y yVar, @fg.l o0 o0Var, int i4, int i5) {
            b5<Object> b5 = g.this.getFontFamilyResolver().b(yVar, o0Var, i4, i5);
            if (b5 instanceof s1.b) {
                Object value = ((s1.b) b5).getValue();
                kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            a0 a0Var = new a0(b5, g.this.resolvedTypefaces);
            g.this.resolvedTypefaces = a0Var;
            return a0Var.b();
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ Typeface i(androidx.compose.ui.text.font.y yVar, o0 o0Var, k0 k0Var, l0 l0Var) {
            return a(yVar, o0Var, k0Var.j(), l0Var.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<androidx.compose.ui.text.e$b<androidx.compose.ui.text.i0>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public g(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<androidx.compose.ui.text.a0>> list2, @fg.l y.b bVar, @fg.l androidx.compose.ui.unit.d dVar) {
        boolean c5;
        this.text = str;
        this.style = v0Var;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = dVar;
        m mVar = new m(1, dVar.getDensity());
        this.textPaint = mVar;
        c5 = h.c(v0Var);
        this.emojiCompatProcessed = !c5 ? false : u.f21288a.a().getValue().booleanValue();
        this.textDirectionHeuristic = h.d(v0Var.V(), v0Var.K());
        a aVar = new a();
        androidx.compose.ui.text.platform.extensions.e.f(mVar, v0Var.Y());
        i0 a5 = androidx.compose.ui.text.platform.extensions.e.a(mVar, v0Var.o0(), aVar, dVar, !((Collection) list).isEmpty());
        if (a5 != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i4 = 0;
            while (i4 < size) {
                list.add(i4 == 0 ? new e.b<>(a5, 0, this.text.length()) : this.spanStyles.get(i4 - 1));
                i4++;
            }
        }
        CharSequence a6 = f.a(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, aVar, this.emojiCompatProcessed);
        this.charSequence = a6;
        this.layoutIntrinsics = new androidx.compose.ui.text.android.o(a6, this.textPaint, this.textDirectionHeuristic);
    }

    @Override // androidx.compose.ui.text.v
    public float a() {
        return this.layoutIntrinsics.b();
    }

    @Override // androidx.compose.ui.text.v
    public float b() {
        return this.layoutIntrinsics.c();
    }

    @Override // androidx.compose.ui.text.v
    public boolean c() {
        boolean c5;
        a0 a0Var = this.resolvedTypefaces;
        if (!(a0Var != null ? a0Var.c() : false)) {
            if (this.emojiCompatProcessed) {
                return false;
            }
            c5 = h.c(this.style);
            if (!c5 || !u.f21288a.a().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final y.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final androidx.compose.ui.text.android.o getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @fg.l
    public final List<e.b<androidx.compose.ui.text.a0>> j() {
        return this.placeholders;
    }

    @fg.l
    public final List<e.b<i0>> k() {
        return this.spanStyles;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final v0 getStyle() {
        return this.style;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: n, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final m getTextPaint() {
        return this.textPaint;
    }
}
