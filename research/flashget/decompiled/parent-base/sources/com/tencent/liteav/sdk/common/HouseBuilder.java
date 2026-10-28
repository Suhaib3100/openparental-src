package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;

@JNINamespace("liteav::house")
/* loaded from: classes7.dex */
public class HouseBuilder {
    private b mHouseBuilderListener;

    public enum a {
        f71986a(1),
        f71987b(2),
        f71988c(4),
        f71989d(8),
        f71990e(16),
        f71991f(32),
        f71992g(64),
        f71993h(128),
        f71994i(256),
        f71995j(512);

        int value;

        a(int i4) {
            this.value = i4;
        }
    }

    public interface b {
        void a(int i4, String str);
    }

    public enum c {
        f71997a,
        f71998b
    }

    public enum d {
        f72000a(0),
        f72001b(-1),
        f72002c(-2),
        f72003d(-3),
        f72004e(-4),
        f72005f(-5),
        f72006g(-6),
        f72007h(-7),
        f72008i(-8),
        f72009j(-9),
        f72010k(-10),
        f72011l(-11),
        f72012m(-12),
        f72013n(-13),
        f72014o(-14);

        int value;

        d(int i4) {
            this.value = i4;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public static HouseBuilder f72016a = new HouseBuilder();
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public static HouseBuilder getInstance() {
        return e.f72016a;
    }

    private static native String nativeGetAppId();

    private static native String nativeGetHouse(int i4);

    private static native String nativeGetKey(int i4);

    private static native void nativeSetClient(HouseBuilder houseBuilder);

    private static native boolean nativeSetHouse(int i4, String str, String str2);

    private static native int nativeValid(int i4);

    public void OnResult(int i4, String str) {
        b bVar = this.mHouseBuilderListener;
        if (bVar != null) {
            bVar.a(i4, str);
        }
    }

    public String getAppId() {
        return nativeGetAppId();
    }

    public String getHouse(c cVar) {
        return nativeGetHouse(cVar.ordinal());
    }

    public String getKey(c cVar) {
        return nativeGetKey(cVar.ordinal());
    }

    public boolean setHouse(c cVar, String str, String str2) {
        return nativeSetHouse(cVar.ordinal(), str, str2);
    }

    public void setListener(b bVar) {
        this.mHouseBuilderListener = bVar;
        if (bVar != null) {
            nativeSetClient(this);
        }
    }

    public d valid(a aVar) {
        int nativeValid = nativeValid(aVar.value);
        for (d dVar : d.values()) {
            if (dVar.value == nativeValid) {
                return dVar;
            }
        }
        return d.f72014o;
    }
}
