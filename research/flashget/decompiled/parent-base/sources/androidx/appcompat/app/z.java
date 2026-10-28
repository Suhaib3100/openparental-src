package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f967a = "ResourcesFlusher";

    /* renamed from: b, reason: collision with root package name */
    private static Field f968b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f969c;

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f970d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f971e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f972f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f973g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f974h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f975i;

    /* compiled from: ResourcesFlusher.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private z() {
    }

    static void a(@o0 Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        d(resources);
    }

    @x0(21)
    private static void b(@o0 Resources resources) {
        Map map;
        if (!f969c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f968b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f969c = true;
        }
        Field field = f968b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    @androidx.annotation.x0(23)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(@androidx.annotation.o0 android.content.res.Resources r3) {
        /*
            boolean r0 = androidx.appcompat.app.z.f969c
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.appcompat.app.z.f968b = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.appcompat.app.z.f969c = r0
        L14:
            java.lang.reflect.Field r0 = androidx.appcompat.app.z.f968b
            if (r0 == 0) goto L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.c(android.content.res.Resources):void");
    }

    @x0(24)
    private static void d(@o0 Resources resources) {
        Object obj;
        if (!f975i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f974h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f975i = true;
        }
        Field field = f974h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f969c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f968b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f969c = true;
        }
        Field field2 = f968b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @x0(16)
    private static void e(@o0 Object obj) {
        LongSparseArray longSparseArray;
        if (!f971e) {
            try {
                f970d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f971e = true;
        }
        Class<?> cls = f970d;
        if (cls == null) {
            return;
        }
        if (!f973g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f972f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f973g = true;
        }
        Field field = f972f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
