package androidx.compose.foundation.text2.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.annotation.m1;
import androidx.compose.ui.text.t0;
import kotlin.Metadata;

/* compiled from: StatelessInputConnection.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "Landroid/view/inputmethod/ExtractedText;", "c", "(Landroidx/compose/foundation/text2/input/q;)Landroid/view/inputmethod/ExtractedText;", "", "a", "Z", "b", "()V", "SIC_DEBUG", "", "Ljava/lang/String;", "TAG", "DEBUG_CLASS", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f9002a = false;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f9003b = "StatelessIC";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f9004c = "StatelessInputConnection";

    @m1
    public static /* synthetic */ void b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText c(androidx.compose.foundation.text2.input.q qVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = qVar;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = qVar.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = t0.l(qVar.getSelectionInChars());
        extractedText.selectionEnd = t0.k(qVar.getSelectionInChars());
        extractedText.flags = !kotlin.text.v.S2(qVar, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
