package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.x;
import kotlin.Metadata;

/* compiled from: AndroidFontResourceLoader.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.k(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.x0(expression = "PlatformFontLoader", imports = {}))
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/p0;", "Landroidx/compose/ui/text/font/x$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/x;", "font", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/x;)Landroid/graphics/Typeface;", "a", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 implements x.b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20077b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    public p0(@fg.l Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.x.b
    @fg.l
    @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.x0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@fg.l androidx.compose.ui.text.font.x font) {
        if (!(font instanceof androidx.compose.ui.text.font.b1)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return r0.f20090a.a(this.context, ((androidx.compose.ui.text.font.b1) font).getResId());
        }
        Typeface j4 = androidx.core.content.res.i.j(this.context, ((androidx.compose.ui.text.font.b1) font).getResId());
        kotlin.jvm.internal.l0.m(j4);
        return j4;
    }
}
