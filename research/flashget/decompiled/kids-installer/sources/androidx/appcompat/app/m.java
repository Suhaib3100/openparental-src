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
class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f377a = "ResourcesFlusher";

    /* renamed from: b, reason: collision with root package name */
    private static Field f378b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f379c;

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f380d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f381e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f382f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f383g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f384h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f385i;

    private m() {
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
        if (!f379c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f378b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f379c = true;
        }
        Field field = f378b;
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
            boolean r0 = androidx.appcompat.app.m.f379c
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.appcompat.app.m.f378b = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.appcompat.app.m.f379c = r0
        L14:
            java.lang.reflect.Field r0 = androidx.appcompat.app.m.f378b
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.m.c(android.content.res.Resources):void");
    }

    @x0(24)
    private static void d(@o0 Resources resources) {
        Object obj;
        if (!f385i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f384h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f385i = true;
        }
        Field field = f384h;
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
        if (!f379c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f378b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f379c = true;
        }
        Field field2 = f378b;
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
        if (!f381e) {
            try {
                f380d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f381e = true;
        }
        Class<?> cls = f380d;
        if (cls == null) {
            return;
        }
        if (!f383g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f382f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f383g = true;
        }
        Field field = f382f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
