package androidx.compose.ui.text;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MultiParagraphIntrinsics.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u001b\u0010%\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0017\u0010\"R \u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/p;", "Landroidx/compose/ui/text/v;", "Landroidx/compose/ui/text/e;", "annotatedString", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)V", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/x$b;)V", "Landroidx/compose/ui/text/y;", "defaultStyle", "h", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/y;", "a", "Landroidx/compose/ui/text/e;", "e", "()Landroidx/compose/ui/text/e;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "c", "Lkotlin/b0;", "()F", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "Landroidx/compose/ui/text/u;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n804#2:155\n805#2,5:164\n151#3,3:156\n33#3,4:159\n154#3:163\n155#3:169\n38#3:170\n156#3:171\n101#3,2:172\n33#3,6:174\n103#3:180\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n96#1:155\n96#1:164,5\n96#1:156,3\n96#1:159,4\n96#1:163\n96#1:169\n96#1:170\n96#1:171\n121#1:172,2\n121#1:174,6\n121#1:180\n*E\n"})
/* loaded from: classes.dex */
public final class p implements v {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21218f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e.b<a0>> placeholders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 minIntrinsicWidth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 maxIntrinsicWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<u> infoList;

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n*L\n82#1:155,13\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Float> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            u uVar;
            v g4;
            List<u> f4 = p.this.f();
            if (f4.isEmpty()) {
                uVar = null;
            } else {
                u uVar2 = f4.get(0);
                float a5 = uVar2.g().a();
                int J = kotlin.collections.w.J(f4);
                int i4 = 1;
                if (1 <= J) {
                    while (true) {
                        u uVar3 = f4.get(i4);
                        float a6 = uVar3.g().a();
                        if (Float.compare(a5, a6) < 0) {
                            uVar2 = uVar3;
                            a5 = a6;
                        }
                        if (i4 == J) {
                            break;
                        }
                        i4++;
                    }
                }
                uVar = uVar2;
            }
            u uVar4 = uVar;
            return Float.valueOf((uVar4 == null || (g4 = uVar4.g()) == null) ? 0.0f : g4.a());
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n76#1:155,13\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            u uVar;
            v g4;
            List<u> f4 = p.this.f();
            if (f4.isEmpty()) {
                uVar = null;
            } else {
                u uVar2 = f4.get(0);
                float b5 = uVar2.g().b();
                int J = kotlin.collections.w.J(f4);
                int i4 = 1;
                if (1 <= J) {
                    while (true) {
                        u uVar3 = f4.get(i4);
                        float b6 = uVar3.g().b();
                        if (Float.compare(b5, b6) < 0) {
                            uVar2 = uVar3;
                            b5 = b6;
                        }
                        if (i4 == J) {
                            break;
                        }
                        i4++;
                    }
                }
                uVar = uVar2;
            }
            u uVar4 = uVar;
            return Float.valueOf((uVar4 == null || (g4 = uVar4.g()) == null) ? 0.0f : g4.b());
        }
    }

    public p(@fg.l e eVar, @fg.l v0 v0Var, @fg.l List<e.b<a0>> list, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar) {
        e w4;
        List b5;
        this.annotatedString = eVar;
        this.placeholders = list;
        kotlin.f0 f0Var = kotlin.f0.NONE;
        this.minIntrinsicWidth = kotlin.c0.b(f0Var, new b());
        this.maxIntrinsicWidth = kotlin.c0.b(f0Var, new a());
        y n02 = v0Var.n0();
        List<e.b<y>> v4 = f.v(eVar, n02);
        ArrayList arrayList = new ArrayList(v4.size());
        int size = v4.size();
        for (int i4 = 0; i4 < size; i4++) {
            e.b<y> bVar2 = v4.get(i4);
            w4 = f.w(eVar, bVar2.i(), bVar2.g());
            y h4 = h(bVar2.h(), n02);
            String text = w4.getText();
            v0 c02 = v0Var.c0(h4);
            List<e.b<i0>> i5 = w4.i();
            b5 = q.b(this.placeholders, bVar2.i(), bVar2.g());
            arrayList.add(new u(new androidx.compose.ui.text.platform.g(text, c02, i5, b5, bVar, dVar), bVar2.i(), bVar2.g()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y h(y style, y defaultStyle) {
        int textDirection = style.getTextDirection();
        androidx.compose.ui.text.style.l.INSTANCE.getClass();
        return !androidx.compose.ui.text.style.l.j(textDirection, androidx.compose.ui.text.style.l.f21374h) ? style : y.j(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // androidx.compose.ui.text.v
    public float a() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.v
    public float b() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.v
    public boolean c() {
        List<u> list = this.infoList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (list.get(i4).g().c()) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final e getAnnotatedString() {
        return this.annotatedString;
    }

    @fg.l
    public final List<u> f() {
        return this.infoList;
    }

    @fg.l
    public final List<e.b<a0>> g() {
        return this.placeholders;
    }

    @kotlin.k(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @kotlin.x0(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public p(@fg.l e eVar, @fg.l v0 v0Var, @fg.l List<e.b<a0>> list, @fg.l androidx.compose.ui.unit.d dVar, @fg.l x.b bVar) {
        this(eVar, v0Var, list, dVar, androidx.compose.ui.text.font.s.a(bVar));
    }
}
