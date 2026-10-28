package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.f0;
import androidx.compose.ui.text.font.j0;
import androidx.compose.ui.text.font.m0;
import androidx.compose.ui.text.font.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidFontListTypeface.android.kt */
@kotlin.k(message = "This is not supported after downloadable fonts.")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0016B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/platform/c;", "Landroidx/compose/ui/text/platform/o;", "Landroidx/compose/ui/text/font/f0;", "fontFamily", "Landroid/content/Context;", "context", "", "Lkotlin/q0;", "Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "necessaryStyles", "Landroidx/compose/ui/text/font/j0;", "fontMatcher", "<init>", "(Landroidx/compose/ui/text/font/f0;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/j0;)V", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "synthesis", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/o0;II)Landroid/graphics/Typeface;", "a", "Landroidx/compose/ui/text/font/j0;", "d", "()Landroidx/compose/ui/text/font/j0;", "", "Landroidx/compose/ui/text/font/x;", "Ljava/util/Map;", "loadedTypefaces", "Landroidx/compose/ui/text/font/y;", "c", "Landroidx/compose/ui/text/font/y;", "()Landroidx/compose/ui/text/font/y;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n235#2,3:175\n33#2,4:178\n238#2,2:182\n38#2:184\n240#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n461#2,4:197\n33#2,4:201\n465#2,3:205\n38#2:208\n468#2:209\n33#2,6:211\n1#3:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,4\n66#1:182,2\n66#1:184\n66#1:185\n69#1:186,3\n69#1:189,4\n69#1:193,2\n69#1:195\n69#1:196\n71#1:197,4\n71#1:201,4\n71#1:205,3\n71#1:208\n71#1:209\n76#1:211,6\n*E\n"})
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21235e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 fontMatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<androidx.compose.ui.text.font.x, Typeface> loadedTypefaces;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.font.y fontFamily;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final a f21234d = new a();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final j0 f21236f = new j0();

    /* compiled from: AndroidFontListTypeface.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/j0;", "fontMatcher", "Landroidx/compose/ui/text/font/j0;", "a", "()Landroidx/compose/ui/text/font/j0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        @fg.l
        public final j0 a() {
            return c.f21236f;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(@fg.l androidx.compose.ui.text.font.f0 r8, @fg.l android.content.Context r9, @fg.m java.util.List<kotlin.q0<androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0>> r10, @fg.l androidx.compose.ui.text.font.j0 r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher = r11
            java.util.List r11 = r8.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L18:
            if (r3 >= r1) goto L3a
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.x r5 = (androidx.compose.ui.text.font.x) r5
            int r5 = r5.getLoadingStrategy()
            androidx.compose.ui.text.font.i0$a r6 = androidx.compose.ui.text.font.i0.INSTANCE
            r6.getClass()
            int r6 = androidx.compose.ui.text.font.i0.b()
            boolean r5 = androidx.compose.ui.text.font.i0.g(r5, r6)
            if (r5 == 0) goto L37
            r0.add(r4)
        L37:
            int r3 = r3 + 1
            goto L18
        L3a:
            if (r10 == 0) goto La6
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L4a:
            if (r3 >= r1) goto L74
            java.lang.Object r4 = r10.get(r3)
            kotlin.q0 r4 = (kotlin.q0) r4
            java.lang.Object r5 = r4.a()
            androidx.compose.ui.text.font.o0 r5 = (androidx.compose.ui.text.font.o0) r5
            java.lang.Object r4 = r4.b()
            androidx.compose.ui.text.font.k0 r4 = (androidx.compose.ui.text.font.k0) r4
            int r4 = r4.j()
            androidx.compose.ui.text.font.j0 r6 = r7.fontMatcher
            java.util.List r4 = r6.e(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.w.G2(r4)
            androidx.compose.ui.text.font.x r4 = (androidx.compose.ui.text.font.x) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L4a
        L74:
            java.util.List r10 = androidx.compose.ui.util.c.f(r11)
            if (r10 == 0) goto La6
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L91:
            if (r4 >= r3) goto La7
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.x r6 = (androidx.compose.ui.text.font.x) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La3
            r1.add(r5)
        La3:
            int r4 = r4 + 1
            goto L91
        La6:
            r1 = 0
        La7:
            if (r1 != 0) goto Laa
            goto Lab
        Laa:
            r0 = r1
        Lab:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto Le7
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lba:
            if (r2 >= r11) goto Le2
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.x r1 = (androidx.compose.ui.text.font.x) r1
            androidx.compose.ui.text.platform.p r3 = androidx.compose.ui.text.platform.p.f21269a     // Catch: java.lang.Exception -> Lce
            android.graphics.Typeface r3 = r3.b(r9, r1)     // Catch: java.lang.Exception -> Lce
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lce
            int r2 = r2 + 1
            goto Lba
        Lce:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Cannot create Typeface from "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Le2:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        Le7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.c.<init>(androidx.compose.ui.text.font.f0, android.content.Context, java.util.List, androidx.compose.ui.text.font.j0):void");
    }

    @Override // androidx.compose.ui.text.font.d1
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.text.font.y getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.o
    @fg.l
    public Typeface b(@fg.l o0 fontWeight, int fontStyle, int synthesis) {
        androidx.compose.ui.text.font.x xVar = (androidx.compose.ui.text.font.x) kotlin.collections.w.G2(this.fontMatcher.e(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (xVar == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface = this.loadedTypefaces.get(xVar);
        if (typeface == null) {
            throw new IllegalStateException("Could not load typeface");
        }
        Object a5 = m0.a(synthesis, typeface, xVar, fontWeight, fontStyle);
        l0.n(a5, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) a5;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final j0 getFontMatcher() {
        return this.fontMatcher;
    }

    public /* synthetic */ c(f0 f0Var, Context context, List list, j0 j0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(f0Var, context, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? f21236f : j0Var);
    }
}
