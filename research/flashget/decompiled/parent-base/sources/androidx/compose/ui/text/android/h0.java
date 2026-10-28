package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import kotlin.Metadata;

/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/android/h0;", "", "<init>", "()V", "Landroid/text/StaticLayout;", "layout", "", "a", "(Landroid/text/StaticLayout;)Z", "Landroid/text/StaticLayout$Builder;", "builder", "", "lineBreakStyle", "lineBreakWordStyle", "Lkotlin/k2;", "b", "(Landroid/text/StaticLayout$Builder;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(33)
/* loaded from: classes.dex */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h0 f20501a = new h0();

    private h0() {
    }

    @androidx.annotation.u
    @kd.n
    public static final boolean a(@fg.l StaticLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @androidx.annotation.u
    @kd.n
    public static final void b(@fg.l StaticLayout.Builder builder, int lineBreakStyle, int lineBreakWordStyle) {
        LineBreakConfig.Builder lineBreakStyle2;
        LineBreakConfig.Builder lineBreakWordStyle2;
        LineBreakConfig build;
        lineBreakStyle2 = g0.a().setLineBreakStyle(lineBreakStyle);
        lineBreakWordStyle2 = lineBreakStyle2.setLineBreakWordStyle(lineBreakWordStyle);
        build = lineBreakWordStyle2.build();
        builder.setLineBreakConfig(build);
    }
}
