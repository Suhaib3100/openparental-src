package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.s1;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/t0;", "Landroidx/compose/ui/text/font/d0;", "<init>", "()V", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "Landroidx/compose/ui/text/font/u0;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/s1$b;", "Lkotlin/k2;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/s1;", "a", "(Landroidx/compose/ui/text/font/q1;Landroidx/compose/ui/text/font/u0;Lld/l;Lld/l;)Landroidx/compose/ui/text/font/s1;", "Landroidx/compose/ui/text/font/w0;", "Landroidx/compose/ui/text/font/w0;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20878b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 platformTypefaceResolver = a1.a();

    @Override // androidx.compose.ui.text.font.d0
    @fg.m
    public s1 a(@fg.l q1 typefaceRequest, @fg.l u0 platformFontLoader, @fg.l ld.l<? super s1.b, k2> onAsyncCompletion, @fg.l ld.l<? super q1, ? extends Object> createDefaultTypeface) {
        Typeface b5;
        y h4 = typefaceRequest.h();
        if (h4 == null ? true : h4 instanceof p) {
            b5 = this.platformTypefaceResolver.b(typefaceRequest.k(), typefaceRequest.i());
        } else if (h4 instanceof q0) {
            b5 = this.platformTypefaceResolver.a((q0) typefaceRequest.h(), typefaceRequest.k(), typefaceRequest.i());
        } else {
            if (!(h4 instanceof r0)) {
                return null;
            }
            d1 typeface = ((r0) typefaceRequest.h()).getTypeface();
            kotlin.jvm.internal.l0.n(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            b5 = ((androidx.compose.ui.text.platform.o) typeface).b(typefaceRequest.k(), typefaceRequest.i(), typefaceRequest.j());
        }
        return new s1.b(b5, false, 2, null);
    }
}
