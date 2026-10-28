package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: RecordingInputConnection.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010+J\u001f\u00103\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010/J\u001f\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010/J\u001f\u00105\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b5\u0010/J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0014J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020'2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020'2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b?\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010'2\u0006\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0016H\u0016¢\u0006\u0004\bK\u0010DJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0016H\u0016¢\u0006\u0004\bM\u0010DJ\u0019\u0010O\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010S\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u0011\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u0016H\u0016¢\u0006\u0004\bY\u0010DJ\u0017\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u0016H\u0016¢\u0006\u0004\b^\u0010_J#\u0010c\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u001a2\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bc\u0010dJ)\u0010h\u001a\u00020\u00062\u0006\u0010f\u001a\u00020e2\u0006\u0010<\u001a\u00020\u00162\b\u0010g\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bh\u0010iR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010n\u001a\u0004\bo\u0010\u0014R\u0016\u0010q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010pR*\u0010x\u001a\u00020\u00022\u0006\u0010r\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010pR\u0016\u0010z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000f0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010|R\u0016\u0010~\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010n¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/text/input/u0;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/z0;", "initState", "Landroidx/compose/ui/text/input/a0;", "eventCallback", "", "autoCorrect", "<init>", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/a0;Z)V", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "e", "(Lld/a;)Z", "Landroidx/compose/ui/text/input/p;", "editCommand", "b", "(Landroidx/compose/ui/text/input/p;)V", "c", "()Z", "d", "", "code", "j", "(I)V", "", "message", "i", "(Ljava/lang/String;)V", "state", "Landroidx/compose/ui/text/input/c0;", "inputMethodManager", "l", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/c0;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Landroidx/compose/ui/text/input/a0;", "g", "()Landroidx/compose/ui/text/input/a0;", "Z", "f", "I", "batchDepth", "value", "Landroidx/compose/ui/text/input/z0;", "h", "()Landroidx/compose/ui/text/input/z0;", "k", "(Landroidx/compose/ui/text/input/z0;)V", "mTextFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "Ljava/util/List;", "editCommands", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,453:1\n81#1,5:454\n81#1,5:459\n81#1,5:464\n81#1,5:469\n81#1,5:474\n81#1,5:479\n81#1,5:484\n81#1,5:489\n81#1,5:494\n81#1,5:499\n81#1,5:504\n81#1,5:509\n81#1,5:514\n81#1,5:519\n81#1,5:524\n81#1,5:529\n81#1,5:534\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n140#1:454,5\n176#1:459,5\n181#1:464,5\n187#1:469,5\n195#1:474,5\n206#1:479,5\n212#1:484,5\n218#1:489,5\n224#1:494,5\n260#1:499,5\n344#1:504,5\n370#1:509,5\n393#1:514,5\n403#1:519,5\n415#1:524,5\n435#1:529,5\n444#1:534,5\n*E\n"})
/* loaded from: classes.dex */
public final class u0 implements InputConnection {

    /* renamed from: i, reason: collision with root package name */
    public static final int f21108i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 eventCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private z0 mTextFieldValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<p> editCommands = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isActive = true;

    public u0(@fg.l z0 z0Var, @fg.l a0 a0Var, boolean z4) {
        this.eventCallback = a0Var;
        this.autoCorrect = z4;
        this.mTextFieldValue = z0Var;
    }

    private final void b(p editCommand) {
        c();
        try {
            this.editCommands.add(editCommand);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.batchDepth++;
        return true;
    }

    private final boolean d() {
        int i4 = this.batchDepth - 1;
        this.batchDepth = i4;
        if (i4 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.b(kotlin.collections.w.Y5(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean e(ld.a<k2> block) {
        boolean z4 = this.isActive;
        if (z4) {
            block.invoke();
        }
        return z4;
    }

    private final void i(String message) {
    }

    private final void j(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z4 = this.isActive;
        return z4 ? c() : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.d(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@fg.m CompletionInfo text) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@fg.l InputContentInfo inputContentInfo, int flags, @fg.m Bundle opts) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@fg.m CorrectionInfo correctionInfo) {
        boolean z4 = this.isActive;
        return z4 ? this.autoCorrect : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@fg.m CharSequence text, int newCursorPosition) {
        boolean z4 = this.isActive;
        if (z4) {
            b(new b(String.valueOf(text), newCursorPosition));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        b(new n(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        b(new o(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    /* renamed from: f, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        b(new u());
        return true;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final a0 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.i(), androidx.compose.ui.text.t0.l(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public ExtractedText getExtractedText(@fg.m ExtractedTextRequest request, int flags) {
        boolean z4 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z4;
        if (z4) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return e0.a(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.m
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.m
    public CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.t0.h(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return a1.a(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return a1.b(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @fg.l
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return a1.c(this.mTextFieldValue, maxChars).toString();
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final z0 getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    public final void k(@fg.l z0 z0Var) {
        this.mTextFieldValue = z0Var;
    }

    public final void l(@fg.l z0 state, @fg.l c0 inputMethodManager) {
        if (this.isActive) {
            this.mTextFieldValue = state;
            if (this.extractedTextMonitorMode) {
                inputMethodManager.a(this.currentExtractedTextRequestToken, e0.a(state));
            }
            androidx.compose.ui.text.t0 composition = state.getComposition();
            int l4 = composition != null ? androidx.compose.ui.text.t0.l(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.t0 composition2 = state.getComposition();
            inputMethodManager.c(androidx.compose.ui.text.t0.l(state.getSelection()), androidx.compose.ui.text.t0.k(state.getSelection()), l4, composition2 != null ? androidx.compose.ui.text.t0.k(composition2.getPackedValue()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        boolean z4 = this.isActive;
        if (z4) {
            z4 = false;
            switch (id2) {
                case R.id.selectAll:
                    b(new y0(0, this.mTextFieldValue.i().length()));
                    break;
                case R.id.cut:
                    j(277);
                    break;
                case R.id.copy:
                    j(278);
                    break;
                case R.id.paste:
                    j(279);
                    break;
            }
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int i4;
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    y.INSTANCE.getClass();
                    i4 = y.f21133e;
                    break;
                case 3:
                    y.INSTANCE.getClass();
                    i4 = y.f21134f;
                    break;
                case 4:
                    y.INSTANCE.getClass();
                    i4 = y.f21135g;
                    break;
                case 5:
                    y.INSTANCE.getClass();
                    i4 = y.f21137i;
                    break;
                case 6:
                    y.INSTANCE.getClass();
                    i4 = y.f21138j;
                    break;
                case 7:
                    y.INSTANCE.getClass();
                    i4 = y.f21136h;
                    break;
                default:
                    y.INSTANCE.getClass();
                    i4 = y.f21131c;
                    break;
            }
        } else {
            y.INSTANCE.getClass();
            i4 = y.f21131c;
        }
        this.eventCallback.a(i4);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@fg.m String action, @fg.m Bundle data) {
        boolean z4 = this.isActive;
        if (z4) {
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        boolean z11 = false;
        boolean z12 = (cursorUpdateMode & 1) != 0;
        boolean z13 = (cursorUpdateMode & 2) != 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            boolean z14 = (cursorUpdateMode & 16) != 0;
            boolean z15 = (cursorUpdateMode & 8) != 0;
            boolean z16 = (cursorUpdateMode & 4) != 0;
            if (i4 >= 34 && (cursorUpdateMode & 32) != 0) {
                z11 = true;
            }
            if (z14 || z15 || z16 || z11) {
                z5 = z11;
                z4 = z16;
                z7 = z15;
                z6 = z14;
            } else if (i4 >= 34) {
                z6 = true;
                z7 = true;
                z4 = true;
                z5 = true;
            } else {
                z5 = z11;
                z6 = true;
                z7 = true;
                z4 = true;
            }
        } else {
            z4 = false;
            z5 = false;
            z6 = true;
            z7 = true;
        }
        this.eventCallback.e(z12, z13, z6, z7, z4, z5);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@fg.l KeyEvent event) {
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        this.eventCallback.c(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z4 = this.isActive;
        if (z4) {
            b(new w0(start, end));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@fg.m CharSequence text, int newCursorPosition) {
        boolean z4 = this.isActive;
        if (z4) {
            b(new x0(String.valueOf(text), newCursorPosition));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        b(new y0(start, end));
        return true;
    }
}
