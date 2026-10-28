package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: ConfigurationCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private d() {
    }

    @o0
    public static l a(@o0 Configuration configuration) {
        return l.n(a.a(configuration));
    }
}
