package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.x0;

/* compiled from: MessageCompat.java */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f26555a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f26556b = true;

    /* compiled from: MessageCompat.java */
    @x0(22)
    static class a {
        private a() {
        }

        static boolean a(Message message) {
            return message.isAsynchronous();
        }

        static void b(Message message, boolean z4) {
            message.setAsynchronous(z4);
        }
    }

    private t() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@androidx.annotation.o0 Message message) {
        return message.isAsynchronous();
    }

    @SuppressLint({"NewApi"})
    public static void b(@androidx.annotation.o0 Message message, boolean z4) {
        message.setAsynchronous(z4);
    }
}
