package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
    private static final int f43901d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f43902e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f43903f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f43904g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f43905h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bitmap.Config[] f43906i;

    /* renamed from: a, reason: collision with root package name */
    private final c f43907a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final h<b, Bitmap> f43908b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f43909c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43910a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f43910a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43910a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43910a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43910a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
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

        public b e(int i4, Bitmap.Config config) {
            b b5 = b();
            b5.b(i4, config);
            return b5;
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
        f43902e = configArr;
        f43903f = configArr;
        f43904g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f43905h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f43906i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void d(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j4 = j(bitmap.getConfig());
        Integer num2 = j4.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j4.remove(num);
                return;
            } else {
                j4.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException(ProtectedSandApp.s("ࢴ") + num + ProtectedSandApp.s("ࢵ") + a(bitmap) + ProtectedSandApp.s("ࢶ") + this);
    }

    private b g(int i4, Bitmap.Config config) {
        b e4 = this.f43907a.e(i4, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i4));
            if (ceilingKey != null && ceilingKey.intValue() <= i4 * 8) {
                if (ceilingKey.intValue() == i4) {
                    if (config2 == null) {
                        if (config == null) {
                            return e4;
                        }
                    } else if (config2.equals(config)) {
                        return e4;
                    }
                }
                this.f43907a.c(e4);
                return this.f43907a.e(ceilingKey.intValue(), config2);
            }
        }
        return e4;
    }

    static String h(int i4, Bitmap.Config config) {
        return ProtectedSandApp.s("ࢷ") + i4 + ProtectedSandApp.s("ࢸ") + config + ProtectedSandApp.s("ࢹ");
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f43903f;
            }
        }
        int i4 = a.f43910a[config.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : f43906i : f43905h : f43904g : f43902e;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f43909c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f43909c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(Bitmap bitmap) {
        return h(com.bumptech.glide.util.o.i(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String b(int i4, int i5, Bitmap.Config config) {
        return h(com.bumptech.glide.util.o.h(i4, i5, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int c(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        b e4 = this.f43907a.e(com.bumptech.glide.util.o.i(bitmap), bitmap.getConfig());
        this.f43908b.d(e4, bitmap);
        NavigableMap<Integer, Integer> j4 = j(bitmap.getConfig());
        Integer num = j4.get(Integer.valueOf(e4.f43912b));
        j4.put(Integer.valueOf(e4.f43912b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        b g4 = g(com.bumptech.glide.util.o.h(i4, i5, config), config);
        Bitmap a5 = this.f43908b.a(g4);
        if (a5 != null) {
            d(Integer.valueOf(g4.f43912b), a5);
            a5.reconfigure(i4, i5, config);
        }
        return a5;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap removeLast() {
        Bitmap f4 = this.f43908b.f();
        if (f4 != null) {
            d(Integer.valueOf(com.bumptech.glide.util.o.i(f4)), f4);
        }
        return f4;
    }

    public String toString() {
        StringBuilder a5 = j4.a(ProtectedSandApp.s("ࢺ"));
        a5.append(this.f43908b);
        a5.append(ProtectedSandApp.s("ࢻ"));
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f43909c.entrySet()) {
            a5.append(entry.getKey());
            a5.append('[');
            a5.append(entry.getValue());
            a5.append(ProtectedSandApp.s("ࢼ"));
        }
        if (!this.f43909c.isEmpty()) {
            a5.replace(a5.length() - 2, a5.length(), "");
        }
        a5.append(ProtectedSandApp.s("ࢽ"));
        return a5.toString();
    }

    /* compiled from: SizeConfigStrategy.java */
    @m1
    static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final c f43911a;

        /* renamed from: b, reason: collision with root package name */
        int f43912b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f43913c;

        public b(c cVar) {
            this.f43911a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f43911a.c(this);
        }

        public void b(int i4, Bitmap.Config config) {
            this.f43912b = i4;
            this.f43913c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f43912b == bVar.f43912b && com.bumptech.glide.util.o.e(this.f43913c, bVar.f43913c);
        }

        public int hashCode() {
            int i4 = this.f43912b * 31;
            Bitmap.Config config = this.f43913c;
            return i4 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f43912b, this.f43913c);
        }

        @m1
        b(c cVar, int i4, Bitmap.Config config) {
            this(cVar);
            this.f43912b = i4;
            this.f43913c = config;
        }
    }
}
