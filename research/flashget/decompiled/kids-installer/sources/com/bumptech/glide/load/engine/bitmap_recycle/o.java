package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
@x0(19)
/* loaded from: classes3.dex */
public class o implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final int f11193d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f11194e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f11195f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f11196g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f11197h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bitmap.Config[] f11198i;

    /* renamed from: a, reason: collision with root package name */
    private final c f11199a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final h<b, Bitmap> f11200b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f11201c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11202a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f11202a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11202a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11202a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11202a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    @m1
    static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i5, Bitmap.Config config) {
            b b6 = b();
            b6.b(i5, config);
            return b6;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f11194e = configArr;
        f11195f = configArr;
        f11196g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f11197h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f11198i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j5 = j(bitmap.getConfig());
        Integer num2 = j5.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j5.remove(num);
                return;
            } else {
                j5.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException(ProtectedSandApp.s("Ჷ") + num + ProtectedSandApp.s("Ჸ") + c(bitmap) + ProtectedSandApp.s("Ჹ") + this);
    }

    private b g(int i5, Bitmap.Config config) {
        b e6 = this.f11199a.e(i5, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i5));
            if (ceilingKey != null && ceilingKey.intValue() <= i5 * 8) {
                if (ceilingKey.intValue() == i5) {
                    if (config2 == null) {
                        if (config == null) {
                            return e6;
                        }
                    } else if (config2.equals(config)) {
                        return e6;
                    }
                }
                this.f11199a.c(e6);
                return this.f11199a.e(ceilingKey.intValue(), config2);
            }
        }
        return e6;
    }

    static String h(int i5, Bitmap.Config config) {
        return ProtectedSandApp.s("Ჺ") + i5 + ProtectedSandApp.s("\u1cbb") + config + ProtectedSandApp.s("\u1cbc");
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f11195f;
            }
        }
        int i5 = a.f11202a[config.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? new Bitmap.Config[]{config} : f11198i : f11197h : f11196g : f11194e;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f11201c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11201c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i5, int i6, Bitmap.Config config) {
        return h(com.bumptech.glide.util.n.g(i5, i6, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(com.bumptech.glide.util.n.h(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        b e6 = this.f11199a.e(com.bumptech.glide.util.n.h(bitmap), bitmap.getConfig());
        this.f11200b.d(e6, bitmap);
        NavigableMap<Integer, Integer> j5 = j(bitmap.getConfig());
        Integer num = j5.get(Integer.valueOf(e6.f11204b));
        j5.put(Integer.valueOf(e6.f11204b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap f(int i5, int i6, Bitmap.Config config) {
        b g5 = g(com.bumptech.glide.util.n.g(i5, i6, config), config);
        Bitmap a6 = this.f11200b.a(g5);
        if (a6 != null) {
            e(Integer.valueOf(g5.f11204b), a6);
            a6.reconfigure(i5, i6, config);
        }
        return a6;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap removeLast() {
        Bitmap f6 = this.f11200b.f();
        if (f6 != null) {
            e(Integer.valueOf(com.bumptech.glide.util.n.h(f6)), f6);
        }
        return f6;
    }

    public String toString() {
        StringBuilder a6 = r.a(ProtectedSandApp.s("Ჽ"));
        a6.append(this.f11200b);
        a6.append(ProtectedSandApp.s("Ჾ"));
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f11201c.entrySet()) {
            a6.append(entry.getKey());
            a6.append('[');
            a6.append(entry.getValue());
            a6.append(ProtectedSandApp.s("Ჿ"));
        }
        if (!this.f11201c.isEmpty()) {
            a6.replace(a6.length() - 2, a6.length(), "");
        }
        a6.append(ProtectedSandApp.s("᳀"));
        return a6.toString();
    }

    /* compiled from: SizeConfigStrategy.java */
    @m1
    static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final c f11203a;

        /* renamed from: b, reason: collision with root package name */
        int f11204b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f11205c;

        public b(c cVar) {
            this.f11203a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f11203a.c(this);
        }

        public void b(int i5, Bitmap.Config config) {
            this.f11204b = i5;
            this.f11205c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11204b == bVar.f11204b && com.bumptech.glide.util.n.d(this.f11205c, bVar.f11205c);
        }

        public int hashCode() {
            int i5 = this.f11204b * 31;
            Bitmap.Config config = this.f11205c;
            return i5 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f11204b, this.f11205c);
        }

        @m1
        b(c cVar, int i5, Bitmap.Config config) {
            this(cVar);
            this.f11204b = i5;
            this.f11205c = config;
        }
    }
}
