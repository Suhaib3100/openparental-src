package com.tencent.beacon.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.util.h;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* compiled from: BeaconProperties.java */
/* loaded from: classes6.dex */
public class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f71118a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71119b;

    /* renamed from: c, reason: collision with root package name */
    private g f71120c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferencesEditorC0995a f71121d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f71122e;

    /* compiled from: BeaconProperties.java */
    /* renamed from: com.tencent.beacon.a.d.a$a, reason: collision with other inner class name */
    public static class SharedPreferencesEditorC0995a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private g f71123a;

        SharedPreferencesEditorC0995a(g gVar) {
            this.f71123a = gVar;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f71123a.a();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(@o0 String str, boolean z4) {
            this.f71123a.b(str, Boolean.valueOf(z4));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(@o0 String str, float f4) {
            this.f71123a.b(str, Float.valueOf(f4));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(@o0 String str, int i4) {
            this.f71123a.b(str, Integer.valueOf(i4));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(@o0 String str, long j4) {
            this.f71123a.b(str, Long.valueOf(j4));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(@o0 String str, @o0 String str2) {
            this.f71123a.b(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(@o0 String str, @o0 Set<String> set) {
            this.f71123a.b(str, (Set) set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f71123a.b(str);
            return this;
        }
    }

    private a() {
    }

    public static a a() {
        if (f71118a == null) {
            synchronized (a.class) {
                try {
                    if (f71118a == null) {
                        f71118a = new a();
                    }
                } finally {
                }
            }
        }
        return f71118a;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f71120c.a(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f71120c.b();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@o0 String str, boolean z4) {
        Object a5 = a(str, Boolean.valueOf(z4));
        return a5 instanceof Boolean ? ((Boolean) a5).booleanValue() : z4;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@o0 String str, float f4) {
        Object a5 = a(str, Float.valueOf(f4));
        return a5 instanceof Number ? ((Number) a5).floatValue() : f4;
    }

    @Override // android.content.SharedPreferences
    public int getInt(@o0 String str, int i4) {
        Object a5 = a(str, Integer.valueOf(i4));
        return a5 instanceof Number ? ((Number) a5).intValue() : i4;
    }

    @Override // android.content.SharedPreferences
    public long getLong(@o0 String str, long j4) {
        Object a5 = a(str, Long.valueOf(j4));
        return a5 instanceof Number ? ((Number) a5).longValue() : j4;
    }

    @Override // android.content.SharedPreferences
    public String getString(@o0 String str, @o0 String str2) {
        Object a5 = a(str, str2);
        return a5 instanceof String ? (String) a5 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(@o0 String str, @q0 Set<String> set) {
        return !this.f71119b ? set : this.f71120c.a(str, (Set) set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public SharedPreferencesEditorC0995a edit() {
        if (!this.f71119b) {
            h.a(ProtectedSandApp.s("む\u0001"));
            a(com.tencent.beacon.a.c.c.c().b());
        }
        return this.f71121d;
    }

    public synchronized void a(Context context) {
        String s4 = ProtectedSandApp.s("ぽ\u0001");
        synchronized (this) {
            if (this.f71119b || context == null) {
                return;
            }
            try {
                g a5 = g.a(context, s4 + com.tencent.beacon.a.c.b.c(context).replace(context.getPackageName(), ""));
                this.f71120c = a5;
                this.f71121d = new SharedPreferencesEditorC0995a(a5);
                this.f71119b = true;
            } catch (IOException e4) {
                com.tencent.beacon.base.util.c.a(e4);
                j.e().a(ProtectedSandApp.s("ま\u0001"), ProtectedSandApp.s("み\u0001"), e4);
                this.f71119b = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> Object a(@o0 String str, T t4) {
        if (!this.f71119b) {
            return t4;
        }
        Object a5 = this.f71120c.a(str, (String) t4);
        if (a5 == null || a5 == t4) {
            Context b5 = com.tencent.beacon.a.c.c.c().b();
            if (this.f71122e == null) {
                this.f71122e = b5.getSharedPreferences(ProtectedSandApp.s("ぼ\u0001"), 0);
            }
            if (t4 instanceof Boolean) {
                a5 = Boolean.valueOf(this.f71122e.getBoolean(str, ((Boolean) t4).booleanValue()));
            } else if (t4 instanceof String) {
                a5 = this.f71122e.getString(str, (String) t4);
            } else if (t4 instanceof Integer) {
                a5 = Integer.valueOf(this.f71122e.getInt(str, ((Integer) t4).intValue()));
            } else if (t4 instanceof Long) {
                a5 = Long.valueOf(this.f71122e.getLong(str, ((Long) t4).longValue()));
            } else if (t4 instanceof Float) {
                a5 = Float.valueOf(this.f71122e.getFloat(str, ((Float) t4).floatValue()));
            }
            if (a5 != null && a5 != t4) {
                this.f71120c.b(str, a5);
            }
        }
        return a5 == null ? t4 : a5;
    }
}
