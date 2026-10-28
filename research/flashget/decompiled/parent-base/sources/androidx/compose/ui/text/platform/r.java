package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/r;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "typeface", "Landroid/text/style/TypefaceSpan;", "a", "(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(28)
/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r f21275a = new r();

    private r() {
    }

    @fg.l
    @androidx.annotation.u
    public final TypefaceSpan a(@fg.l Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
