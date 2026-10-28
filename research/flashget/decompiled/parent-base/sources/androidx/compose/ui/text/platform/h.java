package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.c0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/style/l;", "textDirection", "Lu0/f;", "localeList", "", "d", "(ILu0/f;)I", "", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/v;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)Landroidx/compose/ui/text/v;", "", "c", "(Landroidx/compose/ui/text/v0;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    @fg.l
    public static final androidx.compose.ui.text.v a(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<androidx.compose.ui.text.a0>> list2, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar) {
        return new g(str, v0Var, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(v0 v0Var) {
        c0 paragraphStyle;
        f0 platformStyle = v0Var.getPlatformStyle();
        androidx.compose.ui.text.j c5 = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : androidx.compose.ui.text.j.c(paragraphStyle.getEmojiSupportMatch());
        androidx.compose.ui.text.j.INSTANCE.getClass();
        return !(c5 == null ? false : androidx.compose.ui.text.j.f(c5.getValue(), androidx.compose.ui.text.j.f21162d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(int r6, @fg.m u0.f r7) {
        /*
            androidx.compose.ui.text.style.l$a r0 = androidx.compose.ui.text.style.l.INSTANCE
            r0.getClass()
            int r1 = androidx.compose.ui.text.style.l.b()
            boolean r1 = androidx.compose.ui.text.style.l.j(r6, r1)
            r2 = 2
            if (r1 == 0) goto L12
            goto L81
        L12:
            r0.getClass()
            int r1 = androidx.compose.ui.text.style.l.c()
            boolean r1 = androidx.compose.ui.text.style.l.j(r6, r1)
            r3 = 3
            if (r1 == 0) goto L22
        L20:
            r2 = r3
            goto L81
        L22:
            r0.getClass()
            int r1 = androidx.compose.ui.text.style.l.d()
            boolean r1 = androidx.compose.ui.text.style.l.j(r6, r1)
            r4 = 0
            if (r1 == 0) goto L32
            r2 = r4
            goto L81
        L32:
            r0.getClass()
            int r1 = androidx.compose.ui.text.style.l.e()
            boolean r1 = androidx.compose.ui.text.style.l.j(r6, r1)
            r5 = 1
            if (r1 == 0) goto L42
            r2 = r5
            goto L81
        L42:
            r0.getClass()
            int r1 = androidx.compose.ui.text.style.l.a()
            boolean r1 = androidx.compose.ui.text.style.l.j(r6, r1)
            if (r1 == 0) goto L51
            r6 = r5
            goto L5c
        L51:
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.l.f()
            boolean r6 = androidx.compose.ui.text.style.l.j(r6, r0)
        L5c:
            if (r6 == 0) goto L82
            if (r7 == 0) goto L75
            u0.e r6 = r7.f(r4)
            u0.g r6 = r6.getPlatformLocale()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.l0.n(r6, r7)
            u0.a r6 = (u0.a) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L79
        L75:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L79:
            int r6 = android.text.TextUtils.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L81
            if (r6 == r5) goto L20
        L81:
            return r2
        L82:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.h.d(int, u0.f):int");
    }

    public static /* synthetic */ int e(int i4, u0.f fVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fVar = null;
        }
        return d(i4, fVar);
    }
}
