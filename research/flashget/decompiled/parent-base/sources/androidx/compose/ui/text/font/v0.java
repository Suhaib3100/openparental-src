package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/v0;", "", "Landroidx/compose/ui/text/font/y;", "fontFamily", "d", "(Landroidx/compose/ui/text/font/y;)Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "a", "(Landroidx/compose/ui/text/font/o0;)Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "b", "(I)I", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface v0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20884a;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/v0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/v0;", "b", "Landroidx/compose/ui/text/font/v0;", "a", "()Landroidx/compose/ui/text/font/v0;", "Default", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.v0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f20884a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final v0 Default = new C0372a();

        /* compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/font/v0$a$a", "Landroidx/compose/ui/text/font/v0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.font.v0$a$a, reason: collision with other inner class name */
        public static final class C0372a implements v0 {
            C0372a() {
            }
        }

        private Companion() {
        }

        @fg.l
        public final v0 a() {
            return Default;
        }
    }

    @fg.l
    default o0 a(@fg.l o0 fontWeight) {
        return fontWeight;
    }

    default int b(int fontStyle) {
        return fontStyle;
    }

    default int c(int fontSynthesis) {
        return fontSynthesis;
    }

    @fg.m
    default y d(@fg.m y fontFamily) {
        return fontFamily;
    }
}
