package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.k;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: GmsRpc.java */
/* loaded from: classes2.dex */
class f0 {
    private static final String A = ProtectedSandApp.s("៦");
    private static final String B = ProtectedSandApp.s("៧");
    private static final String C = ProtectedSandApp.s("៨");
    private static final String D = ProtectedSandApp.s("៩");
    private static final String E = ProtectedSandApp.s("\u17ea");
    private static final String F = ProtectedSandApp.s("\u17eb");
    private static final String G = ProtectedSandApp.s("\u17ec");
    static final String H = ProtectedSandApp.s("\u17ed");
    static final String I = ProtectedSandApp.s("\u17ee");
    static final String J = ProtectedSandApp.s("\u17ef");
    private static final String K = ProtectedSandApp.s("៰");

    /* renamed from: g, reason: collision with root package name */
    static final String f17255g = ProtectedSandApp.s("៱");

    /* renamed from: h, reason: collision with root package name */
    private static final String f17256h = ProtectedSandApp.s("៲");

    /* renamed from: i, reason: collision with root package name */
    private static final String f17257i = ProtectedSandApp.s("៳");

    /* renamed from: j, reason: collision with root package name */
    private static final String f17258j = ProtectedSandApp.s("៴");

    /* renamed from: k, reason: collision with root package name */
    static final String f17259k = ProtectedSandApp.s("៵");

    /* renamed from: l, reason: collision with root package name */
    static final String f17260l = ProtectedSandApp.s("៶");

    /* renamed from: m, reason: collision with root package name */
    static final String f17261m = ProtectedSandApp.s("៷");

    /* renamed from: n, reason: collision with root package name */
    static final String f17262n = ProtectedSandApp.s("៸");

    /* renamed from: o, reason: collision with root package name */
    private static final String f17263o = ProtectedSandApp.s("៹");

    /* renamed from: p, reason: collision with root package name */
    private static final String f17264p = ProtectedSandApp.s("\u17fa");

    /* renamed from: q, reason: collision with root package name */
    static final String f17265q = ProtectedSandApp.s("\u17fb");

    /* renamed from: r, reason: collision with root package name */
    private static final String f17266r = ProtectedSandApp.s("\u17fc");

    /* renamed from: s, reason: collision with root package name */
    private static final String f17267s = ProtectedSandApp.s("\u17fd");

    /* renamed from: t, reason: collision with root package name */
    private static final String f17268t = ProtectedSandApp.s("\u17fe");

    /* renamed from: u, reason: collision with root package name */
    private static final String f17269u = ProtectedSandApp.s("\u17ff");

    /* renamed from: v, reason: collision with root package name */
    private static final String f17270v = ProtectedSandApp.s("᠀");

    /* renamed from: w, reason: collision with root package name */
    private static final String f17271w = ProtectedSandApp.s("᠁");

    /* renamed from: x, reason: collision with root package name */
    private static final String f17272x = ProtectedSandApp.s("᠂");

    /* renamed from: y, reason: collision with root package name */
    private static final String f17273y = ProtectedSandApp.s("᠃");

    /* renamed from: z, reason: collision with root package name */
    private static final String f17274z = ProtectedSandApp.s("᠄");

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f17275a;

    /* renamed from: b, reason: collision with root package name */
    private final k0 f17276b;

    /* renamed from: c, reason: collision with root package name */
    private final Rpc f17277c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.b<com.google.firebase.platforminfo.i> f17278d;

    /* renamed from: e, reason: collision with root package name */
    private final o2.b<com.google.firebase.heartbeatinfo.k> f17279e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.k f17280f;

    f0(com.google.firebase.g gVar, k0 k0Var, o2.b<com.google.firebase.platforminfo.i> bVar, o2.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this(gVar, k0Var, new Rpc(gVar.n()), bVar, bVar2, kVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(new h(), new Continuation() { // from class: com.google.firebase.messaging.e0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String i5;
                i5 = f0.this.i(task2);
                return i5;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance(ProtectedSandApp.s("េ")).digest(this.f17275a.r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return ProtectedSandApp.s("ែ");
        }
    }

    @androidx.annotation.d
    private String g(Bundle bundle) throws IOException {
        String s5 = ProtectedSandApp.s("ៃ");
        if (bundle == null) {
            throw new IOException(s5);
        }
        String string = bundle.getString(ProtectedSandApp.s("ោ"));
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(ProtectedSandApp.s("ៅ"));
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(ProtectedSandApp.s("ំ"));
        if (ProtectedSandApp.s("ះ").equals(string3)) {
            throw new IOException(ProtectedSandApp.s("ៈ"));
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException(s5);
    }

    static boolean h(String str) {
        return ProtectedSandApp.s("៉").equals(str) || ProtectedSandApp.s("៊").equals(str) || ProtectedSandApp.s("់").equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(Task task) throws Exception {
        return g((Bundle) task.getResult(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        k.a b6;
        bundle.putString(ProtectedSandApp.s("៌"), str2);
        bundle.putString(ProtectedSandApp.s("៍"), str);
        bundle.putString(ProtectedSandApp.s("៎"), str);
        bundle.putString(ProtectedSandApp.s("៏"), this.f17275a.s().j());
        bundle.putString(ProtectedSandApp.s("័"), Integer.toString(this.f17276b.d()));
        bundle.putString(ProtectedSandApp.s("៑"), Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(ProtectedSandApp.s("្"), this.f17276b.a());
        bundle.putString(ProtectedSandApp.s("៓"), this.f17276b.b());
        bundle.putString(ProtectedSandApp.s("។"), e());
        try {
            String b7 = ((com.google.firebase.installations.o) Tasks.await(this.f17280f.a(false))).b();
            if (!TextUtils.isEmpty(b7)) {
                bundle.putString(ProtectedSandApp.s("៕"), b7);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString(ProtectedSandApp.s("៖"), (String) Tasks.await(this.f17280f.getId()));
        bundle.putString(ProtectedSandApp.s("ៗ"), ProtectedSandApp.s("៘"));
        com.google.firebase.heartbeatinfo.k kVar = this.f17279e.get();
        com.google.firebase.platforminfo.i iVar = this.f17278d.get();
        if (kVar == null || iVar == null || (b6 = kVar.b(ProtectedSandApp.s("៙"))) == k.a.NONE) {
            return;
        }
        bundle.putString(ProtectedSandApp.s("៚"), Integer.toString(b6.getCode()));
        bundle.putString(ProtectedSandApp.s("៛"), iVar.a());
    }

    private Task<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f17277c.send(bundle);
        } catch (InterruptedException | ExecutionException e6) {
            return Tasks.forException(e6);
        }
    }

    Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("ៜ"), ProtectedSandApp.s("៝"));
        return d(k(k0.c(this.f17275a), ProtectedSandApp.s("\u17de"), bundle));
    }

    Task<String> f() {
        return d(k(k0.c(this.f17275a), ProtectedSandApp.s("\u17df"), new Bundle()));
    }

    Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        String s5 = ProtectedSandApp.s("០");
        bundle.putString(ProtectedSandApp.s("១"), s5 + str2);
        return d(k(str, s5 + str2, bundle));
    }

    Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        String s5 = ProtectedSandApp.s("២");
        bundle.putString(ProtectedSandApp.s("៣"), s5 + str2);
        bundle.putString(ProtectedSandApp.s("៤"), ProtectedSandApp.s("៥"));
        return d(k(str, s5 + str2, bundle));
    }

    @androidx.annotation.m1
    f0(com.google.firebase.g gVar, k0 k0Var, Rpc rpc, o2.b<com.google.firebase.platforminfo.i> bVar, o2.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this.f17275a = gVar;
        this.f17276b = k0Var;
        this.f17277c = rpc;
        this.f17278d = bVar;
        this.f17279e = bVar2;
        this.f17280f = kVar;
    }
}
