package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.core.view.g;
import androidx.core.view.y1;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: p, reason: collision with root package name */
    public static final int f5576p = 1;

    /* renamed from: a, reason: collision with root package name */
    private static final String f5561a = "InputConnectionCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final String f5562b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c, reason: collision with root package name */
    private static final String f5563c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d, reason: collision with root package name */
    private static final String f5564d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f5565e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f, reason: collision with root package name */
    private static final String f5566f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g, reason: collision with root package name */
    private static final String f5567g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h, reason: collision with root package name */
    private static final String f5568h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i, reason: collision with root package name */
    private static final String f5569i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j, reason: collision with root package name */
    private static final String f5570j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f5571k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l, reason: collision with root package name */
    private static final String f5572l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m, reason: collision with root package name */
    private static final String f5573m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n, reason: collision with root package name */
    private static final String f5574n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o, reason: collision with root package name */
    private static final String f5575o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: q, reason: collision with root package name */
    private static final String f5577q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* compiled from: InputConnectionCompat.java */
    class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f5578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z5, d dVar) {
            super(inputConnection, z5);
            this.f5578a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
            if (this.f5578a.a(p.g(inputContentInfo), i5, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i5, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    class b extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f5579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z5, d dVar) {
            super(inputConnection, z5);
            this.f5579a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (i.f(str, bundle, this.f5579a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    @x0(25)
    static class c {
        private c() {
        }

        @u
        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i5, Bundle bundle) {
            boolean commitContent;
            commitContent = inputConnection.commitContent(inputContentInfo, i5, bundle);
            return commitContent;
        }
    }

    /* compiled from: InputConnectionCompat.java */
    public interface d {
        boolean a(@o0 p pVar, int i5, @q0 Bundle bundle);
    }

    @Deprecated
    public i() {
    }

    public static boolean b(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 p pVar, int i5, @q0 Bundle bundle) {
        boolean z5;
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, (InputContentInfo) pVar.f(), i5, bundle);
        }
        int e6 = g.e(editorInfo);
        if (e6 != 2) {
            z5 = false;
            if (e6 != 3 && e6 != 4) {
                return false;
            }
        } else {
            z5 = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", pVar.a());
        bundle2.putParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", pVar.b());
        bundle2.putParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", pVar.c());
        bundle2.putInt(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i5);
        bundle2.putParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", bundle);
        return inputConnection.performPrivateCommand(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle2);
    }

    @o0
    private static d c(@o0 final View view) {
        view.getClass();
        return new d() { // from class: androidx.core.view.inputmethod.h
            @Override // androidx.core.view.inputmethod.i.d
            public final boolean a(p pVar, int i5, Bundle bundle) {
                boolean g5;
                g5 = i.g(view, pVar, i5, bundle);
                return g5;
            }
        };
    }

    @o0
    public static InputConnection d(@o0 View view, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @o0
    @Deprecated
    public static InputConnection e(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 d dVar) {
        androidx.core.util.l.e(inputConnection, "inputConnection must be non-null");
        androidx.core.util.l.e(editorInfo, "editorInfo must be non-null");
        androidx.core.util.l.e(dVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, dVar) : g.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean f(@q0 String str, @q0 Bundle bundle, @o0 d dVar) {
        boolean z5;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z5 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z5 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i5 = bundle.getInt(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    r02 = dVar.a(new p(uri, clipDescription, uri2), i5, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r02, null);
                }
                return r02;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(View view, p pVar, int i5, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i5 & 1) != 0) {
            try {
                pVar.e();
                InputContentInfo inputContentInfo = (InputContentInfo) pVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        return y1.m1(view, new g.b(new ClipData(pVar.b(), new ClipData.Item(pVar.a())), 2).e(pVar.c()).c(bundle).a()) == null;
    }
}
