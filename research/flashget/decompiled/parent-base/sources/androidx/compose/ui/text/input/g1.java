package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.f0;
import androidx.compose.ui.text.input.g0;
import androidx.compose.ui.text.input.y;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Lkotlin/k2;", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Landroidx/compose/ui/text/input/z0;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/z;Landroidx/compose/ui/text/input/z0;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "", "a", "Ljava/lang/String;", "DEBUG_CLASS", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f21035a = "TextInputServiceAndroid";

    public static void a(Runnable runnable, long j4) {
        runnable.run();
    }

    @fg.l
    public static final Executor d(@fg.l Choreographer choreographer) {
        return new f1(choreographer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.e1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                runnable.run();
            }
        });
    }

    private static final void f(Runnable runnable, long j4) {
        runnable.run();
    }

    private static final boolean g(int i4, int i5) {
        return (i4 & i5) == i5;
    }

    public static final void h(@fg.l EditorInfo editorInfo, @fg.l z zVar, @fg.l z0 z0Var) {
        String privateImeOptions;
        int imeAction = zVar.getImeAction();
        y.Companion companion = y.INSTANCE;
        companion.getClass();
        int i4 = 6;
        if (!y.l(imeAction, y.f21131c)) {
            companion.getClass();
            if (y.l(imeAction, y.f21132d)) {
                i4 = 1;
            } else {
                companion.getClass();
                if (y.l(imeAction, y.f21133e)) {
                    i4 = 2;
                } else {
                    companion.getClass();
                    if (y.l(imeAction, y.f21137i)) {
                        i4 = 5;
                    } else {
                        companion.getClass();
                        if (y.l(imeAction, y.f21136h)) {
                            i4 = 7;
                        } else {
                            companion.getClass();
                            if (y.l(imeAction, y.f21134f)) {
                                i4 = 3;
                            } else {
                                companion.getClass();
                                if (y.l(imeAction, y.f21135g)) {
                                    i4 = 4;
                                } else {
                                    companion.getClass();
                                    if (!y.l(imeAction, y.f21138j)) {
                                        throw new IllegalStateException("invalid ImeAction");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (!zVar.getSingleLine()) {
            i4 = 0;
        }
        editorInfo.imeOptions = i4;
        s0 platformImeOptions = zVar.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = zVar.getKeyboardType();
        g0.Companion companion2 = g0.INSTANCE;
        companion2.getClass();
        if (g0.m(keyboardType, g0.f21025c)) {
            editorInfo.inputType = 1;
        } else {
            companion2.getClass();
            if (g0.m(keyboardType, g0.f21026d)) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else {
                companion2.getClass();
                if (g0.m(keyboardType, g0.f21027e)) {
                    editorInfo.inputType = 2;
                } else {
                    companion2.getClass();
                    if (g0.m(keyboardType, g0.f21028f)) {
                        editorInfo.inputType = 3;
                    } else {
                        companion2.getClass();
                        if (g0.m(keyboardType, g0.f21029g)) {
                            editorInfo.inputType = 17;
                        } else {
                            companion2.getClass();
                            if (g0.m(keyboardType, g0.f21030h)) {
                                editorInfo.inputType = 33;
                            } else {
                                companion2.getClass();
                                if (g0.m(keyboardType, g0.f21031i)) {
                                    editorInfo.inputType = 129;
                                } else {
                                    companion2.getClass();
                                    if (g0.m(keyboardType, g0.f21032j)) {
                                        editorInfo.inputType = 18;
                                    } else {
                                        companion2.getClass();
                                        if (!g0.m(keyboardType, g0.f21033k)) {
                                            throw new IllegalStateException("Invalid Keyboard Type");
                                        }
                                        editorInfo.inputType = 8194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!zVar.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            int imeAction2 = zVar.getImeAction();
            companion.getClass();
            if (y.l(imeAction2, y.f21131c)) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = zVar.getCapitalization();
            f0.Companion companion3 = f0.INSTANCE;
            companion3.getClass();
            if (f0.h(capitalization, f0.f21019d)) {
                editorInfo.inputType |= 4096;
            } else {
                companion3.getClass();
                if (f0.h(capitalization, f0.f21020e)) {
                    editorInfo.inputType |= 8192;
                } else {
                    companion3.getClass();
                    if (f0.h(capitalization, f0.f21021f)) {
                        editorInfo.inputType |= 16384;
                    }
                }
            }
            if (zVar.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.t0.n(z0Var.getSelection());
        editorInfo.initialSelEnd = (int) (z0Var.getSelection() & 4294967295L);
        androidx.core.view.inputmethod.c.k(editorInfo, z0Var.i());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.g.q()) {
            androidx.emoji2.text.g.c().G(editorInfo);
        }
    }
}
