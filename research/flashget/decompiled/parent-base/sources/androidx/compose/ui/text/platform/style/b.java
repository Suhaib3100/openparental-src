package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.a6;
import fg.l;
import fg.m;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: ShaderBrushSpan.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R1\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/style/b;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/a6;", "shaderBrush", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/a6;F)V", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/k2;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/a6;", "b", "()Landroidx/compose/ui/graphics/a6;", "F", "()F", "Li0/n;", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "()J", "d", "(J)V", "size", "Landroidx/compose/runtime/b5;", "Landroid/graphics/Shader;", "Landroidx/compose/runtime/b5;", "shaderState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,56:1\n81#2:57\n107#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:57\n41#1:58,2\n*E\n"})
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21281e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final a6 shaderBrush;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final k2 size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final b5<Shader> shaderState;

    /* compiled from: ShaderBrushSpan.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "a", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,56:1\n159#2:57\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n*L\n44#1:57\n*E\n"})
    static final class a extends n0 implements ld.a<Shader> {
        a() {
            super(0);
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            long c5 = b.this.c();
            n.INSTANCE.getClass();
            if (c5 == n.f74172d || n.v(b.this.c())) {
                return null;
            }
            return b.this.getShaderBrush().c(b.this.c());
        }
    }

    public b(@l a6 a6Var, float f4) {
        k2 g4;
        this.shaderBrush = a6Var;
        this.alpha = f4;
        n.INSTANCE.getClass();
        g4 = t4.g(n.c(n.f74172d), null, 2, null);
        this.size = g4;
        this.shaderState = o4.e(new a());
    }

    /* renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a6 getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((n) this.size.getValue()).getPackedValue();
    }

    public final void d(long j4) {
        this.size.setValue(n.c(j4));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        androidx.compose.ui.text.platform.n.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
