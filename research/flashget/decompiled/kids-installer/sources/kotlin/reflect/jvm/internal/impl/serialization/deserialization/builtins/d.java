package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.l0;

/* compiled from: BuiltInsResourceLoader.kt */
/* loaded from: classes5.dex */
public final class d {
    @e
    public final InputStream a(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("厑"));
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
