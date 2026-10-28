package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.graphics.y4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010KR$\u0010P\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010QR\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000e0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Landroidx/compose/ui/text/input/d1;", "Landroidx/compose/ui/text/input/t0;", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/r0;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/c0;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/r0;Landroidx/compose/ui/text/input/c0;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/r0;)V", "Landroidx/compose/ui/text/input/d1$a;", "command", "Lkotlin/k2;", "w", "(Landroidx/compose/ui/text/input/d1$a;)V", "t", "()V", "v", "", "visible", "y", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "s", "()Z", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/p;", "onEditCommand", "Landroidx/compose/ui/text/input/y;", "onImeActionPerformed", "c", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z;Lld/l;Lld/l;)V", "a", "b", "h", "d", "oldValue", "newValue", "e", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z0;)V", "Li0/i;", "rect", "g", "(Li0/i;)V", "textFieldValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Landroidx/compose/ui/graphics/y4;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "f", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Lld/l;Li0/i;Li0/i;)V", "Landroid/view/View;", "r", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/c0;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "Lld/l;", "<set-?>", "Landroidx/compose/ui/text/input/z0;", "q", "()Landroidx/compose/ui/text/input/z0;", "state", "Landroidx/compose/ui/text/input/z;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/u0;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lkotlin/b0;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "Landroidx/compose/ui/text/input/l;", "l", "Landroidx/compose/ui/text/input/l;", "cursorAnchorInfoController", "Landroidx/compose/runtime/collection/g;", "m", "Landroidx/compose/runtime/collection/g;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,570:1\n1208#2:571\n1187#2,2:572\n728#3,2:574\n460#3,11:577\n1#4:576\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n113#1:571\n113#1:572,2\n257#1:574,2\n321#1:577,11\n*E\n"})
/* loaded from: classes.dex */
public final class d1 implements t0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f20994o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 inputMethodManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor inputCommandProcessorExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super List<? extends p>, k2> onEditCommand;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super y, k2> onImeActionPerformed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private z0 state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private z imeOptions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<WeakReference<u0>> ics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 baseInputConnection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Rect focusedRect;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l cursorAnchorInfoController;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a> textInputCommandQueue;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Runnable frameCallback;

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/d1$a;", "", "<init>", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21009a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21009a = iArr;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "a", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(d1.this.getView(), false);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"androidx/compose/ui/text/input/d1$d", "Landroidx/compose/ui/text/input/a0;", "", "Landroidx/compose/ui/text/input/p;", "editCommands", "Lkotlin/k2;", "b", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/y;", "imeAction", "a", "(I)V", "Landroid/view/KeyEvent;", "event", "c", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "e", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/u0;", "inputConnection", "d", "(Landroidx/compose/ui/text/input/u0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements a0 {
        d() {
        }

        @Override // androidx.compose.ui.text.input.a0
        public void a(int imeAction) {
            d1.this.onImeActionPerformed.invoke(y.i(imeAction));
        }

        @Override // androidx.compose.ui.text.input.a0
        public void b(@fg.l List<? extends p> editCommands) {
            d1.this.onEditCommand.invoke(editCommands);
        }

        @Override // androidx.compose.ui.text.input.a0
        public void c(@fg.l KeyEvent event) {
            d1.this.p().sendKeyEvent(event);
        }

        @Override // androidx.compose.ui.text.input.a0
        public void d(@fg.l u0 inputConnection) {
            int size = d1.this.ics.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (kotlin.jvm.internal.l0.g(((WeakReference) d1.this.ics.get(i4)).get(), inputConnection)) {
                    d1.this.ics.remove(i4);
                    return;
                }
            }
        }

        @Override // androidx.compose.ui.text.input.a0
        public void e(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            d1.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/p;", "it", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<List<? extends p>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f21012b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l List<? extends p> list) {
        }

        @Override // ld.l
        public k2 invoke(List<? extends p> list) {
            return k2.f75408a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/y;", "it", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<y, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f21013b = new f(1);

        f() {
            super(1);
        }

        public final void a(int i4) {
        }

        @Override // ld.l
        public k2 invoke(y yVar) {
            yVar.getValue();
            return k2.f75408a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/p;", "it", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<List<? extends p>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f21014b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l List<? extends p> list) {
        }

        @Override // ld.l
        public k2 invoke(List<? extends p> list) {
            return k2.f75408a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/y;", "it", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<y, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f21015b = new h(1);

        h() {
            super(1);
        }

        public final void a(int i4) {
        }

        @Override // ld.l
        public k2 invoke(y yVar) {
            yVar.getValue();
            return k2.f75408a;
        }
    }

    public d1(@fg.l View view, @fg.l androidx.compose.ui.input.pointer.r0 r0Var, @fg.l c0 c0Var, @fg.l Executor executor) {
        this.view = view;
        this.inputMethodManager = c0Var;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = e.f21012b;
        this.onImeActionPerformed = f.f21013b;
        androidx.compose.ui.text.t0.INSTANCE.getClass();
        this.state = new z0("", androidx.compose.ui.text.t0.f21417c, (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null);
        z.INSTANCE.getClass();
        this.imeOptions = z.f21145i;
        this.ics = new ArrayList();
        this.baseInputConnection = kotlin.c0.b(kotlin.f0.NONE, new c());
        this.cursorAnchorInfoController = new l(r0Var, c0Var);
        this.textInputCommandQueue = new androidx.compose.runtime.collection.g<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t() {
        k1.h hVar = new k1.h();
        k1.h hVar2 = new k1.h();
        androidx.compose.runtime.collection.g<a> gVar = this.textInputCommandQueue;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                u(L[i4], hVar, hVar2);
                i4++;
            } while (i4 < size);
        }
        this.textInputCommandQueue.m();
        if (kotlin.jvm.internal.l0.g(hVar.f75329b, Boolean.TRUE)) {
            v();
        }
        Boolean bool = (Boolean) hVar2.f75329b;
        if (bool != null) {
            y(bool.booleanValue());
        }
        if (kotlin.jvm.internal.l0.g(hVar.f75329b, Boolean.FALSE)) {
            v();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void u(a aVar, k1.h<Boolean> hVar, k1.h<Boolean> hVar2) {
        int i4 = b.f21009a[aVar.ordinal()];
        if (i4 == 1) {
            ?? r32 = Boolean.TRUE;
            hVar.f75329b = r32;
            hVar2.f75329b = r32;
        } else if (i4 == 2) {
            ?? r33 = Boolean.FALSE;
            hVar.f75329b = r33;
            hVar2.f75329b = r33;
        } else if ((i4 == 3 || i4 == 4) && !kotlin.jvm.internal.l0.g(hVar.f75329b, Boolean.FALSE)) {
            hVar2.f75329b = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    private final void v() {
        this.inputMethodManager.d();
    }

    private final void w(a command) {
        this.textInputCommandQueue.b(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.c1
                @Override // java.lang.Runnable
                public final void run() {
                    d1.x(d1.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(d1 d1Var) {
        d1Var.frameCallback = null;
        d1Var.t();
    }

    private final void y(boolean visible) {
        if (visible) {
            this.inputMethodManager.b();
        } else {
            this.inputMethodManager.e();
        }
    }

    @Override // androidx.compose.ui.text.input.t0
    public void a() {
        w(a.StartInput);
    }

    @Override // androidx.compose.ui.text.input.t0
    public void b() {
        this.editorHasFocus = false;
        this.onEditCommand = g.f21014b;
        this.onImeActionPerformed = h.f21015b;
        this.focusedRect = null;
        w(a.StopInput);
    }

    @Override // androidx.compose.ui.text.input.t0
    public void c(@fg.l z0 value, @fg.l z imeOptions, @fg.l ld.l<? super List<? extends p>, k2> onEditCommand, @fg.l ld.l<? super y, k2> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        w(a.StartInput);
    }

    @Override // androidx.compose.ui.text.input.t0
    public void d() {
        w(a.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.t0
    public void e(@fg.m z0 oldValue, @fg.l z0 newValue) {
        boolean z4 = (androidx.compose.ui.text.t0.g(this.state.getSelection(), newValue.getSelection()) && kotlin.jvm.internal.l0.g(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i4 = 0; i4 < size; i4++) {
            u0 u0Var = this.ics.get(i4).get();
            if (u0Var != null) {
                u0Var.k(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (kotlin.jvm.internal.l0.g(oldValue, newValue)) {
            if (z4) {
                c0 c0Var = this.inputMethodManager;
                int l4 = androidx.compose.ui.text.t0.l(newValue.getSelection());
                int k4 = androidx.compose.ui.text.t0.k(newValue.getSelection());
                androidx.compose.ui.text.t0 composition = this.state.getComposition();
                int l5 = composition != null ? androidx.compose.ui.text.t0.l(composition.getPackedValue()) : -1;
                androidx.compose.ui.text.t0 composition2 = this.state.getComposition();
                c0Var.c(l4, k4, l5, composition2 != null ? androidx.compose.ui.text.t0.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!kotlin.jvm.internal.l0.g(oldValue.i(), newValue.i()) || (androidx.compose.ui.text.t0.g(oldValue.getSelection(), newValue.getSelection()) && !kotlin.jvm.internal.l0.g(oldValue.getComposition(), newValue.getComposition())))) {
            v();
            return;
        }
        int size2 = this.ics.size();
        for (int i5 = 0; i5 < size2; i5++) {
            u0 u0Var2 = this.ics.get(i5).get();
            if (u0Var2 != null) {
                u0Var2.l(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.t0
    public void f(@fg.l z0 textFieldValue, @fg.l p0 offsetMapping, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l ld.l<? super y4, k2> textFieldToRootTransform, @fg.l i0.i innerTextFieldBounds, @fg.l i0.i decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    @Override // androidx.compose.ui.text.input.t0
    @kotlin.k(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void g(@fg.l i0.i rect) {
        Rect rect2;
        this.focusedRect = new Rect(kotlin.math.b.L0(rect.t()), kotlin.math.b.L0(rect.getTop()), kotlin.math.b.L0(rect.x()), kotlin.math.b.L0(rect.j()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.t0
    public void h() {
        w(a.ShowKeyboard);
    }

    @fg.m
    public final InputConnection o(@fg.l EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        g1.h(outAttrs, this.imeOptions, this.state);
        g1.i(outAttrs);
        u0 u0Var = new u0(this.state, new d(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(u0Var));
        return u0Var;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final z0 getState() {
        return this.state;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public d1(View view, androidx.compose.ui.input.pointer.r0 r0Var, c0 c0Var, Executor executor, int i4, kotlin.jvm.internal.w wVar) {
        this(view, r0Var, c0Var, (i4 & 8) != 0 ? new f1(Choreographer.getInstance()) : executor);
    }

    public d1(@fg.l View view, @fg.l androidx.compose.ui.input.pointer.r0 r0Var) {
        this(view, r0Var, new d0(view), null, 8, null);
    }
}
