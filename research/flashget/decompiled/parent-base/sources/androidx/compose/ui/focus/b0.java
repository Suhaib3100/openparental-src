package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusRequester.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0001\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"", "a", "Ljava/lang/String;", "()V", "FocusRequesterNotInitialized", "b", "InvalidFocusRequesterInvocation", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f17521a = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f17522b = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }
}
