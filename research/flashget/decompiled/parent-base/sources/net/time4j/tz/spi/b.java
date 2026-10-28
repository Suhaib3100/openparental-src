package net.time4j.tz.spi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import net.time4j.tz.k;

/* compiled from: WinZoneID.java */
/* loaded from: classes7.dex */
final class b implements k, Serializable {
    private static final long serialVersionUID = -4077231634935102213L;

    /* renamed from: id, reason: collision with root package name */
    private final String f83659id;

    b(String str) {
        a(str);
        this.f83659id = str;
    }

    private static void a(String str) {
        if (!str.startsWith(ProtectedSandApp.s("鷂\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鷃\u0001").concat(str));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(this.f83659id);
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        return this.f83659id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f83659id.equals(((b) obj).f83659id);
        }
        return false;
    }

    public int hashCode() {
        return this.f83659id.hashCode();
    }

    public String toString() {
        return this.f83659id;
    }
}
