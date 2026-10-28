package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

/* compiled from: BoringLayoutFactory.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJm\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/android/d;", "", "<init>", "()V", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", "c", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "width", "Landroid/text/Layout$Alignment;", "alignment", "", "lineSpacingMultiplier", "lineSpacingExtra", "metrics", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", "layout", "d", "(Landroid/text/BoringLayout;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(33)
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f20469a = new d();

    private d() {
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    public static final BoringLayout a(@fg.l CharSequence text, @fg.l TextPaint paint, int width, @fg.l Layout.Alignment alignment, float lineSpacingMultiplier, float lineSpacingExtra, @fg.l BoringLayout.Metrics metrics, boolean includePadding, boolean useFallbackLineSpacing, @fg.m TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        return c.a(text, paint, width, alignment, lineSpacingMultiplier, lineSpacingExtra, metrics, includePadding, ellipsize, ellipsizedWidth, useFallbackLineSpacing);
    }

    @androidx.annotation.u
    @fg.m
    @kd.n
    public static final BoringLayout.Metrics c(@fg.l CharSequence text, @fg.l TextPaint paint, @fg.l TextDirectionHeuristic textDir) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(text, paint, textDir, true, null);
        return isBoring;
    }

    public final boolean d(@fg.l BoringLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
