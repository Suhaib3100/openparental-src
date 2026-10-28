package androidx.compose.ui.platform;

import android.graphics.Rect;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AccessibilityIterators.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19735a = 0;

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/a$a;", "Landroidx/compose/ui/platform/a$f;", "<init>", "()V", "", "text", "Lkotlin/k2;", "e", "(Ljava/lang/String;)V", "", "start", "end", "", "c", "(II)[I", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "b", "[I", "segment", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0358a implements f {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19736c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        protected String text;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final int[] segment = new int[2];

        @fg.m
        protected final int[] c(int start, int end) {
            if (start < 0 || end < 0 || start == end) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = start;
            iArr[1] = end;
            return iArr;
        }

        @fg.l
        protected final String d() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.l0.S("text");
            return null;
        }

        public void e(@fg.l String text) {
            this.text = text;
        }

        protected final void f(@fg.l String str) {
            this.text = str;
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/a$b;", "Landroidx/compose/ui/platform/a$a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Lkotlin/k2;", "i", "", "text", "e", "(Ljava/lang/String;)V", "", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "d", "Ljava/text/BreakIterator;", "impl", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    public static class b extends AbstractC0358a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: f, reason: collision with root package name */
        public static final int f19740f = 8;

        /* renamed from: g, reason: collision with root package name */
        @fg.m
        private static b f19741g;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private BreakIterator impl;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/a$b$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/a$b;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/a$b;", "instance", "Landroidx/compose/ui/platform/a$b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final b a(@fg.l Locale locale) {
                if (b.f19741g == null) {
                    b.f19741g = new b(locale, null);
                }
                b bVar = b.f19741g;
                kotlin.jvm.internal.l0.n(bVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return bVar;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public /* synthetic */ b(Locale locale, kotlin.jvm.internal.w wVar) {
            this(locale);
        }

        private final void i(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] a(int current) {
            int length = d().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator2 = null;
                    }
                    int following = breakIterator2.following(current);
                    if (following == -1) {
                        return null;
                    }
                    return c(current, following);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.following(current);
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] b(int current) {
            int length = d().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator2 = null;
                    }
                    int preceding = breakIterator2.preceding(current);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, current);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.preceding(current);
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.a.AbstractC0358a
        public void e(@fg.l String text) {
            this.text = text;
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        private b(Locale locale) {
            i(locale);
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/a$c;", "Landroidx/compose/ui/platform/a$a;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/i;", "direction", "i", "(ILandroidx/compose/ui/text/style/i;)I", "", "text", "Landroidx/compose/ui/text/n0;", "layoutResult", "Lkotlin/k2;", "j", "(Ljava/lang/String;Landroidx/compose/ui/text/n0;)V", "current", "", "a", "(I)[I", "b", "d", "Landroidx/compose/ui/text/n0;", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    public static final class c extends AbstractC0358a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f19744f = 8;

        /* renamed from: g, reason: collision with root package name */
        @fg.m
        private static c f19745g;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.ui.text.n0 layoutResult;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private static final androidx.compose.ui.text.style.i f19746h = androidx.compose.ui.text.style.i.Rtl;

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        private static final androidx.compose.ui.text.style.i f19747i = androidx.compose.ui.text.style.i.Ltr;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/a$c$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/a$c;", "a", "()Landroidx/compose/ui/platform/a$c;", "Landroidx/compose/ui/text/style/i;", "DirectionEnd", "Landroidx/compose/ui/text/style/i;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/a$c;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final c a() {
                if (c.f19745g == null) {
                    c.f19745g = new c(null);
                }
                c cVar = c.f19745g;
                kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return cVar;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final int i(int lineNumber, androidx.compose.ui.text.style.i direction) {
            androidx.compose.ui.text.n0 n0Var = this.layoutResult;
            androidx.compose.ui.text.n0 n0Var2 = null;
            if (n0Var == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var = null;
            }
            int u4 = n0Var.u(lineNumber);
            androidx.compose.ui.text.n0 n0Var3 = this.layoutResult;
            if (n0Var3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var3 = null;
            }
            if (direction != n0Var3.y(u4)) {
                androidx.compose.ui.text.n0 n0Var4 = this.layoutResult;
                if (n0Var4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                } else {
                    n0Var2 = n0Var4;
                }
                return n0Var2.u(lineNumber);
            }
            androidx.compose.ui.text.n0 n0Var5 = this.layoutResult;
            if (n0Var5 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var5 = null;
            }
            return androidx.compose.ui.text.n0.p(n0Var5, lineNumber, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] a(int current) {
            int i4;
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            if (current < 0) {
                androidx.compose.ui.text.n0 n0Var = this.layoutResult;
                if (n0Var == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var = null;
                }
                i4 = n0Var.q(0);
            } else {
                androidx.compose.ui.text.n0 n0Var2 = this.layoutResult;
                if (n0Var2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var2 = null;
                }
                int q4 = n0Var2.q(current);
                i4 = i(q4, f19746h) == current ? q4 : q4 + 1;
            }
            androidx.compose.ui.text.n0 n0Var3 = this.layoutResult;
            if (n0Var3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var3 = null;
            }
            if (i4 >= n0Var3.n()) {
                return null;
            }
            return c(i(i4, f19746h), i(i4, f19747i) + 1);
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] b(int current) {
            int i4;
            if (d().length() <= 0 || current <= 0) {
                return null;
            }
            if (current > d().length()) {
                androidx.compose.ui.text.n0 n0Var = this.layoutResult;
                if (n0Var == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var = null;
                }
                i4 = n0Var.q(d().length());
            } else {
                androidx.compose.ui.text.n0 n0Var2 = this.layoutResult;
                if (n0Var2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var2 = null;
                }
                int q4 = n0Var2.q(current);
                i4 = i(q4, f19747i) + 1 == current ? q4 : q4 - 1;
            }
            if (i4 < 0) {
                return null;
            }
            return c(i(i4, f19746h), i(i4, f19747i) + 1);
        }

        public final void j(@fg.l String text, @fg.l androidx.compose.ui.text.n0 layoutResult) {
            this.text = text;
            this.layoutResult = layoutResult;
        }

        private c() {
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/a$d;", "Landroidx/compose/ui/platform/a$a;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/i;", "direction", "i", "(ILandroidx/compose/ui/text/style/i;)I", "", "text", "Landroidx/compose/ui/text/n0;", "layoutResult", "Landroidx/compose/ui/semantics/p;", "node", "Lkotlin/k2;", "j", "(Ljava/lang/String;Landroidx/compose/ui/text/n0;Landroidx/compose/ui/semantics/p;)V", "current", "", "a", "(I)[I", "b", "d", "Landroidx/compose/ui/text/n0;", "e", "Landroidx/compose/ui/semantics/p;", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "tempRect", "g", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    public static final class d extends AbstractC0358a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f19750h = 8;

        /* renamed from: i, reason: collision with root package name */
        @fg.m
        private static d f19751i;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.ui.text.n0 layoutResult;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.ui.semantics.p node;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Rect tempRect;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        private static final androidx.compose.ui.text.style.i f19752j = androidx.compose.ui.text.style.i.Rtl;

        /* renamed from: k, reason: collision with root package name */
        @fg.l
        private static final androidx.compose.ui.text.style.i f19753k = androidx.compose.ui.text.style.i.Ltr;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/a$d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/a$d;", "a", "()Landroidx/compose/ui/platform/a$d;", "Landroidx/compose/ui/text/style/i;", "DirectionEnd", "Landroidx/compose/ui/text/style/i;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/a$d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.a$d$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final d a() {
                if (d.f19751i == null) {
                    d.f19751i = new d(null);
                }
                d dVar = d.f19751i;
                kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return dVar;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final int i(int lineNumber, androidx.compose.ui.text.style.i direction) {
            androidx.compose.ui.text.n0 n0Var = this.layoutResult;
            androidx.compose.ui.text.n0 n0Var2 = null;
            if (n0Var == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var = null;
            }
            int u4 = n0Var.u(lineNumber);
            androidx.compose.ui.text.n0 n0Var3 = this.layoutResult;
            if (n0Var3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var3 = null;
            }
            if (direction != n0Var3.y(u4)) {
                androidx.compose.ui.text.n0 n0Var4 = this.layoutResult;
                if (n0Var4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                } else {
                    n0Var2 = n0Var4;
                }
                return n0Var2.u(lineNumber);
            }
            androidx.compose.ui.text.n0 n0Var5 = this.layoutResult;
            if (n0Var5 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                n0Var5 = null;
            }
            return androidx.compose.ui.text.n0.p(n0Var5, lineNumber, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] a(int current) {
            int n4;
            androidx.compose.ui.text.n0 n0Var = null;
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.p pVar = this.node;
                if (pVar == null) {
                    kotlin.jvm.internal.l0.S("node");
                    pVar = null;
                }
                int L0 = kotlin.math.b.L0(pVar.j().r());
                if (current <= 0) {
                    current = 0;
                }
                androidx.compose.ui.text.n0 n0Var2 = this.layoutResult;
                if (n0Var2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var2 = null;
                }
                int q4 = n0Var2.q(current);
                androidx.compose.ui.text.n0 n0Var3 = this.layoutResult;
                if (n0Var3 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var3 = null;
                }
                float v4 = n0Var3.v(q4) + L0;
                androidx.compose.ui.text.n0 n0Var4 = this.layoutResult;
                if (n0Var4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var4 = null;
                }
                androidx.compose.ui.text.n0 n0Var5 = this.layoutResult;
                if (n0Var5 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var5 = null;
                }
                if (v4 < n0Var4.v(n0Var5.n() - 1)) {
                    androidx.compose.ui.text.n0 n0Var6 = this.layoutResult;
                    if (n0Var6 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        n0Var = n0Var6;
                    }
                    n4 = n0Var.r(v4);
                } else {
                    androidx.compose.ui.text.n0 n0Var7 = this.layoutResult;
                    if (n0Var7 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        n0Var = n0Var7;
                    }
                    n4 = n0Var.n();
                }
                return c(current, i(n4 - 1, f19753k) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] b(int current) {
            int i4;
            androidx.compose.ui.text.n0 n0Var = null;
            if (d().length() <= 0 || current <= 0) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.p pVar = this.node;
                if (pVar == null) {
                    kotlin.jvm.internal.l0.S("node");
                    pVar = null;
                }
                int L0 = kotlin.math.b.L0(pVar.j().r());
                int length = d().length();
                if (length <= current) {
                    current = length;
                }
                androidx.compose.ui.text.n0 n0Var2 = this.layoutResult;
                if (n0Var2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var2 = null;
                }
                int q4 = n0Var2.q(current);
                androidx.compose.ui.text.n0 n0Var3 = this.layoutResult;
                if (n0Var3 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    n0Var3 = null;
                }
                float v4 = n0Var3.v(q4) - L0;
                if (v4 > 0.0f) {
                    androidx.compose.ui.text.n0 n0Var4 = this.layoutResult;
                    if (n0Var4 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        n0Var = n0Var4;
                    }
                    i4 = n0Var.r(v4);
                } else {
                    i4 = 0;
                }
                if (current == d().length() && i4 < q4) {
                    i4++;
                }
                return c(i(i4, f19752j), current);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void j(@fg.l String text, @fg.l androidx.compose.ui.text.n0 layoutResult, @fg.l androidx.compose.ui.semantics.p node) {
            this.text = text;
            this.layoutResult = layoutResult;
            this.node = node;
        }

        private d() {
            this.tempRect = new Rect();
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/a$e;", "Landroidx/compose/ui/platform/a$a;", "<init>", "()V", "", "index", "", "j", "(I)Z", "i", "current", "", "a", "(I)[I", "b", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class e extends AbstractC0358a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19758e = 0;

        /* renamed from: f, reason: collision with root package name */
        @fg.m
        private static e f19759f;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/a$e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/a$e;", "a", "()Landroidx/compose/ui/platform/a$e;", "instance", "Landroidx/compose/ui/platform/a$e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.a$e$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final e a() {
                if (e.f19759f == null) {
                    e.f19759f = new e();
                }
                e eVar = e.f19759f;
                kotlin.jvm.internal.l0.n(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return eVar;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        private e() {
        }

        private final boolean i(int index) {
            return index > 0 && d().charAt(index + (-1)) != '\n' && (index == d().length() || d().charAt(index) == '\n');
        }

        private final boolean j(int index) {
            return d().charAt(index) != '\n' && (index == 0 || d().charAt(index - 1) == '\n');
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] a(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.d()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.d()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.j(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.i(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.c(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.e.a(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] b(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.d()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.d()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.i(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.j(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.c(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.e.b(int):int[]");
        }

        public e(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/a$f;", "", "", "current", "", "a", "(I)[I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f {
        @fg.m
        int[] a(int current);

        @fg.m
        int[] b(int current);
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/a$g;", "Landroidx/compose/ui/platform/a$a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Lkotlin/k2;", "l", "", "index", "", "k", "(I)Z", "i", "j", "", "text", "e", "(Ljava/lang/String;)V", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "d", "Ljava/text/BreakIterator;", "impl", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    public static final class g extends AbstractC0358a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: f, reason: collision with root package name */
        public static final int f19761f = 8;

        /* renamed from: g, reason: collision with root package name */
        @fg.m
        private static g f19762g;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private BreakIterator impl;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/a$g$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/a$g;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/a$g;", "instance", "Landroidx/compose/ui/platform/a$g;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.a$g$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final g a(@fg.l Locale locale) {
                if (g.f19762g == null) {
                    g.f19762g = new g(locale, null);
                }
                g gVar = g.f19762g;
                kotlin.jvm.internal.l0.n(gVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return gVar;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public /* synthetic */ g(Locale locale, kotlin.jvm.internal.w wVar) {
            this(locale);
        }

        private final boolean i(int index) {
            return index > 0 && j(index + (-1)) && (index == d().length() || !j(index));
        }

        private final boolean j(int index) {
            if (index < 0 || index >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(index));
        }

        private final boolean k(int index) {
            return j(index) && (index == 0 || !j(index - 1));
        }

        private final void l(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] a(int current) {
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (!j(current) && !k(current)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                current = breakIterator.following(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(current);
            if (following == -1 || !i(following)) {
                return null;
            }
            return c(current, following);
        }

        @Override // androidx.compose.ui.platform.a.f
        @fg.m
        public int[] b(int current) {
            int length = d().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && !j(current - 1) && !i(current)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                current = breakIterator.preceding(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(current);
            if (preceding == -1 || !k(preceding)) {
                return null;
            }
            return c(preceding, current);
        }

        @Override // androidx.compose.ui.platform.a.AbstractC0358a
        public void e(@fg.l String text) {
            this.text = text;
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        private g(Locale locale) {
            l(locale);
        }
    }
}
