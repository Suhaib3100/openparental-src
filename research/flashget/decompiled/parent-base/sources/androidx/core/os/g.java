package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.x0;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: ConfigurationCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(@androidx.annotation.o0 Configuration configuration, @androidx.annotation.o0 p pVar) {
            configuration.setLocales((LocaleList) pVar.n());
        }
    }

    private g() {
    }

    @androidx.annotation.o0
    public static p a(@androidx.annotation.o0 Configuration configuration) {
        return p.o(configuration.getLocales());
    }

    public static void b(@androidx.annotation.o0 Configuration configuration, @androidx.annotation.o0 p pVar) {
        a.b(configuration, pVar);
    }
}
