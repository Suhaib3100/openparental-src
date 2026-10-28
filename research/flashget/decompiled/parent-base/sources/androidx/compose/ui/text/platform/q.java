package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.o0;
import kotlin.Metadata;

/* compiled from: AndroidTypefaceWrapper.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/platform/q;", "Landroidx/compose/ui/text/platform/o;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "synthesis", "b", "(Landroidx/compose/ui/text/font/o0;II)Landroid/graphics/Typeface;", "a", "Landroid/graphics/Typeface;", "c", "()Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/y;", "()Landroidx/compose/ui/text/font/y;", "fontFamily", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21272c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Typeface typeface;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.font.y fontFamily;

    public q(@fg.l Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // androidx.compose.ui.text.font.d1
    @fg.m
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.text.font.y getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.o
    @fg.l
    public Typeface b(@fg.l o0 fontWeight, int fontStyle, int synthesis) {
        return this.typeface;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }
}
