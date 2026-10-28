package org.minidns.dane;

import android.support.v4.media.d;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: X509TrustManagerUtil.java */
/* loaded from: classes4.dex */
public class c {
    public static X509TrustManager a() {
        return b(null);
    }

    public static X509TrustManager b(KeyStore keyStore) {
        String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new AssertionError(d.a("No trust manager for the default algorithm ", defaultAlgorithm, " found"));
        } catch (KeyStoreException | NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }
}
