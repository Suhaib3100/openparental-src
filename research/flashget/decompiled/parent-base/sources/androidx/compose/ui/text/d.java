package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: AndroidTextStyle.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/d0;", "spanStyle", "Landroidx/compose/ui/text/c0;", "paragraphStyle", "Landroidx/compose/ui/text/f0;", "a", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/c0;)Landroidx/compose/ui/text/f0;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/c0;F)Landroidx/compose/ui/text/c0;", "c", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/d0;F)Landroidx/compose/ui/text/d0;", "", "Z", "DefaultIncludeFontPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20630a = false;

    @fg.l
    public static final f0 a(@fg.m d0 d0Var, @fg.m c0 c0Var) {
        return new f0(d0Var, c0Var);
    }

    @fg.l
    public static final c0 b(@fg.l c0 c0Var, @fg.l c0 c0Var2, float f4) {
        return c0Var.getIncludeFontPadding() == c0Var2.getIncludeFontPadding() ? c0Var : new c0(((j) j0.d(j.c(c0Var.getEmojiSupportMatch()), j.c(c0Var2.getEmojiSupportMatch()), f4)).getValue(), ((Boolean) j0.d(Boolean.valueOf(c0Var.getIncludeFontPadding()), Boolean.valueOf(c0Var2.getIncludeFontPadding()), f4)).booleanValue(), (kotlin.jvm.internal.w) null);
    }

    @fg.l
    public static final d0 c(@fg.l d0 d0Var, @fg.l d0 d0Var2, float f4) {
        return d0Var;
    }
}
