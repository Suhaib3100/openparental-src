package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.w;
import androidx.emoji2.text.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
@androidx.annotation.d
/* loaded from: classes3.dex */
public class g {
    public static final int A = 1;
    public static final int B = 2;

    @c1({c1.a.LIBRARY})
    static final int C = Integer.MAX_VALUE;

    @q0
    @b0("INSTANCE_LOCK")
    private static volatile g F = null;

    @b0("CONFIG_LOCK")
    private static volatile boolean G = false;

    /* renamed from: q, reason: collision with root package name */
    public static final int f29400q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f29401r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f29402s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f29403t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f29404u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f29405v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f29406w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f29407x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f29408y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f29409z = 0;

    /* renamed from: b, reason: collision with root package name */
    @b0("mInitLock")
    @o0
    private final Set<AbstractC0478g> f29411b;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final c f29414e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    final j f29415f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final m f29416g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f29417h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f29418i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    final int[] f29419j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f29420k;

    /* renamed from: l, reason: collision with root package name */
    private final int f29421l;

    /* renamed from: m, reason: collision with root package name */
    private final int f29422m;

    /* renamed from: n, reason: collision with root package name */
    private final f f29423n;

    /* renamed from: p, reason: collision with root package name */
    public static final String f29399p = "android.support.text.emoji.emojiCompat_replaceAll";
    private static final String H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29398o = "android.support.text.emoji.emojiCompat_metadataVersion";
    private static final Object D = new Object();
    private static final Object E = new Object();

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final ReadWriteLock f29410a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @b0("mInitLock")
    private volatile int f29412c = 3;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final Handler f29413d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: EmojiCompat.java */
    @x0(19)
    private static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.k f29424b;

        /* renamed from: c, reason: collision with root package name */
        private volatile q f29425c;

        /* compiled from: EmojiCompat.java */
        class a extends k {
            a() {
            }

            @Override // androidx.emoji2.text.g.k
            public void a(@q0 Throwable th) {
                b.this.f29427a.v(th);
            }

            @Override // androidx.emoji2.text.g.k
            public void b(@o0 q qVar) {
                b.this.j(qVar);
            }
        }

        b(g gVar) {
            super(gVar);
        }

        @Override // androidx.emoji2.text.g.c
        String a() {
            String N = this.f29425c.g().N();
            return N == null ? "" : N;
        }

        @Override // androidx.emoji2.text.g.c
        int b(@o0 CharSequence charSequence, int i4) {
            return this.f29424b.b(charSequence, i4);
        }

        @Override // androidx.emoji2.text.g.c
        public int c(CharSequence charSequence, int i4) {
            return this.f29424b.d(charSequence, i4);
        }

        @Override // androidx.emoji2.text.g.c
        int d(@o0 CharSequence charSequence, int i4) {
            return this.f29424b.e(charSequence, i4);
        }

        @Override // androidx.emoji2.text.g.c
        boolean e(@o0 CharSequence charSequence) {
            return this.f29424b.c(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.g.c
        boolean f(@o0 CharSequence charSequence, int i4) {
            return this.f29424b.d(charSequence, i4) == 1;
        }

        @Override // androidx.emoji2.text.g.c
        void g() {
            try {
                this.f29427a.f29415f.a(new a());
            } catch (Throwable th) {
                this.f29427a.v(th);
            }
        }

        @Override // androidx.emoji2.text.g.c
        CharSequence h(@o0 CharSequence charSequence, int i4, int i5, int i6, boolean z4) {
            return this.f29424b.l(charSequence, i4, i5, i6, z4);
        }

        @Override // androidx.emoji2.text.g.c
        void i(@o0 EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f29425c.h());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f29427a.f29417h);
        }

        void j(@o0 q qVar) {
            if (qVar == null) {
                this.f29427a.v(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f29425c = qVar;
            q qVar2 = this.f29425c;
            m mVar = this.f29427a.f29416g;
            f fVar = this.f29427a.f29423n;
            g gVar = this.f29427a;
            this.f29424b = new androidx.emoji2.text.k(qVar2, mVar, fVar, gVar.f29418i, gVar.f29419j, androidx.emoji2.text.j.a());
            this.f29427a.w();
        }
    }

    /* compiled from: EmojiCompat.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final g f29427a;

        c(g gVar) {
            this.f29427a = gVar;
        }

        String a() {
            return "";
        }

        int b(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
            return -1;
        }

        public int c(CharSequence charSequence, int i4) {
            return 0;
        }

        int d(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
            return -1;
        }

        boolean e(@o0 CharSequence charSequence) {
            return false;
        }

        boolean f(@o0 CharSequence charSequence, int i4) {
            return false;
        }

        void g() {
            this.f29427a.w();
        }

        CharSequence h(@o0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, @g0(from = 0) int i6, boolean z4) {
            return charSequence;
        }

        void i(@o0 EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @o0
        final j f29428a;

        /* renamed from: b, reason: collision with root package name */
        m f29429b;

        /* renamed from: c, reason: collision with root package name */
        boolean f29430c;

        /* renamed from: d, reason: collision with root package name */
        boolean f29431d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        int[] f29432e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        Set<AbstractC0478g> f29433f;

        /* renamed from: g, reason: collision with root package name */
        boolean f29434g;

        /* renamed from: h, reason: collision with root package name */
        int f29435h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f29436i = 0;

        /* renamed from: j, reason: collision with root package name */
        @o0
        f f29437j = new androidx.emoji2.text.f();

        protected d(@o0 j jVar) {
            w.m(jVar, "metadataLoader cannot be null.");
            this.f29428a = jVar;
        }

        @o0
        protected final j a() {
            return this.f29428a;
        }

        @o0
        public d b(@o0 AbstractC0478g abstractC0478g) {
            w.m(abstractC0478g, "initCallback cannot be null");
            if (this.f29433f == null) {
                this.f29433f = new androidx.collection.d();
            }
            this.f29433f.add(abstractC0478g);
            return this;
        }

        @o0
        public d c(@androidx.annotation.l int i4) {
            this.f29435h = i4;
            return this;
        }

        @o0
        public d d(boolean z4) {
            this.f29434g = z4;
            return this;
        }

        @o0
        public d e(@o0 f fVar) {
            w.m(fVar, "GlyphChecker cannot be null");
            this.f29437j = fVar;
            return this;
        }

        @o0
        public d f(int i4) {
            this.f29436i = i4;
            return this;
        }

        @o0
        public d g(boolean z4) {
            this.f29430c = z4;
            return this;
        }

        @o0
        public d h(@o0 m mVar) {
            this.f29429b = mVar;
            return this;
        }

        @o0
        public d i(boolean z4) {
            return j(z4, null);
        }

        @o0
        public d j(boolean z4, @q0 List<Integer> list) {
            this.f29431d = z4;
            if (!z4 || list == null) {
                this.f29432e = null;
            } else {
                this.f29432e = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    this.f29432e[i4] = it.next().intValue();
                    i4++;
                }
                Arrays.sort(this.f29432e);
            }
            return this;
        }

        @o0
        public d k(@o0 AbstractC0478g abstractC0478g) {
            w.m(abstractC0478g, "initCallback cannot be null");
            Set<AbstractC0478g> set = this.f29433f;
            if (set != null) {
                set.remove(abstractC0478g);
            }
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    @c1({c1.a.LIBRARY})
    public static class e implements m {
        @Override // androidx.emoji2.text.g.m
        @o0
        @x0(19)
        public androidx.emoji2.text.l a(@o0 s sVar) {
            return new t(sVar);
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface f {
        boolean a(@o0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, @g0(from = 0) int i6);
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.g$g, reason: collision with other inner class name */
    public static abstract class AbstractC0478g {
        public void a(@q0 Throwable th) {
        }

        public void b() {
        }
    }

    /* compiled from: EmojiCompat.java */
    private static class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final List<AbstractC0478g> f29438b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f29439c;

        /* renamed from: d, reason: collision with root package name */
        private final int f29440d;

        h(@o0 AbstractC0478g abstractC0478g, int i4) {
            this(Arrays.asList((AbstractC0478g) w.m(abstractC0478g, "initCallback cannot be null")), i4, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f29438b.size();
            int i4 = 0;
            if (this.f29440d != 1) {
                while (i4 < size) {
                    this.f29438b.get(i4).a(this.f29439c);
                    i4++;
                }
            } else {
                while (i4 < size) {
                    this.f29438b.get(i4).b();
                    i4++;
                }
            }
        }

        h(@o0 Collection<AbstractC0478g> collection, int i4) {
            this(collection, i4, null);
        }

        h(@o0 Collection<AbstractC0478g> collection, int i4, @q0 Throwable th) {
            w.m(collection, "initCallbacks cannot be null");
            this.f29438b = new ArrayList(collection);
            this.f29440d = i4;
            this.f29439c = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* compiled from: EmojiCompat.java */
    public interface j {
        void a(@o0 k kVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class k {
        public abstract void a(@q0 Throwable th);

        public abstract void b(@o0 q qVar);
    }

    /* compiled from: EmojiCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    /* compiled from: EmojiCompat.java */
    public interface m {
        @o0
        @x0(19)
        androidx.emoji2.text.l a(@o0 s sVar);
    }

    private g(@o0 d dVar) {
        this.f29417h = dVar.f29430c;
        this.f29418i = dVar.f29431d;
        this.f29419j = dVar.f29432e;
        this.f29420k = dVar.f29434g;
        this.f29421l = dVar.f29435h;
        this.f29415f = dVar.f29428a;
        this.f29422m = dVar.f29436i;
        this.f29423n = dVar.f29437j;
        androidx.collection.d dVar2 = new androidx.collection.d();
        this.f29411b = dVar2;
        m mVar = dVar.f29429b;
        this.f29416g = mVar == null ? new e() : mVar;
        Set<AbstractC0478g> set = dVar.f29433f;
        if (set != null && !set.isEmpty()) {
            dVar2.addAll(dVar.f29433f);
        }
        this.f29414e = new b(this);
        u();
    }

    @o0
    public static g C(@o0 d dVar) {
        g gVar;
        synchronized (D) {
            gVar = new g(dVar);
            F = gVar;
        }
        return gVar;
    }

    @q0
    @c1({c1.a.TESTS})
    public static g D(@q0 g gVar) {
        g gVar2;
        synchronized (D) {
            F = gVar;
            gVar2 = F;
        }
        return gVar2;
    }

    @c1({c1.a.TESTS})
    public static void E(boolean z4) {
        synchronized (E) {
            G = z4;
        }
    }

    @o0
    public static g c() {
        g gVar;
        synchronized (D) {
            gVar = F;
            w.o(gVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return gVar;
    }

    public static boolean j(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i4, @g0(from = 0) int i5, boolean z4) {
        return androidx.emoji2.text.k.f(inputConnection, editable, i4, i5, z4);
    }

    public static boolean k(@o0 Editable editable, int i4, @o0 KeyEvent keyEvent) {
        return androidx.emoji2.text.k.g(editable, i4, keyEvent);
    }

    @q0
    public static g n(@o0 Context context) {
        return o(context, null);
    }

    @q0
    @c1({c1.a.LIBRARY})
    public static g o(@o0 Context context, @q0 e.a aVar) {
        g gVar;
        if (G) {
            return F;
        }
        if (aVar == null) {
            aVar = new e.a(null);
        }
        d c5 = aVar.c(context);
        synchronized (E) {
            try {
                if (!G) {
                    if (c5 != null) {
                        p(c5);
                    }
                    G = true;
                }
                gVar = F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @o0
    public static g p(@o0 d dVar) {
        g gVar = F;
        if (gVar == null) {
            synchronized (D) {
                try {
                    gVar = F;
                    if (gVar == null) {
                        gVar = new g(dVar);
                        F = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static boolean q() {
        return F != null;
    }

    private boolean s() {
        return i() == 1;
    }

    private void u() {
        this.f29410a.writeLock().lock();
        try {
            if (this.f29422m == 0) {
                this.f29412c = 0;
            }
            this.f29410a.writeLock().unlock();
            if (i() == 0) {
                this.f29414e.g();
            }
        } catch (Throwable th) {
            this.f29410a.writeLock().unlock();
            throw th;
        }
    }

    @q0
    @androidx.annotation.j
    public CharSequence A(@q0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, @g0(from = 0) int i6, int i7) {
        boolean z4;
        w.o(s(), "Not initialized yet");
        w.j(i4, "start cannot be negative");
        w.j(i5, "end cannot be negative");
        w.j(i6, "maxEmojiCount cannot be negative");
        w.b(i4 <= i5, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        w.b(i4 <= charSequence.length(), "start should be < than charSequence length");
        w.b(i5 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i4 == i5) {
            return charSequence;
        }
        if (i7 != 1) {
            z4 = i7 != 2 ? this.f29417h : false;
        } else {
            z4 = true;
        }
        return this.f29414e.h(charSequence, i4, i5, i6, z4);
    }

    public void B(@o0 AbstractC0478g abstractC0478g) {
        w.m(abstractC0478g, "initCallback cannot be null");
        this.f29410a.writeLock().lock();
        try {
            if (this.f29412c != 1 && this.f29412c != 2) {
                this.f29411b.add(abstractC0478g);
                this.f29410a.writeLock().unlock();
            }
            this.f29413d.post(new h(abstractC0478g, this.f29412c));
            this.f29410a.writeLock().unlock();
        } catch (Throwable th) {
            this.f29410a.writeLock().unlock();
            throw th;
        }
    }

    public void F(@o0 AbstractC0478g abstractC0478g) {
        w.m(abstractC0478g, "initCallback cannot be null");
        this.f29410a.writeLock().lock();
        try {
            this.f29411b.remove(abstractC0478g);
        } finally {
            this.f29410a.writeLock().unlock();
        }
    }

    public void G(@o0 EditorInfo editorInfo) {
        if (!s() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f29414e.i(editorInfo);
    }

    @o0
    public String d() {
        w.o(s(), "Not initialized yet");
        return this.f29414e.a();
    }

    public int e(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        return this.f29414e.b(charSequence, i4);
    }

    public int f(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        w.o(s(), "Not initialized yet");
        w.m(charSequence, "sequence cannot be null");
        return this.f29414e.c(charSequence, i4);
    }

    @androidx.annotation.l
    @c1({c1.a.LIBRARY_GROUP})
    public int g() {
        return this.f29421l;
    }

    public int h(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        return this.f29414e.d(charSequence, i4);
    }

    public int i() {
        this.f29410a.readLock().lock();
        try {
            return this.f29412c;
        } finally {
            this.f29410a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean l(@o0 CharSequence charSequence) {
        w.o(s(), "Not initialized yet");
        w.m(charSequence, "sequence cannot be null");
        return this.f29414e.e(charSequence);
    }

    @Deprecated
    public boolean m(@o0 CharSequence charSequence, @g0(from = 0) int i4) {
        w.o(s(), "Not initialized yet");
        w.m(charSequence, "sequence cannot be null");
        return this.f29414e.f(charSequence, i4);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean r() {
        return this.f29420k;
    }

    public void t() {
        w.o(this.f29422m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (s()) {
            return;
        }
        this.f29410a.writeLock().lock();
        try {
            if (this.f29412c == 0) {
                return;
            }
            this.f29412c = 0;
            this.f29410a.writeLock().unlock();
            this.f29414e.g();
        } finally {
            this.f29410a.writeLock().unlock();
        }
    }

    void v(@q0 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f29410a.writeLock().lock();
        try {
            this.f29412c = 2;
            arrayList.addAll(this.f29411b);
            this.f29411b.clear();
            this.f29410a.writeLock().unlock();
            this.f29413d.post(new h(arrayList, this.f29412c, th));
        } catch (Throwable th2) {
            this.f29410a.writeLock().unlock();
            throw th2;
        }
    }

    void w() {
        ArrayList arrayList = new ArrayList();
        this.f29410a.writeLock().lock();
        try {
            this.f29412c = 1;
            arrayList.addAll(this.f29411b);
            this.f29411b.clear();
            this.f29410a.writeLock().unlock();
            this.f29413d.post(new h(arrayList, this.f29412c, null));
        } catch (Throwable th) {
            this.f29410a.writeLock().unlock();
            throw th;
        }
    }

    @q0
    @androidx.annotation.j
    public CharSequence x(@q0 CharSequence charSequence) {
        return y(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @q0
    @androidx.annotation.j
    public CharSequence y(@q0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5) {
        return z(charSequence, i4, i5, Integer.MAX_VALUE);
    }

    @q0
    @androidx.annotation.j
    public CharSequence z(@q0 CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, @g0(from = 0) int i6) {
        return A(charSequence, i4, i5, i6, 0);
    }
}
