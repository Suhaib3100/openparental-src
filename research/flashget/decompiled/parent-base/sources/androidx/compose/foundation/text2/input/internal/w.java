package androidx.compose.foundation.text2.input.internal;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.t0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: StatelessInputConnection.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010!J\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010%J\u001f\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010%J\u001f\u0010+\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010\u000fJ\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00104J\u0019\u00106\u001a\u0004\u0018\u00010\u001d2\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u0010:J\u0017\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010:J\u0019\u0010H\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u0010:J\u0017\u0010T\u001a\u00020\r2\u0006\u0010S\u001a\u00020\rH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010Y\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010\u00152\b\u0010X\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bY\u0010ZJ)\u0010^\u001a\u00020\r2\u0006\u0010\\\u001a\u00020[2\u0006\u00102\u001a\u00020\u00112\b\u0010]\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR+\u0010h\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001e\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006l"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/w;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/foundation/text2/input/internal/i0;", "session", "<init>", "(Landroidx/compose/foundation/text2/input/internal/i0;)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "Lkotlin/u;", "editCommand", "d", "(Lld/l;)V", "", "e", "()Z", "f", "", "code", "i", "(I)V", "", "message", "h", "(Ljava/lang/String;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "reqModes", "getCursorCapsMode", "(I)I", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Landroidx/compose/foundation/text2/input/internal/i0;", "b", "I", "batchDepth", "Landroidx/compose/runtime/collection/g;", "c", "Landroidx/compose/runtime/collection/g;", "editCommands", "Landroidx/compose/foundation/text2/input/q;", "g", "()Landroidx/compose/foundation/text2/input/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,372:1\n1208#2:373\n1187#2,2:374\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n*L\n72#1:373\n72#1:374,2\n*E\n"})
/* loaded from: classes.dex */
public final class w implements InputConnection {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8983d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 session;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<ld.l<m, k2>> editCommands = new androidx.compose.runtime.collection.g<>(new ld.l[16], 0);

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f8987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, int i4) {
            super(1);
            this.f8987b = charSequence;
            this.f8988c = i4;
        }

        public final void a(@fg.l m mVar) {
            l.b(mVar, String.valueOf(this.f8987b), this.f8988c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8989b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, int i5) {
            super(1);
            this.f8989b = i4;
            this.f8990c = i5;
        }

        public final void a(@fg.l m mVar) {
            l.d(mVar, this.f8989b, this.f8990c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, int i5) {
            super(1);
            this.f8991b = i4;
            this.f8992c = i5;
        }

        public final void a(@fg.l m mVar) {
            l.e(mVar, this.f8991b, this.f8992c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection$endBatchEditInternal$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,372:1\n460#2,11:373\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection$endBatchEditInternal$1\n*L\n111#1:373,11\n*E\n"})
    static final class d extends n0 implements ld.l<m, k2> {
        d() {
            super(1);
        }

        public final void a(@fg.l m mVar) {
            androidx.compose.runtime.collection.g gVar = w.this.editCommands;
            int size = gVar.getSize();
            if (size > 0) {
                Object[] L = gVar.L();
                int i4 = 0;
                do {
                    ((ld.l) L[i4]).invoke(mVar);
                    i4++;
                } while (i4 < size);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f8994b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l m mVar) {
            mVar.b();
        }

        @Override // ld.l
        public k2 invoke(m mVar) {
            mVar.b();
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.l<m, k2> {
        f() {
            super(1);
        }

        public final void a(@fg.l m mVar) {
            mVar.r(0, w.c(w.this).length());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4, int i5) {
            super(1);
            this.f8996b = i4;
            this.f8997c = i5;
        }

        public final void a(@fg.l m mVar) {
            l.i(mVar, this.f8996b, this.f8997c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f8998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence, int i4) {
            super(1);
            this.f8998b = charSequence;
            this.f8999c = i4;
        }

        public final void a(@fg.l m mVar) {
            l.j(mVar, String.valueOf(this.f8998b), this.f8999c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: StatelessInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.l<m, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i4, int i5) {
            super(1);
            this.f9000b = i4;
            this.f9001c = i5;
        }

        public final void a(@fg.l m mVar) {
            mVar.r(this.f9000b, this.f9001c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m mVar) {
            a(mVar);
            return k2.f75408a;
        }
    }

    public w(@fg.l i0 i0Var) {
        this.session = i0Var;
    }

    public static final androidx.compose.foundation.text2.input.q c(w wVar) {
        return wVar.session.b();
    }

    private final void d(ld.l<? super m, k2> editCommand) {
        e();
        try {
            this.editCommands.b(editCommand);
        } finally {
            f();
        }
    }

    private final boolean e() {
        this.batchDepth++;
        return true;
    }

    private final boolean f() {
        int i4 = this.batchDepth - 1;
        this.batchDepth = i4;
        if (i4 == 0 && this.editCommands.V()) {
            this.session.c(new d());
            this.editCommands.m();
        }
        return this.batchDepth > 0;
    }

    private final androidx.compose.foundation.text2.input.q g() {
        return this.session.b();
    }

    private final void h(String message) {
    }

    private final void i(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.m();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@fg.m CompletionInfo text) {
        Objects.toString(text != null ? text.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@fg.l InputContentInfo inputContentInfo, int flags, @fg.m Bundle opts) {
        Objects.toString(inputContentInfo);
        Objects.toString(opts);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@fg.m CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@fg.m CharSequence text, int newCursorPosition) {
        Objects.toString(text);
        d(new a(text, newCursorPosition));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        d(new b(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        d(new c(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return f();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        d(e.f8994b);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.session.b(), t0.l(this.session.b().getSelectionInChars()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public ExtractedText getExtractedText(@fg.m ExtractedTextRequest request, int flags) {
        ExtractedText c5;
        Objects.toString(request);
        c5 = x.c(this.session.b());
        return c5;
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.m
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.m
    public CharSequence getSelectedText(int flags) {
        if (t0.h(this.session.b().getSelectionInChars())) {
            return null;
        }
        return androidx.compose.foundation.text2.input.r.e(this.session.b()).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return androidx.compose.foundation.text2.input.r.f(this.session.b(), maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return androidx.compose.foundation.text2.input.r.g(this.session.b(), maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        switch (id2) {
            case R.id.selectAll:
                d(new f());
                break;
            case R.id.cut:
                i(277);
                break;
            case R.id.copy:
                i(278);
                break;
            case R.id.paste:
                i(279);
                break;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int i4;
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21133e;
                    break;
                case 3:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21134f;
                    break;
                case 4:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21135g;
                    break;
                case 5:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21137i;
                    break;
                case 6:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21138j;
                    break;
                case 7:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21136h;
                    break;
                default:
                    androidx.compose.ui.text.input.y.INSTANCE.getClass();
                    i4 = androidx.compose.ui.text.input.y.f21131c;
                    break;
            }
        } else {
            androidx.compose.ui.text.input.y.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.input.y.f21131c;
        }
        this.session.a(i4);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@fg.m String action, @fg.m Bundle data) {
        Objects.toString(data);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@fg.l KeyEvent event) {
        Objects.toString(event);
        this.session.sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        d(new g(start, end));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@fg.m CharSequence text, int newCursorPosition) {
        Objects.toString(text);
        d(new h(text, newCursorPosition));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        d(new i(start, end));
        return true;
    }
}
