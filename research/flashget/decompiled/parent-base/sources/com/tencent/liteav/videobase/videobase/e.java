package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.qcloud.network.sonar.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<a, Integer> f72330a = new HashMap<a, Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.1
        {
            put(a.f72334a, 0);
            put(a.f72335b, -1301);
            put(a.f72336c, -1301);
            put(a.f72338e, -1314);
            put(a.f72337d, -1301);
            put(a.f72339f, -1308);
            put(a.f72341h, -1309);
            put(a.f72340g, -1308);
            put(a.f72342i, -1303);
            put(a.f72343j, -1303);
            put(a.f72344k, -2304);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Map<c, Integer> f72331b = new HashMap<c, Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.2
        {
            put(c.f72372a, 1103);
            put(c.f72373b, 1103);
            put(c.f72374c, 1103);
            put(c.f72375d, 1103);
            put(c.f72376e, 2110);
            put(c.f72377f, 2110);
            put(c.f72378g, 2110);
            put(c.f72379h, 2106);
            put(c.f72380i, 2106);
            put(c.f72381j, 2106);
            put(c.f72382k, 2106);
            put(c.f72383l, 2106);
            put(c.f72384m, 2106);
            put(c.f72385n, 2101);
            put(c.f72386o, 2101);
            put(c.f72387p, 2101);
            put(c.f72392u, Integer.valueOf(TXLiteAVCode.WARNING_OUT_OF_MEMORY));
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Map<b, Integer> f72332c = new HashMap<b, Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.3
        {
            put(b.f72347b, 2108);
            put(b.f72348c, 2108);
            put(b.f72349d, 2108);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Map<b, Integer> f72333d = new HashMap<b, Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.4
        {
            put(b.f72350e, 10000);
            put(b.f72354i, 10004);
            put(b.f72355j, 10005);
            put(b.f72351f, Integer.valueOf(BuildConfig.VERSION_CODE));
            put(b.f72352g, 10002);
            put(b.f72353h, Integer.valueOf(com.tencent.qcloud.track.BuildConfig.VERSION_CODE));
            put(b.f72356k, 20000);
            put(b.f72357l, 30001);
            put(b.f72358m, 30002);
            put(b.f72359n, 30003);
            put(b.f72360o, 30004);
            put(b.f72361p, 30005);
            put(b.f72362q, 40001);
            put(b.f72363r, 50001);
            put(b.f72364s, 50002);
            put(b.f72365t, 50003);
        }
    };

    public enum a {
        f72334a(0),
        f72335b(100),
        f72336c(101),
        f72337d(110),
        f72338e(111),
        f72339f(120),
        f72340g(121),
        f72341h(122),
        f72342i(200),
        f72343j(201),
        f72344k(300);

        private final int mValue;

        a(int i4) {
            this.mValue = i4;
        }
    }

    public enum b {
        f72346a,
        f72347b,
        f72348c,
        f72349d,
        f72350e,
        f72351f,
        f72352g,
        f72353h,
        f72354i,
        f72355j,
        f72356k,
        f72357l,
        f72358m,
        f72359n,
        f72360o,
        f72361p,
        f72362q,
        f72363r,
        f72364s,
        f72365t,
        f72366u,
        f72367v,
        f72368w,
        f72369x,
        f72370y,
        f72371z,
        A,
        B,
        C,
        D,
        E,
        F,
        G
    }

    public enum c {
        f72372a(100),
        f72373b(101),
        f72374c(102),
        f72375d(103),
        f72376e(200),
        f72377f(201),
        f72378g(202),
        f72379h(300),
        f72380i(301),
        f72381j(302),
        f72382k(303),
        f72383l(304),
        f72384m(305),
        f72385n(306),
        f72386o(307),
        f72387p(308),
        f72388q(1000),
        f72389r(1001),
        f72390s(1002),
        f72391t(1003),
        f72392u(2000);

        public final int mValue;

        c(int i4) {
            this.mValue = i4;
        }
    }

    public static int a(a aVar) {
        Map<a, Integer> map = f72330a;
        if (map.containsKey(aVar)) {
            return map.get(aVar).intValue();
        }
        return 0;
    }
}
