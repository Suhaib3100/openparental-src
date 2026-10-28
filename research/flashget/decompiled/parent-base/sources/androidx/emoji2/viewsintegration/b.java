package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.emoji2.text.r;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes3.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f29534a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @b0("INSTANCE_LOCK")
    private static volatile Editable.Factory f29535b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private static Class<?> f29536c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f29536c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f29535b == null) {
            synchronized (f29534a) {
                try {
                    if (f29535b == null) {
                        f29535b = new b();
                    }
                } finally {
                }
            }
        }
        return f29535b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@o0 CharSequence charSequence) {
        Class<?> cls = f29536c;
        return cls != null ? r.f(cls, charSequence) : super.newEditable(charSequence);
    }
}
