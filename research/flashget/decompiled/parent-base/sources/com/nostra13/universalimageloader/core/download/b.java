package com.nostra13.universalimageloader.core.download;

import android.support.v4.media.c;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: ImageDownloader.java */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: ImageDownloader.java */
    public enum a {
        HTTP(ProtectedSandApp.s("᩻\u0001")),
        HTTPS(ProtectedSandApp.s("\u1a7d\u0001")),
        FILE(ProtectedSandApp.s("᩿\u0001")),
        CONTENT(ProtectedSandApp.s("᪁\u0001")),
        ASSETS(ProtectedSandApp.s("᪃\u0001")),
        DRAWABLE(ProtectedSandApp.s("᪅\u0001")),
        UNKNOWN("");

        private String scheme;
        private String uriPrefix;

        a(String str) {
            this.scheme = str;
            this.uriPrefix = j.a(str, ProtectedSandApp.s("᪈\u0001"));
        }

        private boolean belongsTo(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.uriPrefix);
        }

        public static a ofUri(String str) {
            if (str != null) {
                for (a aVar : values()) {
                    if (aVar.belongsTo(str)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        public String crop(String str) {
            if (belongsTo(str)) {
                return str.substring(this.uriPrefix.length());
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("᪉\u0001"), str, this.scheme));
        }

        public String wrap(String str) {
            return c.a(new StringBuilder(), this.uriPrefix, str);
        }
    }

    InputStream a(String str, Object obj) throws IOException;
}
