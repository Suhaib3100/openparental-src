package androidx.compose.foundation.text;

import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* compiled from: TextFieldDelegate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/u;", "a", "(Landroidx/compose/ui/text/v0;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/lang/String;I)J", "I", "DefaultWidthCharCount", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7873a = 10;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f7874b = kotlin.text.v.e2("H", 10);

    public static final long a(@fg.l androidx.compose.ui.text.v0 v0Var, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l String str, int i4) {
        androidx.compose.ui.text.s h4 = androidx.compose.ui.text.x.h(str, v0Var, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), dVar, bVar, kotlin.collections.j0.f74919b, null, i4, false, 64, null);
        return androidx.compose.ui.unit.v.a(n0.a(h4.b()), n0.a(h4.getHeight()));
    }

    public static /* synthetic */ long b(androidx.compose.ui.text.v0 v0Var, androidx.compose.ui.unit.d dVar, y.b bVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            str = f7874b;
        }
        if ((i5 & 16) != 0) {
            i4 = 1;
        }
        return a(v0Var, dVar, bVar, str, i4);
    }

    @fg.l
    public static final String c() {
        return f7874b;
    }
}
