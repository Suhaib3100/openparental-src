package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.collection.n1;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.text.android.g1;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBi\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\n\u0010\u001aJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$JQ\u0010-\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010:J,\u0010@\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u0002082\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010:J\u001d\u0010H\u001a\u00020;2\u0006\u00107\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010O\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bO\u0010LJ\u0017\u0010P\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bP\u0010LJ\u0017\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bQ\u0010LJ\u0017\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010LJ\u0017\u0010S\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010LJ\u0017\u0010T\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bT\u0010LJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0006H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010VJ\u001f\u0010^\u001a\u00020/2\u0006\u00107\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020`2\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020`2\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\bc\u0010bJ6\u0010j\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010e\u001a\u00020d2\b\u0010g\u001a\u0004\u0018\u00010f2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJH\u0010p\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010e\u001a\u00020d2\b\u0010g\u001a\u0004\u0018\u00010f2\b\u0010i\u001a\u0004\u0018\u00010h2\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010o\u001a\u00020nH\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010qJP\u0010u\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020/2\b\u0010g\u001a\u0004\u0018\u00010f2\b\u0010i\u001a\u0004\u0018\u00010h2\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010o\u001a\u00020nH\u0016ø\u0001\u0000¢\u0006\u0004\bu\u0010vR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0018\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\r\n\u0004\bM\u0010#\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bK\u0010-\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010\u0083\u0001R'\u0010\u008b\u0001\u001a\u00030\u0085\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0005\ba\u0010\u0086\u0001\u0012\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00108\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bN\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bG\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0099\u0001\u001a\u00030\u0095\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0098\u0001\u0010\u008a\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009e\u0001\u001a\u00030\u009a\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009d\u0001\u0010\u008a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0017\u0010¡\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010 \u0001R\u0016\u0010¤\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bw\u0010 \u0001R\u0016\u0010¥\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b{\u0010 \u0001R\u0017\u0010§\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010 \u0001R\u0017\u0010©\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010 \u0001R\u0017\u0010«\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0080\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010~\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, d2 = {"Landroidx/compose/ui/text/b;", "Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/platform/g;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/g;IZJLkotlin/jvm/internal/w;)V", "", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/d;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/unit/d;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/android/g1;", "", "Landroidx/compose/ui/text/platform/style/b;", "T", "(Landroidx/compose/ui/text/android/g1;)[Landroidx/compose/ui/text/platform/style/b;", "Landroidx/compose/ui/graphics/v1;", "canvas", "Lkotlin/k2;", "Z", "(Landroidx/compose/ui/graphics/v1;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "J", "(IILandroid/text/TextUtils$TruncateAt;IIIII)Landroidx/compose/ui/text/android/g1;", "", "vertical", "s", "(F)I", "Li0/f;", "position", "l", "(J)I", "offset", "Li0/i;", "e", "(I)Li0/i;", "Landroidx/compose/ui/text/t0;", "range", "", "array", "arrayStart", "x", "(J[FI)V", "start", "end", "Landroidx/compose/ui/graphics/g5;", "t", "(II)Landroidx/compose/ui/graphics/g5;", "h", "j", "(I)J", "lineIndex", "d", "(I)F", "c", "g", "O", "P", "Q", "B", "q", "F", "n", "(I)I", "visibleEnd", "o", "(IZ)I", "m", "(I)Z", "z", "usePrimaryDirection", "u", "(IZ)F", "Landroidx/compose/ui/text/style/i;", "f", "(I)Landroidx/compose/ui/text/style/i;", "A", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/k;", "textDecoration", "G", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "Landroidx/compose/ui/graphics/k1;", "blendMode", "i", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "Landroidx/compose/ui/graphics/t1;", "brush", "alpha", "w", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "a", "Landroidx/compose/ui/text/platform/g;", "S", "()Landroidx/compose/ui/text/platform/g;", "b", "I", "R", "()I", "N", "()Z", "M", "()J", "Landroidx/compose/ui/text/android/g1;", "layout", "", "Ljava/lang/CharSequence;", "K", "()Ljava/lang/CharSequence;", "L", "()V", "charSequence", "Ljava/util/List;", "D", "()Ljava/util/List;", "placeholderRects", "Lr0/a;", "Lkotlin/b0;", "Y", "()Lr0/a;", "wordBoundary", "Ljava/util/Locale;", "U", "()Ljava/util/Locale;", "V", "textLocale", "Landroidx/compose/ui/text/platform/m;", "W", "()Landroidx/compose/ui/text/platform/m;", "X", "textPaint", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "k", "firstBaseline", "y", "lastBaseline", "r", "didExceedMaxLines", "p", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,623:1\n1#2:624\n13579#3,2:625\n11335#3:627\n11670#3,3:628\n26#4:631\n26#4:632\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n205#1:625,2\n245#1:627\n245#1:628,3\n441#1:631\n445#1:632\n*E\n"})
/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: i, reason: collision with root package name */
    public static final int f20584i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.platform.g paragraphIntrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean ellipsis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g1 layout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence charSequence;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i0.i> placeholderRects;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 wordBoundary;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20593a;

        static {
            int[] iArr = new int[androidx.compose.ui.text.style.i.values().length];
            try {
                iArr[androidx.compose.ui.text.style.i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.style.i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20593a = iArr;
        }
    }

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr0/a;", "a", "()Lr0/a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.b$b, reason: collision with other inner class name */
    static final class C0368b extends kotlin.jvm.internal.n0 implements ld.a<r0.a> {
        C0368b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0.a invoke() {
            return new r0.a(b.this.U(), b.this.layout.N());
        }
    }

    public /* synthetic */ b(androidx.compose.ui.text.platform.g gVar, int i4, boolean z4, long j4, kotlin.jvm.internal.w wVar) {
        this(gVar, i4, z4, j4);
    }

    private final g1 J(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        return new g1(this.charSequence, getWidth(), this.paragraphIntrinsics.getTextPaint(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, androidx.compose.ui.text.platform.f.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    @m1
    public static /* synthetic */ void L() {
    }

    private final androidx.compose.ui.text.platform.style.b[] T(g1 g1Var) {
        if (!(g1Var.N() instanceof Spanned)) {
            return new androidx.compose.ui.text.platform.style.b[0];
        }
        CharSequence N = g1Var.N();
        kotlin.jvm.internal.l0.n(N, "null cannot be cast to non-null type android.text.Spanned");
        androidx.compose.ui.text.platform.style.b[] bVarArr = (androidx.compose.ui.text.platform.style.b[]) ((Spanned) N).getSpans(0, g1Var.N().length(), androidx.compose.ui.text.platform.style.b.class);
        return bVarArr.length == 0 ? new androidx.compose.ui.text.platform.style.b[0] : bVarArr;
    }

    @m1
    public static /* synthetic */ void V() {
    }

    @m1
    public static /* synthetic */ void X() {
    }

    private final r0.a Y() {
        return (r0.a) this.wordBoundary.getValue();
    }

    private final void Z(v1 canvas) {
        Canvas d5 = androidx.compose.ui.graphics.h0.d(canvas);
        if (this.layout.getDidExceedMaxLines()) {
            d5.save();
            d5.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.T(d5);
        if (this.layout.getDidExceedMaxLines()) {
            d5.restore();
        }
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public androidx.compose.ui.text.style.i A(int offset) {
        return this.layout.S(offset) ? androidx.compose.ui.text.style.i.Rtl : androidx.compose.ui.text.style.i.Ltr;
    }

    @Override // androidx.compose.ui.text.s
    public float B(int lineIndex) {
        return this.layout.p(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public List<i0.i> D() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.s
    public float F(int lineIndex) {
        return this.layout.D(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public void G(@fg.l v1 canvas, long color, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration) {
        androidx.compose.ui.text.platform.m textPaint = this.paragraphIntrinsics.getTextPaint();
        textPaint.h(color);
        textPaint.j(shadow);
        textPaint.l(textDecoration);
        Z(canvas);
    }

    @fg.l
    /* renamed from: K, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* renamed from: M, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: N, reason: from getter */
    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    public final float O(int lineIndex) {
        return this.layout.n(lineIndex);
    }

    public final float P(int lineIndex) {
        return this.layout.o(lineIndex);
    }

    public final float Q(int lineIndex) {
        return this.layout.r(lineIndex);
    }

    /* renamed from: R, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @fg.l
    /* renamed from: S, reason: from getter */
    public final androidx.compose.ui.text.platform.g getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @fg.l
    public final Locale U() {
        return this.paragraphIntrinsics.getTextPaint().getTextLocale();
    }

    @fg.l
    public final androidx.compose.ui.text.platform.m W() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.s
    public float a() {
        return this.paragraphIntrinsics.a();
    }

    @Override // androidx.compose.ui.text.s
    public float b() {
        return this.paragraphIntrinsics.b();
    }

    @Override // androidx.compose.ui.text.s
    public float c(int lineIndex) {
        return this.layout.z(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public float d(int lineIndex) {
        return this.layout.y(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public i0.i e(int offset) {
        if (offset >= 0 && offset < this.charSequence.length()) {
            RectF d5 = this.layout.d(offset);
            return new i0.i(d5.left, d5.top, d5.right, d5.bottom);
        }
        StringBuilder a5 = androidx.collection.s.a("offset(", offset, ") is out of bounds [0,");
        a5.append(this.charSequence.length());
        a5.append(')');
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public androidx.compose.ui.text.style.i f(int offset) {
        return this.layout.H(this.layout.v(offset)) == 1 ? androidx.compose.ui.text.style.i.Ltr : androidx.compose.ui.text.style.i.Rtl;
    }

    @Override // androidx.compose.ui.text.s
    public float g(int lineIndex) {
        return this.layout.B(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public float getHeight() {
        return this.layout.g();
    }

    @Override // androidx.compose.ui.text.s
    public float getWidth() {
        return androidx.compose.ui.unit.b.p(this.constraints);
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public i0.i h(int offset) {
        if (offset >= 0 && offset <= this.charSequence.length()) {
            float J = g1.J(this.layout, offset, false, 2, null);
            int v4 = this.layout.v(offset);
            return new i0.i(J, this.layout.B(v4), J, this.layout.p(v4));
        }
        StringBuilder a5 = androidx.collection.s.a("offset(", offset, ") is out of bounds [0,");
        a5.append(this.charSequence.length());
        a5.append(']');
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @Override // androidx.compose.ui.text.s
    public void i(@fg.l v1 canvas, long color, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode) {
        int a5 = this.paragraphIntrinsics.getTextPaint().a();
        androidx.compose.ui.text.platform.m textPaint = this.paragraphIntrinsics.getTextPaint();
        textPaint.h(color);
        textPaint.j(shadow);
        textPaint.l(textDecoration);
        textPaint.i(drawStyle);
        textPaint.e(blendMode);
        Z(canvas);
        this.paragraphIntrinsics.getTextPaint().e(a5);
    }

    @Override // androidx.compose.ui.text.s
    public long j(int offset) {
        return u0.b(Y().b(offset), Y().a(offset));
    }

    @Override // androidx.compose.ui.text.s
    public float k() {
        return this.layout.o(0);
    }

    @Override // androidx.compose.ui.text.s
    public int l(long position) {
        return this.layout.G(this.layout.w((int) i0.f.r(position)), i0.f.p(position));
    }

    @Override // androidx.compose.ui.text.s
    public boolean m(int lineIndex) {
        return this.layout.R(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public int n(int lineIndex) {
        return this.layout.A(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public int o(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.C(lineIndex) : this.layout.u(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public int p() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.s
    public float q(int lineIndex) {
        return this.layout.x(lineIndex);
    }

    @Override // androidx.compose.ui.text.s
    public boolean r() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.s
    public int s(float vertical) {
        return this.layout.w((int) vertical);
    }

    @Override // androidx.compose.ui.text.s
    @fg.l
    public g5 t(int start, int end) {
        if (start >= 0 && start <= end && end <= this.charSequence.length()) {
            Path path = new Path();
            this.layout.M(start, end, path);
            return new androidx.compose.ui.graphics.v0(path);
        }
        StringBuilder a5 = n1.a("start(", start, ") or end(", end, ") is out of range [0..");
        a5.append(this.charSequence.length());
        a5.append("], or start > end!");
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @Override // androidx.compose.ui.text.s
    public float u(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? g1.J(this.layout, offset, false, 2, null) : g1.L(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.s
    public void w(@fg.l v1 canvas, @fg.l t1 brush, float alpha, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode) {
        int a5 = this.paragraphIntrinsics.getTextPaint().a();
        androidx.compose.ui.text.platform.m textPaint = this.paragraphIntrinsics.getTextPaint();
        textPaint.f(brush, i0.o.a(getWidth(), getHeight()), alpha);
        textPaint.j(shadow);
        textPaint.l(textDecoration);
        textPaint.i(drawStyle);
        textPaint.e(blendMode);
        Z(canvas);
        this.paragraphIntrinsics.getTextPaint().e(a5);
    }

    @Override // androidx.compose.ui.text.s
    public void x(long range, @fg.l float[] array, @androidx.annotation.g0(from = 0) int arrayStart) {
        this.layout.a(t0.l(range), t0.k(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.s
    public float y() {
        return this.layout.o(this.layout.getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.s
    public int z(int offset) {
        return this.layout.v(offset);
    }

    public /* synthetic */ b(String str, v0 v0Var, List list, List list2, int i4, boolean z4, long j4, y.b bVar, androidx.compose.ui.unit.d dVar, kotlin.jvm.internal.w wVar) {
        this(str, v0Var, list, list2, i4, z4, j4, bVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(androidx.compose.ui.text.platform.g gVar, int i4, boolean z4, long j4) {
        boolean k4;
        CharSequence charSequence;
        int l4;
        int n4;
        int m4;
        int o4;
        int p4;
        List<i0.i> list;
        i0.i iVar;
        float u4;
        float o5;
        int b5;
        float B;
        float f4;
        float o6;
        int j5;
        this.paragraphIntrinsics = gVar;
        this.maxLines = i4;
        this.ellipsis = z4;
        this.constraints = j4;
        if (androidx.compose.ui.unit.b.q(j4) != 0 || androidx.compose.ui.unit.b.r(j4) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i4 >= 1) {
            v0 style = gVar.getStyle();
            k4 = c.k(style, z4);
            if (k4) {
                charSequence = c.i(gVar.getCharSequence());
            } else {
                charSequence = gVar.getCharSequence();
            }
            this.charSequence = charSequence;
            l4 = c.l(style.R());
            int R = style.R();
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            boolean k5 = androidx.compose.ui.text.style.j.k(R, androidx.compose.ui.text.style.j.f21357f);
            n4 = c.n(style.getParagraphStyle().getHyphens());
            m4 = c.m(androidx.compose.ui.text.style.f.l(style.H()));
            o4 = c.o(androidx.compose.ui.text.style.f.m(style.H()));
            p4 = c.p(androidx.compose.ui.text.style.f.n(style.H()));
            TextUtils.TruncateAt truncateAt = z4 ? TextUtils.TruncateAt.END : null;
            g1 J = J(l4, k5 ? 1 : 0, truncateAt, i4, n4, m4, o4, p4);
            if (z4 && J.g() > androidx.compose.ui.unit.b.o(j4) && i4 > 1) {
                j5 = c.j(J, androidx.compose.ui.unit.b.o(j4));
                if (j5 >= 0 && j5 != i4) {
                    J = J(l4, k5 ? 1 : 0, truncateAt, j5 < 1 ? 1 : j5, n4, m4, o4, p4);
                }
                this.layout = J;
            } else {
                this.layout = J;
            }
            gVar.getTextPaint().f(style.s(), i0.o.a(getWidth(), getHeight()), style.p());
            for (androidx.compose.ui.text.platform.style.b bVar : T(this.layout)) {
                bVar.d(i0.o.a(getWidth(), getHeight()));
            }
            CharSequence charSequence2 = this.charSequence;
            if (!(charSequence2 instanceof Spanned)) {
                list = kotlin.collections.j0.f74919b;
            } else {
                Spanned spanned = (Spanned) charSequence2;
                Object[] spans = spanned.getSpans(0, charSequence2.length(), s0.j.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    s0.j jVar = (s0.j) obj;
                    int spanStart = spanned.getSpanStart(jVar);
                    int spanEnd = spanned.getSpanEnd(jVar);
                    int v4 = this.layout.v(spanStart);
                    Object[] objArr = v4 >= this.maxLines;
                    Object[] objArr2 = this.layout.s(v4) > 0 && spanEnd > this.layout.t(v4);
                    Object[] objArr3 = spanEnd > this.layout.u(v4);
                    if (objArr2 == true || objArr3 == true || objArr == true) {
                        iVar = null;
                    } else {
                        int i5 = a.f20593a[A(spanStart).ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u4 = u(spanStart, true) - jVar.d();
                        } else {
                            u4 = u(spanStart, true);
                        }
                        float d5 = jVar.d() + u4;
                        g1 g1Var = this.layout;
                        switch (jVar.getVerticalAlign()) {
                            case 0:
                                o5 = g1Var.o(v4);
                                b5 = jVar.b();
                                B = o5 - b5;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 1:
                                B = g1Var.B(v4);
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 2:
                                o5 = g1Var.p(v4);
                                b5 = jVar.b();
                                B = o5 - b5;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 3:
                                B = ((g1Var.p(v4) + g1Var.B(v4)) - jVar.b()) / 2;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 4:
                                f4 = jVar.a().ascent;
                                o6 = g1Var.o(v4);
                                B = o6 + f4;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 5:
                                o5 = g1Var.o(v4) + jVar.a().descent;
                                b5 = jVar.b();
                                B = o5 - b5;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            case 6:
                                Paint.FontMetricsInt a5 = jVar.a();
                                f4 = ((a5.ascent + a5.descent) - jVar.b()) / 2;
                                o6 = g1Var.o(v4);
                                B = o6 + f4;
                                iVar = new i0.i(u4, B, d5, jVar.b() + B);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(iVar);
                }
                list = arrayList;
            }
            this.placeholderRects = list;
            this.wordBoundary = kotlin.c0.b(kotlin.f0.NONE, new C0368b());
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0");
    }

    private b(String str, v0 v0Var, List<e.b<i0>> list, List<e.b<a0>> list2, int i4, boolean z4, long j4, y.b bVar, androidx.compose.ui.unit.d dVar) {
        this(new androidx.compose.ui.text.platform.g(str, v0Var, list, list2, bVar, dVar), i4, z4, j4);
    }
}
