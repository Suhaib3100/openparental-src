package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BoringLayoutFactory.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJa\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/android/e;", "", "<init>", "()V", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", "d", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "width", "metrics", "Landroid/text/Layout$Alignment;", "alignment", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/BoringLayout$Metrics;Landroid/text/Layout$Alignment;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", "layout", "c", "(Landroid/text/BoringLayout;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBoringLayoutFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e f20470a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final int f20471b = 0;

    private e() {
    }

    @fg.l
    public final BoringLayout a(@fg.l CharSequence text, @fg.l TextPaint paint, int width, @fg.l BoringLayout.Metrics metrics, @fg.l Layout.Alignment alignment, boolean includePadding, boolean useFallbackLineSpacing, @fg.m TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (ellipsizedWidth >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? d.a(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, useFallbackLineSpacing, ellipsize, ellipsizedWidth) : f.a(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, ellipsize, ellipsizedWidth);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean c(@fg.l BoringLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        d.f20469a.getClass();
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @fg.m
    public final BoringLayout.Metrics d(@fg.l CharSequence text, @fg.l TextPaint paint, @fg.l TextDirectionHeuristic textDir) {
        return Build.VERSION.SDK_INT >= 33 ? d.c(text, paint, textDir) : f.c(text, paint, textDir);
    }
}
