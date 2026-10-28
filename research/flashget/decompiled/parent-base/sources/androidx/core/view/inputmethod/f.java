package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.r;
import androidx.core.view.e;
import androidx.core.view.x1;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f27258p = 1;

    /* renamed from: a, reason: collision with root package name */
    private static final String f27243a = "InputConnectionCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final String f27244b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c, reason: collision with root package name */
    private static final String f27245c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d, reason: collision with root package name */
    private static final String f27246d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f27247e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f, reason: collision with root package name */
    private static final String f27248f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g, reason: collision with root package name */
    private static final String f27249g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h, reason: collision with root package name */
    private static final String f27250h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i, reason: collision with root package name */
    private static final String f27251i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j, reason: collision with root package name */
    private static final String f27252j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f27253k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l, reason: collision with root package name */
    private static final String f27254l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m, reason: collision with root package name */
    private static final String f27255m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n, reason: collision with root package name */
    private static final String f27256n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o, reason: collision with root package name */
    private static final String f27257o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: q, reason: collision with root package name */
    private static final String f27259q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* compiled from: InputConnectionCompat.java */
    class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f27260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z4, d dVar) {
            super(inputConnection, z4);
            this.f27260a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            if (this.f27260a.a(g.g(inputContentInfo), i4, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i4, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    class b extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f27261a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z4, d dVar) {
            super(inputConnection, z4);
            this.f27261a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (f.f(str, bundle, this.f27261a)) {
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

        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i4, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    public interface d {
        boolean a(@o0 g gVar, int i4, @q0 Bundle bundle);
    }

    @Deprecated
    public f() {
    }

    public static boolean b(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 g gVar, int i4, @q0 Bundle bundle) {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, androidx.core.view.inputmethod.d.a(gVar.f()), i4, bundle);
        }
        int e4 = androidx.core.view.inputmethod.c.e(editorInfo);
        if (e4 != 2) {
            z4 = false;
            if (e4 != 3 && e4 != 4) {
                return false;
            }
        } else {
            z4 = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", gVar.a());
        bundle2.putParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", gVar.b());
        bundle2.putParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", gVar.c());
        bundle2.putInt(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i4);
        bundle2.putParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", bundle);
        return inputConnection.performPrivateCommand(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle2);
    }

    @o0
    private static d c(@o0 final View view) {
        view.getClass();
        return new d() { // from class: androidx.core.view.inputmethod.e
            @Override // androidx.core.view.inputmethod.f.d
            public final boolean a(g gVar, int i4, Bundle bundle) {
                boolean g4;
                g4 = f.g(view, gVar, i4, bundle);
                return g4;
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
        r.e(inputConnection, "inputConnection must be non-null");
        r.e(editorInfo, "editorInfo must be non-null");
        r.e(dVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, dVar) : androidx.core.view.inputmethod.c.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean f(@q0 String str, @q0 Bundle bundle, @o0 d dVar) {
        boolean z4;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z4 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z4 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i4 = bundle.getInt(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z4 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    r02 = dVar.a(new g(uri, clipDescription, uri2), i4, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(r02, null);
                }
                return r02;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(View view, g gVar, int i4, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i4 & 1) != 0) {
            try {
                gVar.e();
                Parcelable parcelable = (Parcelable) gVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return x1.s1(view, new e.b(new ClipData(gVar.b(), new ClipData.Item(gVar.a())), 2).e(gVar.c()).c(bundle).a()) == null;
    }
}
