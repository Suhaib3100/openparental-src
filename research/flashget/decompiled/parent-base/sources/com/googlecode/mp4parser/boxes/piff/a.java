package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: ProtectionSpecificHeader.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected static Map<UUID, Class<? extends a>> f64044a = new HashMap();

    public static a a(UUID uuid, ByteBuffer byteBuffer) {
        a newInstance;
        Class<? extends a> cls = f64044a.get(uuid);
        if (cls != null) {
            try {
                newInstance = cls.newInstance();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(e5);
            }
        } else {
            newInstance = null;
        }
        if (newInstance == null) {
            newInstance = new com.googlecode.mp4parser.contentprotection.a();
        }
        newInstance.d(byteBuffer);
        return newInstance;
    }

    public abstract ByteBuffer b();

    public abstract UUID c();

    public abstract void d(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException(ProtectedSandApp.s("Ꮿ\u0001"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ᏸ\u0001"));
        ByteBuffer duplicate = b().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        sb.append(e.b(bArr));
        sb.append('}');
        return sb.toString();
    }
}
