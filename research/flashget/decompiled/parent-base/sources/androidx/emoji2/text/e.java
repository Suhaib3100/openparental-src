package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.w;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: DefaultEmojiCompatConfig.java */
    @c1({c1.a.LIBRARY})
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        @o0
        private static final String f29273b = "emoji2.text.DefaultEmojiConfig";

        /* renamed from: c, reason: collision with root package name */
        @o0
        private static final String f29274c = "androidx.content.action.LOAD_EMOJI_FONT";

        /* renamed from: d, reason: collision with root package name */
        @o0
        private static final String f29275d = "emojicompat-emoji-font";

        /* renamed from: a, reason: collision with root package name */
        private final b f29276a;

        @c1({c1.a.LIBRARY})
        public a(@q0 b bVar) {
            this.f29276a = bVar == null ? e() : bVar;
        }

        @q0
        private g.d a(@o0 Context context, @q0 androidx.core.provider.g gVar) {
            if (gVar == null) {
                return null;
            }
            return new m(context, gVar);
        }

        @o0
        private List<List<byte[]>> b(@o0 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @o0
        private androidx.core.provider.g d(@o0 ProviderInfo providerInfo, @o0 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.g(str, str2, "emojicompat-emoji-font", b(this.f29276a.b(packageManager, str2)));
        }

        @o0
        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        private boolean f(@q0 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @q0
        private ProviderInfo g(@o0 PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f29276a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a5 = this.f29276a.a(it.next());
                if (f(a5)) {
                    return a5;
                }
            }
            return null;
        }

        @q0
        @c1({c1.a.LIBRARY})
        public g.d c(@o0 Context context) {
            return a(context, h(context));
        }

        @q0
        @c1({c1.a.LIBRARY})
        @m1
        androidx.core.provider.g h(@o0 Context context) {
            PackageManager packageManager = context.getPackageManager();
            w.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g4 = g(packageManager);
            if (g4 == null) {
                return null;
            }
            try {
                return d(g4, packageManager);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
                return null;
            }
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @c1({c1.a.LIBRARY})
    public static class b {
        @q0
        public ProviderInfo a(@o0 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @o0
        public Signature[] b(@o0 PackageManager packageManager, @o0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @o0
        public List<ResolveInfo> c(@o0 PackageManager packageManager, @o0 Intent intent, int i4) {
            return Collections.emptyList();
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @c1({c1.a.LIBRARY})
    @x0(19)
    public static class c extends b {
        @Override // androidx.emoji2.text.e.b
        @q0
        public ProviderInfo a(@o0 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.e.b
        @o0
        public List<ResolveInfo> c(@o0 PackageManager packageManager, @o0 Intent intent, int i4) {
            return packageManager.queryIntentContentProviders(intent, i4);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @c1({c1.a.LIBRARY})
    @x0(28)
    public static class d extends c {
        @Override // androidx.emoji2.text.e.b
        @o0
        public Signature[] b(@o0 PackageManager packageManager, @o0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private e() {
    }

    @q0
    public static m a(@o0 Context context) {
        return (m) new a(null).c(context);
    }
}
