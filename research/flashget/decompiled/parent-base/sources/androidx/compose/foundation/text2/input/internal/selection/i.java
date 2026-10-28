package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.z0;
import androidx.compose.foundation.text.p0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.platform.k5;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import androidx.constraintlayout.core.motion.utils.w;
import i0.f;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: TextFieldSelectionState.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0015\u001a\u00020\u000f*\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u000eH\u0082@¢\u0006\u0004\b\u0017\u0010\u0011J\"\u0010\u0018\u001a\u00020\u000f*\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\"\u0010,\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020&H\u0002ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020 H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010/JG\u0010>\u001a\u00020=2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J<\u0010C\u001a\u00020=2\u0006\u0010@\u001a\u0002072\u0006\u0010A\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010=2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ=\u0010K\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\bK\u0010LJ\u0014\u0010M\u001a\u00020\u000f*\u00020\u000eH\u0086@¢\u0006\u0004\bM\u0010\u0011J0\u0010N\u001a\u00020\u000f*\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086@¢\u0006\u0004\bN\u0010\u0016J\u001c\u0010O\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bH\u0086@¢\u0006\u0004\bO\u0010\u001cJ\u0010\u0010P\u001a\u00020\u000fH\u0086@¢\u0006\u0004\bP\u0010\u001eJ\u0015\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u000f¢\u0006\u0004\bU\u0010/J\r\u0010V\u001a\u00020\u000f¢\u0006\u0004\bV\u0010/J\u0017\u0010X\u001a\u00020\u000f2\b\b\u0002\u0010W\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010/J\r\u0010[\u001a\u00020\u000f¢\u0006\u0004\b[\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010c\u001a\u0004\bf\u0010g\"\u0004\bh\u0010YR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR+\u0010t\u001a\u00020\b2\u0006\u0010o\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010g\"\u0004\bs\u0010YR1\u0010z\u001a\u00020&2\u0006\u0010o\u001a\u00020&8B@BX\u0082\u008e\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\bu\u0010q\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR1\u0010~\u001a\u00020&2\u0006\u0010o\u001a\u00020&8B@BX\u0082\u008e\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b{\u0010q\u001a\u0004\b|\u0010w\"\u0004\b}\u0010yR4\u0010\u0084\u0001\u001a\u0004\u0018\u00010)2\b\u0010o\u001a\u0004\u0018\u00010)8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b\u007f\u0010q\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R/\u0010\u0088\u0001\u001a\u00020\b2\u0006\u0010o\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010q\u001a\u0005\b\u0086\u0001\u0010g\"\u0005\b\u0087\u0001\u0010YR/\u0010R\u001a\u00020Q2\u0006\u0010o\u001a\u00020Q8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0089\u0001\u0010q\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010TR\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0098\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u009b\u0001\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u0095\u0001\u001a\u0005\b\u009a\u0001\u0010gR\u001e\u0010\u009d\u0001\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0006\b\u009c\u0001\u0010\u0095\u0001\u001a\u0004\bc\u0010\"R \u0010 \u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0095\u0001\u001a\u0006\b\u009f\u0001\u0010\u0097\u0001R \u0010£\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0095\u0001\u001a\u0006\b¢\u0001\u0010\u0097\u0001R\u001c\u0010¥\u0001\u001a\u00020&8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010wR\u001a\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010gR\u0019\u0010\u00ad\u0001\u001a\u00020&8Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010w\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006®\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/i;", "", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/ui/unit/d;", "density", "", "enabled", "readOnly", "isFocused", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/ui/unit/d;ZZZ)V", "Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "T", "(Landroidx/compose/ui/input/pointer/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "S", "(Landroidx/compose/ui/input/pointer/k0;Lld/a;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "M", "Q", "(Landroidx/compose/ui/input/pointer/k0;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isStartHandle", "O", "(Landroidx/compose/ui/input/pointer/k0;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "s0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "t0", "Li0/i;", "V", "()Li0/i;", "Landroidx/compose/foundation/text2/input/internal/selection/e;", "g0", "(Z)Landroidx/compose/foundation/text2/input/internal/selection/e;", "Li0/f;", "e0", "(Z)J", "Landroidx/compose/foundation/text/o;", "handle", "position", "G0", "(Landroidx/compose/foundation/text/o;J)V", "q0", "()V", "G", "contentRect", "D0", "(Li0/i;)V", "n0", "Landroidx/compose/foundation/text2/input/q;", "textFieldCharSequence", "", "startOffset", "endOffset", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "allowPreviousSelectionCollapsed", "Landroidx/compose/ui/text/t0;", "H0", "(Landroidx/compose/foundation/text2/input/q;IIZLandroidx/compose/foundation/text/selection/w;Z)J", "rawStartOffset", "rawEndOffset", "previousSelection", "k0", "(IILandroidx/compose/ui/text/t0;ZLandroidx/compose/foundation/text/selection/w;)J", "Lk0/a;", "hapticFeedBack", "Landroidx/compose/ui/platform/f1;", "clipboardManager", "Landroidx/compose/ui/platform/i5;", "textToolbar", "F0", "(Lk0/a;Landroidx/compose/ui/platform/f1;Landroidx/compose/ui/platform/i5;Landroidx/compose/ui/unit/d;ZZ)V", "J", "E0", "v0", "r0", "Landroidx/compose/foundation/text2/input/internal/selection/k;", "textToolbarState", "J0", "(Landroidx/compose/foundation/text2/input/internal/selection/k;)V", "U", "K", "cancelSelection", "H", "(Z)V", "u0", "L", "a", "Landroidx/compose/foundation/text2/input/internal/m0;", "b", "Landroidx/compose/foundation/text2/input/internal/j0;", "c", "Landroidx/compose/ui/unit/d;", "d", "Z", "e", "f", "o0", "()Z", "x0", "g", "Lk0/a;", "h", "Landroidx/compose/ui/platform/i5;", "i", "Landroidx/compose/ui/platform/f1;", "<set-?>", "j", "Landroidx/compose/runtime/k2;", "p0", "y0", "isInTouchMode", "k", "i0", "()J", "B0", "(J)V", "startContentVisibleOffset", "l", "f0", "z0", "rawHandleDragPosition", "m", "a0", "()Landroidx/compose/foundation/text/o;", "w0", "(Landroidx/compose/foundation/text/o;)V", "draggingHandle", "n", "h0", "A0", "showCursorHandle", "o", "m0", "()Landroidx/compose/foundation/text2/input/internal/selection/k;", "C0", "Landroidx/compose/foundation/text/selection/d0;", "p", "Landroidx/compose/foundation/text/selection/d0;", "previousSelectionLayout", "q", "I", "previousRawDragOffset", "r", "Landroidx/compose/runtime/b5;", "X", "()Landroidx/compose/foundation/text2/input/internal/selection/e;", "cursorHandle", "s", "Y", "cursorHandleInBounds", "t", "cursorRect", "u", "j0", "startSelectionHandle", "v", "c0", "endSelectionHandle", "W", "currentContentVisibleOffset", "Landroidx/compose/ui/layout/u;", "l0", "()Landroidx/compose/ui/layout/u;", "textLayoutCoordinates", "b0", "editable", "d0", "handleDragPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n81#2:1236\n107#2,2:1237\n81#2:1239\n107#2,2:1240\n81#2:1242\n107#2,2:1243\n81#2:1245\n107#2,2:1246\n81#2:1248\n107#2,2:1249\n81#2:1251\n107#2,2:1252\n81#2:1255\n81#2:1256\n81#2:1257\n81#2:1258\n81#2:1259\n1#3:1254\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n*L\n99#1:1236\n99#1:1237,2\n110#1:1239\n110#1:1240,2\n132#1:1242\n132#1:1243,2\n164#1:1245\n164#1:1246,2\n169#1:1248\n169#1:1249,2\n175#1:1251\n175#1:1252,2\n206#1:1255\n239#1:1256\n254#1:1257\n285#1:1258\n289#1:1259\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: w, reason: collision with root package name */
    public static final int f8776w = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 textFieldState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.j0 textLayoutState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean readOnly;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k0.a hapticFeedBack;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i5 textToolbar;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f1 clipboardManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isInTouchMode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 startContentVisibleOffset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 rawHandleDragPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 draggingHandle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 showCursorHandle;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 textToolbarState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.text.selection.d0 previousSelectionLayout;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 cursorHandle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 cursorHandleInBounds;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 cursorRect;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 startSelectionHandle;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 endSelectionHandle;

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/e;", "a", "()Landroidx/compose/foundation/text2/input/internal/selection/e;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<androidx.compose.foundation.text2.input.internal.selection.e> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.foundation.text2.input.internal.selection.e invoke() {
            androidx.compose.foundation.text2.input.q k4 = i.this.textFieldState.k();
            if (i.this.h0() && t0.h(k4.getSelectionInChars()) && k4.length() > 0 && (i.this.a0() == androidx.compose.foundation.text.o.Cursor || i.this.Y())) {
                return new androidx.compose.foundation.text2.input.internal.selection.e(true, i.this.Z().l(), androidx.compose.ui.text.style.i.Ltr, false, null);
            }
            androidx.compose.foundation.text2.input.internal.selection.e.INSTANCE.getClass();
            return androidx.compose.foundation.text2.input.internal.selection.e.f8751g;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a0 extends kotlin.jvm.internal.h0 implements ld.p<androidx.compose.foundation.text2.input.q, CharSequence, Boolean> {

        /* renamed from: d, reason: collision with root package name */
        public static final a0 f8800d = new a0();

        a0() {
            super(2, androidx.compose.foundation.text2.input.q.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.foundation.text2.input.q qVar, @fg.l CharSequence charSequence) {
            return Boolean.valueOf(qVar.d(charSequence));
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8801b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8802c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8804e;

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {w.a.f22421s}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8805b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8806c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8807d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8806c = iVar;
                this.f8807d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f8806c, this.f8807d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8805b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8806c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8807d;
                    this.f8805b = 1;
                    if (iVar.T(k0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.i$b$b, reason: collision with other inner class name */
        static final class C0185b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8808b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8809c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8810d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0185b(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super C0185b> dVar) {
                super(2, dVar);
                this.f8809c = iVar;
                this.f8810d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0185b(this.f8809c, this.f8810d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8808b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8809c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8810d;
                    this.f8808b = 1;
                    if (iVar.M(k0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0185b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8811b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8812c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f8813d;

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends n0 implements ld.l<i0.f, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f8814b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(1);
                    this.f8814b = iVar;
                }

                public final void a(long j4) {
                    i iVar = this.f8814b;
                    androidx.compose.foundation.text2.input.internal.selection.k m02 = iVar.m0();
                    androidx.compose.foundation.text2.input.internal.selection.k kVar = androidx.compose.foundation.text2.input.internal.selection.k.Cursor;
                    if (m02 == kVar) {
                        kVar = androidx.compose.foundation.text2.input.internal.selection.k.None;
                    }
                    iVar.C0(kVar);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                    a(fVar.getPackedValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(androidx.compose.ui.input.pointer.k0 k0Var, i iVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f8812c = k0Var;
                this.f8813d = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new c(this.f8812c, this.f8813d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8811b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8812c;
                    a aVar2 = new a(this.f8813d);
                    this.f8811b = 1;
                    if (z0.m(k0Var, null, null, null, aVar2, this, 7, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f8804e = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = i.this.new b(this.f8804e, dVar);
            bVar.f8802c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f8801b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f8802c;
            kotlinx.coroutines.t0 t0Var = kotlinx.coroutines.t0.UNDISPATCHED;
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new a(i.this, this.f8804e, null), 1, null);
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new C0185b(i.this, this.f8804e, null), 1, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, t0Var, new c(this.f8804e, i.this, null), 1, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b0<T> implements kotlinx.coroutines.flow.j {
        b0() {
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@fg.l androidx.compose.foundation.text2.input.q qVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            i.this.A0(false);
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1235:1\n495#2,4:1236\n500#2:1245\n129#3,5:1240\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2\n*L\n240#1:1236,4\n240#1:1245\n240#1:1240,5\n*E\n"})
    static final class c extends n0 implements ld.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            i0.i i4;
            m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
            i iVar = i.this;
            androidx.compose.runtime.snapshots.m c5 = companion.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    long l4 = iVar.Z().l();
                    c5.d();
                    androidx.compose.ui.layout.u l02 = i.this.l0();
                    return Boolean.valueOf((l02 == null || (i4 = androidx.compose.foundation.text.selection.i0.i(l02)) == null) ? false : androidx.compose.foundation.text.selection.i0.d(i4, l4));
                } finally {
                    c5.y(r4);
                }
            } catch (Throwable th) {
                c5.d();
                throw th;
            }
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/i;", "a", "()Li0/i;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
    static final class c0 extends n0 implements ld.a<i0.i> {
        c0() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.i invoke() {
            i0.i K;
            boolean h4 = t0.h(i.this.textFieldState.k().getSelectionInChars());
            if (((!h4 || i.this.m0() != androidx.compose.foundation.text2.input.internal.selection.k.Cursor) && (h4 || i.this.m0() != androidx.compose.foundation.text2.input.internal.selection.k.Selection)) || i.this.a0() != null || !i.this.p0()) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            androidx.compose.ui.layout.u l02 = i.this.l0();
            i0.i i4 = l02 != null ? androidx.compose.foundation.text.selection.i0.i(l02) : null;
            if (i4 == null) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            androidx.compose.ui.layout.u l03 = i.this.l0();
            i0.f d5 = l03 != null ? i0.f.d(l03.r0(i4.E())) : null;
            l0.m(d5);
            i0.i c5 = i0.j.c(d5.getPackedValue(), i4.z());
            i0.i V = i.this.V();
            i0.i iVar = c5.R(V) ? V : null;
            if (iVar != null && (K = iVar.K(c5)) != null) {
                return K;
            }
            i0.i.INSTANCE.getClass();
            return i0.i.f74153g;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/i;", "a", "()Li0/i;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorRect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
    static final class d extends n0 implements ld.a<i0.i> {
        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.i invoke() {
            float x4;
            androidx.compose.ui.text.n0 e4 = i.this.textLayoutState.e();
            if (e4 == null) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            androidx.compose.foundation.text2.input.q k4 = i.this.textFieldState.k();
            if (!t0.h(k4.getSelectionInChars())) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            i0.i e5 = e4.e((int) (k4.getSelectionInChars() >> 32));
            float v5 = i.this.density.v5(p0.c());
            if (e4.getLayoutInput().getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                x4 = (v5 / 2) + e5.t();
            } else {
                x4 = e5.x() - (v5 / 2);
            }
            float f4 = v5 / 2;
            float t4 = kotlin.ranges.s.t(kotlin.ranges.s.A(x4, androidx.compose.ui.unit.u.m(e4.getSize()) - f4), f4);
            return new i0.i(t4 - f4, e5.getTop(), t4 + f4, e5.j());
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/i;", "rect", "Lkotlin/k2;", "a", "(Li0/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class d0<T> implements kotlinx.coroutines.flow.j {
        d0() {
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@fg.l i0.i iVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            i0.i.INSTANCE.getClass();
            if (l0.g(iVar, i0.i.f74153g)) {
                i.this.n0();
            } else {
                i.this.D0(iVar);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0}, l = {498}, m = "detectCursorHandleDragGestures", n = {"this", "cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8820b;

        /* renamed from: c, reason: collision with root package name */
        Object f8821c;

        /* renamed from: d, reason: collision with root package name */
        Object f8822d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f8823e;

        /* renamed from: g, reason: collision with root package name */
        int f8825g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8823e = obj;
            this.f8825g |= Integer.MIN_VALUE;
            return i.this.M(null, this);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8826b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8827c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8829e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8830f;

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8832c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8833d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8832c = iVar;
                this.f8833d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f8832c, this.f8833d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8831b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8832c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8833d;
                    this.f8831b = 1;
                    if (iVar.T(k0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8834b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8835c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f8836d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f8837e;

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Li0/f;)V"}, k = 3, mv = {1, 8, 0})
            static final class a implements androidx.compose.foundation.text2.input.internal.selection.d {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f8838a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f8839b;

                a(i iVar, boolean z4) {
                    this.f8838a = iVar;
                    this.f8839b = z4;
                }

                @Override // androidx.compose.foundation.text2.input.internal.selection.d
                public final void a(long j4) {
                    this.f8838a.q0();
                    i iVar = this.f8838a;
                    boolean z4 = this.f8839b;
                    iVar.G0(z4 ? androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd, androidx.compose.foundation.text.selection.c0.a(iVar.e0(z4)));
                }
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.i$e0$b$b, reason: collision with other inner class name */
            static final class C0186b extends n0 implements ld.a<kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f8840b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0186b(i iVar) {
                    super(0);
                    this.f8840b = iVar;
                }

                public final void a() {
                    this.f8840b.G();
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                    a();
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.input.pointer.k0 k0Var, i iVar, boolean z4, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f8835c = k0Var;
                this.f8836d = iVar;
                this.f8837e = z4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f8835c, this.f8836d, this.f8837e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8834b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8835c;
                    a aVar2 = new a(this.f8836d, this.f8837e);
                    C0186b c0186b = new C0186b(this.f8836d);
                    this.f8834b = 1;
                    if (androidx.compose.foundation.text2.input.internal.selection.b.a(k0Var, aVar2, c0186b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {382}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8841b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8842c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8843d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f8844e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, boolean z4, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f8842c = iVar;
                this.f8843d = k0Var;
                this.f8844e = z4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new c(this.f8842c, this.f8843d, this.f8844e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8841b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8842c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8843d;
                    boolean z4 = this.f8844e;
                    this.f8841b = 1;
                    if (iVar.O(k0Var, z4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(androidx.compose.ui.input.pointer.k0 k0Var, boolean z4, kotlin.coroutines.d<? super e0> dVar) {
            super(2, dVar);
            this.f8829e = k0Var;
            this.f8830f = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e0 e0Var = i.this.new e0(this.f8829e, this.f8830f, dVar);
            e0Var.f8827c = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f8826b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f8827c;
            kotlinx.coroutines.t0 t0Var = kotlinx.coroutines.t0.UNDISPATCHED;
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new a(i.this, this.f8829e, null), 1, null);
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new b(this.f8829e, i.this, this.f8830f, null), 1, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, t0Var, new c(i.this, this.f8829e, this.f8830f, null), 1, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((e0) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.l<i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8846c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f8847d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.g gVar, i iVar, k1.g gVar2) {
            super(1);
            this.f8845b = gVar;
            this.f8846c = iVar;
            this.f8847d = gVar2;
        }

        public final void a(long j4) {
            this.f8845b.f75328b = androidx.compose.foundation.text.selection.c0.a(this.f8846c.Z().l());
            k1.g gVar = this.f8847d;
            i0.f.INSTANCE.getClass();
            gVar.f75328b = i0.f.f74147c;
            this.f8846c.y0(true);
            this.f8846c.q0();
            this.f8846c.G0(androidx.compose.foundation.text.o.Cursor, this.f8845b.f75328b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f0 extends n0 implements ld.a<kotlin.k2> {
        f0() {
            super(0);
        }

        public final void a() {
            i.I(i.this, false, 1, null);
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.g f8850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f8851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1.g gVar, k1.g gVar2, i iVar) {
            super(0);
            this.f8849b = gVar;
            this.f8850c = gVar2;
            this.f8851d = iVar;
        }

        public final void a() {
            i.N(this.f8849b, this.f8850c, this.f8851d);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends n0 implements ld.a<kotlin.k2> {
        g0() {
            super(0);
        }

        public final void a() {
            i.this.K();
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8853b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.g f8854c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f8855d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.g gVar, k1.g gVar2, i iVar) {
            super(0);
            this.f8853b = gVar;
            this.f8854c = gVar2;
            this.f8855d = iVar;
        }

        public final void a() {
            i.N(this.f8853b, this.f8854c, this.f8855d);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends n0 implements ld.a<kotlin.k2> {
        h0() {
            super(0);
        }

        public final void a() {
            i.this.u0();
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "change", "Li0/f;", "dragAmount", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.i$i, reason: collision with other inner class name */
    static final class C0187i extends n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f8859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0187i(k1.g gVar, i iVar, k1.g gVar2) {
            super(2);
            this.f8857b = gVar;
            this.f8858c = iVar;
            this.f8859d = gVar2;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            k1.g gVar = this.f8857b;
            gVar.f75328b = i0.f.v(gVar.f75328b, j4);
            this.f8858c.G0(androidx.compose.foundation.text.o.Cursor, i0.f.v(this.f8859d.f75328b, this.f8857b.f75328b));
            androidx.compose.ui.text.n0 e4 = this.f8858c.textLayoutState.e();
            if (e4 == null) {
                return;
            }
            int x4 = e4.x(this.f8858c.d0());
            long b5 = u0.b(x4, x4);
            if (t0.g(b5, this.f8858c.textFieldState.k().getSelectionInChars())) {
                return;
            }
            b0Var.a();
            k0.a aVar = this.f8858c.hapticFeedBack;
            if (aVar != null) {
                k0.b.INSTANCE.getClass();
                aVar.a(k0.d.f74804a.b());
            }
            this.f8858c.textFieldState.A(b5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i0 extends n0 implements ld.a<kotlin.k2> {
        i0() {
            super(0);
        }

        public final void a() {
            i.this.textFieldState.z();
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.Selection);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0, 0}, l = {740}, m = "detectSelectionHandleDragGestures", n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8861b;

        /* renamed from: c, reason: collision with root package name */
        Object f8862c;

        /* renamed from: d, reason: collision with root package name */
        Object f8863d;

        /* renamed from: e, reason: collision with root package name */
        Object f8864e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8865f;

        /* renamed from: h, reason: collision with root package name */
        int f8867h;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8865f = obj;
            this.f8867h |= Integer.MIN_VALUE;
            return i.this.O(null, false, this);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/e;", "a", "()Landroidx/compose/foundation/text2/input/internal/selection/e;"}, k = 3, mv = {1, 8, 0})
    static final class j0 extends n0 implements ld.a<androidx.compose.foundation.text2.input.internal.selection.e> {
        j0() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.foundation.text2.input.internal.selection.e invoke() {
            return i.this.g0(true);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends n0 implements ld.l<i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8871d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o f8872e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1.g f8873f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1.g gVar, i iVar, boolean z4, androidx.compose.foundation.text.o oVar, k1.g gVar2) {
            super(1);
            this.f8869b = gVar;
            this.f8870c = iVar;
            this.f8871d = z4;
            this.f8872e = oVar;
            this.f8873f = gVar2;
        }

        public final void a(long j4) {
            this.f8869b.f75328b = androidx.compose.foundation.text.selection.c0.a(this.f8870c.e0(this.f8871d));
            this.f8870c.G0(this.f8872e, this.f8869b.f75328b);
            k1.g gVar = this.f8873f;
            i0.f.INSTANCE.getClass();
            gVar.f75328b = i0.f.f74147c;
            this.f8870c.previousRawDragOffset = -1;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8874b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8875c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8877e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8879g;

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8880b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8881c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8882d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8881c = iVar;
                this.f8882d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f8881c, this.f8882d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8880b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8881c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8882d;
                    this.f8880b = 1;
                    if (iVar.T(k0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8883b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8884c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8885d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f8886e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f8887f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f8884c = iVar;
                this.f8885d = k0Var;
                this.f8886e = aVar;
                this.f8887f = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f8884c, this.f8885d, this.f8886e, this.f8887f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8883b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8884c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8885d;
                    ld.a<kotlin.k2> aVar2 = this.f8886e;
                    ld.a<kotlin.k2> aVar3 = this.f8887f;
                    this.f8883b = 1;
                    if (iVar.S(k0Var, aVar2, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8888b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8889c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f8890d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f8891e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i iVar, androidx.compose.ui.input.pointer.k0 k0Var, ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f8889c = iVar;
                this.f8890d = k0Var;
                this.f8891e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new c(this.f8889c, this.f8890d, this.f8891e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8888b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8889c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f8890d;
                    ld.a<kotlin.k2> aVar2 = this.f8891e;
                    this.f8888b = 1;
                    if (iVar.Q(k0Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(androidx.compose.ui.input.pointer.k0 k0Var, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, kotlin.coroutines.d<? super k0> dVar) {
            super(2, dVar);
            this.f8877e = k0Var;
            this.f8878f = aVar;
            this.f8879g = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            k0 k0Var = i.this.new k0(this.f8877e, this.f8878f, this.f8879g, dVar);
            k0Var.f8875c = obj;
            return k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f8874b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f8875c;
            kotlinx.coroutines.t0 t0Var = kotlinx.coroutines.t0.UNDISPATCHED;
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new a(i.this, this.f8877e, null), 1, null);
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new b(i.this, this.f8877e, this.f8878f, this.f8879g, null), 1, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, t0Var, new c(i.this, this.f8877e, this.f8878f, null), 1, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((k0) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class l extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f8894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(k1.g gVar, i iVar, k1.g gVar2) {
            super(0);
            this.f8892b = gVar;
            this.f8893c = iVar;
            this.f8894d = gVar2;
        }

        public final void a() {
            i.P(this.f8892b, this.f8893c, this.f8894d);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f8897d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(k1.g gVar, i iVar, k1.g gVar2) {
            super(0);
            this.f8895b = gVar;
            this.f8896c = iVar;
            this.f8897d = gVar2;
        }

        public final void a() {
            i.P(this.f8895b, this.f8896c, this.f8897d);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "<anonymous parameter 0>", "Li0/f;", "delta", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8899c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o f8900d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.g f8901e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8902f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(k1.g gVar, i iVar, androidx.compose.foundation.text.o oVar, k1.g gVar2, boolean z4) {
            super(2);
            this.f8898b = gVar;
            this.f8899c = iVar;
            this.f8900d = oVar;
            this.f8901e = gVar2;
            this.f8902f = z4;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            k1.g gVar = this.f8898b;
            gVar.f75328b = i0.f.v(gVar.f75328b, j4);
            androidx.compose.ui.text.n0 e4 = this.f8899c.textLayoutState.e();
            if (e4 == null) {
                return;
            }
            this.f8899c.G0(this.f8900d, i0.f.v(this.f8901e.f75328b, this.f8898b.f75328b));
            int x4 = this.f8902f ? e4.x(this.f8899c.d0()) : t0.n(this.f8899c.textFieldState.k().getSelectionInChars());
            int i4 = this.f8902f ? t0.i(this.f8899c.textFieldState.k().getSelectionInChars()) : e4.x(this.f8899c.d0());
            long selectionInChars = this.f8899c.textFieldState.k().getSelectionInChars();
            i iVar = this.f8899c;
            long I0 = i.I0(iVar, iVar.textFieldState.k(), x4, i4, this.f8902f, androidx.compose.foundation.text.selection.w.INSTANCE.l(), false, 32, null);
            if (t0.h(selectionInChars) || !t0.h(I0)) {
                this.f8899c.textFieldState.A(I0);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class o extends n0 implements ld.a<String> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o f8904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(androidx.compose.foundation.text.o oVar) {
            super(0);
            this.f8904c = oVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Selection Handle drag cancelled for draggingHandle: " + i.this.a0() + " definedOn: " + this.f8904c;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "dragStartOffset", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends n0 implements ld.l<i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8906c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.foundation.text.o> f8907d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.g f8908e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1.g f8909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k1.f f8910g;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f8911b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j4) {
                super(0);
                this.f8911b = j4;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onDragStart after longPress " + ((Object) i0.f.y(this.f8911b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ld.a<kotlin.k2> aVar, i iVar, k1.h<androidx.compose.foundation.text.o> hVar, k1.g gVar, k1.g gVar2, k1.f fVar) {
            super(1);
            this.f8905b = aVar;
            this.f8906c = iVar;
            this.f8907d = hVar;
            this.f8908e = gVar;
            this.f8909f = gVar2;
            this.f8910g = fVar;
        }

        public final void a(long j4) {
            new a(j4);
            this.f8905b.invoke();
            this.f8906c.G0(this.f8907d.f75329b, j4);
            this.f8908e.f75328b = j4;
            k1.g gVar = this.f8909f;
            i0.f.INSTANCE.getClass();
            gVar.f75328b = i0.f.f74147c;
            this.f8906c.previousRawDragOffset = -1;
            if (!this.f8906c.textLayoutState.k(j4)) {
                int h4 = androidx.compose.foundation.text2.input.internal.j0.h(this.f8906c.textLayoutState, j4, false, 2, null);
                k0.a aVar = this.f8906c.hapticFeedBack;
                if (aVar != null) {
                    k0.b.INSTANCE.getClass();
                    aVar.a(k0.d.f74804a.b());
                }
                this.f8906c.textFieldState.s(h4);
                this.f8906c.A0(true);
                this.f8906c.J0(androidx.compose.foundation.text2.input.internal.selection.k.Cursor);
                return;
            }
            if (this.f8906c.textFieldState.k().length() == 0) {
                return;
            }
            int h5 = androidx.compose.foundation.text2.input.internal.j0.h(this.f8906c.textLayoutState, j4, false, 2, null);
            i iVar = this.f8906c;
            androidx.compose.foundation.text2.input.q k4 = iVar.textFieldState.k();
            t0.INSTANCE.getClass();
            long I0 = i.I0(iVar, androidx.compose.foundation.text2.input.r.b(k4, t0.f21417c, null, 4, null), h5, h5, false, androidx.compose.foundation.text.selection.w.INSTANCE.l(), false, 32, null);
            this.f8906c.textFieldState.A(I0);
            this.f8906c.J0(androidx.compose.foundation.text2.input.internal.selection.k.Selection);
            this.f8910g.f75327b = (int) (I0 >> 32);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class q extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.f f8914d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.g f8915e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(k1.g gVar, i iVar, k1.f fVar, k1.g gVar2) {
            super(0);
            this.f8912b = gVar;
            this.f8913c = iVar;
            this.f8914d = fVar;
            this.f8915e = gVar2;
        }

        public final void a() {
            i.R(this.f8912b, this.f8913c, this.f8914d, this.f8915e);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class r extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f8916b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f8917c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.f f8918d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.g f8919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(k1.g gVar, i iVar, k1.f fVar, k1.g gVar2) {
            super(0);
            this.f8916b = gVar;
            this.f8917c = iVar;
            this.f8918d = fVar;
            this.f8919e = gVar2;
        }

        public final void a() {
            i.R(this.f8916b, this.f8917c, this.f8918d, this.f8919e);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "<anonymous parameter 0>", "Li0/f;", "dragAmount", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
    static final class s extends n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.g f8921c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f8922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.f f8923e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.foundation.text.o> f8924f;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f8925b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j4) {
                super(0);
                this.f8925b = j4;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onDrag after longPress " + ((Object) i0.f.y(this.f8925b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(k1.g gVar, k1.g gVar2, k1.f fVar, k1.h<androidx.compose.foundation.text.o> hVar) {
            super(2);
            this.f8921c = gVar;
            this.f8922d = gVar2;
            this.f8923e = fVar;
            this.f8924f = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            int intValue;
            int g4;
            androidx.compose.foundation.text.selection.w o4;
            if (i.this.textFieldState.k().length() == 0) {
                return;
            }
            k1.g gVar = this.f8921c;
            gVar.f75328b = i0.f.v(gVar.f75328b, j4);
            long v4 = i0.f.v(this.f8922d.f75328b, this.f8921c.f75328b);
            new a(v4);
            if (this.f8923e.f75327b >= 0 || i.this.textLayoutState.k(v4)) {
                Integer valueOf = Integer.valueOf(this.f8923e.f75327b);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : i.this.textLayoutState.g(this.f8922d.f75328b, false);
                g4 = i.this.textLayoutState.g(v4, false);
                if (this.f8923e.f75327b < 0 && intValue == g4) {
                    return;
                } else {
                    o4 = androidx.compose.foundation.text.selection.w.INSTANCE.o();
                }
            } else {
                intValue = androidx.compose.foundation.text2.input.internal.j0.h(i.this.textLayoutState, this.f8922d.f75328b, false, 2, null);
                g4 = androidx.compose.foundation.text2.input.internal.j0.h(i.this.textLayoutState, v4, false, 2, null);
                o4 = intValue == g4 ? androidx.compose.foundation.text.selection.w.INSTANCE.m() : androidx.compose.foundation.text.selection.w.INSTANCE.o();
            }
            int i4 = intValue;
            int i5 = g4;
            androidx.compose.foundation.text.selection.w wVar = o4;
            long selectionInChars = i.this.textFieldState.k().getSelectionInChars();
            i iVar = i.this;
            long H0 = iVar.H0(iVar.textFieldState.k(), i4, i5, false, wVar, false);
            if (t0.m(H0)) {
                H0 = androidx.compose.foundation.text2.input.internal.selection.j.d(H0);
            }
            if (this.f8923e.f75327b == -1 && !t0.h(H0)) {
                this.f8923e.f75327b = (int) (H0 >> 32);
            }
            if (!t0.g(H0, selectionInChars)) {
                int i6 = (int) (H0 >> 32);
                int i7 = (int) (selectionInChars >> 32);
                this.f8924f.f75329b = (i6 == i7 || ((int) (H0 & 4294967295L)) != ((int) (selectionInChars & 4294967295L))) ? (i6 != i7 || ((int) (H0 & 4294967295L)) == ((int) (selectionInChars & 4294967295L))) ? ((float) (i6 + ((int) (H0 & 4294967295L)))) / 2.0f > ((float) (i7 + ((int) (4294967295L & selectionInChars)))) / 2.0f ? androidx.compose.foundation.text.o.SelectionEnd : androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd : androidx.compose.foundation.text.o.SelectionStart;
            }
            if (t0.h(selectionInChars) || !t0.h(H0)) {
                i.this.textFieldState.A(H0);
            }
            i.this.G0(this.f8924f.f75329b, v4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "offset", "Lkotlin/k2;", "<anonymous>", "(Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class t implements androidx.compose.foundation.text2.input.internal.selection.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f8927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8928c;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f8929b = new a(0);

            a() {
                super(0);
            }

            @fg.l
            public final String a() {
                return "onTapTextField";
            }

            @Override // ld.a
            public String invoke() {
                return "onTapTextField";
            }
        }

        t(ld.a<kotlin.k2> aVar, i iVar, ld.a<kotlin.k2> aVar2) {
            this.f8926a = aVar;
            this.f8927b = iVar;
            this.f8928c = aVar2;
        }

        @Override // androidx.compose.foundation.text2.input.internal.selection.d
        public final void a(long j4) {
            a aVar = a.f8929b;
            this.f8926a.invoke();
            if (this.f8927b.b0() && this.f8927b.getIsFocused()) {
                this.f8928c.invoke();
                if (this.f8927b.textFieldState.k().length() > 0) {
                    this.f8927b.A0(true);
                }
                this.f8927b.J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
                int h4 = androidx.compose.foundation.text2.input.internal.j0.h(this.f8927b.textLayoutState, j4, false, 2, null);
                if (h4 >= 0) {
                    this.f8927b.textFieldState.s(h4);
                }
            }
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "offset", "Lkotlin/k2;", "<anonymous>", "(Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class u implements androidx.compose.foundation.text2.input.internal.selection.d {

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f8931b = new a(0);

            a() {
                super(0);
            }

            @fg.l
            public final String a() {
                return "onDoubleTapTextField";
            }

            @Override // ld.a
            public String invoke() {
                return "onDoubleTapTextField";
            }
        }

        u() {
        }

        @Override // androidx.compose.foundation.text2.input.internal.selection.d
        public final void a(long j4) {
            a aVar = a.f8931b;
            i.this.A0(false);
            i.this.J0(androidx.compose.foundation.text2.input.internal.selection.k.Selection);
            int h4 = androidx.compose.foundation.text2.input.internal.j0.h(i.this.textLayoutState, j4, false, 2, null);
            i iVar = i.this;
            androidx.compose.foundation.text2.input.q k4 = iVar.textFieldState.k();
            t0.INSTANCE.getClass();
            i.this.textFieldState.A(i.I0(iVar, androidx.compose.foundation.text2.input.r.b(k4, t0.f21417c, null, 4, null), h4, h4, false, androidx.compose.foundation.text.selection.w.INSTANCE.o(), false, 32, null));
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {w.c.f22467w}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f8932c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f8933d;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((v) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            v vVar = i.this.new v(dVar);
            vVar.f8933d = obj;
            return vVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r4.f8932c
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.f8933d
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r5)
                goto L2e
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.a1.n(r5)
                java.lang.Object r5 = r4.f8933d
                androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                r1 = r5
            L21:
                androidx.compose.ui.input.pointer.r r5 = androidx.compose.ui.input.pointer.r.Initial
                r4.f8933d = r1
                r4.f8932c = r2
                java.lang.Object r5 = r1.u3(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                androidx.compose.ui.input.pointer.p r5 = (androidx.compose.ui.input.pointer.p) r5
                androidx.compose.foundation.text2.input.internal.selection.i r3 = androidx.compose.foundation.text2.input.internal.selection.i.this
                boolean r5 = androidx.compose.foundation.text.selection.z.f(r5)
                r5 = r5 ^ r2
                androidx.compose.foundation.text2.input.internal.selection.i.z(r3, r5)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.i.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/e;", "a", "()Landroidx/compose/foundation/text2/input/internal/selection/e;"}, k = 3, mv = {1, 8, 0})
    static final class w extends n0 implements ld.a<androidx.compose.foundation.text2.input.internal.selection.e> {
        w() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.foundation.text2.input.internal.selection.e invoke() {
            return i.this.g0(false);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {393}, m = "observeChanges", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8936b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8937c;

        /* renamed from: e, reason: collision with root package name */
        int f8939e;

        x(kotlin.coroutines.d<? super x> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8937c = obj;
            this.f8939e |= Integer.MIN_VALUE;
            return i.this.r0(this);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8940b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8941c;

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8943b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8944c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8944c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f8944c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8943b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8944c;
                    this.f8943b = 1;
                    if (iVar.s0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8945b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f8946c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f8946c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f8946c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8945b;
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f8946c;
                    this.f8945b = 1;
                    if (iVar.t0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        y(kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            y yVar = i.this.new y(dVar);
            yVar.f8941c = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f8940b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f8941c;
            kotlinx.coroutines.k.f(r0Var, null, null, new a(i.this, null), 3, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, null, new b(i.this, null), 3, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((y) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "a", "()Landroidx/compose/foundation/text2/input/q;"}, k = 3, mv = {1, 8, 0})
    static final class z extends n0 implements ld.a<androidx.compose.foundation.text2.input.q> {
        z() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.foundation.text2.input.q invoke() {
            return i.this.textFieldState.k();
        }
    }

    public i(@fg.l m0 m0Var, @fg.l androidx.compose.foundation.text2.input.internal.j0 j0Var, @fg.l androidx.compose.ui.unit.d dVar, boolean z4, boolean z5, boolean z6) {
        k2 g4;
        k2 g5;
        k2 g6;
        k2 g7;
        k2 g10;
        k2 g11;
        this.textFieldState = m0Var;
        this.textLayoutState = j0Var;
        this.density = dVar;
        this.enabled = z4;
        this.readOnly = z5;
        this.isFocused = z6;
        g4 = t4.g(Boolean.TRUE, null, 2, null);
        this.isInTouchMode = g4;
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        g5 = t4.g(i0.f.d(i0.f.f74149e), null, 2, null);
        this.startContentVisibleOffset = g5;
        companion.getClass();
        g6 = t4.g(i0.f.d(i0.f.f74149e), null, 2, null);
        this.rawHandleDragPosition = g6;
        g7 = t4.g(null, null, 2, null);
        this.draggingHandle = g7;
        g10 = t4.g(Boolean.FALSE, null, 2, null);
        this.showCursorHandle = g10;
        g11 = t4.g(androidx.compose.foundation.text2.input.internal.selection.k.None, null, 2, null);
        this.textToolbarState = g11;
        this.previousRawDragOffset = -1;
        this.cursorHandle = o4.e(new a());
        this.cursorHandleInBounds = o4.d(o4.x(), new c());
        this.cursorRect = o4.e(new d());
        this.startSelectionHandle = o4.e(new j0());
        this.endSelectionHandle = o4.e(new w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(boolean z4) {
        this.showCursorHandle.setValue(Boolean.valueOf(z4));
    }

    private final void B0(long j4) {
        this.startContentVisibleOffset.setValue(i0.f.d(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(androidx.compose.foundation.text2.input.internal.selection.k kVar) {
        this.textToolbarState.setValue(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(i0.i contentRect) {
        f1 f1Var;
        long selectionInChars = this.textFieldState.k().getSelectionInChars();
        h0 h0Var = (b0() && (f1Var = this.clipboardManager) != null && f1Var.a()) ? new h0() : null;
        f0 f0Var = !t0.h(selectionInChars) ? new f0() : null;
        g0 g0Var = (t0.h(selectionInChars) || !b0()) ? null : new g0();
        i0 i0Var = t0.j(selectionInChars) != this.textFieldState.k().length() ? new i0() : null;
        i5 i5Var = this.textToolbar;
        if (i5Var != null) {
            i5Var.c(contentRect, f0Var, h0Var, g0Var, i0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        w0(null);
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        z0(i0.f.f74149e);
        companion.getClass();
        B0(i0.f.f74149e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(androidx.compose.foundation.text.o handle, long position) {
        w0(handle);
        z0(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H0(androidx.compose.foundation.text2.input.q textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, androidx.compose.foundation.text.selection.w adjustment, boolean allowPreviousSelectionCollapsed) {
        k0.a aVar;
        t0 b5 = t0.b(textFieldCharSequence.getSelectionInChars());
        long packedValue = b5.getPackedValue();
        if (!allowPreviousSelectionCollapsed && t0.h(packedValue)) {
            b5 = null;
        }
        long k02 = k0(startOffset, endOffset, b5, isStartHandle, adjustment);
        if (t0.g(k02, textFieldCharSequence.getSelectionInChars())) {
            return k02;
        }
        boolean z4 = t0.m(k02) != t0.m(textFieldCharSequence.getSelectionInChars()) && t0.g(u0.b((int) (4294967295L & k02), (int) (k02 >> 32)), textFieldCharSequence.getSelectionInChars());
        if (p0() && !z4 && (aVar = this.hapticFeedBack) != null) {
            k0.b.INSTANCE.getClass();
            aVar.a(k0.d.f74804a.b());
        }
        return k02;
    }

    public static /* synthetic */ void I(i iVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        iVar.H(z4);
    }

    static /* synthetic */ long I0(i iVar, androidx.compose.foundation.text2.input.q qVar, int i4, int i5, boolean z4, androidx.compose.foundation.text.selection.w wVar, boolean z5, int i6, Object obj) {
        if ((i6 & 32) != 0) {
            z5 = false;
        }
        return iVar.H0(qVar, i4, i5, z4, wVar, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(androidx.compose.ui.input.pointer.k0 r10, kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.text2.input.internal.selection.i.e
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.text2.input.internal.selection.i$e r0 = (androidx.compose.foundation.text2.input.internal.selection.i.e) r0
            int r1 = r0.f8825g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8825g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.text2.input.internal.selection.i$e r0 = new androidx.compose.foundation.text2.input.internal.selection.i$e
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f8823e
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f8825g
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r10 = r6.f8822d
            kotlin.jvm.internal.k1$g r10 = (kotlin.jvm.internal.k1.g) r10
            java.lang.Object r0 = r6.f8821c
            kotlin.jvm.internal.k1$g r0 = (kotlin.jvm.internal.k1.g) r0
            java.lang.Object r1 = r6.f8820b
            androidx.compose.foundation.text2.input.internal.selection.i r1 = (androidx.compose.foundation.text2.input.internal.selection.i) r1
            kotlin.a1.n(r11)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r11 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            kotlin.a1.n(r11)
            kotlin.jvm.internal.k1$g r11 = new kotlin.jvm.internal.k1$g
            r11.<init>()
            i0.f$a r1 = i0.f.INSTANCE
            r1.getClass()
            long r3 = i0.f.b()
            r11.f75328b = r3
            kotlin.jvm.internal.k1$g r7 = new kotlin.jvm.internal.k1$g
            r7.<init>()
            r1.getClass()
            long r3 = i0.f.b()
            r7.f75328b = r3
            androidx.compose.foundation.text2.input.internal.selection.i$f r3 = new androidx.compose.foundation.text2.input.internal.selection.i$f     // Catch: java.lang.Throwable -> L91
            r3.<init>(r11, r9, r7)     // Catch: java.lang.Throwable -> L91
            androidx.compose.foundation.text2.input.internal.selection.i$g r4 = new androidx.compose.foundation.text2.input.internal.selection.i$g     // Catch: java.lang.Throwable -> L91
            r4.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L91
            androidx.compose.foundation.text2.input.internal.selection.i$h r5 = new androidx.compose.foundation.text2.input.internal.selection.i$h     // Catch: java.lang.Throwable -> L91
            r5.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L91
            androidx.compose.foundation.text2.input.internal.selection.i$i r8 = new androidx.compose.foundation.text2.input.internal.selection.i$i     // Catch: java.lang.Throwable -> L91
            r8.<init>(r7, r9, r11)     // Catch: java.lang.Throwable -> L91
            r6.f8820b = r9     // Catch: java.lang.Throwable -> L91
            r6.f8821c = r11     // Catch: java.lang.Throwable -> L91
            r6.f8822d = r7     // Catch: java.lang.Throwable -> L91
            r6.f8825g = r2     // Catch: java.lang.Throwable -> L91
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = androidx.compose.foundation.gestures.u.n(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91
            if (r10 != r0) goto L88
            return r0
        L88:
            r1 = r9
            r0 = r11
            r10 = r7
        L8b:
            N(r0, r10, r1)
            kotlin.k2 r10 = kotlin.k2.f75408a
            return r10
        L91:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        L96:
            N(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.i.M(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(k1.g gVar, k1.g gVar2, i iVar) {
        if (i0.g.d(gVar.f75328b)) {
            f.Companion companion = i0.f.INSTANCE;
            companion.getClass();
            gVar.f75328b = i0.f.f74149e;
            companion.getClass();
            gVar2.f75328b = i0.f.f74149e;
            iVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(androidx.compose.ui.input.pointer.k0 r18, boolean r19, kotlin.coroutines.d<? super kotlin.k2> r20) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.i.O(androidx.compose.ui.input.pointer.k0, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(k1.g gVar, i iVar, k1.g gVar2) {
        if (i0.g.d(gVar.f75328b)) {
            iVar.G();
            f.Companion companion = i0.f.INSTANCE;
            companion.getClass();
            gVar.f75328b = i0.f.f74149e;
            companion.getClass();
            gVar2.f75328b = i0.f.f74147c;
            iVar.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.text.o] */
    public final Object Q(androidx.compose.ui.input.pointer.k0 k0Var, ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        k1.f fVar = new k1.f();
        fVar.f75327b = -1;
        k1.g gVar = new k1.g();
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        gVar.f75328b = i0.f.f74149e;
        k1.g gVar2 = new k1.g();
        companion.getClass();
        gVar2.f75328b = i0.f.f74147c;
        k1.h hVar = new k1.h();
        hVar.f75329b = androidx.compose.foundation.text.o.SelectionEnd;
        Object p4 = androidx.compose.foundation.gestures.u.p(k0Var, new p(aVar, this, hVar, gVar, gVar2, fVar), new q(gVar, this, fVar, gVar2), new r(gVar, this, fVar, gVar2), new s(gVar2, gVar, fVar, hVar), dVar);
        return p4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? p4 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(k1.g gVar, i iVar, k1.f fVar, k1.g gVar2) {
        if (i0.g.d(gVar.f75328b)) {
            iVar.G();
            fVar.f75327b = -1;
            f.Companion companion = i0.f.INSTANCE;
            companion.getClass();
            gVar.f75328b = i0.f.f74149e;
            companion.getClass();
            gVar2.f75328b = i0.f.f74147c;
            iVar.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S(androidx.compose.ui.input.pointer.k0 k0Var, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = androidx.compose.foundation.text2.input.internal.selection.c.e(k0Var, new t(aVar, this, aVar2), new u(), dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object o32 = k0Var.o3(new v(null), dVar);
        return o32 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? o32 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0.i V() {
        long j4;
        long j5;
        float f4;
        i0.i e4;
        i0.i e5;
        long j6;
        androidx.compose.foundation.text2.input.q k4 = this.textFieldState.k();
        if (t0.h(k4.getSelectionInChars())) {
            androidx.compose.ui.layout.u l02 = l0();
            if (l02 != null) {
                j6 = l02.r0(Z().E());
            } else {
                i0.f.INSTANCE.getClass();
                j6 = i0.f.f74147c;
            }
            return i0.j.c(j6, Z().z());
        }
        androidx.compose.ui.layout.u l03 = l0();
        if (l03 != null) {
            j4 = l03.r0(e0(true));
        } else {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74147c;
        }
        androidx.compose.ui.layout.u l04 = l0();
        if (l04 != null) {
            j5 = l04.r0(e0(false));
        } else {
            i0.f.INSTANCE.getClass();
            j5 = i0.f.f74147c;
        }
        androidx.compose.ui.layout.u l05 = l0();
        float f5 = 0.0f;
        if (l05 != null) {
            androidx.compose.ui.text.n0 e6 = this.textLayoutState.e();
            f4 = i0.f.r(l05.r0(i0.g.a(0.0f, (e6 == null || (e5 = e6.e((int) (k4.getSelectionInChars() >> 32))) == null) ? 0.0f : e5.getTop())));
        } else {
            f4 = 0.0f;
        }
        androidx.compose.ui.layout.u l06 = l0();
        if (l06 != null) {
            androidx.compose.ui.text.n0 e7 = this.textLayoutState.e();
            f5 = i0.f.r(l06.r0(i0.g.a(0.0f, (e7 == null || (e4 = e7.e((int) (k4.getSelectionInChars() & 4294967295L))) == null) ? 0.0f : e4.getTop())));
        }
        return new i0.i(Math.min(i0.f.p(j4), i0.f.p(j5)), Math.min(f4, f5), Math.max(i0.f.p(j4), i0.f.p(j5)), Math.max(i0.f.r(j4), i0.f.r(j5)));
    }

    private final long W() {
        i0.i i4;
        androidx.compose.ui.layout.u l02 = l0();
        if (l02 != null && (i4 = androidx.compose.foundation.text.selection.i0.i(l02)) != null) {
            return i4.E();
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        return ((Boolean) this.cursorHandleInBounds.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b0() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e0(boolean isStartHandle) {
        androidx.compose.ui.text.n0 e4 = this.textLayoutState.e();
        if (e4 == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
        long selectionInChars = this.textFieldState.k().getSelectionInChars();
        return androidx.compose.foundation.text.selection.z0.b(e4, isStartHandle ? t0.n(selectionInChars) : t0.i(selectionInChars), isStartHandle, t0.m(selectionInChars));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long f0() {
        return ((i0.f) this.rawHandleDragPosition.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.text2.input.internal.selection.e g0(boolean r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L5
            androidx.compose.foundation.text.o r0 = androidx.compose.foundation.text.o.SelectionStart
            goto L7
        L5:
            androidx.compose.foundation.text.o r0 = androidx.compose.foundation.text.o.SelectionEnd
        L7:
            androidx.compose.foundation.text2.input.internal.j0 r1 = r13.textLayoutState
            androidx.compose.ui.text.n0 r1 = r1.e()
            if (r1 != 0) goto L19
            androidx.compose.foundation.text2.input.internal.selection.e$a r14 = androidx.compose.foundation.text2.input.internal.selection.e.INSTANCE
            r14.getClass()
            androidx.compose.foundation.text2.input.internal.selection.e r14 = androidx.compose.foundation.text2.input.internal.selection.e.a()
            return r14
        L19:
            androidx.compose.foundation.text2.input.internal.m0 r2 = r13.textFieldState
            androidx.compose.foundation.text2.input.q r2 = r2.k()
            long r2 = r2.getSelectionInChars()
            boolean r4 = androidx.compose.ui.text.t0.h(r2)
            if (r4 == 0) goto L33
            androidx.compose.foundation.text2.input.internal.selection.e$a r14 = androidx.compose.foundation.text2.input.internal.selection.e.INSTANCE
            r14.getClass()
            androidx.compose.foundation.text2.input.internal.selection.e r14 = androidx.compose.foundation.text2.input.internal.selection.e.a()
            return r14
        L33:
            long r4 = r13.e0(r14)
            androidx.compose.foundation.text.o r6 = r13.a0()
            r7 = 1
            r8 = 0
            if (r6 == r0) goto L56
            androidx.compose.ui.layout.u r0 = r13.l0()
            if (r0 == 0) goto L50
            i0.i r0 = androidx.compose.foundation.text.selection.i0.i(r0)
            if (r0 == 0) goto L50
            boolean r0 = androidx.compose.foundation.text.selection.i0.d(r0, r4)
            goto L51
        L50:
            r0 = r8
        L51:
            if (r0 == 0) goto L54
            goto L56
        L54:
            r0 = r8
            goto L57
        L56:
            r0 = r7
        L57:
            if (r0 != 0) goto L63
            androidx.compose.foundation.text2.input.internal.selection.e$a r14 = androidx.compose.foundation.text2.input.internal.selection.e.INSTANCE
            r14.getClass()
            androidx.compose.foundation.text2.input.internal.selection.e r14 = androidx.compose.foundation.text2.input.internal.selection.e.a()
            return r14
        L63:
            if (r14 == 0) goto L6b
            r14 = 32
            long r6 = r2 >> r14
            int r14 = (int) r6
            goto L77
        L6b:
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r2
            int r14 = (int) r9
            int r14 = r14 - r7
            int r14 = java.lang.Math.max(r14, r8)
        L77:
            androidx.compose.ui.text.style.i r10 = r1.c(r14)
            boolean r11 = androidx.compose.ui.text.t0.m(r2)
            androidx.compose.ui.layout.u r14 = r13.l0()
            if (r14 == 0) goto L8f
            i0.i r14 = androidx.compose.foundation.text.selection.i0.i(r14)
            if (r14 == 0) goto L8f
            long r4 = androidx.compose.foundation.text2.input.internal.k0.a(r4, r14)
        L8f:
            r8 = r4
            androidx.compose.foundation.text2.input.internal.selection.e r14 = new androidx.compose.foundation.text2.input.internal.selection.e
            r7 = 1
            r12 = 0
            r6 = r14
            r6.<init>(r7, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.i.g0(boolean):androidx.compose.foundation.text2.input.internal.selection.e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h0() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long i0() {
        return ((i0.f) this.startContentVisibleOffset.getValue()).getPackedValue();
    }

    private final long k0(int rawStartOffset, int rawEndOffset, t0 previousSelection, boolean isStartHandle, androidx.compose.foundation.text.selection.w adjustment) {
        long j4;
        androidx.compose.ui.text.n0 e4 = this.textLayoutState.e();
        if (e4 == null) {
            t0.INSTANCE.getClass();
            return t0.f21417c;
        }
        if (previousSelection == null && l0.g(adjustment, androidx.compose.foundation.text.selection.w.INSTANCE.k())) {
            return u0.b(rawStartOffset, rawEndOffset);
        }
        int i4 = this.previousRawDragOffset;
        if (previousSelection != null) {
            j4 = previousSelection.getPackedValue();
        } else {
            t0.INSTANCE.getClass();
            j4 = t0.f21417c;
        }
        androidx.compose.foundation.text.selection.d0 c5 = androidx.compose.foundation.text.selection.f0.c(e4, rawStartOffset, rawEndOffset, i4, j4, previousSelection == null, isStartHandle);
        if (previousSelection != null && !c5.i(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long j5 = adjustment.a(c5).j();
        this.previousSelectionLayout = c5;
        if (!isStartHandle) {
            rawStartOffset = rawEndOffset;
        }
        this.previousRawDragOffset = rawStartOffset;
        return j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.u l0() {
        androidx.compose.ui.layout.u j4 = this.textLayoutState.j();
        if (j4 == null || !j4.f()) {
            return null;
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text2.input.internal.selection.k m0() {
        return (androidx.compose.foundation.text2.input.internal.selection.k) this.textToolbarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        i5 i5Var;
        i5 i5Var2 = this.textToolbar;
        if ((i5Var2 != null ? i5Var2.getStatus() : null) != k5.Shown || (i5Var = this.textToolbar) == null) {
            return;
        }
        i5Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        long j4;
        i0.i i4;
        androidx.compose.ui.layout.u l02 = l0();
        if (l02 == null || (i4 = androidx.compose.foundation.text.selection.i0.i(l02)) == null) {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74149e;
        } else {
            j4 = i4.E();
        }
        B0(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object a5 = kotlinx.coroutines.flow.k.j0(kotlinx.coroutines.flow.k.h0(o4.w(new z()), a0.f8800d), 1).a(new b0(), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t0(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object a5 = o4.w(new c0()).a(new d0(), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z4) {
        this.isInTouchMode.setValue(Boolean.valueOf(z4));
    }

    private final void z0(long j4) {
        this.rawHandleDragPosition.setValue(i0.f.d(j4));
    }

    @fg.m
    public final Object E0(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.a<kotlin.k2> aVar, @fg.l ld.a<kotlin.k2> aVar2, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = s0.g(new k0(k0Var, aVar, aVar2, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    public final void F0(@fg.l k0.a hapticFeedBack, @fg.l f1 clipboardManager, @fg.l i5 textToolbar, @fg.l androidx.compose.ui.unit.d density, boolean enabled, boolean readOnly) {
        if (!enabled) {
            n0();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
    }

    public final void H(boolean cancelSelection) {
        androidx.compose.foundation.text2.input.q k4 = this.textFieldState.k();
        if (t0.h(k4.getSelectionInChars())) {
            return;
        }
        f1 f1Var = this.clipboardManager;
        if (f1Var != null) {
            f1Var.c(new androidx.compose.ui.text.e(androidx.compose.foundation.text2.input.r.e(k4).toString(), null, null, 6, null));
        }
        if (cancelSelection) {
            this.textFieldState.f();
        }
    }

    @fg.m
    public final Object J(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = s0.g(new b(k0Var, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    public final void J0(@fg.l androidx.compose.foundation.text2.input.internal.selection.k textToolbarState) {
        C0(textToolbarState);
    }

    public final void K() {
        androidx.compose.foundation.text2.input.q k4 = this.textFieldState.k();
        if (t0.h(k4.getSelectionInChars())) {
            return;
        }
        f1 f1Var = this.clipboardManager;
        if (f1Var != null) {
            f1Var.c(new androidx.compose.ui.text.e(androidx.compose.foundation.text2.input.r.e(k4).toString(), null, null, 6, null));
        }
        this.textFieldState.h();
    }

    public final void L() {
        if (!t0.h(this.textFieldState.k().getSelectionInChars())) {
            this.textFieldState.e();
        }
        A0(false);
        C0(androidx.compose.foundation.text2.input.internal.selection.k.None);
    }

    public final void U() {
        n0();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    @fg.l
    public final androidx.compose.foundation.text2.input.internal.selection.e X() {
        return (androidx.compose.foundation.text2.input.internal.selection.e) this.cursorHandle.getValue();
    }

    @fg.l
    public final i0.i Z() {
        return (i0.i) this.cursorRect.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final androidx.compose.foundation.text.o a0() {
        return (androidx.compose.foundation.text.o) this.draggingHandle.getValue();
    }

    @fg.l
    public final androidx.compose.foundation.text2.input.internal.selection.e c0() {
        return (androidx.compose.foundation.text2.input.internal.selection.e) this.endSelectionHandle.getValue();
    }

    public final long d0() {
        if (!i0.g.f(f0())) {
            return i0.g.f(i0()) ? androidx.compose.foundation.text2.input.internal.k0.b(this.textLayoutState, f0()) : i0.f.u(i0.f.v(f0(), W()), i0());
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    @fg.l
    public final androidx.compose.foundation.text2.input.internal.selection.e j0() {
        return (androidx.compose.foundation.text2.input.internal.selection.e) this.startSelectionHandle.getValue();
    }

    /* renamed from: o0, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p0() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(@fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.internal.selection.i.x
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.internal.selection.i$x r0 = (androidx.compose.foundation.text2.input.internal.selection.i.x) r0
            int r1 = r0.f8939e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8939e = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.selection.i$x r0 = new androidx.compose.foundation.text2.input.internal.selection.i$x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8937c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8939e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f8936b
            androidx.compose.foundation.text2.input.internal.selection.i r0 = (androidx.compose.foundation.text2.input.internal.selection.i) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r6 = move-exception
            goto L5e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.a1.n(r6)
            androidx.compose.foundation.text2.input.internal.selection.i$y r6 = new androidx.compose.foundation.text2.input.internal.selection.i$y     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r0.f8936b = r5     // Catch: java.lang.Throwable -> L5c
            r0.f8939e = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = kotlinx.coroutines.s0.g(r6, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            r0.A0(r3)
            androidx.compose.foundation.text2.input.internal.selection.k r6 = r0.m0()
            androidx.compose.foundation.text2.input.internal.selection.k r1 = androidx.compose.foundation.text2.input.internal.selection.k.None
            if (r6 == r1) goto L59
            r0.n0()
        L59:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L5c:
            r6 = move-exception
            r0 = r5
        L5e:
            r0.A0(r3)
            androidx.compose.foundation.text2.input.internal.selection.k r1 = r0.m0()
            androidx.compose.foundation.text2.input.internal.selection.k r2 = androidx.compose.foundation.text2.input.internal.selection.k.None
            if (r1 == r2) goto L6c
            r0.n0()
        L6c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.i.r0(kotlin.coroutines.d):java.lang.Object");
    }

    public final void u0() {
        androidx.compose.ui.text.e b5;
        String text;
        f1 f1Var = this.clipboardManager;
        if (f1Var == null || (b5 = f1Var.b()) == null || (text = b5.getText()) == null) {
            return;
        }
        m0.w(this.textFieldState, text, false, androidx.compose.foundation.text2.input.internal.undo.c.NeverMerge, 2, null);
    }

    @fg.m
    public final Object v0(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, boolean z4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = s0.g(new e0(k0Var, z4, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    public final void w0(@fg.m androidx.compose.foundation.text.o oVar) {
        this.draggingHandle.setValue(oVar);
    }

    public final void x0(boolean z4) {
        this.isFocused = z4;
    }
}
