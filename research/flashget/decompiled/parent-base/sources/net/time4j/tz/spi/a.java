package net.time4j.tz.spi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import net.time4j.l0;
import net.time4j.tz.m;
import net.time4j.tz.r;
import net.time4j.tz.s;

/* compiled from: TimezoneRepositoryProviderSPI.java */
/* loaded from: classes7.dex */
public class a implements r, net.time4j.scale.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f83653a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83654b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, byte[]> f83655c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f83656d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f83657e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<net.time4j.base.a, Integer> f83658f;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.tz.spi.a.<init>():void");
    }

    private static void i(DataInputStream dataInputStream, String str) throws IOException {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte != 116 || readByte2 != 122 || readByte3 != 114 || readByte4 != 101 || readByte5 != 112 || readByte6 != 111) {
            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鶼\u0001"), str));
        }
    }

    private static Class<?> l() {
        if (!Boolean.getBoolean(ProtectedSandApp.s("鶽\u0001"))) {
            return a.class;
        }
        try {
            return Class.forName(ProtectedSandApp.s("鶾\u0001"));
        } catch (ClassNotFoundException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // net.time4j.tz.r
    public s a() {
        return null;
    }

    @Override // net.time4j.scale.c
    public boolean b() {
        return !this.f83658f.isEmpty();
    }

    @Override // net.time4j.tz.r
    public Map<String, String> c() {
        return this.f83656d;
    }

    @Override // net.time4j.tz.r
    public Set<String> f() {
        return this.f83655c.keySet();
    }

    @Override // net.time4j.tz.r
    public String g() {
        return "";
    }

    @Override // net.time4j.tz.r
    public String getLocation() {
        return this.f83654b;
    }

    @Override // net.time4j.tz.r
    public String getName() {
        return ProtectedSandApp.s("鶿\u0001");
    }

    @Override // net.time4j.tz.r
    public String getVersion() {
        return this.f83653a;
    }

    @Override // net.time4j.scale.c
    public Map<net.time4j.base.a, Integer> h() {
        return Collections.unmodifiableMap(this.f83658f);
    }

    @Override // net.time4j.scale.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public l0 e(int i4, int i5, int i6) {
        return l0.r1(i4, i5, i6);
    }

    @Override // net.time4j.scale.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l0 d() {
        return this.f83657e;
    }

    @Override // net.time4j.tz.r
    public m load(String str) {
        try {
            byte[] bArr = this.f83655c.get(str);
            if (bArr != null) {
                return (m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("鷀\u0001")), this.f83653a, ProtectedSandApp.s("鷁\u0001"));
    }
}
