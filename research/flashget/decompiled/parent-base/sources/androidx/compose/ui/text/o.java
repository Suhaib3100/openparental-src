package androidx.compose.ui.text;

import androidx.collection.n1;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MultiParagraph.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\n\u0010\u0018B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001eB[\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010#J<\u0010/\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100JP\u00105\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b5\u00106JX\u0010:\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001d\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\b¢\u0006\u0004\bB\u0010CJ\u0018\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020Dø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ*\u0010P\u001a\u00020M2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\b\b\u0001\u0010O\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u001d\u0010S\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u00020U2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020U2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bX\u0010WJ\u001b\u0010Y\u001a\u00020K2\u0006\u0010 \u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020H2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b[\u0010JJ\u0015\u0010\\\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b^\u0010_J\u0015\u0010`\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b`\u0010_J\u0015\u0010a\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\ba\u0010_J\u0015\u0010b\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bb\u0010_J\u0015\u0010c\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bc\u0010_J\u0015\u0010d\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bd\u0010_J\u0015\u0010e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\be\u0010]J\u001f\u0010g\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010f\u001a\u00020\u0006¢\u0006\u0004\bg\u0010hJ\u0015\u0010i\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bi\u0010jR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u00105\u001a\u0004\bo\u0010pR\u0017\u0010t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bX\u0010q\u001a\u0004\br\u0010sR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u0010u\u001a\u0004\bu\u0010vR\u0017\u0010x\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b[\u0010u\u001a\u0004\bw\u0010vR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u00105\u001a\u0004\by\u0010pR\u001f\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u00108\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R#\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00108\u0000X\u0080\u0004¢\u0006\r\n\u0004\bw\u0010|\u001a\u0005\b\u0081\u0001\u0010~R\u0015\u0010\r\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bn\u0010\u0083\u0001R\u0013\u0010\u0085\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010vR\u0013\u0010\u0087\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010vR\u0012\u0010\u0088\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b{\u0010vR\u0013\u0010\u008a\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/ui/text/o;", "", "Landroidx/compose/ui/text/p;", "intrinsics", "", "maxLines", "", "ellipsis", "", "width", "<init>", "(Landroidx/compose/ui/text/p;IZF)V", "Landroidx/compose/ui/text/e;", "annotatedString", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZFLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/x$b;)V", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;FLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/b;", "constraints", "(Landroidx/compose/ui/text/p;JIZLkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;JLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/util/List;IZLkotlin/jvm/internal/w;)V", "offset", "Lkotlin/k2;", "O", "(I)V", "P", "lineIndex", "Q", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/k;", "decoration", "K", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "Landroidx/compose/ui/graphics/k1;", "blendMode", "I", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "Landroidx/compose/ui/graphics/t1;", "brush", "alpha", "M", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "start", "end", "Landroidx/compose/ui/graphics/g5;", "D", "(II)Landroidx/compose/ui/graphics/g5;", "vertical", "q", "(F)I", "Li0/f;", "position", "A", "(J)I", "Li0/i;", "d", "(I)Li0/i;", "Landroidx/compose/ui/text/t0;", "range", "", "array", "arrayStart", "a", "(J[FI)[F", "usePrimaryDirection", "i", "(IZ)F", "Landroidx/compose/ui/text/style/i;", "B", "(I)Landroidx/compose/ui/text/style/i;", "c", "G", "(I)J", "e", "p", "(I)I", "s", "(I)F", "t", "v", "l", "r", "w", "u", "visibleEnd", "n", "(IZ)I", "H", "(I)Z", "Landroidx/compose/ui/text/p;", "j", "()Landroidx/compose/ui/text/p;", "b", "y", "()I", "Z", "f", "()Z", "didExceedMaxLines", "F", "()F", "h", "height", "m", "lineCount", "g", "Ljava/util/List;", "E", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/t;", "C", "paragraphInfoList", "()Landroidx/compose/ui/text/e;", "z", "minIntrinsicWidth", "x", "maxIntrinsicWidth", "firstBaseline", "k", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1055:1\n508#2,3:1056\n33#2,4:1059\n511#2:1063\n151#2,3:1064\n33#2,4:1067\n154#2,2:1071\n38#2:1073\n156#2:1074\n512#2,2:1075\n38#2:1077\n514#2:1078\n33#2,6:1080\n33#2,6:1086\n1#3:1079\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n373#1:1056,3\n373#1:1059,4\n373#1:1063\n375#1:1064,3\n375#1:1067,4\n375#1:1071,2\n375#1:1073\n375#1:1074\n373#1:1075,2\n373#1:1077\n373#1:1078\n401#1:1080,6\n418#1:1086,6\n*E\n"})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: i, reason: collision with root package name */
    public static final int f21195i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p intrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i0.i> placeholderRects;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<t> paragraphInfoList;

    /* compiled from: MultiParagraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/t;", "paragraphInfo", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f21205c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.f f21206d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.e f21207e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4, float[] fArr, k1.f fVar, k1.e eVar) {
            super(1);
            this.f21204b = j4;
            this.f21205c = fArr;
            this.f21206d = fVar;
            this.f21207e = eVar;
        }

        public final void a(@fg.l t tVar) {
            long j4 = this.f21204b;
            float[] fArr = this.f21205c;
            k1.f fVar = this.f21206d;
            k1.e eVar = this.f21207e;
            long b5 = u0.b(tVar.C(tVar.o() > t0.l(j4) ? tVar.o() : t0.l(j4)), tVar.C(tVar.k() < t0.k(j4) ? tVar.k() : t0.k(j4)));
            tVar.n().x(b5, fArr, fVar.f75327b);
            int j5 = (t0.j(b5) * 4) + fVar.f75327b;
            for (int i4 = fVar.f75327b; i4 < j5; i4 += 4) {
                int i5 = i4 + 1;
                float f4 = fArr[i5];
                float f5 = eVar.f75326b;
                fArr[i5] = f4 + f5;
                int i6 = i4 + 3;
                fArr[i6] = fArr[i6] + f5;
            }
            fVar.f75327b = j5;
            eVar.f75326b = tVar.n().getHeight() + eVar.f75326b;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(t tVar) {
            a(tVar);
            return k2.f75408a;
        }
    }

    /* compiled from: MultiParagraph.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/t;", "paragraphInfo", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5 f21208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g5 g5Var, int i4, int i5) {
            super(1);
            this.f21208b = g5Var;
            this.f21209c = i4;
            this.f21210d = i5;
        }

        public final void a(@fg.l t tVar) {
            g5.q(this.f21208b, tVar.v(tVar.n().t(tVar.C(this.f21209c), tVar.C(this.f21210d))), 0L, 2, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(t tVar) {
            a(tVar);
            return k2.f75408a;
        }
    }

    public /* synthetic */ o(e eVar, v0 v0Var, long j4, androidx.compose.ui.unit.d dVar, y.b bVar, List list, int i4, boolean z4, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, j4, dVar, bVar, (List<e.b<a0>>) list, i4, z4);
    }

    public static void J(o oVar, v1 v1Var, long j4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        long j5;
        if ((i5 & 2) != 0) {
            d2.INSTANCE.getClass();
            j5 = d2.f17778o;
        } else {
            j5 = j4;
        }
        oVar.I(v1Var, j5, (i5 & 4) != 0 ? null : c6Var, (i5 & 8) != 0 ? null : kVar, (i5 & 16) == 0 ? iVar : null, (i5 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4);
    }

    public static void L(o oVar, v1 v1Var, long j4, c6 c6Var, androidx.compose.ui.text.style.k kVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            d2.INSTANCE.getClass();
            j4 = d2.f17778o;
        }
        oVar.K(v1Var, j4, (i4 & 4) != 0 ? null : c6Var, (i4 & 8) != 0 ? null : kVar);
    }

    public static void N(o oVar, v1 v1Var, t1 t1Var, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        float f5 = (i5 & 4) != 0 ? Float.NaN : f4;
        c6 c6Var2 = (i5 & 8) != 0 ? null : c6Var;
        androidx.compose.ui.text.style.k kVar2 = (i5 & 16) != 0 ? null : kVar;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i5 & 32) != 0 ? null : iVar;
        int a5 = (i5 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4;
        oVar.getClass();
        androidx.compose.ui.text.platform.e.a(oVar, v1Var, t1Var, f5, c6Var2, kVar2, iVar2, a5);
    }

    private final void O(int offset) {
        if (offset < 0 || offset >= this.intrinsics.getAnnotatedString().getText().length()) {
            StringBuilder a5 = androidx.collection.s.a("offset(", offset, ") is out of bounds [0, ");
            a5.append(this.intrinsics.getAnnotatedString().length());
            a5.append(')');
            throw new IllegalArgumentException(a5.toString().toString());
        }
    }

    private final void P(int offset) {
        if (offset < 0 || offset > this.intrinsics.getAnnotatedString().getText().length()) {
            StringBuilder a5 = androidx.collection.s.a("offset(", offset, ") is out of bounds [0, ");
            a5.append(this.intrinsics.getAnnotatedString().length());
            a5.append(']');
            throw new IllegalArgumentException(a5.toString().toString());
        }
    }

    private final void Q(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new IllegalArgumentException(androidx.view.e.a(androidx.collection.s.a("lineIndex(", lineIndex, ") is out of bounds [0, "), this.lineCount, ')').toString());
        }
    }

    private final e b() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int o(o oVar, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return oVar.n(i4, z4);
    }

    public final int A(long position) {
        t tVar = this.paragraphInfoList.get(i0.f.r(position) <= 0.0f ? 0 : i0.f.r(position) >= this.height ? kotlin.collections.w.J(this.paragraphInfoList) : r.d(this.paragraphInfoList, i0.f.r(position)));
        return tVar.m() == 0 ? tVar.o() : tVar.y(tVar.n().l(tVar.B(position)));
    }

    @fg.l
    public final androidx.compose.ui.text.style.i B(int offset) {
        P(offset);
        t tVar = this.paragraphInfoList.get(offset == this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : r.b(this.paragraphInfoList, offset));
        return tVar.n().f(tVar.C(offset));
    }

    @fg.l
    public final List<t> C() {
        return this.paragraphInfoList;
    }

    @fg.l
    public final g5 D(int start, int end) {
        if (start < 0 || start > end || end > this.intrinsics.getAnnotatedString().getText().length()) {
            StringBuilder a5 = n1.a("Start(", start, ") or End(", end, ") is out of range [0..");
            a5.append(this.intrinsics.getAnnotatedString().getText().length());
            a5.append("), or start > end!");
            throw new IllegalArgumentException(a5.toString().toString());
        }
        if (start == end) {
            return a1.a();
        }
        g5 a6 = a1.a();
        r.e(this.paragraphInfoList, u0.b(start, end), new b(a6, start, end));
        return a6;
    }

    @fg.l
    public final List<i0.i> E() {
        return this.placeholderRects;
    }

    /* renamed from: F, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final long G(int offset) {
        P(offset);
        t tVar = this.paragraphInfoList.get(offset == this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : r.b(this.paragraphInfoList, offset));
        return tVar.x(tVar.n().j(tVar.C(offset)));
    }

    public final boolean H(int lineIndex) {
        Q(lineIndex);
        return this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex)).n().m(lineIndex);
    }

    public final void I(@fg.l v1 canvas, long color, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k decoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode) {
        canvas.C();
        List<t> list = this.paragraphInfoList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            t tVar = list.get(i4);
            tVar.n().i(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, tVar.n().getHeight());
        }
        canvas.o();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    public final /* synthetic */ void K(v1 canvas, long color, c6 shadow, androidx.compose.ui.text.style.k decoration) {
        canvas.C();
        List<t> list = this.paragraphInfoList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            t tVar = list.get(i4);
            tVar.n().G(canvas, color, shadow, decoration);
            canvas.translate(0.0f, tVar.n().getHeight());
        }
        canvas.o();
    }

    public final void M(@fg.l v1 canvas, @fg.l t1 brush, float alpha, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k decoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode) {
        androidx.compose.ui.text.platform.e.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    @fg.l
    public final float[] a(long range, @fg.l float[] array, @androidx.annotation.g0(from = 0) int arrayStart) {
        O(t0.l(range));
        P(t0.k(range));
        k1.f fVar = new k1.f();
        fVar.f75327b = arrayStart;
        r.e(this.paragraphInfoList, range, new a(range, array, fVar, new k1.e()));
        return array;
    }

    @fg.l
    public final androidx.compose.ui.text.style.i c(int offset) {
        P(offset);
        t tVar = this.paragraphInfoList.get(offset == this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : r.b(this.paragraphInfoList, offset));
        return tVar.n().A(tVar.C(offset));
    }

    @fg.l
    public final i0.i d(int offset) {
        O(offset);
        t tVar = this.paragraphInfoList.get(r.b(this.paragraphInfoList, offset));
        return tVar.w(tVar.n().e(tVar.C(offset)));
    }

    @fg.l
    public final i0.i e(int offset) {
        P(offset);
        t tVar = this.paragraphInfoList.get(offset == this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : r.b(this.paragraphInfoList, offset));
        return tVar.w(tVar.n().h(tVar.C(offset)));
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float g() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).n().k();
    }

    /* renamed from: h, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float i(int offset, boolean usePrimaryDirection) {
        P(offset);
        t tVar = this.paragraphInfoList.get(offset == this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : r.b(this.paragraphInfoList, offset));
        return tVar.n().u(tVar.C(offset), usePrimaryDirection);
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final p getIntrinsics() {
        return this.intrinsics;
    }

    public final float k() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        t tVar = (t) kotlin.collections.w.p3(this.paragraphInfoList);
        return tVar.A(tVar.n().y());
    }

    public final float l(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.A(tVar.n().B(tVar.D(lineIndex)));
    }

    /* renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int n(int lineIndex, boolean visibleEnd) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.y(tVar.n().o(tVar.D(lineIndex), visibleEnd));
    }

    public final int p(int offset) {
        t tVar = this.paragraphInfoList.get(offset >= this.intrinsics.getAnnotatedString().length() ? kotlin.collections.w.J(this.paragraphInfoList) : offset < 0 ? 0 : r.b(this.paragraphInfoList, offset));
        return tVar.z(tVar.n().z(tVar.C(offset)));
    }

    public final int q(float vertical) {
        t tVar = this.paragraphInfoList.get(vertical <= 0.0f ? 0 : vertical >= this.height ? kotlin.collections.w.J(this.paragraphInfoList) : r.d(this.paragraphInfoList, vertical));
        return tVar.m() == 0 ? tVar.p() : tVar.z(tVar.n().s(tVar.E(vertical)));
    }

    public final float r(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.n().q(tVar.D(lineIndex));
    }

    public final float s(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.n().d(tVar.D(lineIndex));
    }

    public final float t(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.n().c(tVar.D(lineIndex));
    }

    public final int u(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.y(tVar.n().n(tVar.D(lineIndex)));
    }

    public final float v(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.A(tVar.n().g(tVar.D(lineIndex)));
    }

    public final float w(int lineIndex) {
        Q(lineIndex);
        t tVar = this.paragraphInfoList.get(r.c(this.paragraphInfoList, lineIndex));
        return tVar.n().F(tVar.D(lineIndex));
    }

    public final float x() {
        return this.intrinsics.a();
    }

    /* renamed from: y, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float z() {
        return this.intrinsics.b();
    }

    public /* synthetic */ o(p pVar, long j4, int i4, boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this(pVar, j4, (i5 & 4) != 0 ? Integer.MAX_VALUE : i4, (i5 & 8) != 0 ? false : z4);
    }

    public /* synthetic */ o(p pVar, long j4, int i4, boolean z4, kotlin.jvm.internal.w wVar) {
        this(pVar, j4, i4, z4);
    }

    private o(p pVar, long j4, int i4, boolean z4) {
        boolean z5;
        int o4;
        this.intrinsics = pVar;
        this.maxLines = i4;
        if (androidx.compose.ui.unit.b.r(j4) == 0 && androidx.compose.ui.unit.b.q(j4) == 0) {
            ArrayList arrayList = new ArrayList();
            List<u> f4 = pVar.f();
            int size = f4.size();
            float f5 = 0.0f;
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                u uVar = f4.get(i5);
                v g4 = uVar.g();
                int p4 = androidx.compose.ui.unit.b.p(j4);
                if (androidx.compose.ui.unit.b.i(j4)) {
                    o4 = androidx.compose.ui.unit.b.o(j4) - x.k(f5);
                    if (o4 < 0) {
                        o4 = 0;
                    }
                } else {
                    o4 = androidx.compose.ui.unit.b.o(j4);
                }
                s b5 = androidx.compose.ui.text.platform.i.b(g4, this.maxLines - i6, z4, androidx.compose.ui.unit.c.b(0, p4, 0, o4, 5, null));
                float height = b5.getHeight() + f5;
                int p5 = b5.p() + i6;
                List<u> list = f4;
                arrayList.add(new t(b5, uVar.h(), uVar.f(), i6, p5, f5, height));
                if (b5.r() || (p5 == this.maxLines && i5 != kotlin.collections.w.J(this.intrinsics.f()))) {
                    z5 = true;
                    i6 = p5;
                    f5 = height;
                    break;
                } else {
                    i5++;
                    i6 = p5;
                    f5 = height;
                    f4 = list;
                }
            }
            z5 = false;
            this.height = f5;
            this.lineCount = i6;
            this.didExceedMaxLines = z5;
            this.paragraphInfoList = arrayList;
            this.width = androidx.compose.ui.unit.b.p(j4);
            List<i0.i> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                t tVar = (t) arrayList.get(i7);
                List<i0.i> D = tVar.n().D();
                ArrayList arrayList3 = new ArrayList(D.size());
                int size3 = D.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    i0.i iVar = D.get(i10);
                    arrayList3.add(iVar != null ? tVar.w(iVar) : null);
                }
                kotlin.collections.w.q0(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.g().size()) {
                int size4 = this.intrinsics.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i11 = 0; i11 < size4; i11++) {
                    arrayList4.add(null);
                }
                arrayList2 = kotlin.collections.w.D4(arrayList2, arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public o(e eVar, v0 v0Var, float f4, androidx.compose.ui.unit.d dVar, y.b bVar, List list, int i4, boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, f4, dVar, bVar, (List<e.b<a0>>) ((i5 & 32) != 0 ? kotlin.collections.j0.f74919b : list), (i5 & 64) != 0 ? Integer.MAX_VALUE : i4, (i5 & 128) != 0 ? false : z4);
    }

    public o(e eVar, v0 v0Var, long j4, androidx.compose.ui.unit.d dVar, y.b bVar, List list, int i4, boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, j4, dVar, bVar, (List<e.b<a0>>) ((i5 & 32) != 0 ? kotlin.collections.j0.f74919b : list), (i5 & 64) != 0 ? Integer.MAX_VALUE : i4, (i5 & 128) != 0 ? false : z4);
    }

    public o(e eVar, v0 v0Var, List list, int i4, boolean z4, float f4, androidx.compose.ui.unit.d dVar, x.b bVar, int i5, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, (List<e.b<a0>>) ((i5 & 4) != 0 ? kotlin.collections.j0.f74919b : list), (i5 & 8) != 0 ? Integer.MAX_VALUE : i4, (i5 & 16) != 0 ? false : z4, f4, dVar, bVar);
    }

    public /* synthetic */ o(p pVar, int i4, boolean z4, float f4, int i5, kotlin.jvm.internal.w wVar) {
        this(pVar, (i5 & 2) != 0 ? Integer.MAX_VALUE : i4, (i5 & 4) != 0 ? false : z4, f4);
    }

    @kotlin.k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.x0(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public o(@fg.l p pVar, int i4, boolean z4, float f4) {
        this(pVar, androidx.compose.ui.unit.c.b(0, x.k(f4), 0, 0, 13, null), i4, z4);
    }

    @kotlin.k(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.x0(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public o(@fg.l e eVar, @fg.l v0 v0Var, @fg.l List<e.b<a0>> list, int i4, boolean z4, float f4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l x.b bVar) {
        this(new p(eVar, v0Var, list, dVar, androidx.compose.ui.text.font.s.a(bVar)), androidx.compose.ui.unit.c.b(0, x.k(f4), 0, 0, 13, null), i4, z4);
    }

    @kotlin.k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.x0(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public o(@fg.l e eVar, @fg.l v0 v0Var, float f4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l List<e.b<a0>> list, int i4, boolean z4) {
        this(new p(eVar, v0Var, list, dVar, bVar), androidx.compose.ui.unit.c.b(0, x.k(f4), 0, 0, 13, null), i4, z4);
    }

    private o(e eVar, v0 v0Var, long j4, androidx.compose.ui.unit.d dVar, y.b bVar, List<e.b<a0>> list, int i4, boolean z4) {
        this(new p(eVar, v0Var, list, dVar, bVar), j4, i4, z4);
    }
}
